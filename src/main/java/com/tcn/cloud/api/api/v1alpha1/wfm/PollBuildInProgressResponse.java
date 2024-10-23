// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

/**
 * <pre>
 * Response message for PollBuildInProgress RPC
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.wfm.PollBuildInProgressResponse}
 */
public final class PollBuildInProgressResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.wfm.PollBuildInProgressResponse)
    PollBuildInProgressResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PollBuildInProgressResponse.newBuilder() to construct.
  private PollBuildInProgressResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PollBuildInProgressResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PollBuildInProgressResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_PollBuildInProgressResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_PollBuildInProgressResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.wfm.PollBuildInProgressResponse.class, com.tcn.cloud.api.api.v1alpha1.wfm.PollBuildInProgressResponse.Builder.class);
  }

  public static final int BUILD_START_DATETIME_FIELD_NUMBER = 1;
  private com.google.protobuf.Timestamp buildStartDatetime_;
  /**
   * <pre>
   * Start time of the build in progress, if &#64;build_in_progress is true.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp build_start_datetime = 1 [json_name = "buildStartDatetime"];</code>
   * @return Whether the buildStartDatetime field is set.
   */
  @java.lang.Override
  public boolean hasBuildStartDatetime() {
    return buildStartDatetime_ != null;
  }
  /**
   * <pre>
   * Start time of the build in progress, if &#64;build_in_progress is true.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp build_start_datetime = 1 [json_name = "buildStartDatetime"];</code>
   * @return The buildStartDatetime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getBuildStartDatetime() {
    return buildStartDatetime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : buildStartDatetime_;
  }
  /**
   * <pre>
   * Start time of the build in progress, if &#64;build_in_progress is true.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp build_start_datetime = 1 [json_name = "buildStartDatetime"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getBuildStartDatetimeOrBuilder() {
    return buildStartDatetime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : buildStartDatetime_;
  }

  public static final int BUILD_IN_PROGRESS_FIELD_NUMBER = 2;
  private boolean buildInProgress_ = false;
  /**
   * <pre>
   * If True: A build is currently in progress for the draft.
   * If False: There is no build in progress for the draft.
   * </pre>
   *
   * <code>bool build_in_progress = 2 [json_name = "buildInProgress"];</code>
   * @return The buildInProgress.
   */
  @java.lang.Override
  public boolean getBuildInProgress() {
    return buildInProgress_;
  }

  public static final int PREVIOUS_BUILD_STATE_FIELD_NUMBER = 3;
  private boolean previousBuildState_ = false;
  /**
   * <pre>
   * If build_in_progress is False, indicates whether the previous build was successful.
   * If true, the last build succeeded.
   * If false, the last build failed.
   * If build_in_progress is True, this value is always false.
   * </pre>
   *
   * <code>bool previous_build_state = 3 [json_name = "previousBuildState"];</code>
   * @return The previousBuildState.
   */
  @java.lang.Override
  public boolean getPreviousBuildState() {
    return previousBuildState_;
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
    if (buildStartDatetime_ != null) {
      output.writeMessage(1, getBuildStartDatetime());
    }
    if (buildInProgress_ != false) {
      output.writeBool(2, buildInProgress_);
    }
    if (previousBuildState_ != false) {
      output.writeBool(3, previousBuildState_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (buildStartDatetime_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getBuildStartDatetime());
    }
    if (buildInProgress_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, buildInProgress_);
    }
    if (previousBuildState_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, previousBuildState_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.wfm.PollBuildInProgressResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.wfm.PollBuildInProgressResponse other = (com.tcn.cloud.api.api.v1alpha1.wfm.PollBuildInProgressResponse) obj;

    if (hasBuildStartDatetime() != other.hasBuildStartDatetime()) return false;
    if (hasBuildStartDatetime()) {
      if (!getBuildStartDatetime()
          .equals(other.getBuildStartDatetime())) return false;
    }
    if (getBuildInProgress()
        != other.getBuildInProgress()) return false;
    if (getPreviousBuildState()
        != other.getPreviousBuildState()) return false;
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
    if (hasBuildStartDatetime()) {
      hash = (37 * hash) + BUILD_START_DATETIME_FIELD_NUMBER;
      hash = (53 * hash) + getBuildStartDatetime().hashCode();
    }
    hash = (37 * hash) + BUILD_IN_PROGRESS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getBuildInProgress());
    hash = (37 * hash) + PREVIOUS_BUILD_STATE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getPreviousBuildState());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.PollBuildInProgressResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.PollBuildInProgressResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.PollBuildInProgressResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.PollBuildInProgressResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.PollBuildInProgressResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.PollBuildInProgressResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.PollBuildInProgressResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.PollBuildInProgressResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.PollBuildInProgressResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.PollBuildInProgressResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.PollBuildInProgressResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.PollBuildInProgressResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.wfm.PollBuildInProgressResponse prototype) {
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
   * Response message for PollBuildInProgress RPC
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.wfm.PollBuildInProgressResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.wfm.PollBuildInProgressResponse)
      com.tcn.cloud.api.api.v1alpha1.wfm.PollBuildInProgressResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_PollBuildInProgressResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_PollBuildInProgressResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.wfm.PollBuildInProgressResponse.class, com.tcn.cloud.api.api.v1alpha1.wfm.PollBuildInProgressResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.wfm.PollBuildInProgressResponse.newBuilder()
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
      buildStartDatetime_ = null;
      if (buildStartDatetimeBuilder_ != null) {
        buildStartDatetimeBuilder_.dispose();
        buildStartDatetimeBuilder_ = null;
      }
      buildInProgress_ = false;
      previousBuildState_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_PollBuildInProgressResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.PollBuildInProgressResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.PollBuildInProgressResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.PollBuildInProgressResponse build() {
      com.tcn.cloud.api.api.v1alpha1.wfm.PollBuildInProgressResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.PollBuildInProgressResponse buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.wfm.PollBuildInProgressResponse result = new com.tcn.cloud.api.api.v1alpha1.wfm.PollBuildInProgressResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.wfm.PollBuildInProgressResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.buildStartDatetime_ = buildStartDatetimeBuilder_ == null
            ? buildStartDatetime_
            : buildStartDatetimeBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.buildInProgress_ = buildInProgress_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.previousBuildState_ = previousBuildState_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.wfm.PollBuildInProgressResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.wfm.PollBuildInProgressResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.wfm.PollBuildInProgressResponse other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.wfm.PollBuildInProgressResponse.getDefaultInstance()) return this;
      if (other.hasBuildStartDatetime()) {
        mergeBuildStartDatetime(other.getBuildStartDatetime());
      }
      if (other.getBuildInProgress() != false) {
        setBuildInProgress(other.getBuildInProgress());
      }
      if (other.getPreviousBuildState() != false) {
        setPreviousBuildState(other.getPreviousBuildState());
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
                  getBuildStartDatetimeFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              buildInProgress_ = input.readBool();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              previousBuildState_ = input.readBool();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
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

    private com.google.protobuf.Timestamp buildStartDatetime_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> buildStartDatetimeBuilder_;
    /**
     * <pre>
     * Start time of the build in progress, if &#64;build_in_progress is true.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp build_start_datetime = 1 [json_name = "buildStartDatetime"];</code>
     * @return Whether the buildStartDatetime field is set.
     */
    public boolean hasBuildStartDatetime() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Start time of the build in progress, if &#64;build_in_progress is true.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp build_start_datetime = 1 [json_name = "buildStartDatetime"];</code>
     * @return The buildStartDatetime.
     */
    public com.google.protobuf.Timestamp getBuildStartDatetime() {
      if (buildStartDatetimeBuilder_ == null) {
        return buildStartDatetime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : buildStartDatetime_;
      } else {
        return buildStartDatetimeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Start time of the build in progress, if &#64;build_in_progress is true.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp build_start_datetime = 1 [json_name = "buildStartDatetime"];</code>
     */
    public Builder setBuildStartDatetime(com.google.protobuf.Timestamp value) {
      if (buildStartDatetimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        buildStartDatetime_ = value;
      } else {
        buildStartDatetimeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Start time of the build in progress, if &#64;build_in_progress is true.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp build_start_datetime = 1 [json_name = "buildStartDatetime"];</code>
     */
    public Builder setBuildStartDatetime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (buildStartDatetimeBuilder_ == null) {
        buildStartDatetime_ = builderForValue.build();
      } else {
        buildStartDatetimeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Start time of the build in progress, if &#64;build_in_progress is true.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp build_start_datetime = 1 [json_name = "buildStartDatetime"];</code>
     */
    public Builder mergeBuildStartDatetime(com.google.protobuf.Timestamp value) {
      if (buildStartDatetimeBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          buildStartDatetime_ != null &&
          buildStartDatetime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getBuildStartDatetimeBuilder().mergeFrom(value);
        } else {
          buildStartDatetime_ = value;
        }
      } else {
        buildStartDatetimeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Start time of the build in progress, if &#64;build_in_progress is true.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp build_start_datetime = 1 [json_name = "buildStartDatetime"];</code>
     */
    public Builder clearBuildStartDatetime() {
      bitField0_ = (bitField0_ & ~0x00000001);
      buildStartDatetime_ = null;
      if (buildStartDatetimeBuilder_ != null) {
        buildStartDatetimeBuilder_.dispose();
        buildStartDatetimeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Start time of the build in progress, if &#64;build_in_progress is true.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp build_start_datetime = 1 [json_name = "buildStartDatetime"];</code>
     */
    public com.google.protobuf.Timestamp.Builder getBuildStartDatetimeBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getBuildStartDatetimeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Start time of the build in progress, if &#64;build_in_progress is true.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp build_start_datetime = 1 [json_name = "buildStartDatetime"];</code>
     */
    public com.google.protobuf.TimestampOrBuilder getBuildStartDatetimeOrBuilder() {
      if (buildStartDatetimeBuilder_ != null) {
        return buildStartDatetimeBuilder_.getMessageOrBuilder();
      } else {
        return buildStartDatetime_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : buildStartDatetime_;
      }
    }
    /**
     * <pre>
     * Start time of the build in progress, if &#64;build_in_progress is true.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp build_start_datetime = 1 [json_name = "buildStartDatetime"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getBuildStartDatetimeFieldBuilder() {
      if (buildStartDatetimeBuilder_ == null) {
        buildStartDatetimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getBuildStartDatetime(),
                getParentForChildren(),
                isClean());
        buildStartDatetime_ = null;
      }
      return buildStartDatetimeBuilder_;
    }

    private boolean buildInProgress_ ;
    /**
     * <pre>
     * If True: A build is currently in progress for the draft.
     * If False: There is no build in progress for the draft.
     * </pre>
     *
     * <code>bool build_in_progress = 2 [json_name = "buildInProgress"];</code>
     * @return The buildInProgress.
     */
    @java.lang.Override
    public boolean getBuildInProgress() {
      return buildInProgress_;
    }
    /**
     * <pre>
     * If True: A build is currently in progress for the draft.
     * If False: There is no build in progress for the draft.
     * </pre>
     *
     * <code>bool build_in_progress = 2 [json_name = "buildInProgress"];</code>
     * @param value The buildInProgress to set.
     * @return This builder for chaining.
     */
    public Builder setBuildInProgress(boolean value) {

      buildInProgress_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If True: A build is currently in progress for the draft.
     * If False: There is no build in progress for the draft.
     * </pre>
     *
     * <code>bool build_in_progress = 2 [json_name = "buildInProgress"];</code>
     * @return This builder for chaining.
     */
    public Builder clearBuildInProgress() {
      bitField0_ = (bitField0_ & ~0x00000002);
      buildInProgress_ = false;
      onChanged();
      return this;
    }

    private boolean previousBuildState_ ;
    /**
     * <pre>
     * If build_in_progress is False, indicates whether the previous build was successful.
     * If true, the last build succeeded.
     * If false, the last build failed.
     * If build_in_progress is True, this value is always false.
     * </pre>
     *
     * <code>bool previous_build_state = 3 [json_name = "previousBuildState"];</code>
     * @return The previousBuildState.
     */
    @java.lang.Override
    public boolean getPreviousBuildState() {
      return previousBuildState_;
    }
    /**
     * <pre>
     * If build_in_progress is False, indicates whether the previous build was successful.
     * If true, the last build succeeded.
     * If false, the last build failed.
     * If build_in_progress is True, this value is always false.
     * </pre>
     *
     * <code>bool previous_build_state = 3 [json_name = "previousBuildState"];</code>
     * @param value The previousBuildState to set.
     * @return This builder for chaining.
     */
    public Builder setPreviousBuildState(boolean value) {

      previousBuildState_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If build_in_progress is False, indicates whether the previous build was successful.
     * If true, the last build succeeded.
     * If false, the last build failed.
     * If build_in_progress is True, this value is always false.
     * </pre>
     *
     * <code>bool previous_build_state = 3 [json_name = "previousBuildState"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPreviousBuildState() {
      bitField0_ = (bitField0_ & ~0x00000004);
      previousBuildState_ = false;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.wfm.PollBuildInProgressResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.wfm.PollBuildInProgressResponse)
  private static final com.tcn.cloud.api.api.v1alpha1.wfm.PollBuildInProgressResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.wfm.PollBuildInProgressResponse();
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.PollBuildInProgressResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PollBuildInProgressResponse>
      PARSER = new com.google.protobuf.AbstractParser<PollBuildInProgressResponse>() {
    @java.lang.Override
    public PollBuildInProgressResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<PollBuildInProgressResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PollBuildInProgressResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.PollBuildInProgressResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

