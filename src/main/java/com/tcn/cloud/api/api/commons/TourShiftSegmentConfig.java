// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/wfm.proto

package com.tcn.cloud.api.api.commons;

/**
 * <pre>
 * Represents a TourShiftSegmentConfig
 * </pre>
 *
 * Protobuf type {@code api.commons.TourShiftSegmentConfig}
 */
public final class TourShiftSegmentConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.commons.TourShiftSegmentConfig)
    TourShiftSegmentConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TourShiftSegmentConfig.newBuilder() to construct.
  private TourShiftSegmentConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TourShiftSegmentConfig() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TourShiftSegmentConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.commons.WfmProto.internal_static_api_commons_TourShiftSegmentConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.commons.WfmProto.internal_static_api_commons_TourShiftSegmentConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.commons.TourShiftSegmentConfig.class, com.tcn.cloud.api.api.commons.TourShiftSegmentConfig.Builder.class);
  }

  public static final int TOUR_SHIFT_SEGMENT_CONFIG_SID_FIELD_NUMBER = 1;
  private long tourShiftSegmentConfigSid_ = 0L;
  /**
   * <pre>
   * The unique ID of the tour shift segment config.
   * </pre>
   *
   * <code>int64 tour_shift_segment_config_sid = 1 [json_name = "tourShiftSegmentConfigSid"];</code>
   * @return The tourShiftSegmentConfigSid.
   */
  @java.lang.Override
  public long getTourShiftSegmentConfigSid() {
    return tourShiftSegmentConfigSid_;
  }

  public static final int TOUR_SHIFT_INSTANCE_CONFIG_SID_FIELD_NUMBER = 2;
  private long tourShiftInstanceConfigSid_ = 0L;
  /**
   * <pre>
   * The ID of the parent tour shift instance config
   * </pre>
   *
   * <code>int64 tour_shift_instance_config_sid = 2 [json_name = "tourShiftInstanceConfigSid"];</code>
   * @return The tourShiftInstanceConfigSid.
   */
  @java.lang.Override
  public long getTourShiftInstanceConfigSid() {
    return tourShiftInstanceConfigSid_;
  }

  public static final int START_MINUTE_IN_SHIFT_FIELD_NUMBER = 3;
  private int startMinuteInShift_ = 0;
  /**
   * <pre>
   * The minute within the shift instance config where the shift segment config starts.
   * </pre>
   *
   * <code>int32 start_minute_in_shift = 3 [json_name = "startMinuteInShift"];</code>
   * @return The startMinuteInShift.
   */
  @java.lang.Override
  public int getStartMinuteInShift() {
    return startMinuteInShift_;
  }

  public static final int WIDTH_IN_MINUTES_FIELD_NUMBER = 4;
  private int widthInMinutes_ = 0;
  /**
   * <pre>
   * The number of minutes wide that the segment covers.
   * </pre>
   *
   * <code>int32 width_in_minutes = 4 [json_name = "widthInMinutes"];</code>
   * @return The widthInMinutes.
   */
  @java.lang.Override
  public int getWidthInMinutes() {
    return widthInMinutes_;
  }

  public static final int SCHEDULING_ACTIVITY_SID_FIELD_NUMBER = 5;
  private long schedulingActivitySid_ = 0L;
  /**
   * <pre>
   * The ID of the scheduling activity that the segment will schedule.
   * </pre>
   *
   * <code>int64 scheduling_activity_sid = 5 [json_name = "schedulingActivitySid"];</code>
   * @return The schedulingActivitySid.
   */
  @java.lang.Override
  public long getSchedulingActivitySid() {
    return schedulingActivitySid_;
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
    if (tourShiftSegmentConfigSid_ != 0L) {
      output.writeInt64(1, tourShiftSegmentConfigSid_);
    }
    if (tourShiftInstanceConfigSid_ != 0L) {
      output.writeInt64(2, tourShiftInstanceConfigSid_);
    }
    if (startMinuteInShift_ != 0) {
      output.writeInt32(3, startMinuteInShift_);
    }
    if (widthInMinutes_ != 0) {
      output.writeInt32(4, widthInMinutes_);
    }
    if (schedulingActivitySid_ != 0L) {
      output.writeInt64(5, schedulingActivitySid_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (tourShiftSegmentConfigSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, tourShiftSegmentConfigSid_);
    }
    if (tourShiftInstanceConfigSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, tourShiftInstanceConfigSid_);
    }
    if (startMinuteInShift_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, startMinuteInShift_);
    }
    if (widthInMinutes_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, widthInMinutes_);
    }
    if (schedulingActivitySid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, schedulingActivitySid_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.commons.TourShiftSegmentConfig)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.commons.TourShiftSegmentConfig other = (com.tcn.cloud.api.api.commons.TourShiftSegmentConfig) obj;

    if (getTourShiftSegmentConfigSid()
        != other.getTourShiftSegmentConfigSid()) return false;
    if (getTourShiftInstanceConfigSid()
        != other.getTourShiftInstanceConfigSid()) return false;
    if (getStartMinuteInShift()
        != other.getStartMinuteInShift()) return false;
    if (getWidthInMinutes()
        != other.getWidthInMinutes()) return false;
    if (getSchedulingActivitySid()
        != other.getSchedulingActivitySid()) return false;
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
    hash = (37 * hash) + TOUR_SHIFT_SEGMENT_CONFIG_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTourShiftSegmentConfigSid());
    hash = (37 * hash) + TOUR_SHIFT_INSTANCE_CONFIG_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTourShiftInstanceConfigSid());
    hash = (37 * hash) + START_MINUTE_IN_SHIFT_FIELD_NUMBER;
    hash = (53 * hash) + getStartMinuteInShift();
    hash = (37 * hash) + WIDTH_IN_MINUTES_FIELD_NUMBER;
    hash = (53 * hash) + getWidthInMinutes();
    hash = (37 * hash) + SCHEDULING_ACTIVITY_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSchedulingActivitySid());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.commons.TourShiftSegmentConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.TourShiftSegmentConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.TourShiftSegmentConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.TourShiftSegmentConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.TourShiftSegmentConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.TourShiftSegmentConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.TourShiftSegmentConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.TourShiftSegmentConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.commons.TourShiftSegmentConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.commons.TourShiftSegmentConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.TourShiftSegmentConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.TourShiftSegmentConfig parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.commons.TourShiftSegmentConfig prototype) {
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
   * Represents a TourShiftSegmentConfig
   * </pre>
   *
   * Protobuf type {@code api.commons.TourShiftSegmentConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.commons.TourShiftSegmentConfig)
      com.tcn.cloud.api.api.commons.TourShiftSegmentConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.WfmProto.internal_static_api_commons_TourShiftSegmentConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.commons.WfmProto.internal_static_api_commons_TourShiftSegmentConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.commons.TourShiftSegmentConfig.class, com.tcn.cloud.api.api.commons.TourShiftSegmentConfig.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.commons.TourShiftSegmentConfig.newBuilder()
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
      tourShiftSegmentConfigSid_ = 0L;
      tourShiftInstanceConfigSid_ = 0L;
      startMinuteInShift_ = 0;
      widthInMinutes_ = 0;
      schedulingActivitySid_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.commons.WfmProto.internal_static_api_commons_TourShiftSegmentConfig_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.TourShiftSegmentConfig getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.commons.TourShiftSegmentConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.TourShiftSegmentConfig build() {
      com.tcn.cloud.api.api.commons.TourShiftSegmentConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.TourShiftSegmentConfig buildPartial() {
      com.tcn.cloud.api.api.commons.TourShiftSegmentConfig result = new com.tcn.cloud.api.api.commons.TourShiftSegmentConfig(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.commons.TourShiftSegmentConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.tourShiftSegmentConfigSid_ = tourShiftSegmentConfigSid_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.tourShiftInstanceConfigSid_ = tourShiftInstanceConfigSid_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.startMinuteInShift_ = startMinuteInShift_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.widthInMinutes_ = widthInMinutes_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.schedulingActivitySid_ = schedulingActivitySid_;
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
      if (other instanceof com.tcn.cloud.api.api.commons.TourShiftSegmentConfig) {
        return mergeFrom((com.tcn.cloud.api.api.commons.TourShiftSegmentConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.commons.TourShiftSegmentConfig other) {
      if (other == com.tcn.cloud.api.api.commons.TourShiftSegmentConfig.getDefaultInstance()) return this;
      if (other.getTourShiftSegmentConfigSid() != 0L) {
        setTourShiftSegmentConfigSid(other.getTourShiftSegmentConfigSid());
      }
      if (other.getTourShiftInstanceConfigSid() != 0L) {
        setTourShiftInstanceConfigSid(other.getTourShiftInstanceConfigSid());
      }
      if (other.getStartMinuteInShift() != 0) {
        setStartMinuteInShift(other.getStartMinuteInShift());
      }
      if (other.getWidthInMinutes() != 0) {
        setWidthInMinutes(other.getWidthInMinutes());
      }
      if (other.getSchedulingActivitySid() != 0L) {
        setSchedulingActivitySid(other.getSchedulingActivitySid());
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
              tourShiftSegmentConfigSid_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              tourShiftInstanceConfigSid_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              startMinuteInShift_ = input.readInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              widthInMinutes_ = input.readInt32();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 40: {
              schedulingActivitySid_ = input.readInt64();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
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

    private long tourShiftSegmentConfigSid_ ;
    /**
     * <pre>
     * The unique ID of the tour shift segment config.
     * </pre>
     *
     * <code>int64 tour_shift_segment_config_sid = 1 [json_name = "tourShiftSegmentConfigSid"];</code>
     * @return The tourShiftSegmentConfigSid.
     */
    @java.lang.Override
    public long getTourShiftSegmentConfigSid() {
      return tourShiftSegmentConfigSid_;
    }
    /**
     * <pre>
     * The unique ID of the tour shift segment config.
     * </pre>
     *
     * <code>int64 tour_shift_segment_config_sid = 1 [json_name = "tourShiftSegmentConfigSid"];</code>
     * @param value The tourShiftSegmentConfigSid to set.
     * @return This builder for chaining.
     */
    public Builder setTourShiftSegmentConfigSid(long value) {

      tourShiftSegmentConfigSid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The unique ID of the tour shift segment config.
     * </pre>
     *
     * <code>int64 tour_shift_segment_config_sid = 1 [json_name = "tourShiftSegmentConfigSid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTourShiftSegmentConfigSid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      tourShiftSegmentConfigSid_ = 0L;
      onChanged();
      return this;
    }

    private long tourShiftInstanceConfigSid_ ;
    /**
     * <pre>
     * The ID of the parent tour shift instance config
     * </pre>
     *
     * <code>int64 tour_shift_instance_config_sid = 2 [json_name = "tourShiftInstanceConfigSid"];</code>
     * @return The tourShiftInstanceConfigSid.
     */
    @java.lang.Override
    public long getTourShiftInstanceConfigSid() {
      return tourShiftInstanceConfigSid_;
    }
    /**
     * <pre>
     * The ID of the parent tour shift instance config
     * </pre>
     *
     * <code>int64 tour_shift_instance_config_sid = 2 [json_name = "tourShiftInstanceConfigSid"];</code>
     * @param value The tourShiftInstanceConfigSid to set.
     * @return This builder for chaining.
     */
    public Builder setTourShiftInstanceConfigSid(long value) {

      tourShiftInstanceConfigSid_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ID of the parent tour shift instance config
     * </pre>
     *
     * <code>int64 tour_shift_instance_config_sid = 2 [json_name = "tourShiftInstanceConfigSid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTourShiftInstanceConfigSid() {
      bitField0_ = (bitField0_ & ~0x00000002);
      tourShiftInstanceConfigSid_ = 0L;
      onChanged();
      return this;
    }

    private int startMinuteInShift_ ;
    /**
     * <pre>
     * The minute within the shift instance config where the shift segment config starts.
     * </pre>
     *
     * <code>int32 start_minute_in_shift = 3 [json_name = "startMinuteInShift"];</code>
     * @return The startMinuteInShift.
     */
    @java.lang.Override
    public int getStartMinuteInShift() {
      return startMinuteInShift_;
    }
    /**
     * <pre>
     * The minute within the shift instance config where the shift segment config starts.
     * </pre>
     *
     * <code>int32 start_minute_in_shift = 3 [json_name = "startMinuteInShift"];</code>
     * @param value The startMinuteInShift to set.
     * @return This builder for chaining.
     */
    public Builder setStartMinuteInShift(int value) {

      startMinuteInShift_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The minute within the shift instance config where the shift segment config starts.
     * </pre>
     *
     * <code>int32 start_minute_in_shift = 3 [json_name = "startMinuteInShift"];</code>
     * @return This builder for chaining.
     */
    public Builder clearStartMinuteInShift() {
      bitField0_ = (bitField0_ & ~0x00000004);
      startMinuteInShift_ = 0;
      onChanged();
      return this;
    }

    private int widthInMinutes_ ;
    /**
     * <pre>
     * The number of minutes wide that the segment covers.
     * </pre>
     *
     * <code>int32 width_in_minutes = 4 [json_name = "widthInMinutes"];</code>
     * @return The widthInMinutes.
     */
    @java.lang.Override
    public int getWidthInMinutes() {
      return widthInMinutes_;
    }
    /**
     * <pre>
     * The number of minutes wide that the segment covers.
     * </pre>
     *
     * <code>int32 width_in_minutes = 4 [json_name = "widthInMinutes"];</code>
     * @param value The widthInMinutes to set.
     * @return This builder for chaining.
     */
    public Builder setWidthInMinutes(int value) {

      widthInMinutes_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The number of minutes wide that the segment covers.
     * </pre>
     *
     * <code>int32 width_in_minutes = 4 [json_name = "widthInMinutes"];</code>
     * @return This builder for chaining.
     */
    public Builder clearWidthInMinutes() {
      bitField0_ = (bitField0_ & ~0x00000008);
      widthInMinutes_ = 0;
      onChanged();
      return this;
    }

    private long schedulingActivitySid_ ;
    /**
     * <pre>
     * The ID of the scheduling activity that the segment will schedule.
     * </pre>
     *
     * <code>int64 scheduling_activity_sid = 5 [json_name = "schedulingActivitySid"];</code>
     * @return The schedulingActivitySid.
     */
    @java.lang.Override
    public long getSchedulingActivitySid() {
      return schedulingActivitySid_;
    }
    /**
     * <pre>
     * The ID of the scheduling activity that the segment will schedule.
     * </pre>
     *
     * <code>int64 scheduling_activity_sid = 5 [json_name = "schedulingActivitySid"];</code>
     * @param value The schedulingActivitySid to set.
     * @return This builder for chaining.
     */
    public Builder setSchedulingActivitySid(long value) {

      schedulingActivitySid_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ID of the scheduling activity that the segment will schedule.
     * </pre>
     *
     * <code>int64 scheduling_activity_sid = 5 [json_name = "schedulingActivitySid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSchedulingActivitySid() {
      bitField0_ = (bitField0_ & ~0x00000010);
      schedulingActivitySid_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:api.commons.TourShiftSegmentConfig)
  }

  // @@protoc_insertion_point(class_scope:api.commons.TourShiftSegmentConfig)
  private static final com.tcn.cloud.api.api.commons.TourShiftSegmentConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.commons.TourShiftSegmentConfig();
  }

  public static com.tcn.cloud.api.api.commons.TourShiftSegmentConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TourShiftSegmentConfig>
      PARSER = new com.google.protobuf.AbstractParser<TourShiftSegmentConfig>() {
    @java.lang.Override
    public TourShiftSegmentConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<TourShiftSegmentConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TourShiftSegmentConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.commons.TourShiftSegmentConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

