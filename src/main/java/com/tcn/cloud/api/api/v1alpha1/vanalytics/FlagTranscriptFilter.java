// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/vanalytics/flag_transcript_filter.proto

package com.tcn.cloud.api.api.v1alpha1.vanalytics;

/**
 * <pre>
 * Flag transcript filter resource.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.vanalytics.FlagTranscriptFilter}
 */
public final class FlagTranscriptFilter extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.vanalytics.FlagTranscriptFilter)
    FlagTranscriptFilterOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FlagTranscriptFilter.newBuilder() to construct.
  private FlagTranscriptFilter(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FlagTranscriptFilter() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FlagTranscriptFilter();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilterProto.internal_static_api_v1alpha1_vanalytics_FlagTranscriptFilter_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilterProto.internal_static_api_v1alpha1_vanalytics_FlagTranscriptFilter_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilter.class, com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilter.Builder.class);
  }

  public static final int FLAG_SNAPSHOT_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagSnapshot flagSnapshot_;
  /**
   * <pre>
   * FlagSnapshot which flagged target transcript.
   * </pre>
   *
   * <code>.api.v1alpha1.vanalytics.FlagSnapshot flag_snapshot = 1 [json_name = "flagSnapshot"];</code>
   * @return Whether the flagSnapshot field is set.
   */
  @java.lang.Override
  public boolean hasFlagSnapshot() {
    return flagSnapshot_ != null;
  }
  /**
   * <pre>
   * FlagSnapshot which flagged target transcript.
   * </pre>
   *
   * <code>.api.v1alpha1.vanalytics.FlagSnapshot flag_snapshot = 1 [json_name = "flagSnapshot"];</code>
   * @return The flagSnapshot.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagSnapshot getFlagSnapshot() {
    return flagSnapshot_ == null ? com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagSnapshot.getDefaultInstance() : flagSnapshot_;
  }
  /**
   * <pre>
   * FlagSnapshot which flagged target transcript.
   * </pre>
   *
   * <code>.api.v1alpha1.vanalytics.FlagSnapshot flag_snapshot = 1 [json_name = "flagSnapshot"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagSnapshotOrBuilder getFlagSnapshotOrBuilder() {
    return flagSnapshot_ == null ? com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagSnapshot.getDefaultInstance() : flagSnapshot_;
  }

  public static final int FILTER_SNAPSHOT_FIELD_NUMBER = 2;
  private com.tcn.cloud.api.api.v1alpha1.vanalytics.FilterSnapshot filterSnapshot_;
  /**
   * <pre>
   * FilterSnapshot which filtered target transcript.
   * </pre>
   *
   * <code>.api.v1alpha1.vanalytics.FilterSnapshot filter_snapshot = 2 [json_name = "filterSnapshot"];</code>
   * @return Whether the filterSnapshot field is set.
   */
  @java.lang.Override
  public boolean hasFilterSnapshot() {
    return filterSnapshot_ != null;
  }
  /**
   * <pre>
   * FilterSnapshot which filtered target transcript.
   * </pre>
   *
   * <code>.api.v1alpha1.vanalytics.FilterSnapshot filter_snapshot = 2 [json_name = "filterSnapshot"];</code>
   * @return The filterSnapshot.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.vanalytics.FilterSnapshot getFilterSnapshot() {
    return filterSnapshot_ == null ? com.tcn.cloud.api.api.v1alpha1.vanalytics.FilterSnapshot.getDefaultInstance() : filterSnapshot_;
  }
  /**
   * <pre>
   * FilterSnapshot which filtered target transcript.
   * </pre>
   *
   * <code>.api.v1alpha1.vanalytics.FilterSnapshot filter_snapshot = 2 [json_name = "filterSnapshot"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.vanalytics.FilterSnapshotOrBuilder getFilterSnapshotOrBuilder() {
    return filterSnapshot_ == null ? com.tcn.cloud.api.api.v1alpha1.vanalytics.FilterSnapshot.getDefaultInstance() : filterSnapshot_;
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
    if (flagSnapshot_ != null) {
      output.writeMessage(1, getFlagSnapshot());
    }
    if (filterSnapshot_ != null) {
      output.writeMessage(2, getFilterSnapshot());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (flagSnapshot_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getFlagSnapshot());
    }
    if (filterSnapshot_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getFilterSnapshot());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilter)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilter other = (com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilter) obj;

    if (hasFlagSnapshot() != other.hasFlagSnapshot()) return false;
    if (hasFlagSnapshot()) {
      if (!getFlagSnapshot()
          .equals(other.getFlagSnapshot())) return false;
    }
    if (hasFilterSnapshot() != other.hasFilterSnapshot()) return false;
    if (hasFilterSnapshot()) {
      if (!getFilterSnapshot()
          .equals(other.getFilterSnapshot())) return false;
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
    if (hasFlagSnapshot()) {
      hash = (37 * hash) + FLAG_SNAPSHOT_FIELD_NUMBER;
      hash = (53 * hash) + getFlagSnapshot().hashCode();
    }
    if (hasFilterSnapshot()) {
      hash = (37 * hash) + FILTER_SNAPSHOT_FIELD_NUMBER;
      hash = (53 * hash) + getFilterSnapshot().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilter parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilter parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilter parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilter parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilter parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilter parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilter parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilter parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilter parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilter parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilter parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilter parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilter prototype) {
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
   * Flag transcript filter resource.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.vanalytics.FlagTranscriptFilter}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.vanalytics.FlagTranscriptFilter)
      com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilterOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilterProto.internal_static_api_v1alpha1_vanalytics_FlagTranscriptFilter_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilterProto.internal_static_api_v1alpha1_vanalytics_FlagTranscriptFilter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilter.class, com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilter.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilter.newBuilder()
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
      flagSnapshot_ = null;
      if (flagSnapshotBuilder_ != null) {
        flagSnapshotBuilder_.dispose();
        flagSnapshotBuilder_ = null;
      }
      filterSnapshot_ = null;
      if (filterSnapshotBuilder_ != null) {
        filterSnapshotBuilder_.dispose();
        filterSnapshotBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilterProto.internal_static_api_v1alpha1_vanalytics_FlagTranscriptFilter_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilter getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilter.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilter build() {
      com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilter result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilter buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilter result = new com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilter(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilter result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.flagSnapshot_ = flagSnapshotBuilder_ == null
            ? flagSnapshot_
            : flagSnapshotBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.filterSnapshot_ = filterSnapshotBuilder_ == null
            ? filterSnapshot_
            : filterSnapshotBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilter) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilter)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilter other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilter.getDefaultInstance()) return this;
      if (other.hasFlagSnapshot()) {
        mergeFlagSnapshot(other.getFlagSnapshot());
      }
      if (other.hasFilterSnapshot()) {
        mergeFilterSnapshot(other.getFilterSnapshot());
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
                  getFlagSnapshotFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getFilterSnapshotFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagSnapshot flagSnapshot_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagSnapshot, com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagSnapshot.Builder, com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagSnapshotOrBuilder> flagSnapshotBuilder_;
    /**
     * <pre>
     * FlagSnapshot which flagged target transcript.
     * </pre>
     *
     * <code>.api.v1alpha1.vanalytics.FlagSnapshot flag_snapshot = 1 [json_name = "flagSnapshot"];</code>
     * @return Whether the flagSnapshot field is set.
     */
    public boolean hasFlagSnapshot() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * FlagSnapshot which flagged target transcript.
     * </pre>
     *
     * <code>.api.v1alpha1.vanalytics.FlagSnapshot flag_snapshot = 1 [json_name = "flagSnapshot"];</code>
     * @return The flagSnapshot.
     */
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagSnapshot getFlagSnapshot() {
      if (flagSnapshotBuilder_ == null) {
        return flagSnapshot_ == null ? com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagSnapshot.getDefaultInstance() : flagSnapshot_;
      } else {
        return flagSnapshotBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * FlagSnapshot which flagged target transcript.
     * </pre>
     *
     * <code>.api.v1alpha1.vanalytics.FlagSnapshot flag_snapshot = 1 [json_name = "flagSnapshot"];</code>
     */
    public Builder setFlagSnapshot(com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagSnapshot value) {
      if (flagSnapshotBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        flagSnapshot_ = value;
      } else {
        flagSnapshotBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * FlagSnapshot which flagged target transcript.
     * </pre>
     *
     * <code>.api.v1alpha1.vanalytics.FlagSnapshot flag_snapshot = 1 [json_name = "flagSnapshot"];</code>
     */
    public Builder setFlagSnapshot(
        com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagSnapshot.Builder builderForValue) {
      if (flagSnapshotBuilder_ == null) {
        flagSnapshot_ = builderForValue.build();
      } else {
        flagSnapshotBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * FlagSnapshot which flagged target transcript.
     * </pre>
     *
     * <code>.api.v1alpha1.vanalytics.FlagSnapshot flag_snapshot = 1 [json_name = "flagSnapshot"];</code>
     */
    public Builder mergeFlagSnapshot(com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagSnapshot value) {
      if (flagSnapshotBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          flagSnapshot_ != null &&
          flagSnapshot_ != com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagSnapshot.getDefaultInstance()) {
          getFlagSnapshotBuilder().mergeFrom(value);
        } else {
          flagSnapshot_ = value;
        }
      } else {
        flagSnapshotBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * FlagSnapshot which flagged target transcript.
     * </pre>
     *
     * <code>.api.v1alpha1.vanalytics.FlagSnapshot flag_snapshot = 1 [json_name = "flagSnapshot"];</code>
     */
    public Builder clearFlagSnapshot() {
      bitField0_ = (bitField0_ & ~0x00000001);
      flagSnapshot_ = null;
      if (flagSnapshotBuilder_ != null) {
        flagSnapshotBuilder_.dispose();
        flagSnapshotBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * FlagSnapshot which flagged target transcript.
     * </pre>
     *
     * <code>.api.v1alpha1.vanalytics.FlagSnapshot flag_snapshot = 1 [json_name = "flagSnapshot"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagSnapshot.Builder getFlagSnapshotBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getFlagSnapshotFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * FlagSnapshot which flagged target transcript.
     * </pre>
     *
     * <code>.api.v1alpha1.vanalytics.FlagSnapshot flag_snapshot = 1 [json_name = "flagSnapshot"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagSnapshotOrBuilder getFlagSnapshotOrBuilder() {
      if (flagSnapshotBuilder_ != null) {
        return flagSnapshotBuilder_.getMessageOrBuilder();
      } else {
        return flagSnapshot_ == null ?
            com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagSnapshot.getDefaultInstance() : flagSnapshot_;
      }
    }
    /**
     * <pre>
     * FlagSnapshot which flagged target transcript.
     * </pre>
     *
     * <code>.api.v1alpha1.vanalytics.FlagSnapshot flag_snapshot = 1 [json_name = "flagSnapshot"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagSnapshot, com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagSnapshot.Builder, com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagSnapshotOrBuilder> 
        getFlagSnapshotFieldBuilder() {
      if (flagSnapshotBuilder_ == null) {
        flagSnapshotBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagSnapshot, com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagSnapshot.Builder, com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagSnapshotOrBuilder>(
                getFlagSnapshot(),
                getParentForChildren(),
                isClean());
        flagSnapshot_ = null;
      }
      return flagSnapshotBuilder_;
    }

    private com.tcn.cloud.api.api.v1alpha1.vanalytics.FilterSnapshot filterSnapshot_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.vanalytics.FilterSnapshot, com.tcn.cloud.api.api.v1alpha1.vanalytics.FilterSnapshot.Builder, com.tcn.cloud.api.api.v1alpha1.vanalytics.FilterSnapshotOrBuilder> filterSnapshotBuilder_;
    /**
     * <pre>
     * FilterSnapshot which filtered target transcript.
     * </pre>
     *
     * <code>.api.v1alpha1.vanalytics.FilterSnapshot filter_snapshot = 2 [json_name = "filterSnapshot"];</code>
     * @return Whether the filterSnapshot field is set.
     */
    public boolean hasFilterSnapshot() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * FilterSnapshot which filtered target transcript.
     * </pre>
     *
     * <code>.api.v1alpha1.vanalytics.FilterSnapshot filter_snapshot = 2 [json_name = "filterSnapshot"];</code>
     * @return The filterSnapshot.
     */
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.FilterSnapshot getFilterSnapshot() {
      if (filterSnapshotBuilder_ == null) {
        return filterSnapshot_ == null ? com.tcn.cloud.api.api.v1alpha1.vanalytics.FilterSnapshot.getDefaultInstance() : filterSnapshot_;
      } else {
        return filterSnapshotBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * FilterSnapshot which filtered target transcript.
     * </pre>
     *
     * <code>.api.v1alpha1.vanalytics.FilterSnapshot filter_snapshot = 2 [json_name = "filterSnapshot"];</code>
     */
    public Builder setFilterSnapshot(com.tcn.cloud.api.api.v1alpha1.vanalytics.FilterSnapshot value) {
      if (filterSnapshotBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        filterSnapshot_ = value;
      } else {
        filterSnapshotBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * FilterSnapshot which filtered target transcript.
     * </pre>
     *
     * <code>.api.v1alpha1.vanalytics.FilterSnapshot filter_snapshot = 2 [json_name = "filterSnapshot"];</code>
     */
    public Builder setFilterSnapshot(
        com.tcn.cloud.api.api.v1alpha1.vanalytics.FilterSnapshot.Builder builderForValue) {
      if (filterSnapshotBuilder_ == null) {
        filterSnapshot_ = builderForValue.build();
      } else {
        filterSnapshotBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * FilterSnapshot which filtered target transcript.
     * </pre>
     *
     * <code>.api.v1alpha1.vanalytics.FilterSnapshot filter_snapshot = 2 [json_name = "filterSnapshot"];</code>
     */
    public Builder mergeFilterSnapshot(com.tcn.cloud.api.api.v1alpha1.vanalytics.FilterSnapshot value) {
      if (filterSnapshotBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          filterSnapshot_ != null &&
          filterSnapshot_ != com.tcn.cloud.api.api.v1alpha1.vanalytics.FilterSnapshot.getDefaultInstance()) {
          getFilterSnapshotBuilder().mergeFrom(value);
        } else {
          filterSnapshot_ = value;
        }
      } else {
        filterSnapshotBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * FilterSnapshot which filtered target transcript.
     * </pre>
     *
     * <code>.api.v1alpha1.vanalytics.FilterSnapshot filter_snapshot = 2 [json_name = "filterSnapshot"];</code>
     */
    public Builder clearFilterSnapshot() {
      bitField0_ = (bitField0_ & ~0x00000002);
      filterSnapshot_ = null;
      if (filterSnapshotBuilder_ != null) {
        filterSnapshotBuilder_.dispose();
        filterSnapshotBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * FilterSnapshot which filtered target transcript.
     * </pre>
     *
     * <code>.api.v1alpha1.vanalytics.FilterSnapshot filter_snapshot = 2 [json_name = "filterSnapshot"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.FilterSnapshot.Builder getFilterSnapshotBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getFilterSnapshotFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * FilterSnapshot which filtered target transcript.
     * </pre>
     *
     * <code>.api.v1alpha1.vanalytics.FilterSnapshot filter_snapshot = 2 [json_name = "filterSnapshot"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.FilterSnapshotOrBuilder getFilterSnapshotOrBuilder() {
      if (filterSnapshotBuilder_ != null) {
        return filterSnapshotBuilder_.getMessageOrBuilder();
      } else {
        return filterSnapshot_ == null ?
            com.tcn.cloud.api.api.v1alpha1.vanalytics.FilterSnapshot.getDefaultInstance() : filterSnapshot_;
      }
    }
    /**
     * <pre>
     * FilterSnapshot which filtered target transcript.
     * </pre>
     *
     * <code>.api.v1alpha1.vanalytics.FilterSnapshot filter_snapshot = 2 [json_name = "filterSnapshot"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.vanalytics.FilterSnapshot, com.tcn.cloud.api.api.v1alpha1.vanalytics.FilterSnapshot.Builder, com.tcn.cloud.api.api.v1alpha1.vanalytics.FilterSnapshotOrBuilder> 
        getFilterSnapshotFieldBuilder() {
      if (filterSnapshotBuilder_ == null) {
        filterSnapshotBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.vanalytics.FilterSnapshot, com.tcn.cloud.api.api.v1alpha1.vanalytics.FilterSnapshot.Builder, com.tcn.cloud.api.api.v1alpha1.vanalytics.FilterSnapshotOrBuilder>(
                getFilterSnapshot(),
                getParentForChildren(),
                isClean());
        filterSnapshot_ = null;
      }
      return filterSnapshotBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.vanalytics.FlagTranscriptFilter)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.vanalytics.FlagTranscriptFilter)
  private static final com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilter DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilter();
  }

  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilter getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FlagTranscriptFilter>
      PARSER = new com.google.protobuf.AbstractParser<FlagTranscriptFilter>() {
    @java.lang.Override
    public FlagTranscriptFilter parsePartialFrom(
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

  public static com.google.protobuf.Parser<FlagTranscriptFilter> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FlagTranscriptFilter> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilter getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

