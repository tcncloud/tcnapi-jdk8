// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

/**
 * <pre>
 * Response message for the ListRequiredCallsIntervals RPC.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.wfm.ListRequiredCallsIntervalsRes}
 */
public final class ListRequiredCallsIntervalsRes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.wfm.ListRequiredCallsIntervalsRes)
    ListRequiredCallsIntervalsResOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListRequiredCallsIntervalsRes.newBuilder() to construct.
  private ListRequiredCallsIntervalsRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListRequiredCallsIntervalsRes() {
    requiredCallsIntervals_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListRequiredCallsIntervalsRes();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListRequiredCallsIntervalsRes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListRequiredCallsIntervalsRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.wfm.ListRequiredCallsIntervalsRes.class, com.tcn.cloud.api.api.v1alpha1.wfm.ListRequiredCallsIntervalsRes.Builder.class);
  }

  public static final int INTERVAL_WIDTH_IN_MINUTES_FIELD_NUMBER = 1;
  private int intervalWidthInMinutes_ = 0;
  /**
   * <pre>
   * The width of each interval in minutes.
   * </pre>
   *
   * <code>int32 interval_width_in_minutes = 1 [json_name = "intervalWidthInMinutes"];</code>
   * @return The intervalWidthInMinutes.
   */
  @java.lang.Override
  public int getIntervalWidthInMinutes() {
    return intervalWidthInMinutes_;
  }

  public static final int REQUIRED_CALLS_INTERVALS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.RequiredCallsInterval> requiredCallsIntervals_;
  /**
   * <pre>
   * Requested required call intervals.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.RequiredCallsInterval required_calls_intervals = 2 [json_name = "requiredCallsIntervals"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.RequiredCallsInterval> getRequiredCallsIntervalsList() {
    return requiredCallsIntervals_;
  }
  /**
   * <pre>
   * Requested required call intervals.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.RequiredCallsInterval required_calls_intervals = 2 [json_name = "requiredCallsIntervals"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.wfm.RequiredCallsIntervalOrBuilder> 
      getRequiredCallsIntervalsOrBuilderList() {
    return requiredCallsIntervals_;
  }
  /**
   * <pre>
   * Requested required call intervals.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.RequiredCallsInterval required_calls_intervals = 2 [json_name = "requiredCallsIntervals"];</code>
   */
  @java.lang.Override
  public int getRequiredCallsIntervalsCount() {
    return requiredCallsIntervals_.size();
  }
  /**
   * <pre>
   * Requested required call intervals.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.RequiredCallsInterval required_calls_intervals = 2 [json_name = "requiredCallsIntervals"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.RequiredCallsInterval getRequiredCallsIntervals(int index) {
    return requiredCallsIntervals_.get(index);
  }
  /**
   * <pre>
   * Requested required call intervals.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.RequiredCallsInterval required_calls_intervals = 2 [json_name = "requiredCallsIntervals"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.RequiredCallsIntervalOrBuilder getRequiredCallsIntervalsOrBuilder(
      int index) {
    return requiredCallsIntervals_.get(index);
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
    if (intervalWidthInMinutes_ != 0) {
      output.writeInt32(1, intervalWidthInMinutes_);
    }
    for (int i = 0; i < requiredCallsIntervals_.size(); i++) {
      output.writeMessage(2, requiredCallsIntervals_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (intervalWidthInMinutes_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, intervalWidthInMinutes_);
    }
    for (int i = 0; i < requiredCallsIntervals_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, requiredCallsIntervals_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.wfm.ListRequiredCallsIntervalsRes)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.wfm.ListRequiredCallsIntervalsRes other = (com.tcn.cloud.api.api.v1alpha1.wfm.ListRequiredCallsIntervalsRes) obj;

    if (getIntervalWidthInMinutes()
        != other.getIntervalWidthInMinutes()) return false;
    if (!getRequiredCallsIntervalsList()
        .equals(other.getRequiredCallsIntervalsList())) return false;
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
    hash = (37 * hash) + INTERVAL_WIDTH_IN_MINUTES_FIELD_NUMBER;
    hash = (53 * hash) + getIntervalWidthInMinutes();
    if (getRequiredCallsIntervalsCount() > 0) {
      hash = (37 * hash) + REQUIRED_CALLS_INTERVALS_FIELD_NUMBER;
      hash = (53 * hash) + getRequiredCallsIntervalsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListRequiredCallsIntervalsRes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListRequiredCallsIntervalsRes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListRequiredCallsIntervalsRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListRequiredCallsIntervalsRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListRequiredCallsIntervalsRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListRequiredCallsIntervalsRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListRequiredCallsIntervalsRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListRequiredCallsIntervalsRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListRequiredCallsIntervalsRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListRequiredCallsIntervalsRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListRequiredCallsIntervalsRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListRequiredCallsIntervalsRes parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.wfm.ListRequiredCallsIntervalsRes prototype) {
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
   * Response message for the ListRequiredCallsIntervals RPC.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.wfm.ListRequiredCallsIntervalsRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.wfm.ListRequiredCallsIntervalsRes)
      com.tcn.cloud.api.api.v1alpha1.wfm.ListRequiredCallsIntervalsResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListRequiredCallsIntervalsRes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListRequiredCallsIntervalsRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.wfm.ListRequiredCallsIntervalsRes.class, com.tcn.cloud.api.api.v1alpha1.wfm.ListRequiredCallsIntervalsRes.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.wfm.ListRequiredCallsIntervalsRes.newBuilder()
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
      intervalWidthInMinutes_ = 0;
      if (requiredCallsIntervalsBuilder_ == null) {
        requiredCallsIntervals_ = java.util.Collections.emptyList();
      } else {
        requiredCallsIntervals_ = null;
        requiredCallsIntervalsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListRequiredCallsIntervalsRes_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.ListRequiredCallsIntervalsRes getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.ListRequiredCallsIntervalsRes.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.ListRequiredCallsIntervalsRes build() {
      com.tcn.cloud.api.api.v1alpha1.wfm.ListRequiredCallsIntervalsRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.ListRequiredCallsIntervalsRes buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.wfm.ListRequiredCallsIntervalsRes result = new com.tcn.cloud.api.api.v1alpha1.wfm.ListRequiredCallsIntervalsRes(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v1alpha1.wfm.ListRequiredCallsIntervalsRes result) {
      if (requiredCallsIntervalsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          requiredCallsIntervals_ = java.util.Collections.unmodifiableList(requiredCallsIntervals_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.requiredCallsIntervals_ = requiredCallsIntervals_;
      } else {
        result.requiredCallsIntervals_ = requiredCallsIntervalsBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.wfm.ListRequiredCallsIntervalsRes result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.intervalWidthInMinutes_ = intervalWidthInMinutes_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.wfm.ListRequiredCallsIntervalsRes) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.wfm.ListRequiredCallsIntervalsRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.wfm.ListRequiredCallsIntervalsRes other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.wfm.ListRequiredCallsIntervalsRes.getDefaultInstance()) return this;
      if (other.getIntervalWidthInMinutes() != 0) {
        setIntervalWidthInMinutes(other.getIntervalWidthInMinutes());
      }
      if (requiredCallsIntervalsBuilder_ == null) {
        if (!other.requiredCallsIntervals_.isEmpty()) {
          if (requiredCallsIntervals_.isEmpty()) {
            requiredCallsIntervals_ = other.requiredCallsIntervals_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureRequiredCallsIntervalsIsMutable();
            requiredCallsIntervals_.addAll(other.requiredCallsIntervals_);
          }
          onChanged();
        }
      } else {
        if (!other.requiredCallsIntervals_.isEmpty()) {
          if (requiredCallsIntervalsBuilder_.isEmpty()) {
            requiredCallsIntervalsBuilder_.dispose();
            requiredCallsIntervalsBuilder_ = null;
            requiredCallsIntervals_ = other.requiredCallsIntervals_;
            bitField0_ = (bitField0_ & ~0x00000002);
            requiredCallsIntervalsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getRequiredCallsIntervalsFieldBuilder() : null;
          } else {
            requiredCallsIntervalsBuilder_.addAllMessages(other.requiredCallsIntervals_);
          }
        }
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
              intervalWidthInMinutes_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              com.tcn.cloud.api.api.v1alpha1.wfm.RequiredCallsInterval m =
                  input.readMessage(
                      com.tcn.cloud.api.api.v1alpha1.wfm.RequiredCallsInterval.parser(),
                      extensionRegistry);
              if (requiredCallsIntervalsBuilder_ == null) {
                ensureRequiredCallsIntervalsIsMutable();
                requiredCallsIntervals_.add(m);
              } else {
                requiredCallsIntervalsBuilder_.addMessage(m);
              }
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

    private int intervalWidthInMinutes_ ;
    /**
     * <pre>
     * The width of each interval in minutes.
     * </pre>
     *
     * <code>int32 interval_width_in_minutes = 1 [json_name = "intervalWidthInMinutes"];</code>
     * @return The intervalWidthInMinutes.
     */
    @java.lang.Override
    public int getIntervalWidthInMinutes() {
      return intervalWidthInMinutes_;
    }
    /**
     * <pre>
     * The width of each interval in minutes.
     * </pre>
     *
     * <code>int32 interval_width_in_minutes = 1 [json_name = "intervalWidthInMinutes"];</code>
     * @param value The intervalWidthInMinutes to set.
     * @return This builder for chaining.
     */
    public Builder setIntervalWidthInMinutes(int value) {

      intervalWidthInMinutes_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The width of each interval in minutes.
     * </pre>
     *
     * <code>int32 interval_width_in_minutes = 1 [json_name = "intervalWidthInMinutes"];</code>
     * @return This builder for chaining.
     */
    public Builder clearIntervalWidthInMinutes() {
      bitField0_ = (bitField0_ & ~0x00000001);
      intervalWidthInMinutes_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.RequiredCallsInterval> requiredCallsIntervals_ =
      java.util.Collections.emptyList();
    private void ensureRequiredCallsIntervalsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        requiredCallsIntervals_ = new java.util.ArrayList<com.tcn.cloud.api.api.v1alpha1.wfm.RequiredCallsInterval>(requiredCallsIntervals_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.wfm.RequiredCallsInterval, com.tcn.cloud.api.api.v1alpha1.wfm.RequiredCallsInterval.Builder, com.tcn.cloud.api.api.v1alpha1.wfm.RequiredCallsIntervalOrBuilder> requiredCallsIntervalsBuilder_;

    /**
     * <pre>
     * Requested required call intervals.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.RequiredCallsInterval required_calls_intervals = 2 [json_name = "requiredCallsIntervals"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.RequiredCallsInterval> getRequiredCallsIntervalsList() {
      if (requiredCallsIntervalsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(requiredCallsIntervals_);
      } else {
        return requiredCallsIntervalsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Requested required call intervals.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.RequiredCallsInterval required_calls_intervals = 2 [json_name = "requiredCallsIntervals"];</code>
     */
    public int getRequiredCallsIntervalsCount() {
      if (requiredCallsIntervalsBuilder_ == null) {
        return requiredCallsIntervals_.size();
      } else {
        return requiredCallsIntervalsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Requested required call intervals.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.RequiredCallsInterval required_calls_intervals = 2 [json_name = "requiredCallsIntervals"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.RequiredCallsInterval getRequiredCallsIntervals(int index) {
      if (requiredCallsIntervalsBuilder_ == null) {
        return requiredCallsIntervals_.get(index);
      } else {
        return requiredCallsIntervalsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Requested required call intervals.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.RequiredCallsInterval required_calls_intervals = 2 [json_name = "requiredCallsIntervals"];</code>
     */
    public Builder setRequiredCallsIntervals(
        int index, com.tcn.cloud.api.api.v1alpha1.wfm.RequiredCallsInterval value) {
      if (requiredCallsIntervalsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRequiredCallsIntervalsIsMutable();
        requiredCallsIntervals_.set(index, value);
        onChanged();
      } else {
        requiredCallsIntervalsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Requested required call intervals.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.RequiredCallsInterval required_calls_intervals = 2 [json_name = "requiredCallsIntervals"];</code>
     */
    public Builder setRequiredCallsIntervals(
        int index, com.tcn.cloud.api.api.v1alpha1.wfm.RequiredCallsInterval.Builder builderForValue) {
      if (requiredCallsIntervalsBuilder_ == null) {
        ensureRequiredCallsIntervalsIsMutable();
        requiredCallsIntervals_.set(index, builderForValue.build());
        onChanged();
      } else {
        requiredCallsIntervalsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Requested required call intervals.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.RequiredCallsInterval required_calls_intervals = 2 [json_name = "requiredCallsIntervals"];</code>
     */
    public Builder addRequiredCallsIntervals(com.tcn.cloud.api.api.v1alpha1.wfm.RequiredCallsInterval value) {
      if (requiredCallsIntervalsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRequiredCallsIntervalsIsMutable();
        requiredCallsIntervals_.add(value);
        onChanged();
      } else {
        requiredCallsIntervalsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Requested required call intervals.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.RequiredCallsInterval required_calls_intervals = 2 [json_name = "requiredCallsIntervals"];</code>
     */
    public Builder addRequiredCallsIntervals(
        int index, com.tcn.cloud.api.api.v1alpha1.wfm.RequiredCallsInterval value) {
      if (requiredCallsIntervalsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRequiredCallsIntervalsIsMutable();
        requiredCallsIntervals_.add(index, value);
        onChanged();
      } else {
        requiredCallsIntervalsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Requested required call intervals.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.RequiredCallsInterval required_calls_intervals = 2 [json_name = "requiredCallsIntervals"];</code>
     */
    public Builder addRequiredCallsIntervals(
        com.tcn.cloud.api.api.v1alpha1.wfm.RequiredCallsInterval.Builder builderForValue) {
      if (requiredCallsIntervalsBuilder_ == null) {
        ensureRequiredCallsIntervalsIsMutable();
        requiredCallsIntervals_.add(builderForValue.build());
        onChanged();
      } else {
        requiredCallsIntervalsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Requested required call intervals.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.RequiredCallsInterval required_calls_intervals = 2 [json_name = "requiredCallsIntervals"];</code>
     */
    public Builder addRequiredCallsIntervals(
        int index, com.tcn.cloud.api.api.v1alpha1.wfm.RequiredCallsInterval.Builder builderForValue) {
      if (requiredCallsIntervalsBuilder_ == null) {
        ensureRequiredCallsIntervalsIsMutable();
        requiredCallsIntervals_.add(index, builderForValue.build());
        onChanged();
      } else {
        requiredCallsIntervalsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Requested required call intervals.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.RequiredCallsInterval required_calls_intervals = 2 [json_name = "requiredCallsIntervals"];</code>
     */
    public Builder addAllRequiredCallsIntervals(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.v1alpha1.wfm.RequiredCallsInterval> values) {
      if (requiredCallsIntervalsBuilder_ == null) {
        ensureRequiredCallsIntervalsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, requiredCallsIntervals_);
        onChanged();
      } else {
        requiredCallsIntervalsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Requested required call intervals.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.RequiredCallsInterval required_calls_intervals = 2 [json_name = "requiredCallsIntervals"];</code>
     */
    public Builder clearRequiredCallsIntervals() {
      if (requiredCallsIntervalsBuilder_ == null) {
        requiredCallsIntervals_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        requiredCallsIntervalsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Requested required call intervals.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.RequiredCallsInterval required_calls_intervals = 2 [json_name = "requiredCallsIntervals"];</code>
     */
    public Builder removeRequiredCallsIntervals(int index) {
      if (requiredCallsIntervalsBuilder_ == null) {
        ensureRequiredCallsIntervalsIsMutable();
        requiredCallsIntervals_.remove(index);
        onChanged();
      } else {
        requiredCallsIntervalsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Requested required call intervals.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.RequiredCallsInterval required_calls_intervals = 2 [json_name = "requiredCallsIntervals"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.RequiredCallsInterval.Builder getRequiredCallsIntervalsBuilder(
        int index) {
      return getRequiredCallsIntervalsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Requested required call intervals.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.RequiredCallsInterval required_calls_intervals = 2 [json_name = "requiredCallsIntervals"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.RequiredCallsIntervalOrBuilder getRequiredCallsIntervalsOrBuilder(
        int index) {
      if (requiredCallsIntervalsBuilder_ == null) {
        return requiredCallsIntervals_.get(index);  } else {
        return requiredCallsIntervalsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Requested required call intervals.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.RequiredCallsInterval required_calls_intervals = 2 [json_name = "requiredCallsIntervals"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.wfm.RequiredCallsIntervalOrBuilder> 
         getRequiredCallsIntervalsOrBuilderList() {
      if (requiredCallsIntervalsBuilder_ != null) {
        return requiredCallsIntervalsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(requiredCallsIntervals_);
      }
    }
    /**
     * <pre>
     * Requested required call intervals.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.RequiredCallsInterval required_calls_intervals = 2 [json_name = "requiredCallsIntervals"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.RequiredCallsInterval.Builder addRequiredCallsIntervalsBuilder() {
      return getRequiredCallsIntervalsFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.v1alpha1.wfm.RequiredCallsInterval.getDefaultInstance());
    }
    /**
     * <pre>
     * Requested required call intervals.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.RequiredCallsInterval required_calls_intervals = 2 [json_name = "requiredCallsIntervals"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.RequiredCallsInterval.Builder addRequiredCallsIntervalsBuilder(
        int index) {
      return getRequiredCallsIntervalsFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.v1alpha1.wfm.RequiredCallsInterval.getDefaultInstance());
    }
    /**
     * <pre>
     * Requested required call intervals.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.RequiredCallsInterval required_calls_intervals = 2 [json_name = "requiredCallsIntervals"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.RequiredCallsInterval.Builder> 
         getRequiredCallsIntervalsBuilderList() {
      return getRequiredCallsIntervalsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.wfm.RequiredCallsInterval, com.tcn.cloud.api.api.v1alpha1.wfm.RequiredCallsInterval.Builder, com.tcn.cloud.api.api.v1alpha1.wfm.RequiredCallsIntervalOrBuilder> 
        getRequiredCallsIntervalsFieldBuilder() {
      if (requiredCallsIntervalsBuilder_ == null) {
        requiredCallsIntervalsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.wfm.RequiredCallsInterval, com.tcn.cloud.api.api.v1alpha1.wfm.RequiredCallsInterval.Builder, com.tcn.cloud.api.api.v1alpha1.wfm.RequiredCallsIntervalOrBuilder>(
                requiredCallsIntervals_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        requiredCallsIntervals_ = null;
      }
      return requiredCallsIntervalsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.wfm.ListRequiredCallsIntervalsRes)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.wfm.ListRequiredCallsIntervalsRes)
  private static final com.tcn.cloud.api.api.v1alpha1.wfm.ListRequiredCallsIntervalsRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.wfm.ListRequiredCallsIntervalsRes();
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListRequiredCallsIntervalsRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListRequiredCallsIntervalsRes>
      PARSER = new com.google.protobuf.AbstractParser<ListRequiredCallsIntervalsRes>() {
    @java.lang.Override
    public ListRequiredCallsIntervalsRes parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListRequiredCallsIntervalsRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListRequiredCallsIntervalsRes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.ListRequiredCallsIntervalsRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

