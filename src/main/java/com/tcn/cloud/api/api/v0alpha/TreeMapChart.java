// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/ana.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.TreeMapChart}
 */
public final class TreeMapChart extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.TreeMapChart)
    TreeMapChartOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TreeMapChart.newBuilder() to construct.
  private TreeMapChart(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TreeMapChart() {
    fieldDataPointId_ = "";
    groupingDataPointId_ = "";
    minColor_ = "";
    maxColor_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TreeMapChart();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_TreeMapChart_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_TreeMapChart_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.TreeMapChart.class, com.tcn.cloud.api.api.v0alpha.TreeMapChart.Builder.class);
  }

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

  public static final int MIN_COLOR_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object minColor_ = "";
  /**
   * <code>string min_color = 3 [json_name = "minColor"];</code>
   * @return The minColor.
   */
  @java.lang.Override
  public java.lang.String getMinColor() {
    java.lang.Object ref = minColor_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      minColor_ = s;
      return s;
    }
  }
  /**
   * <code>string min_color = 3 [json_name = "minColor"];</code>
   * @return The bytes for minColor.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMinColorBytes() {
    java.lang.Object ref = minColor_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      minColor_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MAX_COLOR_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object maxColor_ = "";
  /**
   * <code>string max_color = 4 [json_name = "maxColor"];</code>
   * @return The maxColor.
   */
  @java.lang.Override
  public java.lang.String getMaxColor() {
    java.lang.Object ref = maxColor_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      maxColor_ = s;
      return s;
    }
  }
  /**
   * <code>string max_color = 4 [json_name = "maxColor"];</code>
   * @return The bytes for maxColor.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMaxColorBytes() {
    java.lang.Object ref = maxColor_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      maxColor_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(minColor_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, minColor_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(maxColor_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, maxColor_);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(minColor_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, minColor_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(maxColor_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, maxColor_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.TreeMapChart)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.TreeMapChart other = (com.tcn.cloud.api.api.v0alpha.TreeMapChart) obj;

    if (!getFieldDataPointId()
        .equals(other.getFieldDataPointId())) return false;
    if (!getGroupingDataPointId()
        .equals(other.getGroupingDataPointId())) return false;
    if (!getMinColor()
        .equals(other.getMinColor())) return false;
    if (!getMaxColor()
        .equals(other.getMaxColor())) return false;
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
    hash = (37 * hash) + MIN_COLOR_FIELD_NUMBER;
    hash = (53 * hash) + getMinColor().hashCode();
    hash = (37 * hash) + MAX_COLOR_FIELD_NUMBER;
    hash = (53 * hash) + getMaxColor().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.TreeMapChart parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.TreeMapChart parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.TreeMapChart parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.TreeMapChart parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.TreeMapChart parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.TreeMapChart parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.TreeMapChart parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.TreeMapChart parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.TreeMapChart parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.TreeMapChart parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.TreeMapChart parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.TreeMapChart parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.TreeMapChart prototype) {
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
   * Protobuf type {@code api.v0alpha.TreeMapChart}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.TreeMapChart)
      com.tcn.cloud.api.api.v0alpha.TreeMapChartOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_TreeMapChart_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_TreeMapChart_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.TreeMapChart.class, com.tcn.cloud.api.api.v0alpha.TreeMapChart.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.TreeMapChart.newBuilder()
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
      fieldDataPointId_ = "";
      groupingDataPointId_ = "";
      minColor_ = "";
      maxColor_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_TreeMapChart_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.TreeMapChart getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.TreeMapChart.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.TreeMapChart build() {
      com.tcn.cloud.api.api.v0alpha.TreeMapChart result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.TreeMapChart buildPartial() {
      com.tcn.cloud.api.api.v0alpha.TreeMapChart result = new com.tcn.cloud.api.api.v0alpha.TreeMapChart(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.TreeMapChart result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.fieldDataPointId_ = fieldDataPointId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.groupingDataPointId_ = groupingDataPointId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.minColor_ = minColor_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.maxColor_ = maxColor_;
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.TreeMapChart) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.TreeMapChart)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.TreeMapChart other) {
      if (other == com.tcn.cloud.api.api.v0alpha.TreeMapChart.getDefaultInstance()) return this;
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
      if (!other.getMinColor().isEmpty()) {
        minColor_ = other.minColor_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getMaxColor().isEmpty()) {
        maxColor_ = other.maxColor_;
        bitField0_ |= 0x00000008;
        onChanged();
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
            case 26: {
              minColor_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              maxColor_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
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

    private java.lang.Object minColor_ = "";
    /**
     * <code>string min_color = 3 [json_name = "minColor"];</code>
     * @return The minColor.
     */
    public java.lang.String getMinColor() {
      java.lang.Object ref = minColor_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        minColor_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string min_color = 3 [json_name = "minColor"];</code>
     * @return The bytes for minColor.
     */
    public com.google.protobuf.ByteString
        getMinColorBytes() {
      java.lang.Object ref = minColor_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        minColor_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string min_color = 3 [json_name = "minColor"];</code>
     * @param value The minColor to set.
     * @return This builder for chaining.
     */
    public Builder setMinColor(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      minColor_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string min_color = 3 [json_name = "minColor"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMinColor() {
      minColor_ = getDefaultInstance().getMinColor();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string min_color = 3 [json_name = "minColor"];</code>
     * @param value The bytes for minColor to set.
     * @return This builder for chaining.
     */
    public Builder setMinColorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      minColor_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object maxColor_ = "";
    /**
     * <code>string max_color = 4 [json_name = "maxColor"];</code>
     * @return The maxColor.
     */
    public java.lang.String getMaxColor() {
      java.lang.Object ref = maxColor_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        maxColor_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string max_color = 4 [json_name = "maxColor"];</code>
     * @return The bytes for maxColor.
     */
    public com.google.protobuf.ByteString
        getMaxColorBytes() {
      java.lang.Object ref = maxColor_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        maxColor_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string max_color = 4 [json_name = "maxColor"];</code>
     * @param value The maxColor to set.
     * @return This builder for chaining.
     */
    public Builder setMaxColor(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      maxColor_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>string max_color = 4 [json_name = "maxColor"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxColor() {
      maxColor_ = getDefaultInstance().getMaxColor();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>string max_color = 4 [json_name = "maxColor"];</code>
     * @param value The bytes for maxColor to set.
     * @return This builder for chaining.
     */
    public Builder setMaxColorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      maxColor_ = value;
      bitField0_ |= 0x00000008;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.TreeMapChart)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.TreeMapChart)
  private static final com.tcn.cloud.api.api.v0alpha.TreeMapChart DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.TreeMapChart();
  }

  public static com.tcn.cloud.api.api.v0alpha.TreeMapChart getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TreeMapChart>
      PARSER = new com.google.protobuf.AbstractParser<TreeMapChart>() {
    @java.lang.Override
    public TreeMapChart parsePartialFrom(
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

  public static com.google.protobuf.Parser<TreeMapChart> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TreeMapChart> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.TreeMapChart getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

