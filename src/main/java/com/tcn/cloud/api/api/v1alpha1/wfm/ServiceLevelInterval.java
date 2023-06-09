// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

/**
 * <pre>
 * Represents a service level interval.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.wfm.ServiceLevelInterval}
 */
public final class ServiceLevelInterval extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.wfm.ServiceLevelInterval)
    ServiceLevelIntervalOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ServiceLevelInterval.newBuilder() to construct.
  private ServiceLevelInterval(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ServiceLevelInterval() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ServiceLevelInterval();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ServiceLevelInterval_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ServiceLevelInterval_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.wfm.ServiceLevelInterval.class, com.tcn.cloud.api.api.v1alpha1.wfm.ServiceLevelInterval.Builder.class);
  }

  public static final int START_DATETIME_FIELD_NUMBER = 1;
  private com.google.protobuf.Timestamp startDatetime_;
  /**
   * <pre>
   * The start time of the interval.
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
   * The start time of the interval.
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
   * The start time of the interval.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_datetime = 1 [json_name = "startDatetime"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getStartDatetimeOrBuilder() {
    return startDatetime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : startDatetime_;
  }

  public static final int SERVICE_LEVEL_ACHIEVED_FIELD_NUMBER = 2;
  private float serviceLevelAchieved_ = 0F;
  /**
   * <pre>
   * The service level achieved as a percent value, ranging from 0.0 to 1.0
   * </pre>
   *
   * <code>float service_level_achieved = 2 [json_name = "serviceLevelAchieved"];</code>
   * @return The serviceLevelAchieved.
   */
  @java.lang.Override
  public float getServiceLevelAchieved() {
    return serviceLevelAchieved_;
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
    if (java.lang.Float.floatToRawIntBits(serviceLevelAchieved_) != 0) {
      output.writeFloat(2, serviceLevelAchieved_);
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
    if (java.lang.Float.floatToRawIntBits(serviceLevelAchieved_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, serviceLevelAchieved_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.wfm.ServiceLevelInterval)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.wfm.ServiceLevelInterval other = (com.tcn.cloud.api.api.v1alpha1.wfm.ServiceLevelInterval) obj;

    if (hasStartDatetime() != other.hasStartDatetime()) return false;
    if (hasStartDatetime()) {
      if (!getStartDatetime()
          .equals(other.getStartDatetime())) return false;
    }
    if (java.lang.Float.floatToIntBits(getServiceLevelAchieved())
        != java.lang.Float.floatToIntBits(
            other.getServiceLevelAchieved())) return false;
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
    hash = (37 * hash) + SERVICE_LEVEL_ACHIEVED_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getServiceLevelAchieved());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ServiceLevelInterval parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ServiceLevelInterval parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ServiceLevelInterval parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ServiceLevelInterval parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ServiceLevelInterval parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ServiceLevelInterval parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ServiceLevelInterval parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ServiceLevelInterval parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ServiceLevelInterval parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ServiceLevelInterval parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ServiceLevelInterval parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ServiceLevelInterval parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.wfm.ServiceLevelInterval prototype) {
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
   * Represents a service level interval.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.wfm.ServiceLevelInterval}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.wfm.ServiceLevelInterval)
      com.tcn.cloud.api.api.v1alpha1.wfm.ServiceLevelIntervalOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ServiceLevelInterval_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ServiceLevelInterval_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.wfm.ServiceLevelInterval.class, com.tcn.cloud.api.api.v1alpha1.wfm.ServiceLevelInterval.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.wfm.ServiceLevelInterval.newBuilder()
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
      serviceLevelAchieved_ = 0F;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ServiceLevelInterval_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.ServiceLevelInterval getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.ServiceLevelInterval.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.ServiceLevelInterval build() {
      com.tcn.cloud.api.api.v1alpha1.wfm.ServiceLevelInterval result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.ServiceLevelInterval buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.wfm.ServiceLevelInterval result = new com.tcn.cloud.api.api.v1alpha1.wfm.ServiceLevelInterval(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.wfm.ServiceLevelInterval result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.startDatetime_ = startDatetimeBuilder_ == null
            ? startDatetime_
            : startDatetimeBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.serviceLevelAchieved_ = serviceLevelAchieved_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.wfm.ServiceLevelInterval) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.wfm.ServiceLevelInterval)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.wfm.ServiceLevelInterval other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.wfm.ServiceLevelInterval.getDefaultInstance()) return this;
      if (other.hasStartDatetime()) {
        mergeStartDatetime(other.getStartDatetime());
      }
      if (other.getServiceLevelAchieved() != 0F) {
        setServiceLevelAchieved(other.getServiceLevelAchieved());
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
            case 21: {
              serviceLevelAchieved_ = input.readFloat();
              bitField0_ |= 0x00000002;
              break;
            } // case 21
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
     * The start time of the interval.
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
     * The start time of the interval.
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
     * The start time of the interval.
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
     * The start time of the interval.
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
     * The start time of the interval.
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
     * The start time of the interval.
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
     * The start time of the interval.
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
     * The start time of the interval.
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
     * The start time of the interval.
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

    private float serviceLevelAchieved_ ;
    /**
     * <pre>
     * The service level achieved as a percent value, ranging from 0.0 to 1.0
     * </pre>
     *
     * <code>float service_level_achieved = 2 [json_name = "serviceLevelAchieved"];</code>
     * @return The serviceLevelAchieved.
     */
    @java.lang.Override
    public float getServiceLevelAchieved() {
      return serviceLevelAchieved_;
    }
    /**
     * <pre>
     * The service level achieved as a percent value, ranging from 0.0 to 1.0
     * </pre>
     *
     * <code>float service_level_achieved = 2 [json_name = "serviceLevelAchieved"];</code>
     * @param value The serviceLevelAchieved to set.
     * @return This builder for chaining.
     */
    public Builder setServiceLevelAchieved(float value) {

      serviceLevelAchieved_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The service level achieved as a percent value, ranging from 0.0 to 1.0
     * </pre>
     *
     * <code>float service_level_achieved = 2 [json_name = "serviceLevelAchieved"];</code>
     * @return This builder for chaining.
     */
    public Builder clearServiceLevelAchieved() {
      bitField0_ = (bitField0_ & ~0x00000002);
      serviceLevelAchieved_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.wfm.ServiceLevelInterval)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.wfm.ServiceLevelInterval)
  private static final com.tcn.cloud.api.api.v1alpha1.wfm.ServiceLevelInterval DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.wfm.ServiceLevelInterval();
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ServiceLevelInterval getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ServiceLevelInterval>
      PARSER = new com.google.protobuf.AbstractParser<ServiceLevelInterval>() {
    @java.lang.Override
    public ServiceLevelInterval parsePartialFrom(
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

  public static com.google.protobuf.Parser<ServiceLevelInterval> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ServiceLevelInterval> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.ServiceLevelInterval getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

