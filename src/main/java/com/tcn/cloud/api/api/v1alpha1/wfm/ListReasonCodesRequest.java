// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

/**
 * <pre>
 * Request message for ListReasonCodes RPC.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.wfm.ListReasonCodesRequest}
 */
public final class ListReasonCodesRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.wfm.ListReasonCodesRequest)
    ListReasonCodesRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListReasonCodesRequest.newBuilder() to construct.
  private ListReasonCodesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListReasonCodesRequest() {
    schedulingActivitySids_ = emptyLongList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListReasonCodesRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListReasonCodesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListReasonCodesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.wfm.ListReasonCodesRequest.class, com.tcn.cloud.api.api.v1alpha1.wfm.ListReasonCodesRequest.Builder.class);
  }

  public static final int SCHEDULING_ACTIVITY_SIDS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.LongList schedulingActivitySids_;
  /**
   * <pre>
   * Scheduling Activity SIDs to get the reason codes for.
   * </pre>
   *
   * <code>repeated int64 scheduling_activity_sids = 1 [json_name = "schedulingActivitySids"];</code>
   * @return A list containing the schedulingActivitySids.
   */
  @java.lang.Override
  public java.util.List<java.lang.Long>
      getSchedulingActivitySidsList() {
    return schedulingActivitySids_;
  }
  /**
   * <pre>
   * Scheduling Activity SIDs to get the reason codes for.
   * </pre>
   *
   * <code>repeated int64 scheduling_activity_sids = 1 [json_name = "schedulingActivitySids"];</code>
   * @return The count of schedulingActivitySids.
   */
  public int getSchedulingActivitySidsCount() {
    return schedulingActivitySids_.size();
  }
  /**
   * <pre>
   * Scheduling Activity SIDs to get the reason codes for.
   * </pre>
   *
   * <code>repeated int64 scheduling_activity_sids = 1 [json_name = "schedulingActivitySids"];</code>
   * @param index The index of the element to return.
   * @return The schedulingActivitySids at the given index.
   */
  public long getSchedulingActivitySids(int index) {
    return schedulingActivitySids_.getLong(index);
  }
  private int schedulingActivitySidsMemoizedSerializedSize = -1;

  public static final int INCLUDE_INACTIVE_FIELD_NUMBER = 2;
  private boolean includeInactive_ = false;
  /**
   * <pre>
   * If True, includes inactive reason codes in the response.
   * If False, only active reason codes will be included.
   * </pre>
   *
   * <code>bool include_inactive = 2 [json_name = "includeInactive"];</code>
   * @return The includeInactive.
   */
  @java.lang.Override
  public boolean getIncludeInactive() {
    return includeInactive_;
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
    getSerializedSize();
    if (getSchedulingActivitySidsList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(schedulingActivitySidsMemoizedSerializedSize);
    }
    for (int i = 0; i < schedulingActivitySids_.size(); i++) {
      output.writeInt64NoTag(schedulingActivitySids_.getLong(i));
    }
    if (includeInactive_ != false) {
      output.writeBool(2, includeInactive_);
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
      for (int i = 0; i < schedulingActivitySids_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt64SizeNoTag(schedulingActivitySids_.getLong(i));
      }
      size += dataSize;
      if (!getSchedulingActivitySidsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      schedulingActivitySidsMemoizedSerializedSize = dataSize;
    }
    if (includeInactive_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, includeInactive_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.wfm.ListReasonCodesRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.wfm.ListReasonCodesRequest other = (com.tcn.cloud.api.api.v1alpha1.wfm.ListReasonCodesRequest) obj;

    if (!getSchedulingActivitySidsList()
        .equals(other.getSchedulingActivitySidsList())) return false;
    if (getIncludeInactive()
        != other.getIncludeInactive()) return false;
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
    if (getSchedulingActivitySidsCount() > 0) {
      hash = (37 * hash) + SCHEDULING_ACTIVITY_SIDS_FIELD_NUMBER;
      hash = (53 * hash) + getSchedulingActivitySidsList().hashCode();
    }
    hash = (37 * hash) + INCLUDE_INACTIVE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIncludeInactive());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListReasonCodesRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListReasonCodesRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListReasonCodesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListReasonCodesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListReasonCodesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListReasonCodesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListReasonCodesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListReasonCodesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListReasonCodesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListReasonCodesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListReasonCodesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListReasonCodesRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.wfm.ListReasonCodesRequest prototype) {
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
   * Request message for ListReasonCodes RPC.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.wfm.ListReasonCodesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.wfm.ListReasonCodesRequest)
      com.tcn.cloud.api.api.v1alpha1.wfm.ListReasonCodesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListReasonCodesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListReasonCodesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.wfm.ListReasonCodesRequest.class, com.tcn.cloud.api.api.v1alpha1.wfm.ListReasonCodesRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.wfm.ListReasonCodesRequest.newBuilder()
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
      schedulingActivitySids_ = emptyLongList();
      includeInactive_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListReasonCodesRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.ListReasonCodesRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.ListReasonCodesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.ListReasonCodesRequest build() {
      com.tcn.cloud.api.api.v1alpha1.wfm.ListReasonCodesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.ListReasonCodesRequest buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.wfm.ListReasonCodesRequest result = new com.tcn.cloud.api.api.v1alpha1.wfm.ListReasonCodesRequest(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v1alpha1.wfm.ListReasonCodesRequest result) {
      if (((bitField0_ & 0x00000001) != 0)) {
        schedulingActivitySids_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.schedulingActivitySids_ = schedulingActivitySids_;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.wfm.ListReasonCodesRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.includeInactive_ = includeInactive_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.wfm.ListReasonCodesRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.wfm.ListReasonCodesRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.wfm.ListReasonCodesRequest other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.wfm.ListReasonCodesRequest.getDefaultInstance()) return this;
      if (!other.schedulingActivitySids_.isEmpty()) {
        if (schedulingActivitySids_.isEmpty()) {
          schedulingActivitySids_ = other.schedulingActivitySids_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureSchedulingActivitySidsIsMutable();
          schedulingActivitySids_.addAll(other.schedulingActivitySids_);
        }
        onChanged();
      }
      if (other.getIncludeInactive() != false) {
        setIncludeInactive(other.getIncludeInactive());
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
              long v = input.readInt64();
              ensureSchedulingActivitySidsIsMutable();
              schedulingActivitySids_.addLong(v);
              break;
            } // case 8
            case 10: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              ensureSchedulingActivitySidsIsMutable();
              while (input.getBytesUntilLimit() > 0) {
                schedulingActivitySids_.addLong(input.readInt64());
              }
              input.popLimit(limit);
              break;
            } // case 10
            case 16: {
              includeInactive_ = input.readBool();
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

    private com.google.protobuf.Internal.LongList schedulingActivitySids_ = emptyLongList();
    private void ensureSchedulingActivitySidsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        schedulingActivitySids_ = mutableCopy(schedulingActivitySids_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <pre>
     * Scheduling Activity SIDs to get the reason codes for.
     * </pre>
     *
     * <code>repeated int64 scheduling_activity_sids = 1 [json_name = "schedulingActivitySids"];</code>
     * @return A list containing the schedulingActivitySids.
     */
    public java.util.List<java.lang.Long>
        getSchedulingActivitySidsList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(schedulingActivitySids_) : schedulingActivitySids_;
    }
    /**
     * <pre>
     * Scheduling Activity SIDs to get the reason codes for.
     * </pre>
     *
     * <code>repeated int64 scheduling_activity_sids = 1 [json_name = "schedulingActivitySids"];</code>
     * @return The count of schedulingActivitySids.
     */
    public int getSchedulingActivitySidsCount() {
      return schedulingActivitySids_.size();
    }
    /**
     * <pre>
     * Scheduling Activity SIDs to get the reason codes for.
     * </pre>
     *
     * <code>repeated int64 scheduling_activity_sids = 1 [json_name = "schedulingActivitySids"];</code>
     * @param index The index of the element to return.
     * @return The schedulingActivitySids at the given index.
     */
    public long getSchedulingActivitySids(int index) {
      return schedulingActivitySids_.getLong(index);
    }
    /**
     * <pre>
     * Scheduling Activity SIDs to get the reason codes for.
     * </pre>
     *
     * <code>repeated int64 scheduling_activity_sids = 1 [json_name = "schedulingActivitySids"];</code>
     * @param index The index to set the value at.
     * @param value The schedulingActivitySids to set.
     * @return This builder for chaining.
     */
    public Builder setSchedulingActivitySids(
        int index, long value) {

      ensureSchedulingActivitySidsIsMutable();
      schedulingActivitySids_.setLong(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Scheduling Activity SIDs to get the reason codes for.
     * </pre>
     *
     * <code>repeated int64 scheduling_activity_sids = 1 [json_name = "schedulingActivitySids"];</code>
     * @param value The schedulingActivitySids to add.
     * @return This builder for chaining.
     */
    public Builder addSchedulingActivitySids(long value) {

      ensureSchedulingActivitySidsIsMutable();
      schedulingActivitySids_.addLong(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Scheduling Activity SIDs to get the reason codes for.
     * </pre>
     *
     * <code>repeated int64 scheduling_activity_sids = 1 [json_name = "schedulingActivitySids"];</code>
     * @param values The schedulingActivitySids to add.
     * @return This builder for chaining.
     */
    public Builder addAllSchedulingActivitySids(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureSchedulingActivitySidsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, schedulingActivitySids_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Scheduling Activity SIDs to get the reason codes for.
     * </pre>
     *
     * <code>repeated int64 scheduling_activity_sids = 1 [json_name = "schedulingActivitySids"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSchedulingActivitySids() {
      schedulingActivitySids_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private boolean includeInactive_ ;
    /**
     * <pre>
     * If True, includes inactive reason codes in the response.
     * If False, only active reason codes will be included.
     * </pre>
     *
     * <code>bool include_inactive = 2 [json_name = "includeInactive"];</code>
     * @return The includeInactive.
     */
    @java.lang.Override
    public boolean getIncludeInactive() {
      return includeInactive_;
    }
    /**
     * <pre>
     * If True, includes inactive reason codes in the response.
     * If False, only active reason codes will be included.
     * </pre>
     *
     * <code>bool include_inactive = 2 [json_name = "includeInactive"];</code>
     * @param value The includeInactive to set.
     * @return This builder for chaining.
     */
    public Builder setIncludeInactive(boolean value) {

      includeInactive_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If True, includes inactive reason codes in the response.
     * If False, only active reason codes will be included.
     * </pre>
     *
     * <code>bool include_inactive = 2 [json_name = "includeInactive"];</code>
     * @return This builder for chaining.
     */
    public Builder clearIncludeInactive() {
      bitField0_ = (bitField0_ & ~0x00000002);
      includeInactive_ = false;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.wfm.ListReasonCodesRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.wfm.ListReasonCodesRequest)
  private static final com.tcn.cloud.api.api.v1alpha1.wfm.ListReasonCodesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.wfm.ListReasonCodesRequest();
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListReasonCodesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListReasonCodesRequest>
      PARSER = new com.google.protobuf.AbstractParser<ListReasonCodesRequest>() {
    @java.lang.Override
    public ListReasonCodesRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListReasonCodesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListReasonCodesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.ListReasonCodesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

