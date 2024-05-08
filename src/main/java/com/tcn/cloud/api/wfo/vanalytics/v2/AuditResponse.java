// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wfo/vanalytics/v2/service.proto

package com.tcn.cloud.api.wfo.vanalytics.v2;

/**
 * Protobuf type {@code wfo.vanalytics.v2.AuditResponse}
 */
public final class AuditResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:wfo.vanalytics.v2.AuditResponse)
    AuditResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AuditResponse.newBuilder() to construct.
  private AuditResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AuditResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AuditResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.wfo.vanalytics.v2.ServiceProto.internal_static_wfo_vanalytics_v2_AuditResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.wfo.vanalytics.v2.ServiceProto.internal_static_wfo_vanalytics_v2_AuditResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.wfo.vanalytics.v2.AuditResponse.class, com.tcn.cloud.api.wfo.vanalytics.v2.AuditResponse.Builder.class);
  }

  public static final int AUDIO_TIME_FIELD_NUMBER = 1;
  private double audioTime_ = 0D;
  /**
   * <pre>
   * audio time in seconds within billing period
   * </pre>
   *
   * <code>double audio_time = 1 [json_name = "audioTime"];</code>
   * @return The audioTime.
   */
  @java.lang.Override
  public double getAudioTime() {
    return audioTime_;
  }

  public static final int BILLED_AUDIO_TIME_FIELD_NUMBER = 2;
  private double billedAudioTime_ = 0D;
  /**
   * <pre>
   * billed_audio time in seconds within billing period
   * </pre>
   *
   * <code>double billed_audio_time = 2 [json_name = "billedAudioTime"];</code>
   * @return The billedAudioTime.
   */
  @java.lang.Override
  public double getBilledAudioTime() {
    return billedAudioTime_;
  }

  public static final int LAST_USAGE_FIELD_NUMBER = 3;
  private com.google.protobuf.Timestamp lastUsage_;
  /**
   * <pre>
   * last_usage is the date of the last transcription
   * within the billing period
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_usage = 3 [json_name = "lastUsage"];</code>
   * @return Whether the lastUsage field is set.
   */
  @java.lang.Override
  public boolean hasLastUsage() {
    return lastUsage_ != null;
  }
  /**
   * <pre>
   * last_usage is the date of the last transcription
   * within the billing period
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_usage = 3 [json_name = "lastUsage"];</code>
   * @return The lastUsage.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getLastUsage() {
    return lastUsage_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : lastUsage_;
  }
  /**
   * <pre>
   * last_usage is the date of the last transcription
   * within the billing period
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_usage = 3 [json_name = "lastUsage"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getLastUsageOrBuilder() {
    return lastUsage_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : lastUsage_;
  }

  public static final int BILLED_TRANSCRIPTS_FIELD_NUMBER = 4;
  private long billedTranscripts_ = 0L;
  /**
   * <pre>
   * billed_transcripts is the number of billed transcripts
   * within the billing period
   * </pre>
   *
   * <code>int64 billed_transcripts = 4 [json_name = "billedTranscripts"];</code>
   * @return The billedTranscripts.
   */
  @java.lang.Override
  public long getBilledTranscripts() {
    return billedTranscripts_;
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
    if (java.lang.Double.doubleToRawLongBits(audioTime_) != 0) {
      output.writeDouble(1, audioTime_);
    }
    if (java.lang.Double.doubleToRawLongBits(billedAudioTime_) != 0) {
      output.writeDouble(2, billedAudioTime_);
    }
    if (lastUsage_ != null) {
      output.writeMessage(3, getLastUsage());
    }
    if (billedTranscripts_ != 0L) {
      output.writeInt64(4, billedTranscripts_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (java.lang.Double.doubleToRawLongBits(audioTime_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(1, audioTime_);
    }
    if (java.lang.Double.doubleToRawLongBits(billedAudioTime_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, billedAudioTime_);
    }
    if (lastUsage_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getLastUsage());
    }
    if (billedTranscripts_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, billedTranscripts_);
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
    if (!(obj instanceof com.tcn.cloud.api.wfo.vanalytics.v2.AuditResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.wfo.vanalytics.v2.AuditResponse other = (com.tcn.cloud.api.wfo.vanalytics.v2.AuditResponse) obj;

    if (java.lang.Double.doubleToLongBits(getAudioTime())
        != java.lang.Double.doubleToLongBits(
            other.getAudioTime())) return false;
    if (java.lang.Double.doubleToLongBits(getBilledAudioTime())
        != java.lang.Double.doubleToLongBits(
            other.getBilledAudioTime())) return false;
    if (hasLastUsage() != other.hasLastUsage()) return false;
    if (hasLastUsage()) {
      if (!getLastUsage()
          .equals(other.getLastUsage())) return false;
    }
    if (getBilledTranscripts()
        != other.getBilledTranscripts()) return false;
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
    hash = (37 * hash) + AUDIO_TIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getAudioTime()));
    hash = (37 * hash) + BILLED_AUDIO_TIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getBilledAudioTime()));
    if (hasLastUsage()) {
      hash = (37 * hash) + LAST_USAGE_FIELD_NUMBER;
      hash = (53 * hash) + getLastUsage().hashCode();
    }
    hash = (37 * hash) + BILLED_TRANSCRIPTS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getBilledTranscripts());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.wfo.vanalytics.v2.AuditResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.AuditResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.AuditResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.AuditResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.AuditResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.AuditResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.AuditResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.AuditResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.wfo.vanalytics.v2.AuditResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.wfo.vanalytics.v2.AuditResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.AuditResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.AuditResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.wfo.vanalytics.v2.AuditResponse prototype) {
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
   * Protobuf type {@code wfo.vanalytics.v2.AuditResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:wfo.vanalytics.v2.AuditResponse)
      com.tcn.cloud.api.wfo.vanalytics.v2.AuditResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.wfo.vanalytics.v2.ServiceProto.internal_static_wfo_vanalytics_v2_AuditResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.wfo.vanalytics.v2.ServiceProto.internal_static_wfo_vanalytics_v2_AuditResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.wfo.vanalytics.v2.AuditResponse.class, com.tcn.cloud.api.wfo.vanalytics.v2.AuditResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.wfo.vanalytics.v2.AuditResponse.newBuilder()
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
      audioTime_ = 0D;
      billedAudioTime_ = 0D;
      lastUsage_ = null;
      if (lastUsageBuilder_ != null) {
        lastUsageBuilder_.dispose();
        lastUsageBuilder_ = null;
      }
      billedTranscripts_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.wfo.vanalytics.v2.ServiceProto.internal_static_wfo_vanalytics_v2_AuditResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.wfo.vanalytics.v2.AuditResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.wfo.vanalytics.v2.AuditResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.wfo.vanalytics.v2.AuditResponse build() {
      com.tcn.cloud.api.wfo.vanalytics.v2.AuditResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.wfo.vanalytics.v2.AuditResponse buildPartial() {
      com.tcn.cloud.api.wfo.vanalytics.v2.AuditResponse result = new com.tcn.cloud.api.wfo.vanalytics.v2.AuditResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.wfo.vanalytics.v2.AuditResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.audioTime_ = audioTime_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.billedAudioTime_ = billedAudioTime_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.lastUsage_ = lastUsageBuilder_ == null
            ? lastUsage_
            : lastUsageBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.billedTranscripts_ = billedTranscripts_;
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
      if (other instanceof com.tcn.cloud.api.wfo.vanalytics.v2.AuditResponse) {
        return mergeFrom((com.tcn.cloud.api.wfo.vanalytics.v2.AuditResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.wfo.vanalytics.v2.AuditResponse other) {
      if (other == com.tcn.cloud.api.wfo.vanalytics.v2.AuditResponse.getDefaultInstance()) return this;
      if (other.getAudioTime() != 0D) {
        setAudioTime(other.getAudioTime());
      }
      if (other.getBilledAudioTime() != 0D) {
        setBilledAudioTime(other.getBilledAudioTime());
      }
      if (other.hasLastUsage()) {
        mergeLastUsage(other.getLastUsage());
      }
      if (other.getBilledTranscripts() != 0L) {
        setBilledTranscripts(other.getBilledTranscripts());
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
            case 9: {
              audioTime_ = input.readDouble();
              bitField0_ |= 0x00000001;
              break;
            } // case 9
            case 17: {
              billedAudioTime_ = input.readDouble();
              bitField0_ |= 0x00000002;
              break;
            } // case 17
            case 26: {
              input.readMessage(
                  getLastUsageFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              billedTranscripts_ = input.readInt64();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
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

    private double audioTime_ ;
    /**
     * <pre>
     * audio time in seconds within billing period
     * </pre>
     *
     * <code>double audio_time = 1 [json_name = "audioTime"];</code>
     * @return The audioTime.
     */
    @java.lang.Override
    public double getAudioTime() {
      return audioTime_;
    }
    /**
     * <pre>
     * audio time in seconds within billing period
     * </pre>
     *
     * <code>double audio_time = 1 [json_name = "audioTime"];</code>
     * @param value The audioTime to set.
     * @return This builder for chaining.
     */
    public Builder setAudioTime(double value) {

      audioTime_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * audio time in seconds within billing period
     * </pre>
     *
     * <code>double audio_time = 1 [json_name = "audioTime"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAudioTime() {
      bitField0_ = (bitField0_ & ~0x00000001);
      audioTime_ = 0D;
      onChanged();
      return this;
    }

    private double billedAudioTime_ ;
    /**
     * <pre>
     * billed_audio time in seconds within billing period
     * </pre>
     *
     * <code>double billed_audio_time = 2 [json_name = "billedAudioTime"];</code>
     * @return The billedAudioTime.
     */
    @java.lang.Override
    public double getBilledAudioTime() {
      return billedAudioTime_;
    }
    /**
     * <pre>
     * billed_audio time in seconds within billing period
     * </pre>
     *
     * <code>double billed_audio_time = 2 [json_name = "billedAudioTime"];</code>
     * @param value The billedAudioTime to set.
     * @return This builder for chaining.
     */
    public Builder setBilledAudioTime(double value) {

      billedAudioTime_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * billed_audio time in seconds within billing period
     * </pre>
     *
     * <code>double billed_audio_time = 2 [json_name = "billedAudioTime"];</code>
     * @return This builder for chaining.
     */
    public Builder clearBilledAudioTime() {
      bitField0_ = (bitField0_ & ~0x00000002);
      billedAudioTime_ = 0D;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp lastUsage_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> lastUsageBuilder_;
    /**
     * <pre>
     * last_usage is the date of the last transcription
     * within the billing period
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_usage = 3 [json_name = "lastUsage"];</code>
     * @return Whether the lastUsage field is set.
     */
    public boolean hasLastUsage() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * last_usage is the date of the last transcription
     * within the billing period
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_usage = 3 [json_name = "lastUsage"];</code>
     * @return The lastUsage.
     */
    public com.google.protobuf.Timestamp getLastUsage() {
      if (lastUsageBuilder_ == null) {
        return lastUsage_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : lastUsage_;
      } else {
        return lastUsageBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * last_usage is the date of the last transcription
     * within the billing period
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_usage = 3 [json_name = "lastUsage"];</code>
     */
    public Builder setLastUsage(com.google.protobuf.Timestamp value) {
      if (lastUsageBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        lastUsage_ = value;
      } else {
        lastUsageBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * last_usage is the date of the last transcription
     * within the billing period
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_usage = 3 [json_name = "lastUsage"];</code>
     */
    public Builder setLastUsage(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (lastUsageBuilder_ == null) {
        lastUsage_ = builderForValue.build();
      } else {
        lastUsageBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * last_usage is the date of the last transcription
     * within the billing period
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_usage = 3 [json_name = "lastUsage"];</code>
     */
    public Builder mergeLastUsage(com.google.protobuf.Timestamp value) {
      if (lastUsageBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          lastUsage_ != null &&
          lastUsage_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getLastUsageBuilder().mergeFrom(value);
        } else {
          lastUsage_ = value;
        }
      } else {
        lastUsageBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * last_usage is the date of the last transcription
     * within the billing period
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_usage = 3 [json_name = "lastUsage"];</code>
     */
    public Builder clearLastUsage() {
      bitField0_ = (bitField0_ & ~0x00000004);
      lastUsage_ = null;
      if (lastUsageBuilder_ != null) {
        lastUsageBuilder_.dispose();
        lastUsageBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * last_usage is the date of the last transcription
     * within the billing period
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_usage = 3 [json_name = "lastUsage"];</code>
     */
    public com.google.protobuf.Timestamp.Builder getLastUsageBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getLastUsageFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * last_usage is the date of the last transcription
     * within the billing period
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_usage = 3 [json_name = "lastUsage"];</code>
     */
    public com.google.protobuf.TimestampOrBuilder getLastUsageOrBuilder() {
      if (lastUsageBuilder_ != null) {
        return lastUsageBuilder_.getMessageOrBuilder();
      } else {
        return lastUsage_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : lastUsage_;
      }
    }
    /**
     * <pre>
     * last_usage is the date of the last transcription
     * within the billing period
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_usage = 3 [json_name = "lastUsage"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getLastUsageFieldBuilder() {
      if (lastUsageBuilder_ == null) {
        lastUsageBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getLastUsage(),
                getParentForChildren(),
                isClean());
        lastUsage_ = null;
      }
      return lastUsageBuilder_;
    }

    private long billedTranscripts_ ;
    /**
     * <pre>
     * billed_transcripts is the number of billed transcripts
     * within the billing period
     * </pre>
     *
     * <code>int64 billed_transcripts = 4 [json_name = "billedTranscripts"];</code>
     * @return The billedTranscripts.
     */
    @java.lang.Override
    public long getBilledTranscripts() {
      return billedTranscripts_;
    }
    /**
     * <pre>
     * billed_transcripts is the number of billed transcripts
     * within the billing period
     * </pre>
     *
     * <code>int64 billed_transcripts = 4 [json_name = "billedTranscripts"];</code>
     * @param value The billedTranscripts to set.
     * @return This builder for chaining.
     */
    public Builder setBilledTranscripts(long value) {

      billedTranscripts_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * billed_transcripts is the number of billed transcripts
     * within the billing period
     * </pre>
     *
     * <code>int64 billed_transcripts = 4 [json_name = "billedTranscripts"];</code>
     * @return This builder for chaining.
     */
    public Builder clearBilledTranscripts() {
      bitField0_ = (bitField0_ & ~0x00000008);
      billedTranscripts_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:wfo.vanalytics.v2.AuditResponse)
  }

  // @@protoc_insertion_point(class_scope:wfo.vanalytics.v2.AuditResponse)
  private static final com.tcn.cloud.api.wfo.vanalytics.v2.AuditResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.wfo.vanalytics.v2.AuditResponse();
  }

  public static com.tcn.cloud.api.wfo.vanalytics.v2.AuditResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AuditResponse>
      PARSER = new com.google.protobuf.AbstractParser<AuditResponse>() {
    @java.lang.Override
    public AuditResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<AuditResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AuditResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.wfo.vanalytics.v2.AuditResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
