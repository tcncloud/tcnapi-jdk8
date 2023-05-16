// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/lms.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * <pre>
 * a specific month and day of the year
 * </pre>
 *
 * Protobuf type {@code api.v0alpha.MonthAndDay}
 */
public final class MonthAndDay extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.MonthAndDay)
    MonthAndDayOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MonthAndDay.newBuilder() to construct.
  private MonthAndDay(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MonthAndDay() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MonthAndDay();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_MonthAndDay_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_MonthAndDay_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.MonthAndDay.class, com.tcn.cloud.api.api.v0alpha.MonthAndDay.Builder.class);
  }

  public static final int MONTH_FIELD_NUMBER = 3;
  private int month_ = 0;
  /**
   * <code>int32 month = 3 [json_name = "month"];</code>
   * @return The month.
   */
  @java.lang.Override
  public int getMonth() {
    return month_;
  }

  public static final int WEEK_FIELD_NUMBER = 4;
  private int week_ = 0;
  /**
   * <code>int32 week = 4 [json_name = "week"];</code>
   * @return The week.
   */
  @java.lang.Override
  public int getWeek() {
    return week_;
  }

  public static final int DAY_OF_MONTH_FIELD_NUMBER = 5;
  private int dayOfMonth_ = 0;
  /**
   * <code>int32 day_of_month = 5 [json_name = "dayOfMonth"];</code>
   * @return The dayOfMonth.
   */
  @java.lang.Override
  public int getDayOfMonth() {
    return dayOfMonth_;
  }

  public static final int DAY_OF_WEEK_FIELD_NUMBER = 6;
  private int dayOfWeek_ = 0;
  /**
   * <code>int32 day_of_week = 6 [json_name = "dayOfWeek"];</code>
   * @return The dayOfWeek.
   */
  @java.lang.Override
  public int getDayOfWeek() {
    return dayOfWeek_;
  }

  public static final int DAY_OF_YEAR_FIELD_NUMBER = 7;
  private int dayOfYear_ = 0;
  /**
   * <code>int32 day_of_year = 7 [json_name = "dayOfYear"];</code>
   * @return The dayOfYear.
   */
  @java.lang.Override
  public int getDayOfYear() {
    return dayOfYear_;
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
    if (month_ != 0) {
      output.writeInt32(3, month_);
    }
    if (week_ != 0) {
      output.writeInt32(4, week_);
    }
    if (dayOfMonth_ != 0) {
      output.writeInt32(5, dayOfMonth_);
    }
    if (dayOfWeek_ != 0) {
      output.writeInt32(6, dayOfWeek_);
    }
    if (dayOfYear_ != 0) {
      output.writeInt32(7, dayOfYear_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (month_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, month_);
    }
    if (week_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, week_);
    }
    if (dayOfMonth_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, dayOfMonth_);
    }
    if (dayOfWeek_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, dayOfWeek_);
    }
    if (dayOfYear_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(7, dayOfYear_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.MonthAndDay)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.MonthAndDay other = (com.tcn.cloud.api.api.v0alpha.MonthAndDay) obj;

    if (getMonth()
        != other.getMonth()) return false;
    if (getWeek()
        != other.getWeek()) return false;
    if (getDayOfMonth()
        != other.getDayOfMonth()) return false;
    if (getDayOfWeek()
        != other.getDayOfWeek()) return false;
    if (getDayOfYear()
        != other.getDayOfYear()) return false;
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
    hash = (37 * hash) + MONTH_FIELD_NUMBER;
    hash = (53 * hash) + getMonth();
    hash = (37 * hash) + WEEK_FIELD_NUMBER;
    hash = (53 * hash) + getWeek();
    hash = (37 * hash) + DAY_OF_MONTH_FIELD_NUMBER;
    hash = (53 * hash) + getDayOfMonth();
    hash = (37 * hash) + DAY_OF_WEEK_FIELD_NUMBER;
    hash = (53 * hash) + getDayOfWeek();
    hash = (37 * hash) + DAY_OF_YEAR_FIELD_NUMBER;
    hash = (53 * hash) + getDayOfYear();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.MonthAndDay parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.MonthAndDay parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.MonthAndDay parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.MonthAndDay parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.MonthAndDay parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.MonthAndDay parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.MonthAndDay parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.MonthAndDay parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.MonthAndDay parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.MonthAndDay parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.MonthAndDay parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.MonthAndDay parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.MonthAndDay prototype) {
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
   * a specific month and day of the year
   * </pre>
   *
   * Protobuf type {@code api.v0alpha.MonthAndDay}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.MonthAndDay)
      com.tcn.cloud.api.api.v0alpha.MonthAndDayOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_MonthAndDay_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_MonthAndDay_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.MonthAndDay.class, com.tcn.cloud.api.api.v0alpha.MonthAndDay.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.MonthAndDay.newBuilder()
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
      month_ = 0;
      week_ = 0;
      dayOfMonth_ = 0;
      dayOfWeek_ = 0;
      dayOfYear_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_MonthAndDay_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.MonthAndDay getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.MonthAndDay.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.MonthAndDay build() {
      com.tcn.cloud.api.api.v0alpha.MonthAndDay result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.MonthAndDay buildPartial() {
      com.tcn.cloud.api.api.v0alpha.MonthAndDay result = new com.tcn.cloud.api.api.v0alpha.MonthAndDay(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.MonthAndDay result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.month_ = month_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.week_ = week_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.dayOfMonth_ = dayOfMonth_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.dayOfWeek_ = dayOfWeek_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.dayOfYear_ = dayOfYear_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v0alpha.MonthAndDay) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.MonthAndDay)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.MonthAndDay other) {
      if (other == com.tcn.cloud.api.api.v0alpha.MonthAndDay.getDefaultInstance()) return this;
      if (other.getMonth() != 0) {
        setMonth(other.getMonth());
      }
      if (other.getWeek() != 0) {
        setWeek(other.getWeek());
      }
      if (other.getDayOfMonth() != 0) {
        setDayOfMonth(other.getDayOfMonth());
      }
      if (other.getDayOfWeek() != 0) {
        setDayOfWeek(other.getDayOfWeek());
      }
      if (other.getDayOfYear() != 0) {
        setDayOfYear(other.getDayOfYear());
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
            case 24: {
              month_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 24
            case 32: {
              week_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 32
            case 40: {
              dayOfMonth_ = input.readInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 40
            case 48: {
              dayOfWeek_ = input.readInt32();
              bitField0_ |= 0x00000008;
              break;
            } // case 48
            case 56: {
              dayOfYear_ = input.readInt32();
              bitField0_ |= 0x00000010;
              break;
            } // case 56
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

    private int month_ ;
    /**
     * <code>int32 month = 3 [json_name = "month"];</code>
     * @return The month.
     */
    @java.lang.Override
    public int getMonth() {
      return month_;
    }
    /**
     * <code>int32 month = 3 [json_name = "month"];</code>
     * @param value The month to set.
     * @return This builder for chaining.
     */
    public Builder setMonth(int value) {

      month_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int32 month = 3 [json_name = "month"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMonth() {
      bitField0_ = (bitField0_ & ~0x00000001);
      month_ = 0;
      onChanged();
      return this;
    }

    private int week_ ;
    /**
     * <code>int32 week = 4 [json_name = "week"];</code>
     * @return The week.
     */
    @java.lang.Override
    public int getWeek() {
      return week_;
    }
    /**
     * <code>int32 week = 4 [json_name = "week"];</code>
     * @param value The week to set.
     * @return This builder for chaining.
     */
    public Builder setWeek(int value) {

      week_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>int32 week = 4 [json_name = "week"];</code>
     * @return This builder for chaining.
     */
    public Builder clearWeek() {
      bitField0_ = (bitField0_ & ~0x00000002);
      week_ = 0;
      onChanged();
      return this;
    }

    private int dayOfMonth_ ;
    /**
     * <code>int32 day_of_month = 5 [json_name = "dayOfMonth"];</code>
     * @return The dayOfMonth.
     */
    @java.lang.Override
    public int getDayOfMonth() {
      return dayOfMonth_;
    }
    /**
     * <code>int32 day_of_month = 5 [json_name = "dayOfMonth"];</code>
     * @param value The dayOfMonth to set.
     * @return This builder for chaining.
     */
    public Builder setDayOfMonth(int value) {

      dayOfMonth_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>int32 day_of_month = 5 [json_name = "dayOfMonth"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDayOfMonth() {
      bitField0_ = (bitField0_ & ~0x00000004);
      dayOfMonth_ = 0;
      onChanged();
      return this;
    }

    private int dayOfWeek_ ;
    /**
     * <code>int32 day_of_week = 6 [json_name = "dayOfWeek"];</code>
     * @return The dayOfWeek.
     */
    @java.lang.Override
    public int getDayOfWeek() {
      return dayOfWeek_;
    }
    /**
     * <code>int32 day_of_week = 6 [json_name = "dayOfWeek"];</code>
     * @param value The dayOfWeek to set.
     * @return This builder for chaining.
     */
    public Builder setDayOfWeek(int value) {

      dayOfWeek_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>int32 day_of_week = 6 [json_name = "dayOfWeek"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDayOfWeek() {
      bitField0_ = (bitField0_ & ~0x00000008);
      dayOfWeek_ = 0;
      onChanged();
      return this;
    }

    private int dayOfYear_ ;
    /**
     * <code>int32 day_of_year = 7 [json_name = "dayOfYear"];</code>
     * @return The dayOfYear.
     */
    @java.lang.Override
    public int getDayOfYear() {
      return dayOfYear_;
    }
    /**
     * <code>int32 day_of_year = 7 [json_name = "dayOfYear"];</code>
     * @param value The dayOfYear to set.
     * @return This builder for chaining.
     */
    public Builder setDayOfYear(int value) {

      dayOfYear_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>int32 day_of_year = 7 [json_name = "dayOfYear"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDayOfYear() {
      bitField0_ = (bitField0_ & ~0x00000010);
      dayOfYear_ = 0;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.MonthAndDay)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.MonthAndDay)
  private static final com.tcn.cloud.api.api.v0alpha.MonthAndDay DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.MonthAndDay();
  }

  public static com.tcn.cloud.api.api.v0alpha.MonthAndDay getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MonthAndDay>
      PARSER = new com.google.protobuf.AbstractParser<MonthAndDay>() {
    @java.lang.Override
    public MonthAndDay parsePartialFrom(
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

  public static com.google.protobuf.Parser<MonthAndDay> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MonthAndDay> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.MonthAndDay getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

