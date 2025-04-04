// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

/**
 * <pre>
 * Request message for the SplitPublishedShift RPC.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.wfm.SplitPublishedShiftRequest}
 */
public final class SplitPublishedShiftRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.wfm.SplitPublishedShiftRequest)
    SplitPublishedShiftRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SplitPublishedShiftRequest.newBuilder() to construct.
  private SplitPublishedShiftRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SplitPublishedShiftRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SplitPublishedShiftRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_SplitPublishedShiftRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_SplitPublishedShiftRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.wfm.SplitPublishedShiftRequest.class, com.tcn.cloud.api.api.v1alpha1.wfm.SplitPublishedShiftRequest.Builder.class);
  }

  public static final int SHIFT_INSTANCE_SID_FIELD_NUMBER = 1;
  private long shiftInstanceSid_ = 0L;
  /**
   * <pre>
   * ID of the shift instance to split.
   * </pre>
   *
   * <code>int64 shift_instance_sid = 1 [json_name = "shiftInstanceSid"];</code>
   * @return The shiftInstanceSid.
   */
  @java.lang.Override
  public long getShiftInstanceSid() {
    return shiftInstanceSid_;
  }

  public static final int TIME_TO_SPLIT_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp timeToSplit_;
  /**
   * <pre>
   * The datetime at which to split the &#64;shift_instance_sid.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp time_to_split = 2 [json_name = "timeToSplit"];</code>
   * @return Whether the timeToSplit field is set.
   */
  @java.lang.Override
  public boolean hasTimeToSplit() {
    return timeToSplit_ != null;
  }
  /**
   * <pre>
   * The datetime at which to split the &#64;shift_instance_sid.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp time_to_split = 2 [json_name = "timeToSplit"];</code>
   * @return The timeToSplit.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getTimeToSplit() {
    return timeToSplit_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : timeToSplit_;
  }
  /**
   * <pre>
   * The datetime at which to split the &#64;shift_instance_sid.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp time_to_split = 2 [json_name = "timeToSplit"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getTimeToSplitOrBuilder() {
    return timeToSplit_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : timeToSplit_;
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
    if (shiftInstanceSid_ != 0L) {
      output.writeInt64(1, shiftInstanceSid_);
    }
    if (timeToSplit_ != null) {
      output.writeMessage(2, getTimeToSplit());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (shiftInstanceSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, shiftInstanceSid_);
    }
    if (timeToSplit_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getTimeToSplit());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.wfm.SplitPublishedShiftRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.wfm.SplitPublishedShiftRequest other = (com.tcn.cloud.api.api.v1alpha1.wfm.SplitPublishedShiftRequest) obj;

    if (getShiftInstanceSid()
        != other.getShiftInstanceSid()) return false;
    if (hasTimeToSplit() != other.hasTimeToSplit()) return false;
    if (hasTimeToSplit()) {
      if (!getTimeToSplit()
          .equals(other.getTimeToSplit())) return false;
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
    hash = (37 * hash) + SHIFT_INSTANCE_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getShiftInstanceSid());
    if (hasTimeToSplit()) {
      hash = (37 * hash) + TIME_TO_SPLIT_FIELD_NUMBER;
      hash = (53 * hash) + getTimeToSplit().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.SplitPublishedShiftRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.SplitPublishedShiftRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.SplitPublishedShiftRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.SplitPublishedShiftRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.SplitPublishedShiftRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.SplitPublishedShiftRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.SplitPublishedShiftRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.SplitPublishedShiftRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.SplitPublishedShiftRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.SplitPublishedShiftRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.SplitPublishedShiftRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.SplitPublishedShiftRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.wfm.SplitPublishedShiftRequest prototype) {
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
   * Request message for the SplitPublishedShift RPC.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.wfm.SplitPublishedShiftRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.wfm.SplitPublishedShiftRequest)
      com.tcn.cloud.api.api.v1alpha1.wfm.SplitPublishedShiftRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_SplitPublishedShiftRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_SplitPublishedShiftRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.wfm.SplitPublishedShiftRequest.class, com.tcn.cloud.api.api.v1alpha1.wfm.SplitPublishedShiftRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.wfm.SplitPublishedShiftRequest.newBuilder()
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
      shiftInstanceSid_ = 0L;
      timeToSplit_ = null;
      if (timeToSplitBuilder_ != null) {
        timeToSplitBuilder_.dispose();
        timeToSplitBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_SplitPublishedShiftRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.SplitPublishedShiftRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.SplitPublishedShiftRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.SplitPublishedShiftRequest build() {
      com.tcn.cloud.api.api.v1alpha1.wfm.SplitPublishedShiftRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.SplitPublishedShiftRequest buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.wfm.SplitPublishedShiftRequest result = new com.tcn.cloud.api.api.v1alpha1.wfm.SplitPublishedShiftRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.wfm.SplitPublishedShiftRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.shiftInstanceSid_ = shiftInstanceSid_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.timeToSplit_ = timeToSplitBuilder_ == null
            ? timeToSplit_
            : timeToSplitBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.wfm.SplitPublishedShiftRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.wfm.SplitPublishedShiftRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.wfm.SplitPublishedShiftRequest other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.wfm.SplitPublishedShiftRequest.getDefaultInstance()) return this;
      if (other.getShiftInstanceSid() != 0L) {
        setShiftInstanceSid(other.getShiftInstanceSid());
      }
      if (other.hasTimeToSplit()) {
        mergeTimeToSplit(other.getTimeToSplit());
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
              shiftInstanceSid_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getTimeToSplitFieldBuilder().getBuilder(),
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

    private long shiftInstanceSid_ ;
    /**
     * <pre>
     * ID of the shift instance to split.
     * </pre>
     *
     * <code>int64 shift_instance_sid = 1 [json_name = "shiftInstanceSid"];</code>
     * @return The shiftInstanceSid.
     */
    @java.lang.Override
    public long getShiftInstanceSid() {
      return shiftInstanceSid_;
    }
    /**
     * <pre>
     * ID of the shift instance to split.
     * </pre>
     *
     * <code>int64 shift_instance_sid = 1 [json_name = "shiftInstanceSid"];</code>
     * @param value The shiftInstanceSid to set.
     * @return This builder for chaining.
     */
    public Builder setShiftInstanceSid(long value) {

      shiftInstanceSid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ID of the shift instance to split.
     * </pre>
     *
     * <code>int64 shift_instance_sid = 1 [json_name = "shiftInstanceSid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearShiftInstanceSid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      shiftInstanceSid_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp timeToSplit_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> timeToSplitBuilder_;
    /**
     * <pre>
     * The datetime at which to split the &#64;shift_instance_sid.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp time_to_split = 2 [json_name = "timeToSplit"];</code>
     * @return Whether the timeToSplit field is set.
     */
    public boolean hasTimeToSplit() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The datetime at which to split the &#64;shift_instance_sid.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp time_to_split = 2 [json_name = "timeToSplit"];</code>
     * @return The timeToSplit.
     */
    public com.google.protobuf.Timestamp getTimeToSplit() {
      if (timeToSplitBuilder_ == null) {
        return timeToSplit_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : timeToSplit_;
      } else {
        return timeToSplitBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The datetime at which to split the &#64;shift_instance_sid.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp time_to_split = 2 [json_name = "timeToSplit"];</code>
     */
    public Builder setTimeToSplit(com.google.protobuf.Timestamp value) {
      if (timeToSplitBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        timeToSplit_ = value;
      } else {
        timeToSplitBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The datetime at which to split the &#64;shift_instance_sid.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp time_to_split = 2 [json_name = "timeToSplit"];</code>
     */
    public Builder setTimeToSplit(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (timeToSplitBuilder_ == null) {
        timeToSplit_ = builderForValue.build();
      } else {
        timeToSplitBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The datetime at which to split the &#64;shift_instance_sid.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp time_to_split = 2 [json_name = "timeToSplit"];</code>
     */
    public Builder mergeTimeToSplit(com.google.protobuf.Timestamp value) {
      if (timeToSplitBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          timeToSplit_ != null &&
          timeToSplit_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getTimeToSplitBuilder().mergeFrom(value);
        } else {
          timeToSplit_ = value;
        }
      } else {
        timeToSplitBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The datetime at which to split the &#64;shift_instance_sid.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp time_to_split = 2 [json_name = "timeToSplit"];</code>
     */
    public Builder clearTimeToSplit() {
      bitField0_ = (bitField0_ & ~0x00000002);
      timeToSplit_ = null;
      if (timeToSplitBuilder_ != null) {
        timeToSplitBuilder_.dispose();
        timeToSplitBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The datetime at which to split the &#64;shift_instance_sid.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp time_to_split = 2 [json_name = "timeToSplit"];</code>
     */
    public com.google.protobuf.Timestamp.Builder getTimeToSplitBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getTimeToSplitFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The datetime at which to split the &#64;shift_instance_sid.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp time_to_split = 2 [json_name = "timeToSplit"];</code>
     */
    public com.google.protobuf.TimestampOrBuilder getTimeToSplitOrBuilder() {
      if (timeToSplitBuilder_ != null) {
        return timeToSplitBuilder_.getMessageOrBuilder();
      } else {
        return timeToSplit_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : timeToSplit_;
      }
    }
    /**
     * <pre>
     * The datetime at which to split the &#64;shift_instance_sid.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp time_to_split = 2 [json_name = "timeToSplit"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getTimeToSplitFieldBuilder() {
      if (timeToSplitBuilder_ == null) {
        timeToSplitBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getTimeToSplit(),
                getParentForChildren(),
                isClean());
        timeToSplit_ = null;
      }
      return timeToSplitBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.wfm.SplitPublishedShiftRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.wfm.SplitPublishedShiftRequest)
  private static final com.tcn.cloud.api.api.v1alpha1.wfm.SplitPublishedShiftRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.wfm.SplitPublishedShiftRequest();
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.SplitPublishedShiftRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SplitPublishedShiftRequest>
      PARSER = new com.google.protobuf.AbstractParser<SplitPublishedShiftRequest>() {
    @java.lang.Override
    public SplitPublishedShiftRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<SplitPublishedShiftRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SplitPublishedShiftRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.SplitPublishedShiftRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

