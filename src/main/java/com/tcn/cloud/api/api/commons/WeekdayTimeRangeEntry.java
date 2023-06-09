// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/omnichannel.proto

package com.tcn.cloud.api.api.commons;

/**
 * <pre>
 * WeekdayTimeRangeEntry - an entry defining the same time range over a span of one or more days
 * </pre>
 *
 * Protobuf type {@code api.commons.WeekdayTimeRangeEntry}
 */
public final class WeekdayTimeRangeEntry extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.commons.WeekdayTimeRangeEntry)
    WeekdayTimeRangeEntryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WeekdayTimeRangeEntry.newBuilder() to construct.
  private WeekdayTimeRangeEntry(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WeekdayTimeRangeEntry() {
    startDay_ = 0;
    endDay_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new WeekdayTimeRangeEntry();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.commons.OmnichannelProto.internal_static_api_commons_WeekdayTimeRangeEntry_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.commons.OmnichannelProto.internal_static_api_commons_WeekdayTimeRangeEntry_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.commons.WeekdayTimeRangeEntry.class, com.tcn.cloud.api.api.commons.WeekdayTimeRangeEntry.Builder.class);
  }

  public static final int START_DAY_FIELD_NUMBER = 1;
  private int startDay_ = 0;
  /**
   * <pre>
   * the day the span starts
   * </pre>
   *
   * <code>.api.commons.Weekday.Enum start_day = 1 [json_name = "startDay"];</code>
   * @return The enum numeric value on the wire for startDay.
   */
  @java.lang.Override public int getStartDayValue() {
    return startDay_;
  }
  /**
   * <pre>
   * the day the span starts
   * </pre>
   *
   * <code>.api.commons.Weekday.Enum start_day = 1 [json_name = "startDay"];</code>
   * @return The startDay.
   */
  @java.lang.Override public com.tcn.cloud.api.api.commons.Weekday.Enum getStartDay() {
    com.tcn.cloud.api.api.commons.Weekday.Enum result = com.tcn.cloud.api.api.commons.Weekday.Enum.forNumber(startDay_);
    return result == null ? com.tcn.cloud.api.api.commons.Weekday.Enum.UNRECOGNIZED : result;
  }

  public static final int START_HOUR_FIELD_NUMBER = 2;
  private long startHour_ = 0L;
  /**
   * <pre>
   * the hour the range starts
   * </pre>
   *
   * <code>int64 start_hour = 2 [json_name = "startHour"];</code>
   * @return The startHour.
   */
  @java.lang.Override
  public long getStartHour() {
    return startHour_;
  }

  public static final int START_MINUTE_FIELD_NUMBER = 3;
  private long startMinute_ = 0L;
  /**
   * <pre>
   * the minute the range starts
   * </pre>
   *
   * <code>int64 start_minute = 3 [json_name = "startMinute"];</code>
   * @return The startMinute.
   */
  @java.lang.Override
  public long getStartMinute() {
    return startMinute_;
  }

  public static final int END_DAY_FIELD_NUMBER = 4;
  private int endDay_ = 0;
  /**
   * <pre>
   * the day the span ends
   * </pre>
   *
   * <code>.api.commons.Weekday.Enum end_day = 4 [json_name = "endDay"];</code>
   * @return The enum numeric value on the wire for endDay.
   */
  @java.lang.Override public int getEndDayValue() {
    return endDay_;
  }
  /**
   * <pre>
   * the day the span ends
   * </pre>
   *
   * <code>.api.commons.Weekday.Enum end_day = 4 [json_name = "endDay"];</code>
   * @return The endDay.
   */
  @java.lang.Override public com.tcn.cloud.api.api.commons.Weekday.Enum getEndDay() {
    com.tcn.cloud.api.api.commons.Weekday.Enum result = com.tcn.cloud.api.api.commons.Weekday.Enum.forNumber(endDay_);
    return result == null ? com.tcn.cloud.api.api.commons.Weekday.Enum.UNRECOGNIZED : result;
  }

  public static final int END_HOUR_FIELD_NUMBER = 5;
  private long endHour_ = 0L;
  /**
   * <pre>
   * the hour the range ends
   * </pre>
   *
   * <code>int64 end_hour = 5 [json_name = "endHour"];</code>
   * @return The endHour.
   */
  @java.lang.Override
  public long getEndHour() {
    return endHour_;
  }

  public static final int END_MINUTE_FIELD_NUMBER = 6;
  private long endMinute_ = 0L;
  /**
   * <pre>
   * the minute the range ends
   * </pre>
   *
   * <code>int64 end_minute = 6 [json_name = "endMinute"];</code>
   * @return The endMinute.
   */
  @java.lang.Override
  public long getEndMinute() {
    return endMinute_;
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
    if (startDay_ != com.tcn.cloud.api.api.commons.Weekday.Enum.SUNDAY.getNumber()) {
      output.writeEnum(1, startDay_);
    }
    if (startHour_ != 0L) {
      output.writeInt64(2, startHour_);
    }
    if (startMinute_ != 0L) {
      output.writeInt64(3, startMinute_);
    }
    if (endDay_ != com.tcn.cloud.api.api.commons.Weekday.Enum.SUNDAY.getNumber()) {
      output.writeEnum(4, endDay_);
    }
    if (endHour_ != 0L) {
      output.writeInt64(5, endHour_);
    }
    if (endMinute_ != 0L) {
      output.writeInt64(6, endMinute_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (startDay_ != com.tcn.cloud.api.api.commons.Weekday.Enum.SUNDAY.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, startDay_);
    }
    if (startHour_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, startHour_);
    }
    if (startMinute_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, startMinute_);
    }
    if (endDay_ != com.tcn.cloud.api.api.commons.Weekday.Enum.SUNDAY.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, endDay_);
    }
    if (endHour_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, endHour_);
    }
    if (endMinute_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(6, endMinute_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.commons.WeekdayTimeRangeEntry)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.commons.WeekdayTimeRangeEntry other = (com.tcn.cloud.api.api.commons.WeekdayTimeRangeEntry) obj;

    if (startDay_ != other.startDay_) return false;
    if (getStartHour()
        != other.getStartHour()) return false;
    if (getStartMinute()
        != other.getStartMinute()) return false;
    if (endDay_ != other.endDay_) return false;
    if (getEndHour()
        != other.getEndHour()) return false;
    if (getEndMinute()
        != other.getEndMinute()) return false;
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
    hash = (37 * hash) + START_DAY_FIELD_NUMBER;
    hash = (53 * hash) + startDay_;
    hash = (37 * hash) + START_HOUR_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getStartHour());
    hash = (37 * hash) + START_MINUTE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getStartMinute());
    hash = (37 * hash) + END_DAY_FIELD_NUMBER;
    hash = (53 * hash) + endDay_;
    hash = (37 * hash) + END_HOUR_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getEndHour());
    hash = (37 * hash) + END_MINUTE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getEndMinute());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.commons.WeekdayTimeRangeEntry parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.WeekdayTimeRangeEntry parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.WeekdayTimeRangeEntry parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.WeekdayTimeRangeEntry parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.WeekdayTimeRangeEntry parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.WeekdayTimeRangeEntry parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.WeekdayTimeRangeEntry parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.WeekdayTimeRangeEntry parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.commons.WeekdayTimeRangeEntry parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.commons.WeekdayTimeRangeEntry parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.WeekdayTimeRangeEntry parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.WeekdayTimeRangeEntry parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.commons.WeekdayTimeRangeEntry prototype) {
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
   * WeekdayTimeRangeEntry - an entry defining the same time range over a span of one or more days
   * </pre>
   *
   * Protobuf type {@code api.commons.WeekdayTimeRangeEntry}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.commons.WeekdayTimeRangeEntry)
      com.tcn.cloud.api.api.commons.WeekdayTimeRangeEntryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.OmnichannelProto.internal_static_api_commons_WeekdayTimeRangeEntry_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.commons.OmnichannelProto.internal_static_api_commons_WeekdayTimeRangeEntry_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.commons.WeekdayTimeRangeEntry.class, com.tcn.cloud.api.api.commons.WeekdayTimeRangeEntry.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.commons.WeekdayTimeRangeEntry.newBuilder()
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
      startDay_ = 0;
      startHour_ = 0L;
      startMinute_ = 0L;
      endDay_ = 0;
      endHour_ = 0L;
      endMinute_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.commons.OmnichannelProto.internal_static_api_commons_WeekdayTimeRangeEntry_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.WeekdayTimeRangeEntry getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.commons.WeekdayTimeRangeEntry.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.WeekdayTimeRangeEntry build() {
      com.tcn.cloud.api.api.commons.WeekdayTimeRangeEntry result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.WeekdayTimeRangeEntry buildPartial() {
      com.tcn.cloud.api.api.commons.WeekdayTimeRangeEntry result = new com.tcn.cloud.api.api.commons.WeekdayTimeRangeEntry(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.commons.WeekdayTimeRangeEntry result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.startDay_ = startDay_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.startHour_ = startHour_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.startMinute_ = startMinute_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.endDay_ = endDay_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.endHour_ = endHour_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.endMinute_ = endMinute_;
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
      if (other instanceof com.tcn.cloud.api.api.commons.WeekdayTimeRangeEntry) {
        return mergeFrom((com.tcn.cloud.api.api.commons.WeekdayTimeRangeEntry)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.commons.WeekdayTimeRangeEntry other) {
      if (other == com.tcn.cloud.api.api.commons.WeekdayTimeRangeEntry.getDefaultInstance()) return this;
      if (other.startDay_ != 0) {
        setStartDayValue(other.getStartDayValue());
      }
      if (other.getStartHour() != 0L) {
        setStartHour(other.getStartHour());
      }
      if (other.getStartMinute() != 0L) {
        setStartMinute(other.getStartMinute());
      }
      if (other.endDay_ != 0) {
        setEndDayValue(other.getEndDayValue());
      }
      if (other.getEndHour() != 0L) {
        setEndHour(other.getEndHour());
      }
      if (other.getEndMinute() != 0L) {
        setEndMinute(other.getEndMinute());
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
              startDay_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              startHour_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              startMinute_ = input.readInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              endDay_ = input.readEnum();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 40: {
              endHour_ = input.readInt64();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
            case 48: {
              endMinute_ = input.readInt64();
              bitField0_ |= 0x00000020;
              break;
            } // case 48
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

    private int startDay_ = 0;
    /**
     * <pre>
     * the day the span starts
     * </pre>
     *
     * <code>.api.commons.Weekday.Enum start_day = 1 [json_name = "startDay"];</code>
     * @return The enum numeric value on the wire for startDay.
     */
    @java.lang.Override public int getStartDayValue() {
      return startDay_;
    }
    /**
     * <pre>
     * the day the span starts
     * </pre>
     *
     * <code>.api.commons.Weekday.Enum start_day = 1 [json_name = "startDay"];</code>
     * @param value The enum numeric value on the wire for startDay to set.
     * @return This builder for chaining.
     */
    public Builder setStartDayValue(int value) {
      startDay_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the day the span starts
     * </pre>
     *
     * <code>.api.commons.Weekday.Enum start_day = 1 [json_name = "startDay"];</code>
     * @return The startDay.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.Weekday.Enum getStartDay() {
      com.tcn.cloud.api.api.commons.Weekday.Enum result = com.tcn.cloud.api.api.commons.Weekday.Enum.forNumber(startDay_);
      return result == null ? com.tcn.cloud.api.api.commons.Weekday.Enum.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * the day the span starts
     * </pre>
     *
     * <code>.api.commons.Weekday.Enum start_day = 1 [json_name = "startDay"];</code>
     * @param value The startDay to set.
     * @return This builder for chaining.
     */
    public Builder setStartDay(com.tcn.cloud.api.api.commons.Weekday.Enum value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      startDay_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the day the span starts
     * </pre>
     *
     * <code>.api.commons.Weekday.Enum start_day = 1 [json_name = "startDay"];</code>
     * @return This builder for chaining.
     */
    public Builder clearStartDay() {
      bitField0_ = (bitField0_ & ~0x00000001);
      startDay_ = 0;
      onChanged();
      return this;
    }

    private long startHour_ ;
    /**
     * <pre>
     * the hour the range starts
     * </pre>
     *
     * <code>int64 start_hour = 2 [json_name = "startHour"];</code>
     * @return The startHour.
     */
    @java.lang.Override
    public long getStartHour() {
      return startHour_;
    }
    /**
     * <pre>
     * the hour the range starts
     * </pre>
     *
     * <code>int64 start_hour = 2 [json_name = "startHour"];</code>
     * @param value The startHour to set.
     * @return This builder for chaining.
     */
    public Builder setStartHour(long value) {

      startHour_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the hour the range starts
     * </pre>
     *
     * <code>int64 start_hour = 2 [json_name = "startHour"];</code>
     * @return This builder for chaining.
     */
    public Builder clearStartHour() {
      bitField0_ = (bitField0_ & ~0x00000002);
      startHour_ = 0L;
      onChanged();
      return this;
    }

    private long startMinute_ ;
    /**
     * <pre>
     * the minute the range starts
     * </pre>
     *
     * <code>int64 start_minute = 3 [json_name = "startMinute"];</code>
     * @return The startMinute.
     */
    @java.lang.Override
    public long getStartMinute() {
      return startMinute_;
    }
    /**
     * <pre>
     * the minute the range starts
     * </pre>
     *
     * <code>int64 start_minute = 3 [json_name = "startMinute"];</code>
     * @param value The startMinute to set.
     * @return This builder for chaining.
     */
    public Builder setStartMinute(long value) {

      startMinute_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the minute the range starts
     * </pre>
     *
     * <code>int64 start_minute = 3 [json_name = "startMinute"];</code>
     * @return This builder for chaining.
     */
    public Builder clearStartMinute() {
      bitField0_ = (bitField0_ & ~0x00000004);
      startMinute_ = 0L;
      onChanged();
      return this;
    }

    private int endDay_ = 0;
    /**
     * <pre>
     * the day the span ends
     * </pre>
     *
     * <code>.api.commons.Weekday.Enum end_day = 4 [json_name = "endDay"];</code>
     * @return The enum numeric value on the wire for endDay.
     */
    @java.lang.Override public int getEndDayValue() {
      return endDay_;
    }
    /**
     * <pre>
     * the day the span ends
     * </pre>
     *
     * <code>.api.commons.Weekday.Enum end_day = 4 [json_name = "endDay"];</code>
     * @param value The enum numeric value on the wire for endDay to set.
     * @return This builder for chaining.
     */
    public Builder setEndDayValue(int value) {
      endDay_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the day the span ends
     * </pre>
     *
     * <code>.api.commons.Weekday.Enum end_day = 4 [json_name = "endDay"];</code>
     * @return The endDay.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.Weekday.Enum getEndDay() {
      com.tcn.cloud.api.api.commons.Weekday.Enum result = com.tcn.cloud.api.api.commons.Weekday.Enum.forNumber(endDay_);
      return result == null ? com.tcn.cloud.api.api.commons.Weekday.Enum.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * the day the span ends
     * </pre>
     *
     * <code>.api.commons.Weekday.Enum end_day = 4 [json_name = "endDay"];</code>
     * @param value The endDay to set.
     * @return This builder for chaining.
     */
    public Builder setEndDay(com.tcn.cloud.api.api.commons.Weekday.Enum value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000008;
      endDay_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the day the span ends
     * </pre>
     *
     * <code>.api.commons.Weekday.Enum end_day = 4 [json_name = "endDay"];</code>
     * @return This builder for chaining.
     */
    public Builder clearEndDay() {
      bitField0_ = (bitField0_ & ~0x00000008);
      endDay_ = 0;
      onChanged();
      return this;
    }

    private long endHour_ ;
    /**
     * <pre>
     * the hour the range ends
     * </pre>
     *
     * <code>int64 end_hour = 5 [json_name = "endHour"];</code>
     * @return The endHour.
     */
    @java.lang.Override
    public long getEndHour() {
      return endHour_;
    }
    /**
     * <pre>
     * the hour the range ends
     * </pre>
     *
     * <code>int64 end_hour = 5 [json_name = "endHour"];</code>
     * @param value The endHour to set.
     * @return This builder for chaining.
     */
    public Builder setEndHour(long value) {

      endHour_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the hour the range ends
     * </pre>
     *
     * <code>int64 end_hour = 5 [json_name = "endHour"];</code>
     * @return This builder for chaining.
     */
    public Builder clearEndHour() {
      bitField0_ = (bitField0_ & ~0x00000010);
      endHour_ = 0L;
      onChanged();
      return this;
    }

    private long endMinute_ ;
    /**
     * <pre>
     * the minute the range ends
     * </pre>
     *
     * <code>int64 end_minute = 6 [json_name = "endMinute"];</code>
     * @return The endMinute.
     */
    @java.lang.Override
    public long getEndMinute() {
      return endMinute_;
    }
    /**
     * <pre>
     * the minute the range ends
     * </pre>
     *
     * <code>int64 end_minute = 6 [json_name = "endMinute"];</code>
     * @param value The endMinute to set.
     * @return This builder for chaining.
     */
    public Builder setEndMinute(long value) {

      endMinute_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the minute the range ends
     * </pre>
     *
     * <code>int64 end_minute = 6 [json_name = "endMinute"];</code>
     * @return This builder for chaining.
     */
    public Builder clearEndMinute() {
      bitField0_ = (bitField0_ & ~0x00000020);
      endMinute_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:api.commons.WeekdayTimeRangeEntry)
  }

  // @@protoc_insertion_point(class_scope:api.commons.WeekdayTimeRangeEntry)
  private static final com.tcn.cloud.api.api.commons.WeekdayTimeRangeEntry DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.commons.WeekdayTimeRangeEntry();
  }

  public static com.tcn.cloud.api.api.commons.WeekdayTimeRangeEntry getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WeekdayTimeRangeEntry>
      PARSER = new com.google.protobuf.AbstractParser<WeekdayTimeRangeEntry>() {
    @java.lang.Override
    public WeekdayTimeRangeEntry parsePartialFrom(
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

  public static com.google.protobuf.Parser<WeekdayTimeRangeEntry> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WeekdayTimeRangeEntry> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.commons.WeekdayTimeRangeEntry getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

