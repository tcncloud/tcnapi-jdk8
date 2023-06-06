// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

/**
 * <pre>
 * DOW Placement
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.wfm.DOWPlacement}
 */
public final class DOWPlacement extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.wfm.DOWPlacement)
    DOWPlacementOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DOWPlacement.newBuilder() to construct.
  private DOWPlacement(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DOWPlacement() {
    placementType_ = 0;
    dayOfWeek_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DOWPlacement();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_DOWPlacement_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_DOWPlacement_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.wfm.DOWPlacement.class, com.tcn.cloud.api.api.v1alpha1.wfm.DOWPlacement.Builder.class);
  }

  public static final int START_MINUTE_FIELD_NUMBER = 1;
  private int startMinute_ = 0;
  /**
   * <pre>
   * Minute in the day for the placement to start.
   * </pre>
   *
   * <code>int32 start_minute = 1 [json_name = "startMinute"];</code>
   * @return The startMinute.
   */
  @java.lang.Override
  public int getStartMinute() {
    return startMinute_;
  }

  public static final int END_MINUTE_FIELD_NUMBER = 2;
  private int endMinute_ = 0;
  /**
   * <pre>
   * Minute in the day for the placement to end.
   * </pre>
   *
   * <code>int32 end_minute = 2 [json_name = "endMinute"];</code>
   * @return The endMinute.
   */
  @java.lang.Override
  public int getEndMinute() {
    return endMinute_;
  }

  public static final int PLACEMENT_TYPE_FIELD_NUMBER = 3;
  private int placementType_ = 0;
  /**
   * <pre>
   * The type of placement.
   * </pre>
   *
   * <code>.api.commons.DOWPlacementType placement_type = 3 [json_name = "placementType"];</code>
   * @return The enum numeric value on the wire for placementType.
   */
  @java.lang.Override public int getPlacementTypeValue() {
    return placementType_;
  }
  /**
   * <pre>
   * The type of placement.
   * </pre>
   *
   * <code>.api.commons.DOWPlacementType placement_type = 3 [json_name = "placementType"];</code>
   * @return The placementType.
   */
  @java.lang.Override public com.tcn.cloud.api.api.commons.DOWPlacementType getPlacementType() {
    com.tcn.cloud.api.api.commons.DOWPlacementType result = com.tcn.cloud.api.api.commons.DOWPlacementType.forNumber(placementType_);
    return result == null ? com.tcn.cloud.api.api.commons.DOWPlacementType.UNRECOGNIZED : result;
  }

  public static final int DAY_OF_WEEK_FIELD_NUMBER = 4;
  private int dayOfWeek_ = 0;
  /**
   * <pre>
   * The day of the week that the placement belongs to.
   * Each week always starts on Sunday.
   * </pre>
   *
   * <code>.api.commons.DayOfWeek day_of_week = 4 [json_name = "dayOfWeek"];</code>
   * @return The enum numeric value on the wire for dayOfWeek.
   */
  @java.lang.Override public int getDayOfWeekValue() {
    return dayOfWeek_;
  }
  /**
   * <pre>
   * The day of the week that the placement belongs to.
   * Each week always starts on Sunday.
   * </pre>
   *
   * <code>.api.commons.DayOfWeek day_of_week = 4 [json_name = "dayOfWeek"];</code>
   * @return The dayOfWeek.
   */
  @java.lang.Override public com.tcn.cloud.api.api.commons.DayOfWeek getDayOfWeek() {
    com.tcn.cloud.api.api.commons.DayOfWeek result = com.tcn.cloud.api.api.commons.DayOfWeek.forNumber(dayOfWeek_);
    return result == null ? com.tcn.cloud.api.api.commons.DayOfWeek.UNRECOGNIZED : result;
  }

  public static final int WEEK_NUMBER_FIELD_NUMBER = 5;
  private int weekNumber_ = 0;
  /**
   * <pre>
   * The week number, specifying which week of the template the placement belongs to.
   * The first week should be set to 0.
   * </pre>
   *
   * <code>int32 week_number = 5 [json_name = "weekNumber"];</code>
   * @return The weekNumber.
   */
  @java.lang.Override
  public int getWeekNumber() {
    return weekNumber_;
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
    if (startMinute_ != 0) {
      output.writeInt32(1, startMinute_);
    }
    if (endMinute_ != 0) {
      output.writeInt32(2, endMinute_);
    }
    if (placementType_ != com.tcn.cloud.api.api.commons.DOWPlacementType.MUST_NOT.getNumber()) {
      output.writeEnum(3, placementType_);
    }
    if (dayOfWeek_ != com.tcn.cloud.api.api.commons.DayOfWeek.MON.getNumber()) {
      output.writeEnum(4, dayOfWeek_);
    }
    if (weekNumber_ != 0) {
      output.writeInt32(5, weekNumber_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (startMinute_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, startMinute_);
    }
    if (endMinute_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, endMinute_);
    }
    if (placementType_ != com.tcn.cloud.api.api.commons.DOWPlacementType.MUST_NOT.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, placementType_);
    }
    if (dayOfWeek_ != com.tcn.cloud.api.api.commons.DayOfWeek.MON.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, dayOfWeek_);
    }
    if (weekNumber_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, weekNumber_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.wfm.DOWPlacement)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.wfm.DOWPlacement other = (com.tcn.cloud.api.api.v1alpha1.wfm.DOWPlacement) obj;

    if (getStartMinute()
        != other.getStartMinute()) return false;
    if (getEndMinute()
        != other.getEndMinute()) return false;
    if (placementType_ != other.placementType_) return false;
    if (dayOfWeek_ != other.dayOfWeek_) return false;
    if (getWeekNumber()
        != other.getWeekNumber()) return false;
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
    hash = (37 * hash) + START_MINUTE_FIELD_NUMBER;
    hash = (53 * hash) + getStartMinute();
    hash = (37 * hash) + END_MINUTE_FIELD_NUMBER;
    hash = (53 * hash) + getEndMinute();
    hash = (37 * hash) + PLACEMENT_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + placementType_;
    hash = (37 * hash) + DAY_OF_WEEK_FIELD_NUMBER;
    hash = (53 * hash) + dayOfWeek_;
    hash = (37 * hash) + WEEK_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getWeekNumber();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.DOWPlacement parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.DOWPlacement parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.DOWPlacement parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.DOWPlacement parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.DOWPlacement parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.DOWPlacement parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.DOWPlacement parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.DOWPlacement parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.DOWPlacement parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.DOWPlacement parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.DOWPlacement parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.DOWPlacement parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.wfm.DOWPlacement prototype) {
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
   * DOW Placement
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.wfm.DOWPlacement}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.wfm.DOWPlacement)
      com.tcn.cloud.api.api.v1alpha1.wfm.DOWPlacementOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_DOWPlacement_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_DOWPlacement_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.wfm.DOWPlacement.class, com.tcn.cloud.api.api.v1alpha1.wfm.DOWPlacement.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.wfm.DOWPlacement.newBuilder()
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
      startMinute_ = 0;
      endMinute_ = 0;
      placementType_ = 0;
      dayOfWeek_ = 0;
      weekNumber_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_DOWPlacement_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.DOWPlacement getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.DOWPlacement.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.DOWPlacement build() {
      com.tcn.cloud.api.api.v1alpha1.wfm.DOWPlacement result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.DOWPlacement buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.wfm.DOWPlacement result = new com.tcn.cloud.api.api.v1alpha1.wfm.DOWPlacement(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.wfm.DOWPlacement result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.startMinute_ = startMinute_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.endMinute_ = endMinute_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.placementType_ = placementType_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.dayOfWeek_ = dayOfWeek_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.weekNumber_ = weekNumber_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.wfm.DOWPlacement) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.wfm.DOWPlacement)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.wfm.DOWPlacement other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.wfm.DOWPlacement.getDefaultInstance()) return this;
      if (other.getStartMinute() != 0) {
        setStartMinute(other.getStartMinute());
      }
      if (other.getEndMinute() != 0) {
        setEndMinute(other.getEndMinute());
      }
      if (other.placementType_ != 0) {
        setPlacementTypeValue(other.getPlacementTypeValue());
      }
      if (other.dayOfWeek_ != 0) {
        setDayOfWeekValue(other.getDayOfWeekValue());
      }
      if (other.getWeekNumber() != 0) {
        setWeekNumber(other.getWeekNumber());
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
              startMinute_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              endMinute_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              placementType_ = input.readEnum();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              dayOfWeek_ = input.readEnum();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 40: {
              weekNumber_ = input.readInt32();
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

    private int startMinute_ ;
    /**
     * <pre>
     * Minute in the day for the placement to start.
     * </pre>
     *
     * <code>int32 start_minute = 1 [json_name = "startMinute"];</code>
     * @return The startMinute.
     */
    @java.lang.Override
    public int getStartMinute() {
      return startMinute_;
    }
    /**
     * <pre>
     * Minute in the day for the placement to start.
     * </pre>
     *
     * <code>int32 start_minute = 1 [json_name = "startMinute"];</code>
     * @param value The startMinute to set.
     * @return This builder for chaining.
     */
    public Builder setStartMinute(int value) {

      startMinute_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Minute in the day for the placement to start.
     * </pre>
     *
     * <code>int32 start_minute = 1 [json_name = "startMinute"];</code>
     * @return This builder for chaining.
     */
    public Builder clearStartMinute() {
      bitField0_ = (bitField0_ & ~0x00000001);
      startMinute_ = 0;
      onChanged();
      return this;
    }

    private int endMinute_ ;
    /**
     * <pre>
     * Minute in the day for the placement to end.
     * </pre>
     *
     * <code>int32 end_minute = 2 [json_name = "endMinute"];</code>
     * @return The endMinute.
     */
    @java.lang.Override
    public int getEndMinute() {
      return endMinute_;
    }
    /**
     * <pre>
     * Minute in the day for the placement to end.
     * </pre>
     *
     * <code>int32 end_minute = 2 [json_name = "endMinute"];</code>
     * @param value The endMinute to set.
     * @return This builder for chaining.
     */
    public Builder setEndMinute(int value) {

      endMinute_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Minute in the day for the placement to end.
     * </pre>
     *
     * <code>int32 end_minute = 2 [json_name = "endMinute"];</code>
     * @return This builder for chaining.
     */
    public Builder clearEndMinute() {
      bitField0_ = (bitField0_ & ~0x00000002);
      endMinute_ = 0;
      onChanged();
      return this;
    }

    private int placementType_ = 0;
    /**
     * <pre>
     * The type of placement.
     * </pre>
     *
     * <code>.api.commons.DOWPlacementType placement_type = 3 [json_name = "placementType"];</code>
     * @return The enum numeric value on the wire for placementType.
     */
    @java.lang.Override public int getPlacementTypeValue() {
      return placementType_;
    }
    /**
     * <pre>
     * The type of placement.
     * </pre>
     *
     * <code>.api.commons.DOWPlacementType placement_type = 3 [json_name = "placementType"];</code>
     * @param value The enum numeric value on the wire for placementType to set.
     * @return This builder for chaining.
     */
    public Builder setPlacementTypeValue(int value) {
      placementType_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The type of placement.
     * </pre>
     *
     * <code>.api.commons.DOWPlacementType placement_type = 3 [json_name = "placementType"];</code>
     * @return The placementType.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.DOWPlacementType getPlacementType() {
      com.tcn.cloud.api.api.commons.DOWPlacementType result = com.tcn.cloud.api.api.commons.DOWPlacementType.forNumber(placementType_);
      return result == null ? com.tcn.cloud.api.api.commons.DOWPlacementType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The type of placement.
     * </pre>
     *
     * <code>.api.commons.DOWPlacementType placement_type = 3 [json_name = "placementType"];</code>
     * @param value The placementType to set.
     * @return This builder for chaining.
     */
    public Builder setPlacementType(com.tcn.cloud.api.api.commons.DOWPlacementType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      placementType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The type of placement.
     * </pre>
     *
     * <code>.api.commons.DOWPlacementType placement_type = 3 [json_name = "placementType"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPlacementType() {
      bitField0_ = (bitField0_ & ~0x00000004);
      placementType_ = 0;
      onChanged();
      return this;
    }

    private int dayOfWeek_ = 0;
    /**
     * <pre>
     * The day of the week that the placement belongs to.
     * Each week always starts on Sunday.
     * </pre>
     *
     * <code>.api.commons.DayOfWeek day_of_week = 4 [json_name = "dayOfWeek"];</code>
     * @return The enum numeric value on the wire for dayOfWeek.
     */
    @java.lang.Override public int getDayOfWeekValue() {
      return dayOfWeek_;
    }
    /**
     * <pre>
     * The day of the week that the placement belongs to.
     * Each week always starts on Sunday.
     * </pre>
     *
     * <code>.api.commons.DayOfWeek day_of_week = 4 [json_name = "dayOfWeek"];</code>
     * @param value The enum numeric value on the wire for dayOfWeek to set.
     * @return This builder for chaining.
     */
    public Builder setDayOfWeekValue(int value) {
      dayOfWeek_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The day of the week that the placement belongs to.
     * Each week always starts on Sunday.
     * </pre>
     *
     * <code>.api.commons.DayOfWeek day_of_week = 4 [json_name = "dayOfWeek"];</code>
     * @return The dayOfWeek.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.DayOfWeek getDayOfWeek() {
      com.tcn.cloud.api.api.commons.DayOfWeek result = com.tcn.cloud.api.api.commons.DayOfWeek.forNumber(dayOfWeek_);
      return result == null ? com.tcn.cloud.api.api.commons.DayOfWeek.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The day of the week that the placement belongs to.
     * Each week always starts on Sunday.
     * </pre>
     *
     * <code>.api.commons.DayOfWeek day_of_week = 4 [json_name = "dayOfWeek"];</code>
     * @param value The dayOfWeek to set.
     * @return This builder for chaining.
     */
    public Builder setDayOfWeek(com.tcn.cloud.api.api.commons.DayOfWeek value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000008;
      dayOfWeek_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The day of the week that the placement belongs to.
     * Each week always starts on Sunday.
     * </pre>
     *
     * <code>.api.commons.DayOfWeek day_of_week = 4 [json_name = "dayOfWeek"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDayOfWeek() {
      bitField0_ = (bitField0_ & ~0x00000008);
      dayOfWeek_ = 0;
      onChanged();
      return this;
    }

    private int weekNumber_ ;
    /**
     * <pre>
     * The week number, specifying which week of the template the placement belongs to.
     * The first week should be set to 0.
     * </pre>
     *
     * <code>int32 week_number = 5 [json_name = "weekNumber"];</code>
     * @return The weekNumber.
     */
    @java.lang.Override
    public int getWeekNumber() {
      return weekNumber_;
    }
    /**
     * <pre>
     * The week number, specifying which week of the template the placement belongs to.
     * The first week should be set to 0.
     * </pre>
     *
     * <code>int32 week_number = 5 [json_name = "weekNumber"];</code>
     * @param value The weekNumber to set.
     * @return This builder for chaining.
     */
    public Builder setWeekNumber(int value) {

      weekNumber_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The week number, specifying which week of the template the placement belongs to.
     * The first week should be set to 0.
     * </pre>
     *
     * <code>int32 week_number = 5 [json_name = "weekNumber"];</code>
     * @return This builder for chaining.
     */
    public Builder clearWeekNumber() {
      bitField0_ = (bitField0_ & ~0x00000010);
      weekNumber_ = 0;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.wfm.DOWPlacement)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.wfm.DOWPlacement)
  private static final com.tcn.cloud.api.api.v1alpha1.wfm.DOWPlacement DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.wfm.DOWPlacement();
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.DOWPlacement getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DOWPlacement>
      PARSER = new com.google.protobuf.AbstractParser<DOWPlacement>() {
    @java.lang.Override
    public DOWPlacement parsePartialFrom(
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

  public static com.google.protobuf.Parser<DOWPlacement> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DOWPlacement> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.DOWPlacement getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

