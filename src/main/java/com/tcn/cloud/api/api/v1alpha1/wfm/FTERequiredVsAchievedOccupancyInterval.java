// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

/**
 * Protobuf type {@code api.v1alpha1.wfm.FTERequiredVsAchievedOccupancyInterval}
 */
public final class FTERequiredVsAchievedOccupancyInterval extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.wfm.FTERequiredVsAchievedOccupancyInterval)
    FTERequiredVsAchievedOccupancyIntervalOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FTERequiredVsAchievedOccupancyInterval.newBuilder() to construct.
  private FTERequiredVsAchievedOccupancyInterval(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FTERequiredVsAchievedOccupancyInterval() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FTERequiredVsAchievedOccupancyInterval();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_FTERequiredVsAchievedOccupancyInterval_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_FTERequiredVsAchievedOccupancyInterval_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.wfm.FTERequiredVsAchievedOccupancyInterval.class, com.tcn.cloud.api.api.v1alpha1.wfm.FTERequiredVsAchievedOccupancyInterval.Builder.class);
  }

  public static final int START_DATETIME_FIELD_NUMBER = 1;
  private com.google.protobuf.Timestamp startDatetime_;
  /**
   * <code>.google.protobuf.Timestamp start_datetime = 1 [json_name = "startDatetime"];</code>
   * @return Whether the startDatetime field is set.
   */
  @java.lang.Override
  public boolean hasStartDatetime() {
    return startDatetime_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp start_datetime = 1 [json_name = "startDatetime"];</code>
   * @return The startDatetime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getStartDatetime() {
    return startDatetime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : startDatetime_;
  }
  /**
   * <code>.google.protobuf.Timestamp start_datetime = 1 [json_name = "startDatetime"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getStartDatetimeOrBuilder() {
    return startDatetime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : startDatetime_;
  }

  public static final int REQUIRED_FTE_OCCUPANCY_FIELD_NUMBER = 2;
  private float requiredFteOccupancy_ = 0F;
  /**
   * <code>float required_fte_occupancy = 2 [json_name = "requiredFteOccupancy", deprecated = true];</code>
   * @deprecated api.v1alpha1.wfm.FTERequiredVsAchievedOccupancyInterval.required_fte_occupancy is deprecated.
   *     See api/v1alpha1/wfm/wfm.proto;l=5911
   * @return The requiredFteOccupancy.
   */
  @java.lang.Override
  @java.lang.Deprecated public float getRequiredFteOccupancy() {
    return requiredFteOccupancy_;
  }

  public static final int ACHIEVED_FTE_OCCUPANCY_FIELD_NUMBER = 3;
  private float achievedFteOccupancy_ = 0F;
  /**
   * <code>float achieved_fte_occupancy = 3 [json_name = "achievedFteOccupancy", deprecated = true];</code>
   * @deprecated api.v1alpha1.wfm.FTERequiredVsAchievedOccupancyInterval.achieved_fte_occupancy is deprecated.
   *     See api/v1alpha1/wfm/wfm.proto;l=5912
   * @return The achievedFteOccupancy.
   */
  @java.lang.Override
  @java.lang.Deprecated public float getAchievedFteOccupancy() {
    return achievedFteOccupancy_;
  }

  public static final int REQUIRED_FTE_FIELD_NUMBER = 4;
  private float requiredFte_ = 0F;
  /**
   * <pre>
   * Number of required FTE in the interval.
   * </pre>
   *
   * <code>float required_fte = 4 [json_name = "requiredFte"];</code>
   * @return The requiredFte.
   */
  @java.lang.Override
  public float getRequiredFte() {
    return requiredFte_;
  }

  public static final int ACHIEVED_FTE_FIELD_NUMBER = 5;
  private float achievedFte_ = 0F;
  /**
   * <pre>
   * Number of achieved FTE's in the interval.
   * </pre>
   *
   * <code>float achieved_fte = 5 [json_name = "achievedFte"];</code>
   * @return The achievedFte.
   */
  @java.lang.Override
  public float getAchievedFte() {
    return achievedFte_;
  }

  public static final int PRODUCTIVE_FTE_FIELD_NUMBER = 6;
  private float productiveFte_ = 0F;
  /**
   * <pre>
   * Count of FTE scheduled to be on the phone / productive for a specific interval / duration of time.
   * </pre>
   *
   * <code>float productive_fte = 6 [json_name = "productiveFte"];</code>
   * @return The productiveFte.
   */
  @java.lang.Override
  public float getProductiveFte() {
    return productiveFte_;
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
    if (java.lang.Float.floatToRawIntBits(requiredFteOccupancy_) != 0) {
      output.writeFloat(2, requiredFteOccupancy_);
    }
    if (java.lang.Float.floatToRawIntBits(achievedFteOccupancy_) != 0) {
      output.writeFloat(3, achievedFteOccupancy_);
    }
    if (java.lang.Float.floatToRawIntBits(requiredFte_) != 0) {
      output.writeFloat(4, requiredFte_);
    }
    if (java.lang.Float.floatToRawIntBits(achievedFte_) != 0) {
      output.writeFloat(5, achievedFte_);
    }
    if (java.lang.Float.floatToRawIntBits(productiveFte_) != 0) {
      output.writeFloat(6, productiveFte_);
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
    if (java.lang.Float.floatToRawIntBits(requiredFteOccupancy_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, requiredFteOccupancy_);
    }
    if (java.lang.Float.floatToRawIntBits(achievedFteOccupancy_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, achievedFteOccupancy_);
    }
    if (java.lang.Float.floatToRawIntBits(requiredFte_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(4, requiredFte_);
    }
    if (java.lang.Float.floatToRawIntBits(achievedFte_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(5, achievedFte_);
    }
    if (java.lang.Float.floatToRawIntBits(productiveFte_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(6, productiveFte_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.wfm.FTERequiredVsAchievedOccupancyInterval)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.wfm.FTERequiredVsAchievedOccupancyInterval other = (com.tcn.cloud.api.api.v1alpha1.wfm.FTERequiredVsAchievedOccupancyInterval) obj;

    if (hasStartDatetime() != other.hasStartDatetime()) return false;
    if (hasStartDatetime()) {
      if (!getStartDatetime()
          .equals(other.getStartDatetime())) return false;
    }
    if (java.lang.Float.floatToIntBits(getRequiredFteOccupancy())
        != java.lang.Float.floatToIntBits(
            other.getRequiredFteOccupancy())) return false;
    if (java.lang.Float.floatToIntBits(getAchievedFteOccupancy())
        != java.lang.Float.floatToIntBits(
            other.getAchievedFteOccupancy())) return false;
    if (java.lang.Float.floatToIntBits(getRequiredFte())
        != java.lang.Float.floatToIntBits(
            other.getRequiredFte())) return false;
    if (java.lang.Float.floatToIntBits(getAchievedFte())
        != java.lang.Float.floatToIntBits(
            other.getAchievedFte())) return false;
    if (java.lang.Float.floatToIntBits(getProductiveFte())
        != java.lang.Float.floatToIntBits(
            other.getProductiveFte())) return false;
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
    hash = (37 * hash) + REQUIRED_FTE_OCCUPANCY_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getRequiredFteOccupancy());
    hash = (37 * hash) + ACHIEVED_FTE_OCCUPANCY_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getAchievedFteOccupancy());
    hash = (37 * hash) + REQUIRED_FTE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getRequiredFte());
    hash = (37 * hash) + ACHIEVED_FTE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getAchievedFte());
    hash = (37 * hash) + PRODUCTIVE_FTE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getProductiveFte());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.FTERequiredVsAchievedOccupancyInterval parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.FTERequiredVsAchievedOccupancyInterval parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.FTERequiredVsAchievedOccupancyInterval parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.FTERequiredVsAchievedOccupancyInterval parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.FTERequiredVsAchievedOccupancyInterval parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.FTERequiredVsAchievedOccupancyInterval parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.FTERequiredVsAchievedOccupancyInterval parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.FTERequiredVsAchievedOccupancyInterval parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.FTERequiredVsAchievedOccupancyInterval parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.FTERequiredVsAchievedOccupancyInterval parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.FTERequiredVsAchievedOccupancyInterval parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.FTERequiredVsAchievedOccupancyInterval parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.wfm.FTERequiredVsAchievedOccupancyInterval prototype) {
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
   * Protobuf type {@code api.v1alpha1.wfm.FTERequiredVsAchievedOccupancyInterval}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.wfm.FTERequiredVsAchievedOccupancyInterval)
      com.tcn.cloud.api.api.v1alpha1.wfm.FTERequiredVsAchievedOccupancyIntervalOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_FTERequiredVsAchievedOccupancyInterval_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_FTERequiredVsAchievedOccupancyInterval_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.wfm.FTERequiredVsAchievedOccupancyInterval.class, com.tcn.cloud.api.api.v1alpha1.wfm.FTERequiredVsAchievedOccupancyInterval.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.wfm.FTERequiredVsAchievedOccupancyInterval.newBuilder()
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
      requiredFteOccupancy_ = 0F;
      achievedFteOccupancy_ = 0F;
      requiredFte_ = 0F;
      achievedFte_ = 0F;
      productiveFte_ = 0F;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_FTERequiredVsAchievedOccupancyInterval_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.FTERequiredVsAchievedOccupancyInterval getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.FTERequiredVsAchievedOccupancyInterval.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.FTERequiredVsAchievedOccupancyInterval build() {
      com.tcn.cloud.api.api.v1alpha1.wfm.FTERequiredVsAchievedOccupancyInterval result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.FTERequiredVsAchievedOccupancyInterval buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.wfm.FTERequiredVsAchievedOccupancyInterval result = new com.tcn.cloud.api.api.v1alpha1.wfm.FTERequiredVsAchievedOccupancyInterval(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.wfm.FTERequiredVsAchievedOccupancyInterval result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.startDatetime_ = startDatetimeBuilder_ == null
            ? startDatetime_
            : startDatetimeBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.requiredFteOccupancy_ = requiredFteOccupancy_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.achievedFteOccupancy_ = achievedFteOccupancy_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.requiredFte_ = requiredFte_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.achievedFte_ = achievedFte_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.productiveFte_ = productiveFte_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.wfm.FTERequiredVsAchievedOccupancyInterval) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.wfm.FTERequiredVsAchievedOccupancyInterval)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.wfm.FTERequiredVsAchievedOccupancyInterval other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.wfm.FTERequiredVsAchievedOccupancyInterval.getDefaultInstance()) return this;
      if (other.hasStartDatetime()) {
        mergeStartDatetime(other.getStartDatetime());
      }
      if (other.getRequiredFteOccupancy() != 0F) {
        setRequiredFteOccupancy(other.getRequiredFteOccupancy());
      }
      if (other.getAchievedFteOccupancy() != 0F) {
        setAchievedFteOccupancy(other.getAchievedFteOccupancy());
      }
      if (other.getRequiredFte() != 0F) {
        setRequiredFte(other.getRequiredFte());
      }
      if (other.getAchievedFte() != 0F) {
        setAchievedFte(other.getAchievedFte());
      }
      if (other.getProductiveFte() != 0F) {
        setProductiveFte(other.getProductiveFte());
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
              requiredFteOccupancy_ = input.readFloat();
              bitField0_ |= 0x00000002;
              break;
            } // case 21
            case 29: {
              achievedFteOccupancy_ = input.readFloat();
              bitField0_ |= 0x00000004;
              break;
            } // case 29
            case 37: {
              requiredFte_ = input.readFloat();
              bitField0_ |= 0x00000008;
              break;
            } // case 37
            case 45: {
              achievedFte_ = input.readFloat();
              bitField0_ |= 0x00000010;
              break;
            } // case 45
            case 53: {
              productiveFte_ = input.readFloat();
              bitField0_ |= 0x00000020;
              break;
            } // case 53
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
     * <code>.google.protobuf.Timestamp start_datetime = 1 [json_name = "startDatetime"];</code>
     * @return Whether the startDatetime field is set.
     */
    public boolean hasStartDatetime() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
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
     * <code>.google.protobuf.Timestamp start_datetime = 1 [json_name = "startDatetime"];</code>
     */
    public com.google.protobuf.Timestamp.Builder getStartDatetimeBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getStartDatetimeFieldBuilder().getBuilder();
    }
    /**
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

    private float requiredFteOccupancy_ ;
    /**
     * <code>float required_fte_occupancy = 2 [json_name = "requiredFteOccupancy", deprecated = true];</code>
     * @deprecated api.v1alpha1.wfm.FTERequiredVsAchievedOccupancyInterval.required_fte_occupancy is deprecated.
     *     See api/v1alpha1/wfm/wfm.proto;l=5911
     * @return The requiredFteOccupancy.
     */
    @java.lang.Override
    @java.lang.Deprecated public float getRequiredFteOccupancy() {
      return requiredFteOccupancy_;
    }
    /**
     * <code>float required_fte_occupancy = 2 [json_name = "requiredFteOccupancy", deprecated = true];</code>
     * @deprecated api.v1alpha1.wfm.FTERequiredVsAchievedOccupancyInterval.required_fte_occupancy is deprecated.
     *     See api/v1alpha1/wfm/wfm.proto;l=5911
     * @param value The requiredFteOccupancy to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder setRequiredFteOccupancy(float value) {

      requiredFteOccupancy_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>float required_fte_occupancy = 2 [json_name = "requiredFteOccupancy", deprecated = true];</code>
     * @deprecated api.v1alpha1.wfm.FTERequiredVsAchievedOccupancyInterval.required_fte_occupancy is deprecated.
     *     See api/v1alpha1/wfm/wfm.proto;l=5911
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder clearRequiredFteOccupancy() {
      bitField0_ = (bitField0_ & ~0x00000002);
      requiredFteOccupancy_ = 0F;
      onChanged();
      return this;
    }

    private float achievedFteOccupancy_ ;
    /**
     * <code>float achieved_fte_occupancy = 3 [json_name = "achievedFteOccupancy", deprecated = true];</code>
     * @deprecated api.v1alpha1.wfm.FTERequiredVsAchievedOccupancyInterval.achieved_fte_occupancy is deprecated.
     *     See api/v1alpha1/wfm/wfm.proto;l=5912
     * @return The achievedFteOccupancy.
     */
    @java.lang.Override
    @java.lang.Deprecated public float getAchievedFteOccupancy() {
      return achievedFteOccupancy_;
    }
    /**
     * <code>float achieved_fte_occupancy = 3 [json_name = "achievedFteOccupancy", deprecated = true];</code>
     * @deprecated api.v1alpha1.wfm.FTERequiredVsAchievedOccupancyInterval.achieved_fte_occupancy is deprecated.
     *     See api/v1alpha1/wfm/wfm.proto;l=5912
     * @param value The achievedFteOccupancy to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder setAchievedFteOccupancy(float value) {

      achievedFteOccupancy_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>float achieved_fte_occupancy = 3 [json_name = "achievedFteOccupancy", deprecated = true];</code>
     * @deprecated api.v1alpha1.wfm.FTERequiredVsAchievedOccupancyInterval.achieved_fte_occupancy is deprecated.
     *     See api/v1alpha1/wfm/wfm.proto;l=5912
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder clearAchievedFteOccupancy() {
      bitField0_ = (bitField0_ & ~0x00000004);
      achievedFteOccupancy_ = 0F;
      onChanged();
      return this;
    }

    private float requiredFte_ ;
    /**
     * <pre>
     * Number of required FTE in the interval.
     * </pre>
     *
     * <code>float required_fte = 4 [json_name = "requiredFte"];</code>
     * @return The requiredFte.
     */
    @java.lang.Override
    public float getRequiredFte() {
      return requiredFte_;
    }
    /**
     * <pre>
     * Number of required FTE in the interval.
     * </pre>
     *
     * <code>float required_fte = 4 [json_name = "requiredFte"];</code>
     * @param value The requiredFte to set.
     * @return This builder for chaining.
     */
    public Builder setRequiredFte(float value) {

      requiredFte_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Number of required FTE in the interval.
     * </pre>
     *
     * <code>float required_fte = 4 [json_name = "requiredFte"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRequiredFte() {
      bitField0_ = (bitField0_ & ~0x00000008);
      requiredFte_ = 0F;
      onChanged();
      return this;
    }

    private float achievedFte_ ;
    /**
     * <pre>
     * Number of achieved FTE's in the interval.
     * </pre>
     *
     * <code>float achieved_fte = 5 [json_name = "achievedFte"];</code>
     * @return The achievedFte.
     */
    @java.lang.Override
    public float getAchievedFte() {
      return achievedFte_;
    }
    /**
     * <pre>
     * Number of achieved FTE's in the interval.
     * </pre>
     *
     * <code>float achieved_fte = 5 [json_name = "achievedFte"];</code>
     * @param value The achievedFte to set.
     * @return This builder for chaining.
     */
    public Builder setAchievedFte(float value) {

      achievedFte_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Number of achieved FTE's in the interval.
     * </pre>
     *
     * <code>float achieved_fte = 5 [json_name = "achievedFte"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAchievedFte() {
      bitField0_ = (bitField0_ & ~0x00000010);
      achievedFte_ = 0F;
      onChanged();
      return this;
    }

    private float productiveFte_ ;
    /**
     * <pre>
     * Count of FTE scheduled to be on the phone / productive for a specific interval / duration of time.
     * </pre>
     *
     * <code>float productive_fte = 6 [json_name = "productiveFte"];</code>
     * @return The productiveFte.
     */
    @java.lang.Override
    public float getProductiveFte() {
      return productiveFte_;
    }
    /**
     * <pre>
     * Count of FTE scheduled to be on the phone / productive for a specific interval / duration of time.
     * </pre>
     *
     * <code>float productive_fte = 6 [json_name = "productiveFte"];</code>
     * @param value The productiveFte to set.
     * @return This builder for chaining.
     */
    public Builder setProductiveFte(float value) {

      productiveFte_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Count of FTE scheduled to be on the phone / productive for a specific interval / duration of time.
     * </pre>
     *
     * <code>float productive_fte = 6 [json_name = "productiveFte"];</code>
     * @return This builder for chaining.
     */
    public Builder clearProductiveFte() {
      bitField0_ = (bitField0_ & ~0x00000020);
      productiveFte_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.wfm.FTERequiredVsAchievedOccupancyInterval)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.wfm.FTERequiredVsAchievedOccupancyInterval)
  private static final com.tcn.cloud.api.api.v1alpha1.wfm.FTERequiredVsAchievedOccupancyInterval DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.wfm.FTERequiredVsAchievedOccupancyInterval();
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.FTERequiredVsAchievedOccupancyInterval getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FTERequiredVsAchievedOccupancyInterval>
      PARSER = new com.google.protobuf.AbstractParser<FTERequiredVsAchievedOccupancyInterval>() {
    @java.lang.Override
    public FTERequiredVsAchievedOccupancyInterval parsePartialFrom(
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

  public static com.google.protobuf.Parser<FTERequiredVsAchievedOccupancyInterval> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FTERequiredVsAchievedOccupancyInterval> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.FTERequiredVsAchievedOccupancyInterval getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

