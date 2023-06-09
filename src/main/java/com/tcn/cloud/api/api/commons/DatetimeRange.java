// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/wfm.proto

package com.tcn.cloud.api.api.commons;

/**
 * Protobuf type {@code api.commons.DatetimeRange}
 */
public final class DatetimeRange extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.commons.DatetimeRange)
    DatetimeRangeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DatetimeRange.newBuilder() to construct.
  private DatetimeRange(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DatetimeRange() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DatetimeRange();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.commons.WfmProto.internal_static_api_commons_DatetimeRange_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.commons.WfmProto.internal_static_api_commons_DatetimeRange_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.commons.DatetimeRange.class, com.tcn.cloud.api.api.commons.DatetimeRange.Builder.class);
  }

  public static final int START_DATETIME_FIELD_NUMBER = 1;
  private com.google.protobuf.Timestamp startDatetime_;
  /**
   * <pre>
   * begining datetime
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_datetime = 1 [json_name = "startDatetime"];</code>
   * @return Whether the startDatetime field is set.
   */
  @java.lang.Override
  public boolean hasStartDatetime() {
    return startDatetime_ != null;
  }
  /**
   * <pre>
   * begining datetime
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_datetime = 1 [json_name = "startDatetime"];</code>
   * @return The startDatetime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getStartDatetime() {
    return startDatetime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : startDatetime_;
  }
  /**
   * <pre>
   * begining datetime
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_datetime = 1 [json_name = "startDatetime"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getStartDatetimeOrBuilder() {
    return startDatetime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : startDatetime_;
  }

  public static final int END_DATETIME_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp endDatetime_;
  /**
   * <pre>
   * ending datetime
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_datetime = 2 [json_name = "endDatetime"];</code>
   * @return Whether the endDatetime field is set.
   */
  @java.lang.Override
  public boolean hasEndDatetime() {
    return endDatetime_ != null;
  }
  /**
   * <pre>
   * ending datetime
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_datetime = 2 [json_name = "endDatetime"];</code>
   * @return The endDatetime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getEndDatetime() {
    return endDatetime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : endDatetime_;
  }
  /**
   * <pre>
   * ending datetime
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_datetime = 2 [json_name = "endDatetime"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getEndDatetimeOrBuilder() {
    return endDatetime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : endDatetime_;
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
    if (startDatetime_ != null) {
      output.writeMessage(1, getStartDatetime());
    }
    if (endDatetime_ != null) {
      output.writeMessage(2, getEndDatetime());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (startDatetime_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getStartDatetime());
    }
    if (endDatetime_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getEndDatetime());
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
    if (!(obj instanceof com.tcn.cloud.api.api.commons.DatetimeRange)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.commons.DatetimeRange other = (com.tcn.cloud.api.api.commons.DatetimeRange) obj;

    if (hasStartDatetime() != other.hasStartDatetime()) return false;
    if (hasStartDatetime()) {
      if (!getStartDatetime()
          .equals(other.getStartDatetime())) return false;
    }
    if (hasEndDatetime() != other.hasEndDatetime()) return false;
    if (hasEndDatetime()) {
      if (!getEndDatetime()
          .equals(other.getEndDatetime())) return false;
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
    if (hasStartDatetime()) {
      hash = (37 * hash) + START_DATETIME_FIELD_NUMBER;
      hash = (53 * hash) + getStartDatetime().hashCode();
    }
    if (hasEndDatetime()) {
      hash = (37 * hash) + END_DATETIME_FIELD_NUMBER;
      hash = (53 * hash) + getEndDatetime().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.commons.DatetimeRange parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.DatetimeRange parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.DatetimeRange parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.DatetimeRange parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.DatetimeRange parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.DatetimeRange parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.DatetimeRange parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.DatetimeRange parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.commons.DatetimeRange parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.commons.DatetimeRange parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.DatetimeRange parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.DatetimeRange parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.commons.DatetimeRange prototype) {
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
   * Protobuf type {@code api.commons.DatetimeRange}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.commons.DatetimeRange)
      com.tcn.cloud.api.api.commons.DatetimeRangeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.WfmProto.internal_static_api_commons_DatetimeRange_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.commons.WfmProto.internal_static_api_commons_DatetimeRange_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.commons.DatetimeRange.class, com.tcn.cloud.api.api.commons.DatetimeRange.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.commons.DatetimeRange.newBuilder()
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
      startDatetime_ = null;
      if (startDatetimeBuilder_ != null) {
        startDatetimeBuilder_.dispose();
        startDatetimeBuilder_ = null;
      }
      endDatetime_ = null;
      if (endDatetimeBuilder_ != null) {
        endDatetimeBuilder_.dispose();
        endDatetimeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.commons.WfmProto.internal_static_api_commons_DatetimeRange_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.DatetimeRange getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.commons.DatetimeRange.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.DatetimeRange build() {
      com.tcn.cloud.api.api.commons.DatetimeRange result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.DatetimeRange buildPartial() {
      com.tcn.cloud.api.api.commons.DatetimeRange result = new com.tcn.cloud.api.api.commons.DatetimeRange(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.commons.DatetimeRange result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.startDatetime_ = startDatetimeBuilder_ == null
            ? startDatetime_
            : startDatetimeBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.endDatetime_ = endDatetimeBuilder_ == null
            ? endDatetime_
            : endDatetimeBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.commons.DatetimeRange) {
        return mergeFrom((com.tcn.cloud.api.api.commons.DatetimeRange)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.commons.DatetimeRange other) {
      if (other == com.tcn.cloud.api.api.commons.DatetimeRange.getDefaultInstance()) return this;
      if (other.hasStartDatetime()) {
        mergeStartDatetime(other.getStartDatetime());
      }
      if (other.hasEndDatetime()) {
        mergeEndDatetime(other.getEndDatetime());
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
                  getStartDatetimeFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getEndDatetimeFieldBuilder().getBuilder(),
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

    private com.google.protobuf.Timestamp startDatetime_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> startDatetimeBuilder_;
    /**
     * <pre>
     * begining datetime
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_datetime = 1 [json_name = "startDatetime"];</code>
     * @return Whether the startDatetime field is set.
     */
    public boolean hasStartDatetime() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * begining datetime
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_datetime = 1 [json_name = "startDatetime"];</code>
     * @return The startDatetime.
     */
    public com.google.protobuf.Timestamp getStartDatetime() {
      if (startDatetimeBuilder_ == null) {
        return startDatetime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : startDatetime_;
      } else {
        return startDatetimeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * begining datetime
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_datetime = 1 [json_name = "startDatetime"];</code>
     */
    public Builder setStartDatetime(com.google.protobuf.Timestamp value) {
      if (startDatetimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        startDatetime_ = value;
      } else {
        startDatetimeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * begining datetime
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_datetime = 1 [json_name = "startDatetime"];</code>
     */
    public Builder setStartDatetime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (startDatetimeBuilder_ == null) {
        startDatetime_ = builderForValue.build();
      } else {
        startDatetimeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * begining datetime
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_datetime = 1 [json_name = "startDatetime"];</code>
     */
    public Builder mergeStartDatetime(com.google.protobuf.Timestamp value) {
      if (startDatetimeBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          startDatetime_ != null &&
          startDatetime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getStartDatetimeBuilder().mergeFrom(value);
        } else {
          startDatetime_ = value;
        }
      } else {
        startDatetimeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * begining datetime
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_datetime = 1 [json_name = "startDatetime"];</code>
     */
    public Builder clearStartDatetime() {
      bitField0_ = (bitField0_ & ~0x00000001);
      startDatetime_ = null;
      if (startDatetimeBuilder_ != null) {
        startDatetimeBuilder_.dispose();
        startDatetimeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * begining datetime
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_datetime = 1 [json_name = "startDatetime"];</code>
     */
    public com.google.protobuf.Timestamp.Builder getStartDatetimeBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getStartDatetimeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * begining datetime
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_datetime = 1 [json_name = "startDatetime"];</code>
     */
    public com.google.protobuf.TimestampOrBuilder getStartDatetimeOrBuilder() {
      if (startDatetimeBuilder_ != null) {
        return startDatetimeBuilder_.getMessageOrBuilder();
      } else {
        return startDatetime_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : startDatetime_;
      }
    }
    /**
     * <pre>
     * begining datetime
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_datetime = 1 [json_name = "startDatetime"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getStartDatetimeFieldBuilder() {
      if (startDatetimeBuilder_ == null) {
        startDatetimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getStartDatetime(),
                getParentForChildren(),
                isClean());
        startDatetime_ = null;
      }
      return startDatetimeBuilder_;
    }

    private com.google.protobuf.Timestamp endDatetime_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> endDatetimeBuilder_;
    /**
     * <pre>
     * ending datetime
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_datetime = 2 [json_name = "endDatetime"];</code>
     * @return Whether the endDatetime field is set.
     */
    public boolean hasEndDatetime() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * ending datetime
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_datetime = 2 [json_name = "endDatetime"];</code>
     * @return The endDatetime.
     */
    public com.google.protobuf.Timestamp getEndDatetime() {
      if (endDatetimeBuilder_ == null) {
        return endDatetime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : endDatetime_;
      } else {
        return endDatetimeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * ending datetime
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_datetime = 2 [json_name = "endDatetime"];</code>
     */
    public Builder setEndDatetime(com.google.protobuf.Timestamp value) {
      if (endDatetimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        endDatetime_ = value;
      } else {
        endDatetimeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ending datetime
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_datetime = 2 [json_name = "endDatetime"];</code>
     */
    public Builder setEndDatetime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (endDatetimeBuilder_ == null) {
        endDatetime_ = builderForValue.build();
      } else {
        endDatetimeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ending datetime
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_datetime = 2 [json_name = "endDatetime"];</code>
     */
    public Builder mergeEndDatetime(com.google.protobuf.Timestamp value) {
      if (endDatetimeBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          endDatetime_ != null &&
          endDatetime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getEndDatetimeBuilder().mergeFrom(value);
        } else {
          endDatetime_ = value;
        }
      } else {
        endDatetimeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ending datetime
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_datetime = 2 [json_name = "endDatetime"];</code>
     */
    public Builder clearEndDatetime() {
      bitField0_ = (bitField0_ & ~0x00000002);
      endDatetime_ = null;
      if (endDatetimeBuilder_ != null) {
        endDatetimeBuilder_.dispose();
        endDatetimeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ending datetime
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_datetime = 2 [json_name = "endDatetime"];</code>
     */
    public com.google.protobuf.Timestamp.Builder getEndDatetimeBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getEndDatetimeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * ending datetime
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_datetime = 2 [json_name = "endDatetime"];</code>
     */
    public com.google.protobuf.TimestampOrBuilder getEndDatetimeOrBuilder() {
      if (endDatetimeBuilder_ != null) {
        return endDatetimeBuilder_.getMessageOrBuilder();
      } else {
        return endDatetime_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : endDatetime_;
      }
    }
    /**
     * <pre>
     * ending datetime
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_datetime = 2 [json_name = "endDatetime"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getEndDatetimeFieldBuilder() {
      if (endDatetimeBuilder_ == null) {
        endDatetimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getEndDatetime(),
                getParentForChildren(),
                isClean());
        endDatetime_ = null;
      }
      return endDatetimeBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.commons.DatetimeRange)
  }

  // @@protoc_insertion_point(class_scope:api.commons.DatetimeRange)
  private static final com.tcn.cloud.api.api.commons.DatetimeRange DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.commons.DatetimeRange();
  }

  public static com.tcn.cloud.api.api.commons.DatetimeRange getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DatetimeRange>
      PARSER = new com.google.protobuf.AbstractParser<DatetimeRange>() {
    @java.lang.Override
    public DatetimeRange parsePartialFrom(
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

  public static com.google.protobuf.Parser<DatetimeRange> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DatetimeRange> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.commons.DatetimeRange getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

