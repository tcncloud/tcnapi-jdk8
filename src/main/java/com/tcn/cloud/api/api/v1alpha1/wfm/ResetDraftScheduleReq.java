// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

/**
 * <pre>
 * Request message for the ResetDraftSchedule RPC
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.wfm.ResetDraftScheduleReq}
 */
public final class ResetDraftScheduleReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.wfm.ResetDraftScheduleReq)
    ResetDraftScheduleReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ResetDraftScheduleReq.newBuilder() to construct.
  private ResetDraftScheduleReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ResetDraftScheduleReq() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ResetDraftScheduleReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ResetDraftScheduleReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ResetDraftScheduleReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.wfm.ResetDraftScheduleReq.class, com.tcn.cloud.api.api.v1alpha1.wfm.ResetDraftScheduleReq.Builder.class);
  }

  public static final int DRAFT_SCHEDULE_SID_FIELD_NUMBER = 1;
  private long draftScheduleSid_ = 0L;
  /**
   * <pre>
   * ID of the draft schedule to reset.
   * </pre>
   *
   * <code>int64 draft_schedule_sid = 1 [json_name = "draftScheduleSid"];</code>
   * @return The draftScheduleSid.
   */
  @java.lang.Override
  public long getDraftScheduleSid() {
    return draftScheduleSid_;
  }

  public static final int DATETIME_RANGE_FIELD_NUMBER = 2;
  private com.tcn.cloud.api.api.commons.DatetimeRange datetimeRange_;
  /**
   * <pre>
   * Date range to of the draft to reset.
   * If left blank, the full range for the draft schedule will be used by default.
   * </pre>
   *
   * <code>.api.commons.DatetimeRange datetime_range = 2 [json_name = "datetimeRange"];</code>
   * @return Whether the datetimeRange field is set.
   */
  @java.lang.Override
  public boolean hasDatetimeRange() {
    return datetimeRange_ != null;
  }
  /**
   * <pre>
   * Date range to of the draft to reset.
   * If left blank, the full range for the draft schedule will be used by default.
   * </pre>
   *
   * <code>.api.commons.DatetimeRange datetime_range = 2 [json_name = "datetimeRange"];</code>
   * @return The datetimeRange.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.DatetimeRange getDatetimeRange() {
    return datetimeRange_ == null ? com.tcn.cloud.api.api.commons.DatetimeRange.getDefaultInstance() : datetimeRange_;
  }
  /**
   * <pre>
   * Date range to of the draft to reset.
   * If left blank, the full range for the draft schedule will be used by default.
   * </pre>
   *
   * <code>.api.commons.DatetimeRange datetime_range = 2 [json_name = "datetimeRange"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.DatetimeRangeOrBuilder getDatetimeRangeOrBuilder() {
    return datetimeRange_ == null ? com.tcn.cloud.api.api.commons.DatetimeRange.getDefaultInstance() : datetimeRange_;
  }

  public static final int UNLOCKED_ONLY_FIELD_NUMBER = 3;
  private boolean unlockedOnly_ = false;
  /**
   * <pre>
   * Set to true to only delete unlocked shifts from &#64;draft_schedule_sid.
   * </pre>
   *
   * <code>bool unlocked_only = 3 [json_name = "unlockedOnly"];</code>
   * @return The unlockedOnly.
   */
  @java.lang.Override
  public boolean getUnlockedOnly() {
    return unlockedOnly_;
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
    if (draftScheduleSid_ != 0L) {
      output.writeInt64(1, draftScheduleSid_);
    }
    if (datetimeRange_ != null) {
      output.writeMessage(2, getDatetimeRange());
    }
    if (unlockedOnly_ != false) {
      output.writeBool(3, unlockedOnly_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (draftScheduleSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, draftScheduleSid_);
    }
    if (datetimeRange_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getDatetimeRange());
    }
    if (unlockedOnly_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, unlockedOnly_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.wfm.ResetDraftScheduleReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.wfm.ResetDraftScheduleReq other = (com.tcn.cloud.api.api.v1alpha1.wfm.ResetDraftScheduleReq) obj;

    if (getDraftScheduleSid()
        != other.getDraftScheduleSid()) return false;
    if (hasDatetimeRange() != other.hasDatetimeRange()) return false;
    if (hasDatetimeRange()) {
      if (!getDatetimeRange()
          .equals(other.getDatetimeRange())) return false;
    }
    if (getUnlockedOnly()
        != other.getUnlockedOnly()) return false;
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
    hash = (37 * hash) + DRAFT_SCHEDULE_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getDraftScheduleSid());
    if (hasDatetimeRange()) {
      hash = (37 * hash) + DATETIME_RANGE_FIELD_NUMBER;
      hash = (53 * hash) + getDatetimeRange().hashCode();
    }
    hash = (37 * hash) + UNLOCKED_ONLY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getUnlockedOnly());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ResetDraftScheduleReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ResetDraftScheduleReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ResetDraftScheduleReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ResetDraftScheduleReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ResetDraftScheduleReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ResetDraftScheduleReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ResetDraftScheduleReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ResetDraftScheduleReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ResetDraftScheduleReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ResetDraftScheduleReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ResetDraftScheduleReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ResetDraftScheduleReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.wfm.ResetDraftScheduleReq prototype) {
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
   * Request message for the ResetDraftSchedule RPC
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.wfm.ResetDraftScheduleReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.wfm.ResetDraftScheduleReq)
      com.tcn.cloud.api.api.v1alpha1.wfm.ResetDraftScheduleReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ResetDraftScheduleReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ResetDraftScheduleReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.wfm.ResetDraftScheduleReq.class, com.tcn.cloud.api.api.v1alpha1.wfm.ResetDraftScheduleReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.wfm.ResetDraftScheduleReq.newBuilder()
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
      draftScheduleSid_ = 0L;
      datetimeRange_ = null;
      if (datetimeRangeBuilder_ != null) {
        datetimeRangeBuilder_.dispose();
        datetimeRangeBuilder_ = null;
      }
      unlockedOnly_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ResetDraftScheduleReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.ResetDraftScheduleReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.ResetDraftScheduleReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.ResetDraftScheduleReq build() {
      com.tcn.cloud.api.api.v1alpha1.wfm.ResetDraftScheduleReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.ResetDraftScheduleReq buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.wfm.ResetDraftScheduleReq result = new com.tcn.cloud.api.api.v1alpha1.wfm.ResetDraftScheduleReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.wfm.ResetDraftScheduleReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.draftScheduleSid_ = draftScheduleSid_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.datetimeRange_ = datetimeRangeBuilder_ == null
            ? datetimeRange_
            : datetimeRangeBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.unlockedOnly_ = unlockedOnly_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.wfm.ResetDraftScheduleReq) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.wfm.ResetDraftScheduleReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.wfm.ResetDraftScheduleReq other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.wfm.ResetDraftScheduleReq.getDefaultInstance()) return this;
      if (other.getDraftScheduleSid() != 0L) {
        setDraftScheduleSid(other.getDraftScheduleSid());
      }
      if (other.hasDatetimeRange()) {
        mergeDatetimeRange(other.getDatetimeRange());
      }
      if (other.getUnlockedOnly() != false) {
        setUnlockedOnly(other.getUnlockedOnly());
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
              draftScheduleSid_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getDatetimeRangeFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              unlockedOnly_ = input.readBool();
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

    private long draftScheduleSid_ ;
    /**
     * <pre>
     * ID of the draft schedule to reset.
     * </pre>
     *
     * <code>int64 draft_schedule_sid = 1 [json_name = "draftScheduleSid"];</code>
     * @return The draftScheduleSid.
     */
    @java.lang.Override
    public long getDraftScheduleSid() {
      return draftScheduleSid_;
    }
    /**
     * <pre>
     * ID of the draft schedule to reset.
     * </pre>
     *
     * <code>int64 draft_schedule_sid = 1 [json_name = "draftScheduleSid"];</code>
     * @param value The draftScheduleSid to set.
     * @return This builder for chaining.
     */
    public Builder setDraftScheduleSid(long value) {

      draftScheduleSid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ID of the draft schedule to reset.
     * </pre>
     *
     * <code>int64 draft_schedule_sid = 1 [json_name = "draftScheduleSid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDraftScheduleSid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      draftScheduleSid_ = 0L;
      onChanged();
      return this;
    }

    private com.tcn.cloud.api.api.commons.DatetimeRange datetimeRange_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.DatetimeRange, com.tcn.cloud.api.api.commons.DatetimeRange.Builder, com.tcn.cloud.api.api.commons.DatetimeRangeOrBuilder> datetimeRangeBuilder_;
    /**
     * <pre>
     * Date range to of the draft to reset.
     * If left blank, the full range for the draft schedule will be used by default.
     * </pre>
     *
     * <code>.api.commons.DatetimeRange datetime_range = 2 [json_name = "datetimeRange"];</code>
     * @return Whether the datetimeRange field is set.
     */
    public boolean hasDatetimeRange() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Date range to of the draft to reset.
     * If left blank, the full range for the draft schedule will be used by default.
     * </pre>
     *
     * <code>.api.commons.DatetimeRange datetime_range = 2 [json_name = "datetimeRange"];</code>
     * @return The datetimeRange.
     */
    public com.tcn.cloud.api.api.commons.DatetimeRange getDatetimeRange() {
      if (datetimeRangeBuilder_ == null) {
        return datetimeRange_ == null ? com.tcn.cloud.api.api.commons.DatetimeRange.getDefaultInstance() : datetimeRange_;
      } else {
        return datetimeRangeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Date range to of the draft to reset.
     * If left blank, the full range for the draft schedule will be used by default.
     * </pre>
     *
     * <code>.api.commons.DatetimeRange datetime_range = 2 [json_name = "datetimeRange"];</code>
     */
    public Builder setDatetimeRange(com.tcn.cloud.api.api.commons.DatetimeRange value) {
      if (datetimeRangeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        datetimeRange_ = value;
      } else {
        datetimeRangeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Date range to of the draft to reset.
     * If left blank, the full range for the draft schedule will be used by default.
     * </pre>
     *
     * <code>.api.commons.DatetimeRange datetime_range = 2 [json_name = "datetimeRange"];</code>
     */
    public Builder setDatetimeRange(
        com.tcn.cloud.api.api.commons.DatetimeRange.Builder builderForValue) {
      if (datetimeRangeBuilder_ == null) {
        datetimeRange_ = builderForValue.build();
      } else {
        datetimeRangeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Date range to of the draft to reset.
     * If left blank, the full range for the draft schedule will be used by default.
     * </pre>
     *
     * <code>.api.commons.DatetimeRange datetime_range = 2 [json_name = "datetimeRange"];</code>
     */
    public Builder mergeDatetimeRange(com.tcn.cloud.api.api.commons.DatetimeRange value) {
      if (datetimeRangeBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          datetimeRange_ != null &&
          datetimeRange_ != com.tcn.cloud.api.api.commons.DatetimeRange.getDefaultInstance()) {
          getDatetimeRangeBuilder().mergeFrom(value);
        } else {
          datetimeRange_ = value;
        }
      } else {
        datetimeRangeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Date range to of the draft to reset.
     * If left blank, the full range for the draft schedule will be used by default.
     * </pre>
     *
     * <code>.api.commons.DatetimeRange datetime_range = 2 [json_name = "datetimeRange"];</code>
     */
    public Builder clearDatetimeRange() {
      bitField0_ = (bitField0_ & ~0x00000002);
      datetimeRange_ = null;
      if (datetimeRangeBuilder_ != null) {
        datetimeRangeBuilder_.dispose();
        datetimeRangeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Date range to of the draft to reset.
     * If left blank, the full range for the draft schedule will be used by default.
     * </pre>
     *
     * <code>.api.commons.DatetimeRange datetime_range = 2 [json_name = "datetimeRange"];</code>
     */
    public com.tcn.cloud.api.api.commons.DatetimeRange.Builder getDatetimeRangeBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getDatetimeRangeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Date range to of the draft to reset.
     * If left blank, the full range for the draft schedule will be used by default.
     * </pre>
     *
     * <code>.api.commons.DatetimeRange datetime_range = 2 [json_name = "datetimeRange"];</code>
     */
    public com.tcn.cloud.api.api.commons.DatetimeRangeOrBuilder getDatetimeRangeOrBuilder() {
      if (datetimeRangeBuilder_ != null) {
        return datetimeRangeBuilder_.getMessageOrBuilder();
      } else {
        return datetimeRange_ == null ?
            com.tcn.cloud.api.api.commons.DatetimeRange.getDefaultInstance() : datetimeRange_;
      }
    }
    /**
     * <pre>
     * Date range to of the draft to reset.
     * If left blank, the full range for the draft schedule will be used by default.
     * </pre>
     *
     * <code>.api.commons.DatetimeRange datetime_range = 2 [json_name = "datetimeRange"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.DatetimeRange, com.tcn.cloud.api.api.commons.DatetimeRange.Builder, com.tcn.cloud.api.api.commons.DatetimeRangeOrBuilder> 
        getDatetimeRangeFieldBuilder() {
      if (datetimeRangeBuilder_ == null) {
        datetimeRangeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.commons.DatetimeRange, com.tcn.cloud.api.api.commons.DatetimeRange.Builder, com.tcn.cloud.api.api.commons.DatetimeRangeOrBuilder>(
                getDatetimeRange(),
                getParentForChildren(),
                isClean());
        datetimeRange_ = null;
      }
      return datetimeRangeBuilder_;
    }

    private boolean unlockedOnly_ ;
    /**
     * <pre>
     * Set to true to only delete unlocked shifts from &#64;draft_schedule_sid.
     * </pre>
     *
     * <code>bool unlocked_only = 3 [json_name = "unlockedOnly"];</code>
     * @return The unlockedOnly.
     */
    @java.lang.Override
    public boolean getUnlockedOnly() {
      return unlockedOnly_;
    }
    /**
     * <pre>
     * Set to true to only delete unlocked shifts from &#64;draft_schedule_sid.
     * </pre>
     *
     * <code>bool unlocked_only = 3 [json_name = "unlockedOnly"];</code>
     * @param value The unlockedOnly to set.
     * @return This builder for chaining.
     */
    public Builder setUnlockedOnly(boolean value) {

      unlockedOnly_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Set to true to only delete unlocked shifts from &#64;draft_schedule_sid.
     * </pre>
     *
     * <code>bool unlocked_only = 3 [json_name = "unlockedOnly"];</code>
     * @return This builder for chaining.
     */
    public Builder clearUnlockedOnly() {
      bitField0_ = (bitField0_ & ~0x00000004);
      unlockedOnly_ = false;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.wfm.ResetDraftScheduleReq)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.wfm.ResetDraftScheduleReq)
  private static final com.tcn.cloud.api.api.v1alpha1.wfm.ResetDraftScheduleReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.wfm.ResetDraftScheduleReq();
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ResetDraftScheduleReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResetDraftScheduleReq>
      PARSER = new com.google.protobuf.AbstractParser<ResetDraftScheduleReq>() {
    @java.lang.Override
    public ResetDraftScheduleReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<ResetDraftScheduleReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResetDraftScheduleReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.ResetDraftScheduleReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

