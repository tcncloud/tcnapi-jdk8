// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wfo/vanalytics/v2/transcript_summary.proto

package com.tcn.cloud.api.wfo.vanalytics.v2;

/**
 * <pre>
 * TranscriptSummary is an AI generated summary based on a parent transcript.
 * </pre>
 *
 * Protobuf type {@code wfo.vanalytics.v2.TranscriptSummary}
 */
public final class TranscriptSummary extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:wfo.vanalytics.v2.TranscriptSummary)
    TranscriptSummaryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TranscriptSummary.newBuilder() to construct.
  private TranscriptSummary(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TranscriptSummary() {
    bulletPoints_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    status_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TranscriptSummary();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptSummaryProto.internal_static_wfo_vanalytics_v2_TranscriptSummary_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptSummaryProto.internal_static_wfo_vanalytics_v2_TranscriptSummary_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptSummary.class, com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptSummary.Builder.class);
  }

  public static final int BULLET_POINTS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList bulletPoints_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * Summary content provided in multiple bullet points.
   * </pre>
   *
   * <code>repeated string bullet_points = 1 [json_name = "bulletPoints"];</code>
   * @return A list containing the bulletPoints.
   */
  public com.google.protobuf.ProtocolStringList
      getBulletPointsList() {
    return bulletPoints_;
  }
  /**
   * <pre>
   * Summary content provided in multiple bullet points.
   * </pre>
   *
   * <code>repeated string bullet_points = 1 [json_name = "bulletPoints"];</code>
   * @return The count of bulletPoints.
   */
  public int getBulletPointsCount() {
    return bulletPoints_.size();
  }
  /**
   * <pre>
   * Summary content provided in multiple bullet points.
   * </pre>
   *
   * <code>repeated string bullet_points = 1 [json_name = "bulletPoints"];</code>
   * @param index The index of the element to return.
   * @return The bulletPoints at the given index.
   */
  public java.lang.String getBulletPoints(int index) {
    return bulletPoints_.get(index);
  }
  /**
   * <pre>
   * Summary content provided in multiple bullet points.
   * </pre>
   *
   * <code>repeated string bullet_points = 1 [json_name = "bulletPoints"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the bulletPoints at the given index.
   */
  public com.google.protobuf.ByteString
      getBulletPointsBytes(int index) {
    return bulletPoints_.getByteString(index);
  }

  public static final int STATUS_FIELD_NUMBER = 2;
  private int status_ = 0;
  /**
   * <pre>
   * Status of the summary.
   * </pre>
   *
   * <code>.api.commons.TranscriptSummaryStatus status = 2 [json_name = "status"];</code>
   * @return The enum numeric value on the wire for status.
   */
  @java.lang.Override public int getStatusValue() {
    return status_;
  }
  /**
   * <pre>
   * Status of the summary.
   * </pre>
   *
   * <code>.api.commons.TranscriptSummaryStatus status = 2 [json_name = "status"];</code>
   * @return The status.
   */
  @java.lang.Override public com.tcn.cloud.api.api.commons.TranscriptSummaryStatus getStatus() {
    com.tcn.cloud.api.api.commons.TranscriptSummaryStatus result = com.tcn.cloud.api.api.commons.TranscriptSummaryStatus.forNumber(status_);
    return result == null ? com.tcn.cloud.api.api.commons.TranscriptSummaryStatus.UNRECOGNIZED : result;
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
    for (int i = 0; i < bulletPoints_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, bulletPoints_.getRaw(i));
    }
    if (status_ != com.tcn.cloud.api.api.commons.TranscriptSummaryStatus.TRANSCRIPT_SUMMARY_STATUS_QUEUED.getNumber()) {
      output.writeEnum(2, status_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < bulletPoints_.size(); i++) {
        dataSize += computeStringSizeNoTag(bulletPoints_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getBulletPointsList().size();
    }
    if (status_ != com.tcn.cloud.api.api.commons.TranscriptSummaryStatus.TRANSCRIPT_SUMMARY_STATUS_QUEUED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, status_);
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
    if (!(obj instanceof com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptSummary)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptSummary other = (com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptSummary) obj;

    if (!getBulletPointsList()
        .equals(other.getBulletPointsList())) return false;
    if (status_ != other.status_) return false;
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
    if (getBulletPointsCount() > 0) {
      hash = (37 * hash) + BULLET_POINTS_FIELD_NUMBER;
      hash = (53 * hash) + getBulletPointsList().hashCode();
    }
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + status_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptSummary parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptSummary parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptSummary parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptSummary parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptSummary parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptSummary parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptSummary parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptSummary parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptSummary parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptSummary parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptSummary parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptSummary parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptSummary prototype) {
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
   * TranscriptSummary is an AI generated summary based on a parent transcript.
   * </pre>
   *
   * Protobuf type {@code wfo.vanalytics.v2.TranscriptSummary}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:wfo.vanalytics.v2.TranscriptSummary)
      com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptSummaryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptSummaryProto.internal_static_wfo_vanalytics_v2_TranscriptSummary_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptSummaryProto.internal_static_wfo_vanalytics_v2_TranscriptSummary_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptSummary.class, com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptSummary.Builder.class);
    }

    // Construct using com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptSummary.newBuilder()
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
      bulletPoints_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      status_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptSummaryProto.internal_static_wfo_vanalytics_v2_TranscriptSummary_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptSummary getDefaultInstanceForType() {
      return com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptSummary.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptSummary build() {
      com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptSummary result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptSummary buildPartial() {
      com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptSummary result = new com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptSummary(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptSummary result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        bulletPoints_.makeImmutable();
        result.bulletPoints_ = bulletPoints_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.status_ = status_;
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
      if (other instanceof com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptSummary) {
        return mergeFrom((com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptSummary)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptSummary other) {
      if (other == com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptSummary.getDefaultInstance()) return this;
      if (!other.bulletPoints_.isEmpty()) {
        if (bulletPoints_.isEmpty()) {
          bulletPoints_ = other.bulletPoints_;
          bitField0_ |= 0x00000001;
        } else {
          ensureBulletPointsIsMutable();
          bulletPoints_.addAll(other.bulletPoints_);
        }
        onChanged();
      }
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
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
              java.lang.String s = input.readStringRequireUtf8();
              ensureBulletPointsIsMutable();
              bulletPoints_.add(s);
              break;
            } // case 10
            case 16: {
              status_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private com.google.protobuf.LazyStringArrayList bulletPoints_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureBulletPointsIsMutable() {
      if (!bulletPoints_.isModifiable()) {
        bulletPoints_ = new com.google.protobuf.LazyStringArrayList(bulletPoints_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     * <pre>
     * Summary content provided in multiple bullet points.
     * </pre>
     *
     * <code>repeated string bullet_points = 1 [json_name = "bulletPoints"];</code>
     * @return A list containing the bulletPoints.
     */
    public com.google.protobuf.ProtocolStringList
        getBulletPointsList() {
      bulletPoints_.makeImmutable();
      return bulletPoints_;
    }
    /**
     * <pre>
     * Summary content provided in multiple bullet points.
     * </pre>
     *
     * <code>repeated string bullet_points = 1 [json_name = "bulletPoints"];</code>
     * @return The count of bulletPoints.
     */
    public int getBulletPointsCount() {
      return bulletPoints_.size();
    }
    /**
     * <pre>
     * Summary content provided in multiple bullet points.
     * </pre>
     *
     * <code>repeated string bullet_points = 1 [json_name = "bulletPoints"];</code>
     * @param index The index of the element to return.
     * @return The bulletPoints at the given index.
     */
    public java.lang.String getBulletPoints(int index) {
      return bulletPoints_.get(index);
    }
    /**
     * <pre>
     * Summary content provided in multiple bullet points.
     * </pre>
     *
     * <code>repeated string bullet_points = 1 [json_name = "bulletPoints"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the bulletPoints at the given index.
     */
    public com.google.protobuf.ByteString
        getBulletPointsBytes(int index) {
      return bulletPoints_.getByteString(index);
    }
    /**
     * <pre>
     * Summary content provided in multiple bullet points.
     * </pre>
     *
     * <code>repeated string bullet_points = 1 [json_name = "bulletPoints"];</code>
     * @param index The index to set the value at.
     * @param value The bulletPoints to set.
     * @return This builder for chaining.
     */
    public Builder setBulletPoints(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureBulletPointsIsMutable();
      bulletPoints_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Summary content provided in multiple bullet points.
     * </pre>
     *
     * <code>repeated string bullet_points = 1 [json_name = "bulletPoints"];</code>
     * @param value The bulletPoints to add.
     * @return This builder for chaining.
     */
    public Builder addBulletPoints(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureBulletPointsIsMutable();
      bulletPoints_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Summary content provided in multiple bullet points.
     * </pre>
     *
     * <code>repeated string bullet_points = 1 [json_name = "bulletPoints"];</code>
     * @param values The bulletPoints to add.
     * @return This builder for chaining.
     */
    public Builder addAllBulletPoints(
        java.lang.Iterable<java.lang.String> values) {
      ensureBulletPointsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, bulletPoints_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Summary content provided in multiple bullet points.
     * </pre>
     *
     * <code>repeated string bullet_points = 1 [json_name = "bulletPoints"];</code>
     * @return This builder for chaining.
     */
    public Builder clearBulletPoints() {
      bulletPoints_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Summary content provided in multiple bullet points.
     * </pre>
     *
     * <code>repeated string bullet_points = 1 [json_name = "bulletPoints"];</code>
     * @param value The bytes of the bulletPoints to add.
     * @return This builder for chaining.
     */
    public Builder addBulletPointsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureBulletPointsIsMutable();
      bulletPoints_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int status_ = 0;
    /**
     * <pre>
     * Status of the summary.
     * </pre>
     *
     * <code>.api.commons.TranscriptSummaryStatus status = 2 [json_name = "status"];</code>
     * @return The enum numeric value on the wire for status.
     */
    @java.lang.Override public int getStatusValue() {
      return status_;
    }
    /**
     * <pre>
     * Status of the summary.
     * </pre>
     *
     * <code>.api.commons.TranscriptSummaryStatus status = 2 [json_name = "status"];</code>
     * @param value The enum numeric value on the wire for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatusValue(int value) {
      status_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Status of the summary.
     * </pre>
     *
     * <code>.api.commons.TranscriptSummaryStatus status = 2 [json_name = "status"];</code>
     * @return The status.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.TranscriptSummaryStatus getStatus() {
      com.tcn.cloud.api.api.commons.TranscriptSummaryStatus result = com.tcn.cloud.api.api.commons.TranscriptSummaryStatus.forNumber(status_);
      return result == null ? com.tcn.cloud.api.api.commons.TranscriptSummaryStatus.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Status of the summary.
     * </pre>
     *
     * <code>.api.commons.TranscriptSummaryStatus status = 2 [json_name = "status"];</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(com.tcn.cloud.api.api.commons.TranscriptSummaryStatus value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Status of the summary.
     * </pre>
     *
     * <code>.api.commons.TranscriptSummaryStatus status = 2 [json_name = "status"];</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      bitField0_ = (bitField0_ & ~0x00000002);
      status_ = 0;
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


    // @@protoc_insertion_point(builder_scope:wfo.vanalytics.v2.TranscriptSummary)
  }

  // @@protoc_insertion_point(class_scope:wfo.vanalytics.v2.TranscriptSummary)
  private static final com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptSummary DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptSummary();
  }

  public static com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptSummary getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TranscriptSummary>
      PARSER = new com.google.protobuf.AbstractParser<TranscriptSummary>() {
    @java.lang.Override
    public TranscriptSummary parsePartialFrom(
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

  public static com.google.protobuf.Parser<TranscriptSummary> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TranscriptSummary> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptSummary getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

