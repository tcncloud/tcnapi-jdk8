// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wfo/vanalytics/v2/flag_transcript_filter.proto

package com.tcn.cloud.api.wfo.vanalytics.v2;

/**
 * <pre>
 * ListFlagTranscriptFiltersRequest is a request for listing flag transcript filters.
 * </pre>
 *
 * Protobuf type {@code wfo.vanalytics.v2.ListFlagTranscriptFiltersRequest}
 */
public final class ListFlagTranscriptFiltersRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:wfo.vanalytics.v2.ListFlagTranscriptFiltersRequest)
    ListFlagTranscriptFiltersRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListFlagTranscriptFiltersRequest.newBuilder() to construct.
  private ListFlagTranscriptFiltersRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListFlagTranscriptFiltersRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListFlagTranscriptFiltersRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.wfo.vanalytics.v2.FlagTranscriptFilterProto.internal_static_wfo_vanalytics_v2_ListFlagTranscriptFiltersRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.wfo.vanalytics.v2.FlagTranscriptFilterProto.internal_static_wfo_vanalytics_v2_ListFlagTranscriptFiltersRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagTranscriptFiltersRequest.class, com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagTranscriptFiltersRequest.Builder.class);
  }

  public static final int TRANSCRIPT_SID_FIELD_NUMBER = 2;
  private long transcriptSid_ = 0L;
  /**
   * <pre>
   * Required. The target transcript sid.
   * </pre>
   *
   * <code>int64 transcript_sid = 2 [json_name = "transcriptSid"];</code>
   * @return The transcriptSid.
   */
  @java.lang.Override
  public long getTranscriptSid() {
    return transcriptSid_;
  }

  public static final int FLAG_SNAPSHOT_MASK_FIELD_NUMBER = 3;
  private com.google.protobuf.FieldMask flagSnapshotMask_;
  /**
   * <pre>
   * Optional. Flag snapshot fields to include in response. All when empty.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask flag_snapshot_mask = 3 [json_name = "flagSnapshotMask"];</code>
   * @return Whether the flagSnapshotMask field is set.
   */
  @java.lang.Override
  public boolean hasFlagSnapshotMask() {
    return flagSnapshotMask_ != null;
  }
  /**
   * <pre>
   * Optional. Flag snapshot fields to include in response. All when empty.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask flag_snapshot_mask = 3 [json_name = "flagSnapshotMask"];</code>
   * @return The flagSnapshotMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getFlagSnapshotMask() {
    return flagSnapshotMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : flagSnapshotMask_;
  }
  /**
   * <pre>
   * Optional. Flag snapshot fields to include in response. All when empty.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask flag_snapshot_mask = 3 [json_name = "flagSnapshotMask"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getFlagSnapshotMaskOrBuilder() {
    return flagSnapshotMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : flagSnapshotMask_;
  }

  public static final int FILTER_SNAPSHOT_MASK_FIELD_NUMBER = 4;
  private com.google.protobuf.FieldMask filterSnapshotMask_;
  /**
   * <pre>
   * Optional. Filter snapshot fields to include in response. All when empty.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask filter_snapshot_mask = 4 [json_name = "filterSnapshotMask"];</code>
   * @return Whether the filterSnapshotMask field is set.
   */
  @java.lang.Override
  public boolean hasFilterSnapshotMask() {
    return filterSnapshotMask_ != null;
  }
  /**
   * <pre>
   * Optional. Filter snapshot fields to include in response. All when empty.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask filter_snapshot_mask = 4 [json_name = "filterSnapshotMask"];</code>
   * @return The filterSnapshotMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getFilterSnapshotMask() {
    return filterSnapshotMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : filterSnapshotMask_;
  }
  /**
   * <pre>
   * Optional. Filter snapshot fields to include in response. All when empty.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask filter_snapshot_mask = 4 [json_name = "filterSnapshotMask"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getFilterSnapshotMaskOrBuilder() {
    return filterSnapshotMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : filterSnapshotMask_;
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
    if (transcriptSid_ != 0L) {
      output.writeInt64(2, transcriptSid_);
    }
    if (flagSnapshotMask_ != null) {
      output.writeMessage(3, getFlagSnapshotMask());
    }
    if (filterSnapshotMask_ != null) {
      output.writeMessage(4, getFilterSnapshotMask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (transcriptSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, transcriptSid_);
    }
    if (flagSnapshotMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getFlagSnapshotMask());
    }
    if (filterSnapshotMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getFilterSnapshotMask());
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
    if (!(obj instanceof com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagTranscriptFiltersRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagTranscriptFiltersRequest other = (com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagTranscriptFiltersRequest) obj;

    if (getTranscriptSid()
        != other.getTranscriptSid()) return false;
    if (hasFlagSnapshotMask() != other.hasFlagSnapshotMask()) return false;
    if (hasFlagSnapshotMask()) {
      if (!getFlagSnapshotMask()
          .equals(other.getFlagSnapshotMask())) return false;
    }
    if (hasFilterSnapshotMask() != other.hasFilterSnapshotMask()) return false;
    if (hasFilterSnapshotMask()) {
      if (!getFilterSnapshotMask()
          .equals(other.getFilterSnapshotMask())) return false;
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
    hash = (37 * hash) + TRANSCRIPT_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTranscriptSid());
    if (hasFlagSnapshotMask()) {
      hash = (37 * hash) + FLAG_SNAPSHOT_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getFlagSnapshotMask().hashCode();
    }
    if (hasFilterSnapshotMask()) {
      hash = (37 * hash) + FILTER_SNAPSHOT_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getFilterSnapshotMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagTranscriptFiltersRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagTranscriptFiltersRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagTranscriptFiltersRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagTranscriptFiltersRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagTranscriptFiltersRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagTranscriptFiltersRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagTranscriptFiltersRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagTranscriptFiltersRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagTranscriptFiltersRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagTranscriptFiltersRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagTranscriptFiltersRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagTranscriptFiltersRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagTranscriptFiltersRequest prototype) {
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
   * ListFlagTranscriptFiltersRequest is a request for listing flag transcript filters.
   * </pre>
   *
   * Protobuf type {@code wfo.vanalytics.v2.ListFlagTranscriptFiltersRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:wfo.vanalytics.v2.ListFlagTranscriptFiltersRequest)
      com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagTranscriptFiltersRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.wfo.vanalytics.v2.FlagTranscriptFilterProto.internal_static_wfo_vanalytics_v2_ListFlagTranscriptFiltersRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.wfo.vanalytics.v2.FlagTranscriptFilterProto.internal_static_wfo_vanalytics_v2_ListFlagTranscriptFiltersRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagTranscriptFiltersRequest.class, com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagTranscriptFiltersRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagTranscriptFiltersRequest.newBuilder()
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
      transcriptSid_ = 0L;
      flagSnapshotMask_ = null;
      if (flagSnapshotMaskBuilder_ != null) {
        flagSnapshotMaskBuilder_.dispose();
        flagSnapshotMaskBuilder_ = null;
      }
      filterSnapshotMask_ = null;
      if (filterSnapshotMaskBuilder_ != null) {
        filterSnapshotMaskBuilder_.dispose();
        filterSnapshotMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.wfo.vanalytics.v2.FlagTranscriptFilterProto.internal_static_wfo_vanalytics_v2_ListFlagTranscriptFiltersRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagTranscriptFiltersRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagTranscriptFiltersRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagTranscriptFiltersRequest build() {
      com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagTranscriptFiltersRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagTranscriptFiltersRequest buildPartial() {
      com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagTranscriptFiltersRequest result = new com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagTranscriptFiltersRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagTranscriptFiltersRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.transcriptSid_ = transcriptSid_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.flagSnapshotMask_ = flagSnapshotMaskBuilder_ == null
            ? flagSnapshotMask_
            : flagSnapshotMaskBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.filterSnapshotMask_ = filterSnapshotMaskBuilder_ == null
            ? filterSnapshotMask_
            : filterSnapshotMaskBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagTranscriptFiltersRequest) {
        return mergeFrom((com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagTranscriptFiltersRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagTranscriptFiltersRequest other) {
      if (other == com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagTranscriptFiltersRequest.getDefaultInstance()) return this;
      if (other.getTranscriptSid() != 0L) {
        setTranscriptSid(other.getTranscriptSid());
      }
      if (other.hasFlagSnapshotMask()) {
        mergeFlagSnapshotMask(other.getFlagSnapshotMask());
      }
      if (other.hasFilterSnapshotMask()) {
        mergeFilterSnapshotMask(other.getFilterSnapshotMask());
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
            case 16: {
              transcriptSid_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 16
            case 26: {
              input.readMessage(
                  getFlagSnapshotMaskFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 26
            case 34: {
              input.readMessage(
                  getFilterSnapshotMaskFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 34
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

    private long transcriptSid_ ;
    /**
     * <pre>
     * Required. The target transcript sid.
     * </pre>
     *
     * <code>int64 transcript_sid = 2 [json_name = "transcriptSid"];</code>
     * @return The transcriptSid.
     */
    @java.lang.Override
    public long getTranscriptSid() {
      return transcriptSid_;
    }
    /**
     * <pre>
     * Required. The target transcript sid.
     * </pre>
     *
     * <code>int64 transcript_sid = 2 [json_name = "transcriptSid"];</code>
     * @param value The transcriptSid to set.
     * @return This builder for chaining.
     */
    public Builder setTranscriptSid(long value) {

      transcriptSid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The target transcript sid.
     * </pre>
     *
     * <code>int64 transcript_sid = 2 [json_name = "transcriptSid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTranscriptSid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      transcriptSid_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.FieldMask flagSnapshotMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> flagSnapshotMaskBuilder_;
    /**
     * <pre>
     * Optional. Flag snapshot fields to include in response. All when empty.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask flag_snapshot_mask = 3 [json_name = "flagSnapshotMask"];</code>
     * @return Whether the flagSnapshotMask field is set.
     */
    public boolean hasFlagSnapshotMask() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Optional. Flag snapshot fields to include in response. All when empty.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask flag_snapshot_mask = 3 [json_name = "flagSnapshotMask"];</code>
     * @return The flagSnapshotMask.
     */
    public com.google.protobuf.FieldMask getFlagSnapshotMask() {
      if (flagSnapshotMaskBuilder_ == null) {
        return flagSnapshotMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : flagSnapshotMask_;
      } else {
        return flagSnapshotMaskBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Optional. Flag snapshot fields to include in response. All when empty.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask flag_snapshot_mask = 3 [json_name = "flagSnapshotMask"];</code>
     */
    public Builder setFlagSnapshotMask(com.google.protobuf.FieldMask value) {
      if (flagSnapshotMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        flagSnapshotMask_ = value;
      } else {
        flagSnapshotMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Flag snapshot fields to include in response. All when empty.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask flag_snapshot_mask = 3 [json_name = "flagSnapshotMask"];</code>
     */
    public Builder setFlagSnapshotMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (flagSnapshotMaskBuilder_ == null) {
        flagSnapshotMask_ = builderForValue.build();
      } else {
        flagSnapshotMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Flag snapshot fields to include in response. All when empty.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask flag_snapshot_mask = 3 [json_name = "flagSnapshotMask"];</code>
     */
    public Builder mergeFlagSnapshotMask(com.google.protobuf.FieldMask value) {
      if (flagSnapshotMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          flagSnapshotMask_ != null &&
          flagSnapshotMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getFlagSnapshotMaskBuilder().mergeFrom(value);
        } else {
          flagSnapshotMask_ = value;
        }
      } else {
        flagSnapshotMaskBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Flag snapshot fields to include in response. All when empty.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask flag_snapshot_mask = 3 [json_name = "flagSnapshotMask"];</code>
     */
    public Builder clearFlagSnapshotMask() {
      bitField0_ = (bitField0_ & ~0x00000002);
      flagSnapshotMask_ = null;
      if (flagSnapshotMaskBuilder_ != null) {
        flagSnapshotMaskBuilder_.dispose();
        flagSnapshotMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Flag snapshot fields to include in response. All when empty.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask flag_snapshot_mask = 3 [json_name = "flagSnapshotMask"];</code>
     */
    public com.google.protobuf.FieldMask.Builder getFlagSnapshotMaskBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getFlagSnapshotMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Optional. Flag snapshot fields to include in response. All when empty.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask flag_snapshot_mask = 3 [json_name = "flagSnapshotMask"];</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getFlagSnapshotMaskOrBuilder() {
      if (flagSnapshotMaskBuilder_ != null) {
        return flagSnapshotMaskBuilder_.getMessageOrBuilder();
      } else {
        return flagSnapshotMask_ == null ?
            com.google.protobuf.FieldMask.getDefaultInstance() : flagSnapshotMask_;
      }
    }
    /**
     * <pre>
     * Optional. Flag snapshot fields to include in response. All when empty.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask flag_snapshot_mask = 3 [json_name = "flagSnapshotMask"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> 
        getFlagSnapshotMaskFieldBuilder() {
      if (flagSnapshotMaskBuilder_ == null) {
        flagSnapshotMaskBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder>(
                getFlagSnapshotMask(),
                getParentForChildren(),
                isClean());
        flagSnapshotMask_ = null;
      }
      return flagSnapshotMaskBuilder_;
    }

    private com.google.protobuf.FieldMask filterSnapshotMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> filterSnapshotMaskBuilder_;
    /**
     * <pre>
     * Optional. Filter snapshot fields to include in response. All when empty.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask filter_snapshot_mask = 4 [json_name = "filterSnapshotMask"];</code>
     * @return Whether the filterSnapshotMask field is set.
     */
    public boolean hasFilterSnapshotMask() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Optional. Filter snapshot fields to include in response. All when empty.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask filter_snapshot_mask = 4 [json_name = "filterSnapshotMask"];</code>
     * @return The filterSnapshotMask.
     */
    public com.google.protobuf.FieldMask getFilterSnapshotMask() {
      if (filterSnapshotMaskBuilder_ == null) {
        return filterSnapshotMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : filterSnapshotMask_;
      } else {
        return filterSnapshotMaskBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Optional. Filter snapshot fields to include in response. All when empty.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask filter_snapshot_mask = 4 [json_name = "filterSnapshotMask"];</code>
     */
    public Builder setFilterSnapshotMask(com.google.protobuf.FieldMask value) {
      if (filterSnapshotMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        filterSnapshotMask_ = value;
      } else {
        filterSnapshotMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Filter snapshot fields to include in response. All when empty.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask filter_snapshot_mask = 4 [json_name = "filterSnapshotMask"];</code>
     */
    public Builder setFilterSnapshotMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (filterSnapshotMaskBuilder_ == null) {
        filterSnapshotMask_ = builderForValue.build();
      } else {
        filterSnapshotMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Filter snapshot fields to include in response. All when empty.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask filter_snapshot_mask = 4 [json_name = "filterSnapshotMask"];</code>
     */
    public Builder mergeFilterSnapshotMask(com.google.protobuf.FieldMask value) {
      if (filterSnapshotMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          filterSnapshotMask_ != null &&
          filterSnapshotMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getFilterSnapshotMaskBuilder().mergeFrom(value);
        } else {
          filterSnapshotMask_ = value;
        }
      } else {
        filterSnapshotMaskBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Filter snapshot fields to include in response. All when empty.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask filter_snapshot_mask = 4 [json_name = "filterSnapshotMask"];</code>
     */
    public Builder clearFilterSnapshotMask() {
      bitField0_ = (bitField0_ & ~0x00000004);
      filterSnapshotMask_ = null;
      if (filterSnapshotMaskBuilder_ != null) {
        filterSnapshotMaskBuilder_.dispose();
        filterSnapshotMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Filter snapshot fields to include in response. All when empty.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask filter_snapshot_mask = 4 [json_name = "filterSnapshotMask"];</code>
     */
    public com.google.protobuf.FieldMask.Builder getFilterSnapshotMaskBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getFilterSnapshotMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Optional. Filter snapshot fields to include in response. All when empty.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask filter_snapshot_mask = 4 [json_name = "filterSnapshotMask"];</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getFilterSnapshotMaskOrBuilder() {
      if (filterSnapshotMaskBuilder_ != null) {
        return filterSnapshotMaskBuilder_.getMessageOrBuilder();
      } else {
        return filterSnapshotMask_ == null ?
            com.google.protobuf.FieldMask.getDefaultInstance() : filterSnapshotMask_;
      }
    }
    /**
     * <pre>
     * Optional. Filter snapshot fields to include in response. All when empty.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask filter_snapshot_mask = 4 [json_name = "filterSnapshotMask"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> 
        getFilterSnapshotMaskFieldBuilder() {
      if (filterSnapshotMaskBuilder_ == null) {
        filterSnapshotMaskBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder>(
                getFilterSnapshotMask(),
                getParentForChildren(),
                isClean());
        filterSnapshotMask_ = null;
      }
      return filterSnapshotMaskBuilder_;
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


    // @@protoc_insertion_point(builder_scope:wfo.vanalytics.v2.ListFlagTranscriptFiltersRequest)
  }

  // @@protoc_insertion_point(class_scope:wfo.vanalytics.v2.ListFlagTranscriptFiltersRequest)
  private static final com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagTranscriptFiltersRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagTranscriptFiltersRequest();
  }

  public static com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagTranscriptFiltersRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListFlagTranscriptFiltersRequest>
      PARSER = new com.google.protobuf.AbstractParser<ListFlagTranscriptFiltersRequest>() {
    @java.lang.Override
    public ListFlagTranscriptFiltersRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListFlagTranscriptFiltersRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListFlagTranscriptFiltersRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagTranscriptFiltersRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

