// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wfo/vanalytics/v2/flag_review.proto

package com.tcn.cloud.api.wfo.vanalytics.v2;

/**
 * <pre>
 * FlagReview resource in the Vanalytics API. It represents a flag review
 * for transcripts that have been flagged.
 * </pre>
 *
 * Protobuf type {@code wfo.vanalytics.v2.FlagReview}
 */
public final class FlagReview extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:wfo.vanalytics.v2.FlagReview)
    FlagReviewOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FlagReview.newBuilder() to construct.
  private FlagReview(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FlagReview() {
    notes_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FlagReview();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.wfo.vanalytics.v2.FlagReviewProto.internal_static_wfo_vanalytics_v2_FlagReview_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.wfo.vanalytics.v2.FlagReviewProto.internal_static_wfo_vanalytics_v2_FlagReview_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.wfo.vanalytics.v2.FlagReview.class, com.tcn.cloud.api.wfo.vanalytics.v2.FlagReview.Builder.class);
  }

  public static final int FLAG_REVIEW_SID_FIELD_NUMBER = 1;
  private long flagReviewSid_ = 0L;
  /**
   * <pre>
   * Output only. The unique id of this flag review.
   * </pre>
   *
   * <code>int64 flag_review_sid = 1 [json_name = "flagReviewSid"];</code>
   * @return The flagReviewSid.
   */
  @java.lang.Override
  public long getFlagReviewSid() {
    return flagReviewSid_;
  }

  public static final int TRANSCRIPT_SID_FIELD_NUMBER = 2;
  private long transcriptSid_ = 0L;
  /**
   * <pre>
   * Required. The transcript_sid of the reviewed transcript.
   * </pre>
   *
   * <code>int64 transcript_sid = 2 [json_name = "transcriptSid"];</code>
   * @return The transcriptSid.
   */
  @java.lang.Override
  public long getTranscriptSid() {
    return transcriptSid_;
  }

  public static final int CREATE_TIME_FIELD_NUMBER = 4;
  private com.google.protobuf.Timestamp createTime_;
  /**
   * <pre>
   * Output only. The timestamp when this flag review was created. Assigned by the
   * server.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [json_name = "createTime"];</code>
   * @return Whether the createTime field is set.
   */
  @java.lang.Override
  public boolean hasCreateTime() {
    return createTime_ != null;
  }
  /**
   * <pre>
   * Output only. The timestamp when this flag review was created. Assigned by the
   * server.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [json_name = "createTime"];</code>
   * @return The createTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getCreateTime() {
    return createTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : createTime_;
  }
  /**
   * <pre>
   * Output only. The timestamp when this flag review was created. Assigned by the
   * server.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [json_name = "createTime"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder() {
    return createTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : createTime_;
  }

  public static final int NOTES_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object notes_ = "";
  /**
   * <pre>
   * Optional. Any notes written for the flag review.
   * </pre>
   *
   * <code>string notes = 5 [json_name = "notes"];</code>
   * @return The notes.
   */
  @java.lang.Override
  public java.lang.String getNotes() {
    java.lang.Object ref = notes_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      notes_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Optional. Any notes written for the flag review.
   * </pre>
   *
   * <code>string notes = 5 [json_name = "notes"];</code>
   * @return The bytes for notes.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNotesBytes() {
    java.lang.Object ref = notes_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      notes_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FLAG_SNAPSHOT_SID_FIELD_NUMBER = 8;
  private long flagSnapshotSid_ = 0L;
  /**
   * <pre>
   * The ID of the flag snapshot for this flag review.
   * </pre>
   *
   * <code>int64 flag_snapshot_sid = 8 [json_name = "flagSnapshotSid"];</code>
   * @return The flagSnapshotSid.
   */
  @java.lang.Override
  public long getFlagSnapshotSid() {
    return flagSnapshotSid_;
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
    if (flagReviewSid_ != 0L) {
      output.writeInt64(1, flagReviewSid_);
    }
    if (transcriptSid_ != 0L) {
      output.writeInt64(2, transcriptSid_);
    }
    if (createTime_ != null) {
      output.writeMessage(4, getCreateTime());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(notes_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, notes_);
    }
    if (flagSnapshotSid_ != 0L) {
      output.writeInt64(8, flagSnapshotSid_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (flagReviewSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, flagReviewSid_);
    }
    if (transcriptSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, transcriptSid_);
    }
    if (createTime_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getCreateTime());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(notes_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, notes_);
    }
    if (flagSnapshotSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(8, flagSnapshotSid_);
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
    if (!(obj instanceof com.tcn.cloud.api.wfo.vanalytics.v2.FlagReview)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.wfo.vanalytics.v2.FlagReview other = (com.tcn.cloud.api.wfo.vanalytics.v2.FlagReview) obj;

    if (getFlagReviewSid()
        != other.getFlagReviewSid()) return false;
    if (getTranscriptSid()
        != other.getTranscriptSid()) return false;
    if (hasCreateTime() != other.hasCreateTime()) return false;
    if (hasCreateTime()) {
      if (!getCreateTime()
          .equals(other.getCreateTime())) return false;
    }
    if (!getNotes()
        .equals(other.getNotes())) return false;
    if (getFlagSnapshotSid()
        != other.getFlagSnapshotSid()) return false;
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
    hash = (37 * hash) + FLAG_REVIEW_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getFlagReviewSid());
    hash = (37 * hash) + TRANSCRIPT_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTranscriptSid());
    if (hasCreateTime()) {
      hash = (37 * hash) + CREATE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getCreateTime().hashCode();
    }
    hash = (37 * hash) + NOTES_FIELD_NUMBER;
    hash = (53 * hash) + getNotes().hashCode();
    hash = (37 * hash) + FLAG_SNAPSHOT_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getFlagSnapshotSid());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.wfo.vanalytics.v2.FlagReview parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.FlagReview parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.FlagReview parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.FlagReview parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.FlagReview parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.FlagReview parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.FlagReview parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.FlagReview parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.wfo.vanalytics.v2.FlagReview parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.wfo.vanalytics.v2.FlagReview parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.FlagReview parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.FlagReview parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.wfo.vanalytics.v2.FlagReview prototype) {
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
   * FlagReview resource in the Vanalytics API. It represents a flag review
   * for transcripts that have been flagged.
   * </pre>
   *
   * Protobuf type {@code wfo.vanalytics.v2.FlagReview}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:wfo.vanalytics.v2.FlagReview)
      com.tcn.cloud.api.wfo.vanalytics.v2.FlagReviewOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.wfo.vanalytics.v2.FlagReviewProto.internal_static_wfo_vanalytics_v2_FlagReview_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.wfo.vanalytics.v2.FlagReviewProto.internal_static_wfo_vanalytics_v2_FlagReview_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.wfo.vanalytics.v2.FlagReview.class, com.tcn.cloud.api.wfo.vanalytics.v2.FlagReview.Builder.class);
    }

    // Construct using com.tcn.cloud.api.wfo.vanalytics.v2.FlagReview.newBuilder()
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
      flagReviewSid_ = 0L;
      transcriptSid_ = 0L;
      createTime_ = null;
      if (createTimeBuilder_ != null) {
        createTimeBuilder_.dispose();
        createTimeBuilder_ = null;
      }
      notes_ = "";
      flagSnapshotSid_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.wfo.vanalytics.v2.FlagReviewProto.internal_static_wfo_vanalytics_v2_FlagReview_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.wfo.vanalytics.v2.FlagReview getDefaultInstanceForType() {
      return com.tcn.cloud.api.wfo.vanalytics.v2.FlagReview.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.wfo.vanalytics.v2.FlagReview build() {
      com.tcn.cloud.api.wfo.vanalytics.v2.FlagReview result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.wfo.vanalytics.v2.FlagReview buildPartial() {
      com.tcn.cloud.api.wfo.vanalytics.v2.FlagReview result = new com.tcn.cloud.api.wfo.vanalytics.v2.FlagReview(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.wfo.vanalytics.v2.FlagReview result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.flagReviewSid_ = flagReviewSid_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.transcriptSid_ = transcriptSid_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.createTime_ = createTimeBuilder_ == null
            ? createTime_
            : createTimeBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.notes_ = notes_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.flagSnapshotSid_ = flagSnapshotSid_;
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
      if (other instanceof com.tcn.cloud.api.wfo.vanalytics.v2.FlagReview) {
        return mergeFrom((com.tcn.cloud.api.wfo.vanalytics.v2.FlagReview)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.wfo.vanalytics.v2.FlagReview other) {
      if (other == com.tcn.cloud.api.wfo.vanalytics.v2.FlagReview.getDefaultInstance()) return this;
      if (other.getFlagReviewSid() != 0L) {
        setFlagReviewSid(other.getFlagReviewSid());
      }
      if (other.getTranscriptSid() != 0L) {
        setTranscriptSid(other.getTranscriptSid());
      }
      if (other.hasCreateTime()) {
        mergeCreateTime(other.getCreateTime());
      }
      if (!other.getNotes().isEmpty()) {
        notes_ = other.notes_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      if (other.getFlagSnapshotSid() != 0L) {
        setFlagSnapshotSid(other.getFlagSnapshotSid());
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
              flagReviewSid_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              transcriptSid_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 34: {
              input.readMessage(
                  getCreateTimeFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 34
            case 42: {
              notes_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 42
            case 64: {
              flagSnapshotSid_ = input.readInt64();
              bitField0_ |= 0x00000010;
              break;
            } // case 64
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

    private long flagReviewSid_ ;
    /**
     * <pre>
     * Output only. The unique id of this flag review.
     * </pre>
     *
     * <code>int64 flag_review_sid = 1 [json_name = "flagReviewSid"];</code>
     * @return The flagReviewSid.
     */
    @java.lang.Override
    public long getFlagReviewSid() {
      return flagReviewSid_;
    }
    /**
     * <pre>
     * Output only. The unique id of this flag review.
     * </pre>
     *
     * <code>int64 flag_review_sid = 1 [json_name = "flagReviewSid"];</code>
     * @param value The flagReviewSid to set.
     * @return This builder for chaining.
     */
    public Builder setFlagReviewSid(long value) {

      flagReviewSid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The unique id of this flag review.
     * </pre>
     *
     * <code>int64 flag_review_sid = 1 [json_name = "flagReviewSid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFlagReviewSid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      flagReviewSid_ = 0L;
      onChanged();
      return this;
    }

    private long transcriptSid_ ;
    /**
     * <pre>
     * Required. The transcript_sid of the reviewed transcript.
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
     * Required. The transcript_sid of the reviewed transcript.
     * </pre>
     *
     * <code>int64 transcript_sid = 2 [json_name = "transcriptSid"];</code>
     * @param value The transcriptSid to set.
     * @return This builder for chaining.
     */
    public Builder setTranscriptSid(long value) {

      transcriptSid_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The transcript_sid of the reviewed transcript.
     * </pre>
     *
     * <code>int64 transcript_sid = 2 [json_name = "transcriptSid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTranscriptSid() {
      bitField0_ = (bitField0_ & ~0x00000002);
      transcriptSid_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp createTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> createTimeBuilder_;
    /**
     * <pre>
     * Output only. The timestamp when this flag review was created. Assigned by the
     * server.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 4 [json_name = "createTime"];</code>
     * @return Whether the createTime field is set.
     */
    public boolean hasCreateTime() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Output only. The timestamp when this flag review was created. Assigned by the
     * server.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 4 [json_name = "createTime"];</code>
     * @return The createTime.
     */
    public com.google.protobuf.Timestamp getCreateTime() {
      if (createTimeBuilder_ == null) {
        return createTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : createTime_;
      } else {
        return createTimeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Output only. The timestamp when this flag review was created. Assigned by the
     * server.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 4 [json_name = "createTime"];</code>
     */
    public Builder setCreateTime(com.google.protobuf.Timestamp value) {
      if (createTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        createTime_ = value;
      } else {
        createTimeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The timestamp when this flag review was created. Assigned by the
     * server.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 4 [json_name = "createTime"];</code>
     */
    public Builder setCreateTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (createTimeBuilder_ == null) {
        createTime_ = builderForValue.build();
      } else {
        createTimeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The timestamp when this flag review was created. Assigned by the
     * server.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 4 [json_name = "createTime"];</code>
     */
    public Builder mergeCreateTime(com.google.protobuf.Timestamp value) {
      if (createTimeBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          createTime_ != null &&
          createTime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getCreateTimeBuilder().mergeFrom(value);
        } else {
          createTime_ = value;
        }
      } else {
        createTimeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The timestamp when this flag review was created. Assigned by the
     * server.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 4 [json_name = "createTime"];</code>
     */
    public Builder clearCreateTime() {
      bitField0_ = (bitField0_ & ~0x00000004);
      createTime_ = null;
      if (createTimeBuilder_ != null) {
        createTimeBuilder_.dispose();
        createTimeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The timestamp when this flag review was created. Assigned by the
     * server.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 4 [json_name = "createTime"];</code>
     */
    public com.google.protobuf.Timestamp.Builder getCreateTimeBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getCreateTimeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Output only. The timestamp when this flag review was created. Assigned by the
     * server.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 4 [json_name = "createTime"];</code>
     */
    public com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder() {
      if (createTimeBuilder_ != null) {
        return createTimeBuilder_.getMessageOrBuilder();
      } else {
        return createTime_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : createTime_;
      }
    }
    /**
     * <pre>
     * Output only. The timestamp when this flag review was created. Assigned by the
     * server.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 4 [json_name = "createTime"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getCreateTimeFieldBuilder() {
      if (createTimeBuilder_ == null) {
        createTimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getCreateTime(),
                getParentForChildren(),
                isClean());
        createTime_ = null;
      }
      return createTimeBuilder_;
    }

    private java.lang.Object notes_ = "";
    /**
     * <pre>
     * Optional. Any notes written for the flag review.
     * </pre>
     *
     * <code>string notes = 5 [json_name = "notes"];</code>
     * @return The notes.
     */
    public java.lang.String getNotes() {
      java.lang.Object ref = notes_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        notes_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Optional. Any notes written for the flag review.
     * </pre>
     *
     * <code>string notes = 5 [json_name = "notes"];</code>
     * @return The bytes for notes.
     */
    public com.google.protobuf.ByteString
        getNotesBytes() {
      java.lang.Object ref = notes_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        notes_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Optional. Any notes written for the flag review.
     * </pre>
     *
     * <code>string notes = 5 [json_name = "notes"];</code>
     * @param value The notes to set.
     * @return This builder for chaining.
     */
    public Builder setNotes(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      notes_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Any notes written for the flag review.
     * </pre>
     *
     * <code>string notes = 5 [json_name = "notes"];</code>
     * @return This builder for chaining.
     */
    public Builder clearNotes() {
      notes_ = getDefaultInstance().getNotes();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Any notes written for the flag review.
     * </pre>
     *
     * <code>string notes = 5 [json_name = "notes"];</code>
     * @param value The bytes for notes to set.
     * @return This builder for chaining.
     */
    public Builder setNotesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      notes_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private long flagSnapshotSid_ ;
    /**
     * <pre>
     * The ID of the flag snapshot for this flag review.
     * </pre>
     *
     * <code>int64 flag_snapshot_sid = 8 [json_name = "flagSnapshotSid"];</code>
     * @return The flagSnapshotSid.
     */
    @java.lang.Override
    public long getFlagSnapshotSid() {
      return flagSnapshotSid_;
    }
    /**
     * <pre>
     * The ID of the flag snapshot for this flag review.
     * </pre>
     *
     * <code>int64 flag_snapshot_sid = 8 [json_name = "flagSnapshotSid"];</code>
     * @param value The flagSnapshotSid to set.
     * @return This builder for chaining.
     */
    public Builder setFlagSnapshotSid(long value) {

      flagSnapshotSid_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ID of the flag snapshot for this flag review.
     * </pre>
     *
     * <code>int64 flag_snapshot_sid = 8 [json_name = "flagSnapshotSid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFlagSnapshotSid() {
      bitField0_ = (bitField0_ & ~0x00000010);
      flagSnapshotSid_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:wfo.vanalytics.v2.FlagReview)
  }

  // @@protoc_insertion_point(class_scope:wfo.vanalytics.v2.FlagReview)
  private static final com.tcn.cloud.api.wfo.vanalytics.v2.FlagReview DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.wfo.vanalytics.v2.FlagReview();
  }

  public static com.tcn.cloud.api.wfo.vanalytics.v2.FlagReview getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FlagReview>
      PARSER = new com.google.protobuf.AbstractParser<FlagReview>() {
    @java.lang.Override
    public FlagReview parsePartialFrom(
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

  public static com.google.protobuf.Parser<FlagReview> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FlagReview> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.wfo.vanalytics.v2.FlagReview getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

