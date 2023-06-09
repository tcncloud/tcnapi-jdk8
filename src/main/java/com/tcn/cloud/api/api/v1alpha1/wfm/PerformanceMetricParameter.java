// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

/**
 * <pre>
 * Represents a Performance Metric Parameter.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.wfm.PerformanceMetricParameter}
 */
public final class PerformanceMetricParameter extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.wfm.PerformanceMetricParameter)
    PerformanceMetricParameterOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PerformanceMetricParameter.newBuilder() to construct.
  private PerformanceMetricParameter(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PerformanceMetricParameter() {
    metricType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PerformanceMetricParameter();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_PerformanceMetricParameter_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_PerformanceMetricParameter_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.wfm.PerformanceMetricParameter.class, com.tcn.cloud.api.api.v1alpha1.wfm.PerformanceMetricParameter.Builder.class);
  }

  public static final int METRIC_TYPE_FIELD_NUMBER = 1;
  private int metricType_ = 0;
  /**
   * <pre>
   * The type of metric.
   * </pre>
   *
   * <code>.api.commons.PerformanceMetricType metric_type = 1 [json_name = "metricType"];</code>
   * @return The enum numeric value on the wire for metricType.
   */
  @java.lang.Override public int getMetricTypeValue() {
    return metricType_;
  }
  /**
   * <pre>
   * The type of metric.
   * </pre>
   *
   * <code>.api.commons.PerformanceMetricType metric_type = 1 [json_name = "metricType"];</code>
   * @return The metricType.
   */
  @java.lang.Override public com.tcn.cloud.api.api.commons.PerformanceMetricType getMetricType() {
    com.tcn.cloud.api.api.commons.PerformanceMetricType result = com.tcn.cloud.api.api.commons.PerformanceMetricType.forNumber(metricType_);
    return result == null ? com.tcn.cloud.api.api.commons.PerformanceMetricType.UNRECOGNIZED : result;
  }

  public static final int SERVICE_LEVEL_TARGET_DURATION_SECONDS_FIELD_NUMBER = 2;
  private com.google.protobuf.Int64Value serviceLevelTargetDurationSeconds_;
  /**
   * <pre>
   * Number of seconds allowed to answer a call if the &#64;metric_type is set to SERVICE_LEVEL_ANALYSIS.
   * If &#64;metric_type is not SERVICE_LEVEL_ANALYSIS then this field must be set to nil.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value service_level_target_duration_seconds = 2 [json_name = "serviceLevelTargetDurationSeconds"];</code>
   * @return Whether the serviceLevelTargetDurationSeconds field is set.
   */
  @java.lang.Override
  public boolean hasServiceLevelTargetDurationSeconds() {
    return serviceLevelTargetDurationSeconds_ != null;
  }
  /**
   * <pre>
   * Number of seconds allowed to answer a call if the &#64;metric_type is set to SERVICE_LEVEL_ANALYSIS.
   * If &#64;metric_type is not SERVICE_LEVEL_ANALYSIS then this field must be set to nil.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value service_level_target_duration_seconds = 2 [json_name = "serviceLevelTargetDurationSeconds"];</code>
   * @return The serviceLevelTargetDurationSeconds.
   */
  @java.lang.Override
  public com.google.protobuf.Int64Value getServiceLevelTargetDurationSeconds() {
    return serviceLevelTargetDurationSeconds_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : serviceLevelTargetDurationSeconds_;
  }
  /**
   * <pre>
   * Number of seconds allowed to answer a call if the &#64;metric_type is set to SERVICE_LEVEL_ANALYSIS.
   * If &#64;metric_type is not SERVICE_LEVEL_ANALYSIS then this field must be set to nil.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value service_level_target_duration_seconds = 2 [json_name = "serviceLevelTargetDurationSeconds"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.Int64ValueOrBuilder getServiceLevelTargetDurationSecondsOrBuilder() {
    return serviceLevelTargetDurationSeconds_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : serviceLevelTargetDurationSeconds_;
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
    if (metricType_ != com.tcn.cloud.api.api.commons.PerformanceMetricType.FTE_REQUIRED_VS_ACHIEVED_SIMPLE.getNumber()) {
      output.writeEnum(1, metricType_);
    }
    if (serviceLevelTargetDurationSeconds_ != null) {
      output.writeMessage(2, getServiceLevelTargetDurationSeconds());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (metricType_ != com.tcn.cloud.api.api.commons.PerformanceMetricType.FTE_REQUIRED_VS_ACHIEVED_SIMPLE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, metricType_);
    }
    if (serviceLevelTargetDurationSeconds_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getServiceLevelTargetDurationSeconds());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.wfm.PerformanceMetricParameter)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.wfm.PerformanceMetricParameter other = (com.tcn.cloud.api.api.v1alpha1.wfm.PerformanceMetricParameter) obj;

    if (metricType_ != other.metricType_) return false;
    if (hasServiceLevelTargetDurationSeconds() != other.hasServiceLevelTargetDurationSeconds()) return false;
    if (hasServiceLevelTargetDurationSeconds()) {
      if (!getServiceLevelTargetDurationSeconds()
          .equals(other.getServiceLevelTargetDurationSeconds())) return false;
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
    hash = (37 * hash) + METRIC_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + metricType_;
    if (hasServiceLevelTargetDurationSeconds()) {
      hash = (37 * hash) + SERVICE_LEVEL_TARGET_DURATION_SECONDS_FIELD_NUMBER;
      hash = (53 * hash) + getServiceLevelTargetDurationSeconds().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.PerformanceMetricParameter parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.PerformanceMetricParameter parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.PerformanceMetricParameter parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.PerformanceMetricParameter parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.PerformanceMetricParameter parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.PerformanceMetricParameter parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.PerformanceMetricParameter parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.PerformanceMetricParameter parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.PerformanceMetricParameter parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.PerformanceMetricParameter parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.PerformanceMetricParameter parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.PerformanceMetricParameter parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.wfm.PerformanceMetricParameter prototype) {
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
   * Represents a Performance Metric Parameter.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.wfm.PerformanceMetricParameter}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.wfm.PerformanceMetricParameter)
      com.tcn.cloud.api.api.v1alpha1.wfm.PerformanceMetricParameterOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_PerformanceMetricParameter_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_PerformanceMetricParameter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.wfm.PerformanceMetricParameter.class, com.tcn.cloud.api.api.v1alpha1.wfm.PerformanceMetricParameter.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.wfm.PerformanceMetricParameter.newBuilder()
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
      metricType_ = 0;
      serviceLevelTargetDurationSeconds_ = null;
      if (serviceLevelTargetDurationSecondsBuilder_ != null) {
        serviceLevelTargetDurationSecondsBuilder_.dispose();
        serviceLevelTargetDurationSecondsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_PerformanceMetricParameter_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.PerformanceMetricParameter getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.PerformanceMetricParameter.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.PerformanceMetricParameter build() {
      com.tcn.cloud.api.api.v1alpha1.wfm.PerformanceMetricParameter result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.PerformanceMetricParameter buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.wfm.PerformanceMetricParameter result = new com.tcn.cloud.api.api.v1alpha1.wfm.PerformanceMetricParameter(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.wfm.PerformanceMetricParameter result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.metricType_ = metricType_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.serviceLevelTargetDurationSeconds_ = serviceLevelTargetDurationSecondsBuilder_ == null
            ? serviceLevelTargetDurationSeconds_
            : serviceLevelTargetDurationSecondsBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.wfm.PerformanceMetricParameter) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.wfm.PerformanceMetricParameter)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.wfm.PerformanceMetricParameter other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.wfm.PerformanceMetricParameter.getDefaultInstance()) return this;
      if (other.metricType_ != 0) {
        setMetricTypeValue(other.getMetricTypeValue());
      }
      if (other.hasServiceLevelTargetDurationSeconds()) {
        mergeServiceLevelTargetDurationSeconds(other.getServiceLevelTargetDurationSeconds());
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
              metricType_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getServiceLevelTargetDurationSecondsFieldBuilder().getBuilder(),
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

    private int metricType_ = 0;
    /**
     * <pre>
     * The type of metric.
     * </pre>
     *
     * <code>.api.commons.PerformanceMetricType metric_type = 1 [json_name = "metricType"];</code>
     * @return The enum numeric value on the wire for metricType.
     */
    @java.lang.Override public int getMetricTypeValue() {
      return metricType_;
    }
    /**
     * <pre>
     * The type of metric.
     * </pre>
     *
     * <code>.api.commons.PerformanceMetricType metric_type = 1 [json_name = "metricType"];</code>
     * @param value The enum numeric value on the wire for metricType to set.
     * @return This builder for chaining.
     */
    public Builder setMetricTypeValue(int value) {
      metricType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The type of metric.
     * </pre>
     *
     * <code>.api.commons.PerformanceMetricType metric_type = 1 [json_name = "metricType"];</code>
     * @return The metricType.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.PerformanceMetricType getMetricType() {
      com.tcn.cloud.api.api.commons.PerformanceMetricType result = com.tcn.cloud.api.api.commons.PerformanceMetricType.forNumber(metricType_);
      return result == null ? com.tcn.cloud.api.api.commons.PerformanceMetricType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The type of metric.
     * </pre>
     *
     * <code>.api.commons.PerformanceMetricType metric_type = 1 [json_name = "metricType"];</code>
     * @param value The metricType to set.
     * @return This builder for chaining.
     */
    public Builder setMetricType(com.tcn.cloud.api.api.commons.PerformanceMetricType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      metricType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The type of metric.
     * </pre>
     *
     * <code>.api.commons.PerformanceMetricType metric_type = 1 [json_name = "metricType"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMetricType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      metricType_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.Int64Value serviceLevelTargetDurationSeconds_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder> serviceLevelTargetDurationSecondsBuilder_;
    /**
     * <pre>
     * Number of seconds allowed to answer a call if the &#64;metric_type is set to SERVICE_LEVEL_ANALYSIS.
     * If &#64;metric_type is not SERVICE_LEVEL_ANALYSIS then this field must be set to nil.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value service_level_target_duration_seconds = 2 [json_name = "serviceLevelTargetDurationSeconds"];</code>
     * @return Whether the serviceLevelTargetDurationSeconds field is set.
     */
    public boolean hasServiceLevelTargetDurationSeconds() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Number of seconds allowed to answer a call if the &#64;metric_type is set to SERVICE_LEVEL_ANALYSIS.
     * If &#64;metric_type is not SERVICE_LEVEL_ANALYSIS then this field must be set to nil.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value service_level_target_duration_seconds = 2 [json_name = "serviceLevelTargetDurationSeconds"];</code>
     * @return The serviceLevelTargetDurationSeconds.
     */
    public com.google.protobuf.Int64Value getServiceLevelTargetDurationSeconds() {
      if (serviceLevelTargetDurationSecondsBuilder_ == null) {
        return serviceLevelTargetDurationSeconds_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : serviceLevelTargetDurationSeconds_;
      } else {
        return serviceLevelTargetDurationSecondsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Number of seconds allowed to answer a call if the &#64;metric_type is set to SERVICE_LEVEL_ANALYSIS.
     * If &#64;metric_type is not SERVICE_LEVEL_ANALYSIS then this field must be set to nil.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value service_level_target_duration_seconds = 2 [json_name = "serviceLevelTargetDurationSeconds"];</code>
     */
    public Builder setServiceLevelTargetDurationSeconds(com.google.protobuf.Int64Value value) {
      if (serviceLevelTargetDurationSecondsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        serviceLevelTargetDurationSeconds_ = value;
      } else {
        serviceLevelTargetDurationSecondsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Number of seconds allowed to answer a call if the &#64;metric_type is set to SERVICE_LEVEL_ANALYSIS.
     * If &#64;metric_type is not SERVICE_LEVEL_ANALYSIS then this field must be set to nil.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value service_level_target_duration_seconds = 2 [json_name = "serviceLevelTargetDurationSeconds"];</code>
     */
    public Builder setServiceLevelTargetDurationSeconds(
        com.google.protobuf.Int64Value.Builder builderForValue) {
      if (serviceLevelTargetDurationSecondsBuilder_ == null) {
        serviceLevelTargetDurationSeconds_ = builderForValue.build();
      } else {
        serviceLevelTargetDurationSecondsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Number of seconds allowed to answer a call if the &#64;metric_type is set to SERVICE_LEVEL_ANALYSIS.
     * If &#64;metric_type is not SERVICE_LEVEL_ANALYSIS then this field must be set to nil.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value service_level_target_duration_seconds = 2 [json_name = "serviceLevelTargetDurationSeconds"];</code>
     */
    public Builder mergeServiceLevelTargetDurationSeconds(com.google.protobuf.Int64Value value) {
      if (serviceLevelTargetDurationSecondsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          serviceLevelTargetDurationSeconds_ != null &&
          serviceLevelTargetDurationSeconds_ != com.google.protobuf.Int64Value.getDefaultInstance()) {
          getServiceLevelTargetDurationSecondsBuilder().mergeFrom(value);
        } else {
          serviceLevelTargetDurationSeconds_ = value;
        }
      } else {
        serviceLevelTargetDurationSecondsBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Number of seconds allowed to answer a call if the &#64;metric_type is set to SERVICE_LEVEL_ANALYSIS.
     * If &#64;metric_type is not SERVICE_LEVEL_ANALYSIS then this field must be set to nil.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value service_level_target_duration_seconds = 2 [json_name = "serviceLevelTargetDurationSeconds"];</code>
     */
    public Builder clearServiceLevelTargetDurationSeconds() {
      bitField0_ = (bitField0_ & ~0x00000002);
      serviceLevelTargetDurationSeconds_ = null;
      if (serviceLevelTargetDurationSecondsBuilder_ != null) {
        serviceLevelTargetDurationSecondsBuilder_.dispose();
        serviceLevelTargetDurationSecondsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Number of seconds allowed to answer a call if the &#64;metric_type is set to SERVICE_LEVEL_ANALYSIS.
     * If &#64;metric_type is not SERVICE_LEVEL_ANALYSIS then this field must be set to nil.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value service_level_target_duration_seconds = 2 [json_name = "serviceLevelTargetDurationSeconds"];</code>
     */
    public com.google.protobuf.Int64Value.Builder getServiceLevelTargetDurationSecondsBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getServiceLevelTargetDurationSecondsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Number of seconds allowed to answer a call if the &#64;metric_type is set to SERVICE_LEVEL_ANALYSIS.
     * If &#64;metric_type is not SERVICE_LEVEL_ANALYSIS then this field must be set to nil.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value service_level_target_duration_seconds = 2 [json_name = "serviceLevelTargetDurationSeconds"];</code>
     */
    public com.google.protobuf.Int64ValueOrBuilder getServiceLevelTargetDurationSecondsOrBuilder() {
      if (serviceLevelTargetDurationSecondsBuilder_ != null) {
        return serviceLevelTargetDurationSecondsBuilder_.getMessageOrBuilder();
      } else {
        return serviceLevelTargetDurationSeconds_ == null ?
            com.google.protobuf.Int64Value.getDefaultInstance() : serviceLevelTargetDurationSeconds_;
      }
    }
    /**
     * <pre>
     * Number of seconds allowed to answer a call if the &#64;metric_type is set to SERVICE_LEVEL_ANALYSIS.
     * If &#64;metric_type is not SERVICE_LEVEL_ANALYSIS then this field must be set to nil.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value service_level_target_duration_seconds = 2 [json_name = "serviceLevelTargetDurationSeconds"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder> 
        getServiceLevelTargetDurationSecondsFieldBuilder() {
      if (serviceLevelTargetDurationSecondsBuilder_ == null) {
        serviceLevelTargetDurationSecondsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder>(
                getServiceLevelTargetDurationSeconds(),
                getParentForChildren(),
                isClean());
        serviceLevelTargetDurationSeconds_ = null;
      }
      return serviceLevelTargetDurationSecondsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.wfm.PerformanceMetricParameter)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.wfm.PerformanceMetricParameter)
  private static final com.tcn.cloud.api.api.v1alpha1.wfm.PerformanceMetricParameter DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.wfm.PerformanceMetricParameter();
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.PerformanceMetricParameter getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PerformanceMetricParameter>
      PARSER = new com.google.protobuf.AbstractParser<PerformanceMetricParameter>() {
    @java.lang.Override
    public PerformanceMetricParameter parsePartialFrom(
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

  public static com.google.protobuf.Parser<PerformanceMetricParameter> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PerformanceMetricParameter> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.PerformanceMetricParameter getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

