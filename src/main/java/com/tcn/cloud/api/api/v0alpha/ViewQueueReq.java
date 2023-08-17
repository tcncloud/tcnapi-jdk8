// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/lms.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.ViewQueueReq}
 */
public final class ViewQueueReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.ViewQueueReq)
    ViewQueueReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ViewQueueReq.newBuilder() to construct.
  private ViewQueueReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ViewQueueReq() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ViewQueueReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_ViewQueueReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_ViewQueueReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.ViewQueueReq.class, com.tcn.cloud.api.api.v0alpha.ViewQueueReq.Builder.class);
  }

  private int bitField0_;
  public static final int NEWER_THAN_FIELD_NUMBER = 1;
  private com.google.protobuf.Timestamp newerThan_;
  /**
   * <pre>
   * return events with upload_ts times newer than this timestamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp newer_than = 1 [json_name = "newerThan"];</code>
   * @return Whether the newerThan field is set.
   */
  @java.lang.Override
  public boolean hasNewerThan() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * return events with upload_ts times newer than this timestamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp newer_than = 1 [json_name = "newerThan"];</code>
   * @return The newerThan.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getNewerThan() {
    return newerThan_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : newerThan_;
  }
  /**
   * <pre>
   * return events with upload_ts times newer than this timestamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp newer_than = 1 [json_name = "newerThan"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getNewerThanOrBuilder() {
    return newerThan_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : newerThan_;
  }

  public static final int NO_NEWER_THAN_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp noNewerThan_;
  /**
   * <pre>
   * do not return events with upload_ts times newer than this timestamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp no_newer_than = 2 [json_name = "noNewerThan"];</code>
   * @return Whether the noNewerThan field is set.
   */
  @java.lang.Override
  public boolean hasNoNewerThan() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * do not return events with upload_ts times newer than this timestamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp no_newer_than = 2 [json_name = "noNewerThan"];</code>
   * @return The noNewerThan.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getNoNewerThan() {
    return noNewerThan_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : noNewerThan_;
  }
  /**
   * <pre>
   * do not return events with upload_ts times newer than this timestamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp no_newer_than = 2 [json_name = "noNewerThan"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getNoNewerThanOrBuilder() {
    return noNewerThan_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : noNewerThan_;
  }

  public static final int AFTER_EVENT_ID_FIELD_NUMBER = 3;
  private long afterEventId_ = 0L;
  /**
   * <pre>
   * skip records with event_id smaller than this id
   * </pre>
   *
   * <code>int64 after_event_id = 3 [json_name = "afterEventId"];</code>
   * @return The afterEventId.
   */
  @java.lang.Override
  public long getAfterEventId() {
    return afterEventId_;
  }

  public static final int NUMBER_OF_RECORDS_FIELD_NUMBER = 4;
  private long numberOfRecords_ = 0L;
  /**
   * <pre>
   * max number of records to retrieve
   * </pre>
   *
   * <code>int64 number_of_records = 4 [json_name = "numberOfRecords"];</code>
   * @return The numberOfRecords.
   */
  @java.lang.Override
  public long getNumberOfRecords() {
    return numberOfRecords_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getNewerThan());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getNoNewerThan());
    }
    if (afterEventId_ != 0L) {
      output.writeInt64(3, afterEventId_);
    }
    if (numberOfRecords_ != 0L) {
      output.writeInt64(4, numberOfRecords_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getNewerThan());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getNoNewerThan());
    }
    if (afterEventId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, afterEventId_);
    }
    if (numberOfRecords_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, numberOfRecords_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.ViewQueueReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.ViewQueueReq other = (com.tcn.cloud.api.api.v0alpha.ViewQueueReq) obj;

    if (hasNewerThan() != other.hasNewerThan()) return false;
    if (hasNewerThan()) {
      if (!getNewerThan()
          .equals(other.getNewerThan())) return false;
    }
    if (hasNoNewerThan() != other.hasNoNewerThan()) return false;
    if (hasNoNewerThan()) {
      if (!getNoNewerThan()
          .equals(other.getNoNewerThan())) return false;
    }
    if (getAfterEventId()
        != other.getAfterEventId()) return false;
    if (getNumberOfRecords()
        != other.getNumberOfRecords()) return false;
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
    if (hasNewerThan()) {
      hash = (37 * hash) + NEWER_THAN_FIELD_NUMBER;
      hash = (53 * hash) + getNewerThan().hashCode();
    }
    if (hasNoNewerThan()) {
      hash = (37 * hash) + NO_NEWER_THAN_FIELD_NUMBER;
      hash = (53 * hash) + getNoNewerThan().hashCode();
    }
    hash = (37 * hash) + AFTER_EVENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAfterEventId());
    hash = (37 * hash) + NUMBER_OF_RECORDS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getNumberOfRecords());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.ViewQueueReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ViewQueueReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ViewQueueReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ViewQueueReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ViewQueueReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ViewQueueReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ViewQueueReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.ViewQueueReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.ViewQueueReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.ViewQueueReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ViewQueueReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.ViewQueueReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.ViewQueueReq prototype) {
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
   * Protobuf type {@code api.v0alpha.ViewQueueReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.ViewQueueReq)
      com.tcn.cloud.api.api.v0alpha.ViewQueueReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_ViewQueueReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_ViewQueueReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.ViewQueueReq.class, com.tcn.cloud.api.api.v0alpha.ViewQueueReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.ViewQueueReq.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getNewerThanFieldBuilder();
        getNoNewerThanFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      newerThan_ = null;
      if (newerThanBuilder_ != null) {
        newerThanBuilder_.dispose();
        newerThanBuilder_ = null;
      }
      noNewerThan_ = null;
      if (noNewerThanBuilder_ != null) {
        noNewerThanBuilder_.dispose();
        noNewerThanBuilder_ = null;
      }
      afterEventId_ = 0L;
      numberOfRecords_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_ViewQueueReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ViewQueueReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.ViewQueueReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ViewQueueReq build() {
      com.tcn.cloud.api.api.v0alpha.ViewQueueReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ViewQueueReq buildPartial() {
      com.tcn.cloud.api.api.v0alpha.ViewQueueReq result = new com.tcn.cloud.api.api.v0alpha.ViewQueueReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.ViewQueueReq result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.newerThan_ = newerThanBuilder_ == null
            ? newerThan_
            : newerThanBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.noNewerThan_ = noNewerThanBuilder_ == null
            ? noNewerThan_
            : noNewerThanBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.afterEventId_ = afterEventId_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.numberOfRecords_ = numberOfRecords_;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.ViewQueueReq) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.ViewQueueReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.ViewQueueReq other) {
      if (other == com.tcn.cloud.api.api.v0alpha.ViewQueueReq.getDefaultInstance()) return this;
      if (other.hasNewerThan()) {
        mergeNewerThan(other.getNewerThan());
      }
      if (other.hasNoNewerThan()) {
        mergeNoNewerThan(other.getNoNewerThan());
      }
      if (other.getAfterEventId() != 0L) {
        setAfterEventId(other.getAfterEventId());
      }
      if (other.getNumberOfRecords() != 0L) {
        setNumberOfRecords(other.getNumberOfRecords());
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
              input.readMessage(
                  getNewerThanFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getNoNewerThanFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              afterEventId_ = input.readInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              numberOfRecords_ = input.readInt64();
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

    private com.google.protobuf.Timestamp newerThan_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> newerThanBuilder_;
    /**
     * <pre>
     * return events with upload_ts times newer than this timestamp
     * </pre>
     *
     * <code>.google.protobuf.Timestamp newer_than = 1 [json_name = "newerThan"];</code>
     * @return Whether the newerThan field is set.
     */
    public boolean hasNewerThan() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * return events with upload_ts times newer than this timestamp
     * </pre>
     *
     * <code>.google.protobuf.Timestamp newer_than = 1 [json_name = "newerThan"];</code>
     * @return The newerThan.
     */
    public com.google.protobuf.Timestamp getNewerThan() {
      if (newerThanBuilder_ == null) {
        return newerThan_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : newerThan_;
      } else {
        return newerThanBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * return events with upload_ts times newer than this timestamp
     * </pre>
     *
     * <code>.google.protobuf.Timestamp newer_than = 1 [json_name = "newerThan"];</code>
     */
    public Builder setNewerThan(com.google.protobuf.Timestamp value) {
      if (newerThanBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        newerThan_ = value;
      } else {
        newerThanBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * return events with upload_ts times newer than this timestamp
     * </pre>
     *
     * <code>.google.protobuf.Timestamp newer_than = 1 [json_name = "newerThan"];</code>
     */
    public Builder setNewerThan(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (newerThanBuilder_ == null) {
        newerThan_ = builderForValue.build();
      } else {
        newerThanBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * return events with upload_ts times newer than this timestamp
     * </pre>
     *
     * <code>.google.protobuf.Timestamp newer_than = 1 [json_name = "newerThan"];</code>
     */
    public Builder mergeNewerThan(com.google.protobuf.Timestamp value) {
      if (newerThanBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          newerThan_ != null &&
          newerThan_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getNewerThanBuilder().mergeFrom(value);
        } else {
          newerThan_ = value;
        }
      } else {
        newerThanBuilder_.mergeFrom(value);
      }
      if (newerThan_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * return events with upload_ts times newer than this timestamp
     * </pre>
     *
     * <code>.google.protobuf.Timestamp newer_than = 1 [json_name = "newerThan"];</code>
     */
    public Builder clearNewerThan() {
      bitField0_ = (bitField0_ & ~0x00000001);
      newerThan_ = null;
      if (newerThanBuilder_ != null) {
        newerThanBuilder_.dispose();
        newerThanBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * return events with upload_ts times newer than this timestamp
     * </pre>
     *
     * <code>.google.protobuf.Timestamp newer_than = 1 [json_name = "newerThan"];</code>
     */
    public com.google.protobuf.Timestamp.Builder getNewerThanBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getNewerThanFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * return events with upload_ts times newer than this timestamp
     * </pre>
     *
     * <code>.google.protobuf.Timestamp newer_than = 1 [json_name = "newerThan"];</code>
     */
    public com.google.protobuf.TimestampOrBuilder getNewerThanOrBuilder() {
      if (newerThanBuilder_ != null) {
        return newerThanBuilder_.getMessageOrBuilder();
      } else {
        return newerThan_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : newerThan_;
      }
    }
    /**
     * <pre>
     * return events with upload_ts times newer than this timestamp
     * </pre>
     *
     * <code>.google.protobuf.Timestamp newer_than = 1 [json_name = "newerThan"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getNewerThanFieldBuilder() {
      if (newerThanBuilder_ == null) {
        newerThanBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getNewerThan(),
                getParentForChildren(),
                isClean());
        newerThan_ = null;
      }
      return newerThanBuilder_;
    }

    private com.google.protobuf.Timestamp noNewerThan_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> noNewerThanBuilder_;
    /**
     * <pre>
     * do not return events with upload_ts times newer than this timestamp
     * </pre>
     *
     * <code>.google.protobuf.Timestamp no_newer_than = 2 [json_name = "noNewerThan"];</code>
     * @return Whether the noNewerThan field is set.
     */
    public boolean hasNoNewerThan() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * do not return events with upload_ts times newer than this timestamp
     * </pre>
     *
     * <code>.google.protobuf.Timestamp no_newer_than = 2 [json_name = "noNewerThan"];</code>
     * @return The noNewerThan.
     */
    public com.google.protobuf.Timestamp getNoNewerThan() {
      if (noNewerThanBuilder_ == null) {
        return noNewerThan_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : noNewerThan_;
      } else {
        return noNewerThanBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * do not return events with upload_ts times newer than this timestamp
     * </pre>
     *
     * <code>.google.protobuf.Timestamp no_newer_than = 2 [json_name = "noNewerThan"];</code>
     */
    public Builder setNoNewerThan(com.google.protobuf.Timestamp value) {
      if (noNewerThanBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        noNewerThan_ = value;
      } else {
        noNewerThanBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * do not return events with upload_ts times newer than this timestamp
     * </pre>
     *
     * <code>.google.protobuf.Timestamp no_newer_than = 2 [json_name = "noNewerThan"];</code>
     */
    public Builder setNoNewerThan(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (noNewerThanBuilder_ == null) {
        noNewerThan_ = builderForValue.build();
      } else {
        noNewerThanBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * do not return events with upload_ts times newer than this timestamp
     * </pre>
     *
     * <code>.google.protobuf.Timestamp no_newer_than = 2 [json_name = "noNewerThan"];</code>
     */
    public Builder mergeNoNewerThan(com.google.protobuf.Timestamp value) {
      if (noNewerThanBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          noNewerThan_ != null &&
          noNewerThan_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getNoNewerThanBuilder().mergeFrom(value);
        } else {
          noNewerThan_ = value;
        }
      } else {
        noNewerThanBuilder_.mergeFrom(value);
      }
      if (noNewerThan_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * do not return events with upload_ts times newer than this timestamp
     * </pre>
     *
     * <code>.google.protobuf.Timestamp no_newer_than = 2 [json_name = "noNewerThan"];</code>
     */
    public Builder clearNoNewerThan() {
      bitField0_ = (bitField0_ & ~0x00000002);
      noNewerThan_ = null;
      if (noNewerThanBuilder_ != null) {
        noNewerThanBuilder_.dispose();
        noNewerThanBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * do not return events with upload_ts times newer than this timestamp
     * </pre>
     *
     * <code>.google.protobuf.Timestamp no_newer_than = 2 [json_name = "noNewerThan"];</code>
     */
    public com.google.protobuf.Timestamp.Builder getNoNewerThanBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getNoNewerThanFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * do not return events with upload_ts times newer than this timestamp
     * </pre>
     *
     * <code>.google.protobuf.Timestamp no_newer_than = 2 [json_name = "noNewerThan"];</code>
     */
    public com.google.protobuf.TimestampOrBuilder getNoNewerThanOrBuilder() {
      if (noNewerThanBuilder_ != null) {
        return noNewerThanBuilder_.getMessageOrBuilder();
      } else {
        return noNewerThan_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : noNewerThan_;
      }
    }
    /**
     * <pre>
     * do not return events with upload_ts times newer than this timestamp
     * </pre>
     *
     * <code>.google.protobuf.Timestamp no_newer_than = 2 [json_name = "noNewerThan"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getNoNewerThanFieldBuilder() {
      if (noNewerThanBuilder_ == null) {
        noNewerThanBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getNoNewerThan(),
                getParentForChildren(),
                isClean());
        noNewerThan_ = null;
      }
      return noNewerThanBuilder_;
    }

    private long afterEventId_ ;
    /**
     * <pre>
     * skip records with event_id smaller than this id
     * </pre>
     *
     * <code>int64 after_event_id = 3 [json_name = "afterEventId"];</code>
     * @return The afterEventId.
     */
    @java.lang.Override
    public long getAfterEventId() {
      return afterEventId_;
    }
    /**
     * <pre>
     * skip records with event_id smaller than this id
     * </pre>
     *
     * <code>int64 after_event_id = 3 [json_name = "afterEventId"];</code>
     * @param value The afterEventId to set.
     * @return This builder for chaining.
     */
    public Builder setAfterEventId(long value) {

      afterEventId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * skip records with event_id smaller than this id
     * </pre>
     *
     * <code>int64 after_event_id = 3 [json_name = "afterEventId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAfterEventId() {
      bitField0_ = (bitField0_ & ~0x00000004);
      afterEventId_ = 0L;
      onChanged();
      return this;
    }

    private long numberOfRecords_ ;
    /**
     * <pre>
     * max number of records to retrieve
     * </pre>
     *
     * <code>int64 number_of_records = 4 [json_name = "numberOfRecords"];</code>
     * @return The numberOfRecords.
     */
    @java.lang.Override
    public long getNumberOfRecords() {
      return numberOfRecords_;
    }
    /**
     * <pre>
     * max number of records to retrieve
     * </pre>
     *
     * <code>int64 number_of_records = 4 [json_name = "numberOfRecords"];</code>
     * @param value The numberOfRecords to set.
     * @return This builder for chaining.
     */
    public Builder setNumberOfRecords(long value) {

      numberOfRecords_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * max number of records to retrieve
     * </pre>
     *
     * <code>int64 number_of_records = 4 [json_name = "numberOfRecords"];</code>
     * @return This builder for chaining.
     */
    public Builder clearNumberOfRecords() {
      bitField0_ = (bitField0_ & ~0x00000008);
      numberOfRecords_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.ViewQueueReq)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.ViewQueueReq)
  private static final com.tcn.cloud.api.api.v0alpha.ViewQueueReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.ViewQueueReq();
  }

  public static com.tcn.cloud.api.api.v0alpha.ViewQueueReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ViewQueueReq>
      PARSER = new com.google.protobuf.AbstractParser<ViewQueueReq>() {
    @java.lang.Override
    public ViewQueueReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<ViewQueueReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ViewQueueReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.ViewQueueReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

