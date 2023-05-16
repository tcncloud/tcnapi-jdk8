// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

/**
 * <pre>
 * Represents a shift segment
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.wfm.ShiftSegment}
 */
public final class ShiftSegment extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.wfm.ShiftSegment)
    ShiftSegmentOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ShiftSegment.newBuilder() to construct.
  private ShiftSegment(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ShiftSegment() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ShiftSegment();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ShiftSegment_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ShiftSegment_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.wfm.ShiftSegment.class, com.tcn.cloud.api.api.v1alpha1.wfm.ShiftSegment.Builder.class);
  }

  public static final int SHIFT_SEGMENT_SID_FIELD_NUMBER = 1;
  private long shiftSegmentSid_ = 0L;
  /**
   * <pre>
   * ID of this shift segment.
   * </pre>
   *
   * <code>int64 shift_segment_sid = 1 [json_name = "shiftSegmentSid"];</code>
   * @return The shiftSegmentSid.
   */
  @java.lang.Override
  public long getShiftSegmentSid() {
    return shiftSegmentSid_;
  }

  public static final int SHIFT_INSTANCE_SID_FIELD_NUMBER = 2;
  private long shiftInstanceSid_ = 0L;
  /**
   * <pre>
   * ID of the shift instance that this segment belongs to.
   * </pre>
   *
   * <code>int64 shift_instance_sid = 2 [json_name = "shiftInstanceSid"];</code>
   * @return The shiftInstanceSid.
   */
  @java.lang.Override
  public long getShiftInstanceSid() {
    return shiftInstanceSid_;
  }

  public static final int ORDER_IN_SHIFT_INSTANCE_FIELD_NUMBER = 3;
  private int orderInShiftInstance_ = 0;
  /**
   * <pre>
   * Order that this segment has in it's parent shift instance.
   * </pre>
   *
   * <code>int32 order_in_shift_instance = 3 [json_name = "orderInShiftInstance"];</code>
   * @return The orderInShiftInstance.
   */
  @java.lang.Override
  public int getOrderInShiftInstance() {
    return orderInShiftInstance_;
  }

  public static final int WIDTH_IN_MINUTES_FIELD_NUMBER = 4;
  private int widthInMinutes_ = 0;
  /**
   * <pre>
   * Width of this shift segment in minutes.
   * </pre>
   *
   * <code>int32 width_in_minutes = 4 [json_name = "widthInMinutes"];</code>
   * @return The widthInMinutes.
   */
  @java.lang.Override
  public int getWidthInMinutes() {
    return widthInMinutes_;
  }

  public static final int START_MINUTE_IN_SHIFT_FIELD_NUMBER = 5;
  private int startMinuteInShift_ = 0;
  /**
   * <pre>
   * How long after the shift instance start time, the segment to begin.
   * </pre>
   *
   * <code>int32 start_minute_in_shift = 5 [json_name = "startMinuteInShift"];</code>
   * @return The startMinuteInShift.
   */
  @java.lang.Override
  public int getStartMinuteInShift() {
    return startMinuteInShift_;
  }

  public static final int SCHEDULING_ACTIVITY_SID_FIELD_NUMBER = 7;
  private long schedulingActivitySid_ = 0L;
  /**
   * <pre>
   * Scheduling activity sid of this shift segment.
   * </pre>
   *
   * <code>int64 scheduling_activity_sid = 7 [json_name = "schedulingActivitySid"];</code>
   * @return The schedulingActivitySid.
   */
  @java.lang.Override
  public long getSchedulingActivitySid() {
    return schedulingActivitySid_;
  }

  public static final int SCHEDULING_ACTIVITY_FIELD_NUMBER = 8;
  private com.tcn.cloud.api.api.v1alpha1.wfm.SchedulingActivity schedulingActivity_;
  /**
   * <pre>
   * The following field is only returned in List requests of the entity.
   * The scheduling activity referred to by &#64;scheduling_activity_sid
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.SchedulingActivity scheduling_activity = 8 [json_name = "schedulingActivity"];</code>
   * @return Whether the schedulingActivity field is set.
   */
  @java.lang.Override
  public boolean hasSchedulingActivity() {
    return schedulingActivity_ != null;
  }
  /**
   * <pre>
   * The following field is only returned in List requests of the entity.
   * The scheduling activity referred to by &#64;scheduling_activity_sid
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.SchedulingActivity scheduling_activity = 8 [json_name = "schedulingActivity"];</code>
   * @return The schedulingActivity.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.SchedulingActivity getSchedulingActivity() {
    return schedulingActivity_ == null ? com.tcn.cloud.api.api.v1alpha1.wfm.SchedulingActivity.getDefaultInstance() : schedulingActivity_;
  }
  /**
   * <pre>
   * The following field is only returned in List requests of the entity.
   * The scheduling activity referred to by &#64;scheduling_activity_sid
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.SchedulingActivity scheduling_activity = 8 [json_name = "schedulingActivity"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.SchedulingActivityOrBuilder getSchedulingActivityOrBuilder() {
    return schedulingActivity_ == null ? com.tcn.cloud.api.api.v1alpha1.wfm.SchedulingActivity.getDefaultInstance() : schedulingActivity_;
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
    if (shiftSegmentSid_ != 0L) {
      output.writeInt64(1, shiftSegmentSid_);
    }
    if (shiftInstanceSid_ != 0L) {
      output.writeInt64(2, shiftInstanceSid_);
    }
    if (orderInShiftInstance_ != 0) {
      output.writeInt32(3, orderInShiftInstance_);
    }
    if (widthInMinutes_ != 0) {
      output.writeInt32(4, widthInMinutes_);
    }
    if (startMinuteInShift_ != 0) {
      output.writeInt32(5, startMinuteInShift_);
    }
    if (schedulingActivitySid_ != 0L) {
      output.writeInt64(7, schedulingActivitySid_);
    }
    if (schedulingActivity_ != null) {
      output.writeMessage(8, getSchedulingActivity());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (shiftSegmentSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, shiftSegmentSid_);
    }
    if (shiftInstanceSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, shiftInstanceSid_);
    }
    if (orderInShiftInstance_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, orderInShiftInstance_);
    }
    if (widthInMinutes_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, widthInMinutes_);
    }
    if (startMinuteInShift_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, startMinuteInShift_);
    }
    if (schedulingActivitySid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(7, schedulingActivitySid_);
    }
    if (schedulingActivity_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(8, getSchedulingActivity());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.wfm.ShiftSegment)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.wfm.ShiftSegment other = (com.tcn.cloud.api.api.v1alpha1.wfm.ShiftSegment) obj;

    if (getShiftSegmentSid()
        != other.getShiftSegmentSid()) return false;
    if (getShiftInstanceSid()
        != other.getShiftInstanceSid()) return false;
    if (getOrderInShiftInstance()
        != other.getOrderInShiftInstance()) return false;
    if (getWidthInMinutes()
        != other.getWidthInMinutes()) return false;
    if (getStartMinuteInShift()
        != other.getStartMinuteInShift()) return false;
    if (getSchedulingActivitySid()
        != other.getSchedulingActivitySid()) return false;
    if (hasSchedulingActivity() != other.hasSchedulingActivity()) return false;
    if (hasSchedulingActivity()) {
      if (!getSchedulingActivity()
          .equals(other.getSchedulingActivity())) return false;
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
    hash = (37 * hash) + SHIFT_SEGMENT_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getShiftSegmentSid());
    hash = (37 * hash) + SHIFT_INSTANCE_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getShiftInstanceSid());
    hash = (37 * hash) + ORDER_IN_SHIFT_INSTANCE_FIELD_NUMBER;
    hash = (53 * hash) + getOrderInShiftInstance();
    hash = (37 * hash) + WIDTH_IN_MINUTES_FIELD_NUMBER;
    hash = (53 * hash) + getWidthInMinutes();
    hash = (37 * hash) + START_MINUTE_IN_SHIFT_FIELD_NUMBER;
    hash = (53 * hash) + getStartMinuteInShift();
    hash = (37 * hash) + SCHEDULING_ACTIVITY_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSchedulingActivitySid());
    if (hasSchedulingActivity()) {
      hash = (37 * hash) + SCHEDULING_ACTIVITY_FIELD_NUMBER;
      hash = (53 * hash) + getSchedulingActivity().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ShiftSegment parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ShiftSegment parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ShiftSegment parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ShiftSegment parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ShiftSegment parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ShiftSegment parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ShiftSegment parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ShiftSegment parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ShiftSegment parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ShiftSegment parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ShiftSegment parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ShiftSegment parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.wfm.ShiftSegment prototype) {
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
   * Represents a shift segment
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.wfm.ShiftSegment}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.wfm.ShiftSegment)
      com.tcn.cloud.api.api.v1alpha1.wfm.ShiftSegmentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ShiftSegment_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ShiftSegment_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.wfm.ShiftSegment.class, com.tcn.cloud.api.api.v1alpha1.wfm.ShiftSegment.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.wfm.ShiftSegment.newBuilder()
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
      shiftSegmentSid_ = 0L;
      shiftInstanceSid_ = 0L;
      orderInShiftInstance_ = 0;
      widthInMinutes_ = 0;
      startMinuteInShift_ = 0;
      schedulingActivitySid_ = 0L;
      schedulingActivity_ = null;
      if (schedulingActivityBuilder_ != null) {
        schedulingActivityBuilder_.dispose();
        schedulingActivityBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ShiftSegment_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.ShiftSegment getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.ShiftSegment.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.ShiftSegment build() {
      com.tcn.cloud.api.api.v1alpha1.wfm.ShiftSegment result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.ShiftSegment buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.wfm.ShiftSegment result = new com.tcn.cloud.api.api.v1alpha1.wfm.ShiftSegment(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.wfm.ShiftSegment result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.shiftSegmentSid_ = shiftSegmentSid_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.shiftInstanceSid_ = shiftInstanceSid_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.orderInShiftInstance_ = orderInShiftInstance_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.widthInMinutes_ = widthInMinutes_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.startMinuteInShift_ = startMinuteInShift_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.schedulingActivitySid_ = schedulingActivitySid_;
      }
      if (((from_bitField0_ & 0x00000040) != 0)) {
        result.schedulingActivity_ = schedulingActivityBuilder_ == null
            ? schedulingActivity_
            : schedulingActivityBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.wfm.ShiftSegment) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.wfm.ShiftSegment)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.wfm.ShiftSegment other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.wfm.ShiftSegment.getDefaultInstance()) return this;
      if (other.getShiftSegmentSid() != 0L) {
        setShiftSegmentSid(other.getShiftSegmentSid());
      }
      if (other.getShiftInstanceSid() != 0L) {
        setShiftInstanceSid(other.getShiftInstanceSid());
      }
      if (other.getOrderInShiftInstance() != 0) {
        setOrderInShiftInstance(other.getOrderInShiftInstance());
      }
      if (other.getWidthInMinutes() != 0) {
        setWidthInMinutes(other.getWidthInMinutes());
      }
      if (other.getStartMinuteInShift() != 0) {
        setStartMinuteInShift(other.getStartMinuteInShift());
      }
      if (other.getSchedulingActivitySid() != 0L) {
        setSchedulingActivitySid(other.getSchedulingActivitySid());
      }
      if (other.hasSchedulingActivity()) {
        mergeSchedulingActivity(other.getSchedulingActivity());
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
              shiftSegmentSid_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              shiftInstanceSid_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              orderInShiftInstance_ = input.readInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              widthInMinutes_ = input.readInt32();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 40: {
              startMinuteInShift_ = input.readInt32();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
            case 56: {
              schedulingActivitySid_ = input.readInt64();
              bitField0_ |= 0x00000020;
              break;
            } // case 56
            case 66: {
              input.readMessage(
                  getSchedulingActivityFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000040;
              break;
            } // case 66
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

    private long shiftSegmentSid_ ;
    /**
     * <pre>
     * ID of this shift segment.
     * </pre>
     *
     * <code>int64 shift_segment_sid = 1 [json_name = "shiftSegmentSid"];</code>
     * @return The shiftSegmentSid.
     */
    @java.lang.Override
    public long getShiftSegmentSid() {
      return shiftSegmentSid_;
    }
    /**
     * <pre>
     * ID of this shift segment.
     * </pre>
     *
     * <code>int64 shift_segment_sid = 1 [json_name = "shiftSegmentSid"];</code>
     * @param value The shiftSegmentSid to set.
     * @return This builder for chaining.
     */
    public Builder setShiftSegmentSid(long value) {

      shiftSegmentSid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ID of this shift segment.
     * </pre>
     *
     * <code>int64 shift_segment_sid = 1 [json_name = "shiftSegmentSid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearShiftSegmentSid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      shiftSegmentSid_ = 0L;
      onChanged();
      return this;
    }

    private long shiftInstanceSid_ ;
    /**
     * <pre>
     * ID of the shift instance that this segment belongs to.
     * </pre>
     *
     * <code>int64 shift_instance_sid = 2 [json_name = "shiftInstanceSid"];</code>
     * @return The shiftInstanceSid.
     */
    @java.lang.Override
    public long getShiftInstanceSid() {
      return shiftInstanceSid_;
    }
    /**
     * <pre>
     * ID of the shift instance that this segment belongs to.
     * </pre>
     *
     * <code>int64 shift_instance_sid = 2 [json_name = "shiftInstanceSid"];</code>
     * @param value The shiftInstanceSid to set.
     * @return This builder for chaining.
     */
    public Builder setShiftInstanceSid(long value) {

      shiftInstanceSid_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ID of the shift instance that this segment belongs to.
     * </pre>
     *
     * <code>int64 shift_instance_sid = 2 [json_name = "shiftInstanceSid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearShiftInstanceSid() {
      bitField0_ = (bitField0_ & ~0x00000002);
      shiftInstanceSid_ = 0L;
      onChanged();
      return this;
    }

    private int orderInShiftInstance_ ;
    /**
     * <pre>
     * Order that this segment has in it's parent shift instance.
     * </pre>
     *
     * <code>int32 order_in_shift_instance = 3 [json_name = "orderInShiftInstance"];</code>
     * @return The orderInShiftInstance.
     */
    @java.lang.Override
    public int getOrderInShiftInstance() {
      return orderInShiftInstance_;
    }
    /**
     * <pre>
     * Order that this segment has in it's parent shift instance.
     * </pre>
     *
     * <code>int32 order_in_shift_instance = 3 [json_name = "orderInShiftInstance"];</code>
     * @param value The orderInShiftInstance to set.
     * @return This builder for chaining.
     */
    public Builder setOrderInShiftInstance(int value) {

      orderInShiftInstance_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Order that this segment has in it's parent shift instance.
     * </pre>
     *
     * <code>int32 order_in_shift_instance = 3 [json_name = "orderInShiftInstance"];</code>
     * @return This builder for chaining.
     */
    public Builder clearOrderInShiftInstance() {
      bitField0_ = (bitField0_ & ~0x00000004);
      orderInShiftInstance_ = 0;
      onChanged();
      return this;
    }

    private int widthInMinutes_ ;
    /**
     * <pre>
     * Width of this shift segment in minutes.
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
     * Width of this shift segment in minutes.
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
     * Width of this shift segment in minutes.
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

    private int startMinuteInShift_ ;
    /**
     * <pre>
     * How long after the shift instance start time, the segment to begin.
     * </pre>
     *
     * <code>int32 start_minute_in_shift = 5 [json_name = "startMinuteInShift"];</code>
     * @return The startMinuteInShift.
     */
    @java.lang.Override
    public int getStartMinuteInShift() {
      return startMinuteInShift_;
    }
    /**
     * <pre>
     * How long after the shift instance start time, the segment to begin.
     * </pre>
     *
     * <code>int32 start_minute_in_shift = 5 [json_name = "startMinuteInShift"];</code>
     * @param value The startMinuteInShift to set.
     * @return This builder for chaining.
     */
    public Builder setStartMinuteInShift(int value) {

      startMinuteInShift_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * How long after the shift instance start time, the segment to begin.
     * </pre>
     *
     * <code>int32 start_minute_in_shift = 5 [json_name = "startMinuteInShift"];</code>
     * @return This builder for chaining.
     */
    public Builder clearStartMinuteInShift() {
      bitField0_ = (bitField0_ & ~0x00000010);
      startMinuteInShift_ = 0;
      onChanged();
      return this;
    }

    private long schedulingActivitySid_ ;
    /**
     * <pre>
     * Scheduling activity sid of this shift segment.
     * </pre>
     *
     * <code>int64 scheduling_activity_sid = 7 [json_name = "schedulingActivitySid"];</code>
     * @return The schedulingActivitySid.
     */
    @java.lang.Override
    public long getSchedulingActivitySid() {
      return schedulingActivitySid_;
    }
    /**
     * <pre>
     * Scheduling activity sid of this shift segment.
     * </pre>
     *
     * <code>int64 scheduling_activity_sid = 7 [json_name = "schedulingActivitySid"];</code>
     * @param value The schedulingActivitySid to set.
     * @return This builder for chaining.
     */
    public Builder setSchedulingActivitySid(long value) {

      schedulingActivitySid_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Scheduling activity sid of this shift segment.
     * </pre>
     *
     * <code>int64 scheduling_activity_sid = 7 [json_name = "schedulingActivitySid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSchedulingActivitySid() {
      bitField0_ = (bitField0_ & ~0x00000020);
      schedulingActivitySid_ = 0L;
      onChanged();
      return this;
    }

    private com.tcn.cloud.api.api.v1alpha1.wfm.SchedulingActivity schedulingActivity_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.wfm.SchedulingActivity, com.tcn.cloud.api.api.v1alpha1.wfm.SchedulingActivity.Builder, com.tcn.cloud.api.api.v1alpha1.wfm.SchedulingActivityOrBuilder> schedulingActivityBuilder_;
    /**
     * <pre>
     * The following field is only returned in List requests of the entity.
     * The scheduling activity referred to by &#64;scheduling_activity_sid
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.SchedulingActivity scheduling_activity = 8 [json_name = "schedulingActivity"];</code>
     * @return Whether the schedulingActivity field is set.
     */
    public boolean hasSchedulingActivity() {
      return ((bitField0_ & 0x00000040) != 0);
    }
    /**
     * <pre>
     * The following field is only returned in List requests of the entity.
     * The scheduling activity referred to by &#64;scheduling_activity_sid
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.SchedulingActivity scheduling_activity = 8 [json_name = "schedulingActivity"];</code>
     * @return The schedulingActivity.
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.SchedulingActivity getSchedulingActivity() {
      if (schedulingActivityBuilder_ == null) {
        return schedulingActivity_ == null ? com.tcn.cloud.api.api.v1alpha1.wfm.SchedulingActivity.getDefaultInstance() : schedulingActivity_;
      } else {
        return schedulingActivityBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The following field is only returned in List requests of the entity.
     * The scheduling activity referred to by &#64;scheduling_activity_sid
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.SchedulingActivity scheduling_activity = 8 [json_name = "schedulingActivity"];</code>
     */
    public Builder setSchedulingActivity(com.tcn.cloud.api.api.v1alpha1.wfm.SchedulingActivity value) {
      if (schedulingActivityBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        schedulingActivity_ = value;
      } else {
        schedulingActivityBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000040;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The following field is only returned in List requests of the entity.
     * The scheduling activity referred to by &#64;scheduling_activity_sid
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.SchedulingActivity scheduling_activity = 8 [json_name = "schedulingActivity"];</code>
     */
    public Builder setSchedulingActivity(
        com.tcn.cloud.api.api.v1alpha1.wfm.SchedulingActivity.Builder builderForValue) {
      if (schedulingActivityBuilder_ == null) {
        schedulingActivity_ = builderForValue.build();
      } else {
        schedulingActivityBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000040;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The following field is only returned in List requests of the entity.
     * The scheduling activity referred to by &#64;scheduling_activity_sid
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.SchedulingActivity scheduling_activity = 8 [json_name = "schedulingActivity"];</code>
     */
    public Builder mergeSchedulingActivity(com.tcn.cloud.api.api.v1alpha1.wfm.SchedulingActivity value) {
      if (schedulingActivityBuilder_ == null) {
        if (((bitField0_ & 0x00000040) != 0) &&
          schedulingActivity_ != null &&
          schedulingActivity_ != com.tcn.cloud.api.api.v1alpha1.wfm.SchedulingActivity.getDefaultInstance()) {
          getSchedulingActivityBuilder().mergeFrom(value);
        } else {
          schedulingActivity_ = value;
        }
      } else {
        schedulingActivityBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000040;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The following field is only returned in List requests of the entity.
     * The scheduling activity referred to by &#64;scheduling_activity_sid
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.SchedulingActivity scheduling_activity = 8 [json_name = "schedulingActivity"];</code>
     */
    public Builder clearSchedulingActivity() {
      bitField0_ = (bitField0_ & ~0x00000040);
      schedulingActivity_ = null;
      if (schedulingActivityBuilder_ != null) {
        schedulingActivityBuilder_.dispose();
        schedulingActivityBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The following field is only returned in List requests of the entity.
     * The scheduling activity referred to by &#64;scheduling_activity_sid
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.SchedulingActivity scheduling_activity = 8 [json_name = "schedulingActivity"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.SchedulingActivity.Builder getSchedulingActivityBuilder() {
      bitField0_ |= 0x00000040;
      onChanged();
      return getSchedulingActivityFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The following field is only returned in List requests of the entity.
     * The scheduling activity referred to by &#64;scheduling_activity_sid
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.SchedulingActivity scheduling_activity = 8 [json_name = "schedulingActivity"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.SchedulingActivityOrBuilder getSchedulingActivityOrBuilder() {
      if (schedulingActivityBuilder_ != null) {
        return schedulingActivityBuilder_.getMessageOrBuilder();
      } else {
        return schedulingActivity_ == null ?
            com.tcn.cloud.api.api.v1alpha1.wfm.SchedulingActivity.getDefaultInstance() : schedulingActivity_;
      }
    }
    /**
     * <pre>
     * The following field is only returned in List requests of the entity.
     * The scheduling activity referred to by &#64;scheduling_activity_sid
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.SchedulingActivity scheduling_activity = 8 [json_name = "schedulingActivity"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.wfm.SchedulingActivity, com.tcn.cloud.api.api.v1alpha1.wfm.SchedulingActivity.Builder, com.tcn.cloud.api.api.v1alpha1.wfm.SchedulingActivityOrBuilder> 
        getSchedulingActivityFieldBuilder() {
      if (schedulingActivityBuilder_ == null) {
        schedulingActivityBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.wfm.SchedulingActivity, com.tcn.cloud.api.api.v1alpha1.wfm.SchedulingActivity.Builder, com.tcn.cloud.api.api.v1alpha1.wfm.SchedulingActivityOrBuilder>(
                getSchedulingActivity(),
                getParentForChildren(),
                isClean());
        schedulingActivity_ = null;
      }
      return schedulingActivityBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.wfm.ShiftSegment)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.wfm.ShiftSegment)
  private static final com.tcn.cloud.api.api.v1alpha1.wfm.ShiftSegment DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.wfm.ShiftSegment();
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ShiftSegment getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ShiftSegment>
      PARSER = new com.google.protobuf.AbstractParser<ShiftSegment>() {
    @java.lang.Override
    public ShiftSegment parsePartialFrom(
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

  public static com.google.protobuf.Parser<ShiftSegment> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ShiftSegment> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.ShiftSegment getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

