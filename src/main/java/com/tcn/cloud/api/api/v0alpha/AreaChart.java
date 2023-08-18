// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/ana.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.AreaChart}
 */
public final class AreaChart extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.AreaChart)
    AreaChartOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AreaChart.newBuilder() to construct.
  private AreaChart(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AreaChart() {
    fieldDataPointId_ = "";
    groupingDataPointId_ = "";
    orientation_ = 0;
    areaType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AreaChart();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_AreaChart_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_AreaChart_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.AreaChart.class, com.tcn.cloud.api.api.v0alpha.AreaChart.Builder.class);
  }

  private int bitField0_;
  public static final int FIELD_DATA_POINT_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object fieldDataPointId_ = "";
  /**
   * <code>string field_data_point_id = 1 [json_name = "fieldDataPointId"];</code>
   * @return The fieldDataPointId.
   */
  @java.lang.Override
  public java.lang.String getFieldDataPointId() {
    java.lang.Object ref = fieldDataPointId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fieldDataPointId_ = s;
      return s;
    }
  }
  /**
   * <code>string field_data_point_id = 1 [json_name = "fieldDataPointId"];</code>
   * @return The bytes for fieldDataPointId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFieldDataPointIdBytes() {
    java.lang.Object ref = fieldDataPointId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fieldDataPointId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GROUPING_DATA_POINT_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object groupingDataPointId_ = "";
  /**
   * <code>string grouping_data_point_id = 2 [json_name = "groupingDataPointId"];</code>
   * @return The groupingDataPointId.
   */
  @java.lang.Override
  public java.lang.String getGroupingDataPointId() {
    java.lang.Object ref = groupingDataPointId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      groupingDataPointId_ = s;
      return s;
    }
  }
  /**
   * <code>string grouping_data_point_id = 2 [json_name = "groupingDataPointId"];</code>
   * @return The bytes for groupingDataPointId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getGroupingDataPointIdBytes() {
    java.lang.Object ref = groupingDataPointId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      groupingDataPointId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ORIENTATION_FIELD_NUMBER = 3;
  private int orientation_ = 0;
  /**
   * <code>.api.commons.ChartOrientation orientation = 3 [json_name = "orientation"];</code>
   * @return The enum numeric value on the wire for orientation.
   */
  @java.lang.Override public int getOrientationValue() {
    return orientation_;
  }
  /**
   * <code>.api.commons.ChartOrientation orientation = 3 [json_name = "orientation"];</code>
   * @return The orientation.
   */
  @java.lang.Override public com.tcn.cloud.api.api.commons.ChartOrientation getOrientation() {
    com.tcn.cloud.api.api.commons.ChartOrientation result = com.tcn.cloud.api.api.commons.ChartOrientation.forNumber(orientation_);
    return result == null ? com.tcn.cloud.api.api.commons.ChartOrientation.UNRECOGNIZED : result;
  }

  public static final int THRESHOLD_FIELD_NUMBER = 4;
  private com.tcn.cloud.api.api.v0alpha.Threshold threshold_;
  /**
   * <code>.api.v0alpha.Threshold threshold = 4 [json_name = "threshold"];</code>
   * @return Whether the threshold field is set.
   */
  @java.lang.Override
  public boolean hasThreshold() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.api.v0alpha.Threshold threshold = 4 [json_name = "threshold"];</code>
   * @return The threshold.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.Threshold getThreshold() {
    return threshold_ == null ? com.tcn.cloud.api.api.v0alpha.Threshold.getDefaultInstance() : threshold_;
  }
  /**
   * <code>.api.v0alpha.Threshold threshold = 4 [json_name = "threshold"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.ThresholdOrBuilder getThresholdOrBuilder() {
    return threshold_ == null ? com.tcn.cloud.api.api.v0alpha.Threshold.getDefaultInstance() : threshold_;
  }

  public static final int AREA_TYPE_FIELD_NUMBER = 5;
  private int areaType_ = 0;
  /**
   * <code>.api.commons.AreaChartChoice area_type = 5 [json_name = "areaType"];</code>
   * @return The enum numeric value on the wire for areaType.
   */
  @java.lang.Override public int getAreaTypeValue() {
    return areaType_;
  }
  /**
   * <code>.api.commons.AreaChartChoice area_type = 5 [json_name = "areaType"];</code>
   * @return The areaType.
   */
  @java.lang.Override public com.tcn.cloud.api.api.commons.AreaChartChoice getAreaType() {
    com.tcn.cloud.api.api.commons.AreaChartChoice result = com.tcn.cloud.api.api.commons.AreaChartChoice.forNumber(areaType_);
    return result == null ? com.tcn.cloud.api.api.commons.AreaChartChoice.UNRECOGNIZED : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fieldDataPointId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, fieldDataPointId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(groupingDataPointId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, groupingDataPointId_);
    }
    if (orientation_ != com.tcn.cloud.api.api.commons.ChartOrientation.CHART_ORIENTATION_HORIZONTAL.getNumber()) {
      output.writeEnum(3, orientation_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(4, getThreshold());
    }
    if (areaType_ != com.tcn.cloud.api.api.commons.AreaChartChoice.AREA_CHART_CHOICE_AREA.getNumber()) {
      output.writeEnum(5, areaType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fieldDataPointId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, fieldDataPointId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(groupingDataPointId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, groupingDataPointId_);
    }
    if (orientation_ != com.tcn.cloud.api.api.commons.ChartOrientation.CHART_ORIENTATION_HORIZONTAL.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, orientation_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getThreshold());
    }
    if (areaType_ != com.tcn.cloud.api.api.commons.AreaChartChoice.AREA_CHART_CHOICE_AREA.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(5, areaType_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.AreaChart)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.AreaChart other = (com.tcn.cloud.api.api.v0alpha.AreaChart) obj;

    if (!getFieldDataPointId()
        .equals(other.getFieldDataPointId())) return false;
    if (!getGroupingDataPointId()
        .equals(other.getGroupingDataPointId())) return false;
    if (orientation_ != other.orientation_) return false;
    if (hasThreshold() != other.hasThreshold()) return false;
    if (hasThreshold()) {
      if (!getThreshold()
          .equals(other.getThreshold())) return false;
    }
    if (areaType_ != other.areaType_) return false;
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
    hash = (37 * hash) + FIELD_DATA_POINT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getFieldDataPointId().hashCode();
    hash = (37 * hash) + GROUPING_DATA_POINT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getGroupingDataPointId().hashCode();
    hash = (37 * hash) + ORIENTATION_FIELD_NUMBER;
    hash = (53 * hash) + orientation_;
    if (hasThreshold()) {
      hash = (37 * hash) + THRESHOLD_FIELD_NUMBER;
      hash = (53 * hash) + getThreshold().hashCode();
    }
    hash = (37 * hash) + AREA_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + areaType_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.AreaChart parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.AreaChart parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.AreaChart parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.AreaChart parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.AreaChart parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.AreaChart parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.AreaChart parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.AreaChart parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.AreaChart parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.AreaChart parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.AreaChart parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.AreaChart parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.AreaChart prototype) {
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
   * Protobuf type {@code api.v0alpha.AreaChart}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.AreaChart)
      com.tcn.cloud.api.api.v0alpha.AreaChartOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_AreaChart_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_AreaChart_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.AreaChart.class, com.tcn.cloud.api.api.v0alpha.AreaChart.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.AreaChart.newBuilder()
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
        getThresholdFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      fieldDataPointId_ = "";
      groupingDataPointId_ = "";
      orientation_ = 0;
      threshold_ = null;
      if (thresholdBuilder_ != null) {
        thresholdBuilder_.dispose();
        thresholdBuilder_ = null;
      }
      areaType_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_AreaChart_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.AreaChart getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.AreaChart.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.AreaChart build() {
      com.tcn.cloud.api.api.v0alpha.AreaChart result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.AreaChart buildPartial() {
      com.tcn.cloud.api.api.v0alpha.AreaChart result = new com.tcn.cloud.api.api.v0alpha.AreaChart(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.AreaChart result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.fieldDataPointId_ = fieldDataPointId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.groupingDataPointId_ = groupingDataPointId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.orientation_ = orientation_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.threshold_ = thresholdBuilder_ == null
            ? threshold_
            : thresholdBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.areaType_ = areaType_;
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.AreaChart) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.AreaChart)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.AreaChart other) {
      if (other == com.tcn.cloud.api.api.v0alpha.AreaChart.getDefaultInstance()) return this;
      if (!other.getFieldDataPointId().isEmpty()) {
        fieldDataPointId_ = other.fieldDataPointId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getGroupingDataPointId().isEmpty()) {
        groupingDataPointId_ = other.groupingDataPointId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.orientation_ != 0) {
        setOrientationValue(other.getOrientationValue());
      }
      if (other.hasThreshold()) {
        mergeThreshold(other.getThreshold());
      }
      if (other.areaType_ != 0) {
        setAreaTypeValue(other.getAreaTypeValue());
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
              fieldDataPointId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              groupingDataPointId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              orientation_ = input.readEnum();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 34: {
              input.readMessage(
                  getThresholdFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 40: {
              areaType_ = input.readEnum();
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

    private java.lang.Object fieldDataPointId_ = "";
    /**
     * <code>string field_data_point_id = 1 [json_name = "fieldDataPointId"];</code>
     * @return The fieldDataPointId.
     */
    public java.lang.String getFieldDataPointId() {
      java.lang.Object ref = fieldDataPointId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fieldDataPointId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string field_data_point_id = 1 [json_name = "fieldDataPointId"];</code>
     * @return The bytes for fieldDataPointId.
     */
    public com.google.protobuf.ByteString
        getFieldDataPointIdBytes() {
      java.lang.Object ref = fieldDataPointId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fieldDataPointId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string field_data_point_id = 1 [json_name = "fieldDataPointId"];</code>
     * @param value The fieldDataPointId to set.
     * @return This builder for chaining.
     */
    public Builder setFieldDataPointId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      fieldDataPointId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string field_data_point_id = 1 [json_name = "fieldDataPointId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFieldDataPointId() {
      fieldDataPointId_ = getDefaultInstance().getFieldDataPointId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string field_data_point_id = 1 [json_name = "fieldDataPointId"];</code>
     * @param value The bytes for fieldDataPointId to set.
     * @return This builder for chaining.
     */
    public Builder setFieldDataPointIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      fieldDataPointId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object groupingDataPointId_ = "";
    /**
     * <code>string grouping_data_point_id = 2 [json_name = "groupingDataPointId"];</code>
     * @return The groupingDataPointId.
     */
    public java.lang.String getGroupingDataPointId() {
      java.lang.Object ref = groupingDataPointId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        groupingDataPointId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string grouping_data_point_id = 2 [json_name = "groupingDataPointId"];</code>
     * @return The bytes for groupingDataPointId.
     */
    public com.google.protobuf.ByteString
        getGroupingDataPointIdBytes() {
      java.lang.Object ref = groupingDataPointId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        groupingDataPointId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string grouping_data_point_id = 2 [json_name = "groupingDataPointId"];</code>
     * @param value The groupingDataPointId to set.
     * @return This builder for chaining.
     */
    public Builder setGroupingDataPointId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      groupingDataPointId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string grouping_data_point_id = 2 [json_name = "groupingDataPointId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearGroupingDataPointId() {
      groupingDataPointId_ = getDefaultInstance().getGroupingDataPointId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string grouping_data_point_id = 2 [json_name = "groupingDataPointId"];</code>
     * @param value The bytes for groupingDataPointId to set.
     * @return This builder for chaining.
     */
    public Builder setGroupingDataPointIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      groupingDataPointId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private int orientation_ = 0;
    /**
     * <code>.api.commons.ChartOrientation orientation = 3 [json_name = "orientation"];</code>
     * @return The enum numeric value on the wire for orientation.
     */
    @java.lang.Override public int getOrientationValue() {
      return orientation_;
    }
    /**
     * <code>.api.commons.ChartOrientation orientation = 3 [json_name = "orientation"];</code>
     * @param value The enum numeric value on the wire for orientation to set.
     * @return This builder for chaining.
     */
    public Builder setOrientationValue(int value) {
      orientation_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.ChartOrientation orientation = 3 [json_name = "orientation"];</code>
     * @return The orientation.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.ChartOrientation getOrientation() {
      com.tcn.cloud.api.api.commons.ChartOrientation result = com.tcn.cloud.api.api.commons.ChartOrientation.forNumber(orientation_);
      return result == null ? com.tcn.cloud.api.api.commons.ChartOrientation.UNRECOGNIZED : result;
    }
    /**
     * <code>.api.commons.ChartOrientation orientation = 3 [json_name = "orientation"];</code>
     * @param value The orientation to set.
     * @return This builder for chaining.
     */
    public Builder setOrientation(com.tcn.cloud.api.api.commons.ChartOrientation value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      orientation_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.ChartOrientation orientation = 3 [json_name = "orientation"];</code>
     * @return This builder for chaining.
     */
    public Builder clearOrientation() {
      bitField0_ = (bitField0_ & ~0x00000004);
      orientation_ = 0;
      onChanged();
      return this;
    }

    private com.tcn.cloud.api.api.v0alpha.Threshold threshold_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.Threshold, com.tcn.cloud.api.api.v0alpha.Threshold.Builder, com.tcn.cloud.api.api.v0alpha.ThresholdOrBuilder> thresholdBuilder_;
    /**
     * <code>.api.v0alpha.Threshold threshold = 4 [json_name = "threshold"];</code>
     * @return Whether the threshold field is set.
     */
    public boolean hasThreshold() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>.api.v0alpha.Threshold threshold = 4 [json_name = "threshold"];</code>
     * @return The threshold.
     */
    public com.tcn.cloud.api.api.v0alpha.Threshold getThreshold() {
      if (thresholdBuilder_ == null) {
        return threshold_ == null ? com.tcn.cloud.api.api.v0alpha.Threshold.getDefaultInstance() : threshold_;
      } else {
        return thresholdBuilder_.getMessage();
      }
    }
    /**
     * <code>.api.v0alpha.Threshold threshold = 4 [json_name = "threshold"];</code>
     */
    public Builder setThreshold(com.tcn.cloud.api.api.v0alpha.Threshold value) {
      if (thresholdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        threshold_ = value;
      } else {
        thresholdBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.Threshold threshold = 4 [json_name = "threshold"];</code>
     */
    public Builder setThreshold(
        com.tcn.cloud.api.api.v0alpha.Threshold.Builder builderForValue) {
      if (thresholdBuilder_ == null) {
        threshold_ = builderForValue.build();
      } else {
        thresholdBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.Threshold threshold = 4 [json_name = "threshold"];</code>
     */
    public Builder mergeThreshold(com.tcn.cloud.api.api.v0alpha.Threshold value) {
      if (thresholdBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          threshold_ != null &&
          threshold_ != com.tcn.cloud.api.api.v0alpha.Threshold.getDefaultInstance()) {
          getThresholdBuilder().mergeFrom(value);
        } else {
          threshold_ = value;
        }
      } else {
        thresholdBuilder_.mergeFrom(value);
      }
      if (threshold_ != null) {
        bitField0_ |= 0x00000008;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.api.v0alpha.Threshold threshold = 4 [json_name = "threshold"];</code>
     */
    public Builder clearThreshold() {
      bitField0_ = (bitField0_ & ~0x00000008);
      threshold_ = null;
      if (thresholdBuilder_ != null) {
        thresholdBuilder_.dispose();
        thresholdBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.Threshold threshold = 4 [json_name = "threshold"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.Threshold.Builder getThresholdBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getThresholdFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.v0alpha.Threshold threshold = 4 [json_name = "threshold"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.ThresholdOrBuilder getThresholdOrBuilder() {
      if (thresholdBuilder_ != null) {
        return thresholdBuilder_.getMessageOrBuilder();
      } else {
        return threshold_ == null ?
            com.tcn.cloud.api.api.v0alpha.Threshold.getDefaultInstance() : threshold_;
      }
    }
    /**
     * <code>.api.v0alpha.Threshold threshold = 4 [json_name = "threshold"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.Threshold, com.tcn.cloud.api.api.v0alpha.Threshold.Builder, com.tcn.cloud.api.api.v0alpha.ThresholdOrBuilder> 
        getThresholdFieldBuilder() {
      if (thresholdBuilder_ == null) {
        thresholdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.Threshold, com.tcn.cloud.api.api.v0alpha.Threshold.Builder, com.tcn.cloud.api.api.v0alpha.ThresholdOrBuilder>(
                getThreshold(),
                getParentForChildren(),
                isClean());
        threshold_ = null;
      }
      return thresholdBuilder_;
    }

    private int areaType_ = 0;
    /**
     * <code>.api.commons.AreaChartChoice area_type = 5 [json_name = "areaType"];</code>
     * @return The enum numeric value on the wire for areaType.
     */
    @java.lang.Override public int getAreaTypeValue() {
      return areaType_;
    }
    /**
     * <code>.api.commons.AreaChartChoice area_type = 5 [json_name = "areaType"];</code>
     * @param value The enum numeric value on the wire for areaType to set.
     * @return This builder for chaining.
     */
    public Builder setAreaTypeValue(int value) {
      areaType_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.AreaChartChoice area_type = 5 [json_name = "areaType"];</code>
     * @return The areaType.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.AreaChartChoice getAreaType() {
      com.tcn.cloud.api.api.commons.AreaChartChoice result = com.tcn.cloud.api.api.commons.AreaChartChoice.forNumber(areaType_);
      return result == null ? com.tcn.cloud.api.api.commons.AreaChartChoice.UNRECOGNIZED : result;
    }
    /**
     * <code>.api.commons.AreaChartChoice area_type = 5 [json_name = "areaType"];</code>
     * @param value The areaType to set.
     * @return This builder for chaining.
     */
    public Builder setAreaType(com.tcn.cloud.api.api.commons.AreaChartChoice value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000010;
      areaType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.AreaChartChoice area_type = 5 [json_name = "areaType"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAreaType() {
      bitField0_ = (bitField0_ & ~0x00000010);
      areaType_ = 0;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.AreaChart)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.AreaChart)
  private static final com.tcn.cloud.api.api.v0alpha.AreaChart DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.AreaChart();
  }

  public static com.tcn.cloud.api.api.v0alpha.AreaChart getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AreaChart>
      PARSER = new com.google.protobuf.AbstractParser<AreaChart>() {
    @java.lang.Override
    public AreaChart parsePartialFrom(
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

  public static com.google.protobuf.Parser<AreaChart> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AreaChart> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.AreaChart getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

