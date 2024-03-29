// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/org/preferences.proto

package com.tcn.cloud.api.api.commons.org;

/**
 * <pre>
 * DayInterval describes a time interval of a given day.
 * </pre>
 *
 * Protobuf type {@code api.commons.org.DayInterval}
 */
public final class DayInterval extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.commons.org.DayInterval)
    DayIntervalOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DayInterval.newBuilder() to construct.
  private DayInterval(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DayInterval() {
    day_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DayInterval();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.commons.org.PreferencesProto.internal_static_api_commons_org_DayInterval_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.commons.org.PreferencesProto.internal_static_api_commons_org_DayInterval_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.commons.org.DayInterval.class, com.tcn.cloud.api.api.commons.org.DayInterval.Builder.class);
  }

  public static final int DAY_FIELD_NUMBER = 1;
  private int day_ = 0;
  /**
   * <pre>
   * The specified day of the interval.
   * </pre>
   *
   * <code>.api.commons.Weekday.Enum day = 1 [json_name = "day"];</code>
   * @return The enum numeric value on the wire for day.
   */
  @java.lang.Override public int getDayValue() {
    return day_;
  }
  /**
   * <pre>
   * The specified day of the interval.
   * </pre>
   *
   * <code>.api.commons.Weekday.Enum day = 1 [json_name = "day"];</code>
   * @return The day.
   */
  @java.lang.Override public com.tcn.cloud.api.api.commons.Weekday.Enum getDay() {
    com.tcn.cloud.api.api.commons.Weekday.Enum result = com.tcn.cloud.api.api.commons.Weekday.Enum.forNumber(day_);
    return result == null ? com.tcn.cloud.api.api.commons.Weekday.Enum.UNRECOGNIZED : result;
  }

  public static final int START_FIELD_NUMBER = 2;
  private com.tcn.cloud.api.api.commons.org.TimeOfDay start_;
  /**
   * <pre>
   * The starting time of the interval.
   * </pre>
   *
   * <code>.api.commons.org.TimeOfDay start = 2 [json_name = "start"];</code>
   * @return Whether the start field is set.
   */
  @java.lang.Override
  public boolean hasStart() {
    return start_ != null;
  }
  /**
   * <pre>
   * The starting time of the interval.
   * </pre>
   *
   * <code>.api.commons.org.TimeOfDay start = 2 [json_name = "start"];</code>
   * @return The start.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.TimeOfDay getStart() {
    return start_ == null ? com.tcn.cloud.api.api.commons.org.TimeOfDay.getDefaultInstance() : start_;
  }
  /**
   * <pre>
   * The starting time of the interval.
   * </pre>
   *
   * <code>.api.commons.org.TimeOfDay start = 2 [json_name = "start"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.TimeOfDayOrBuilder getStartOrBuilder() {
    return start_ == null ? com.tcn.cloud.api.api.commons.org.TimeOfDay.getDefaultInstance() : start_;
  }

  public static final int END_FIELD_NUMBER = 3;
  private com.tcn.cloud.api.api.commons.org.TimeOfDay end_;
  /**
   * <pre>
   * The ending time of the interval.
   * </pre>
   *
   * <code>.api.commons.org.TimeOfDay end = 3 [json_name = "end"];</code>
   * @return Whether the end field is set.
   */
  @java.lang.Override
  public boolean hasEnd() {
    return end_ != null;
  }
  /**
   * <pre>
   * The ending time of the interval.
   * </pre>
   *
   * <code>.api.commons.org.TimeOfDay end = 3 [json_name = "end"];</code>
   * @return The end.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.TimeOfDay getEnd() {
    return end_ == null ? com.tcn.cloud.api.api.commons.org.TimeOfDay.getDefaultInstance() : end_;
  }
  /**
   * <pre>
   * The ending time of the interval.
   * </pre>
   *
   * <code>.api.commons.org.TimeOfDay end = 3 [json_name = "end"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.TimeOfDayOrBuilder getEndOrBuilder() {
    return end_ == null ? com.tcn.cloud.api.api.commons.org.TimeOfDay.getDefaultInstance() : end_;
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
    if (day_ != com.tcn.cloud.api.api.commons.Weekday.Enum.SUNDAY.getNumber()) {
      output.writeEnum(1, day_);
    }
    if (start_ != null) {
      output.writeMessage(2, getStart());
    }
    if (end_ != null) {
      output.writeMessage(3, getEnd());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (day_ != com.tcn.cloud.api.api.commons.Weekday.Enum.SUNDAY.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, day_);
    }
    if (start_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getStart());
    }
    if (end_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getEnd());
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
    if (!(obj instanceof com.tcn.cloud.api.api.commons.org.DayInterval)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.commons.org.DayInterval other = (com.tcn.cloud.api.api.commons.org.DayInterval) obj;

    if (day_ != other.day_) return false;
    if (hasStart() != other.hasStart()) return false;
    if (hasStart()) {
      if (!getStart()
          .equals(other.getStart())) return false;
    }
    if (hasEnd() != other.hasEnd()) return false;
    if (hasEnd()) {
      if (!getEnd()
          .equals(other.getEnd())) return false;
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
    hash = (37 * hash) + DAY_FIELD_NUMBER;
    hash = (53 * hash) + day_;
    if (hasStart()) {
      hash = (37 * hash) + START_FIELD_NUMBER;
      hash = (53 * hash) + getStart().hashCode();
    }
    if (hasEnd()) {
      hash = (37 * hash) + END_FIELD_NUMBER;
      hash = (53 * hash) + getEnd().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.commons.org.DayInterval parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.org.DayInterval parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.org.DayInterval parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.org.DayInterval parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.org.DayInterval parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.org.DayInterval parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.org.DayInterval parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.org.DayInterval parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.commons.org.DayInterval parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.commons.org.DayInterval parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.org.DayInterval parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.org.DayInterval parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.commons.org.DayInterval prototype) {
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
   * DayInterval describes a time interval of a given day.
   * </pre>
   *
   * Protobuf type {@code api.commons.org.DayInterval}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.commons.org.DayInterval)
      com.tcn.cloud.api.api.commons.org.DayIntervalOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.org.PreferencesProto.internal_static_api_commons_org_DayInterval_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.commons.org.PreferencesProto.internal_static_api_commons_org_DayInterval_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.commons.org.DayInterval.class, com.tcn.cloud.api.api.commons.org.DayInterval.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.commons.org.DayInterval.newBuilder()
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
      day_ = 0;
      start_ = null;
      if (startBuilder_ != null) {
        startBuilder_.dispose();
        startBuilder_ = null;
      }
      end_ = null;
      if (endBuilder_ != null) {
        endBuilder_.dispose();
        endBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.commons.org.PreferencesProto.internal_static_api_commons_org_DayInterval_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.org.DayInterval getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.commons.org.DayInterval.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.org.DayInterval build() {
      com.tcn.cloud.api.api.commons.org.DayInterval result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.org.DayInterval buildPartial() {
      com.tcn.cloud.api.api.commons.org.DayInterval result = new com.tcn.cloud.api.api.commons.org.DayInterval(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.commons.org.DayInterval result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.day_ = day_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.start_ = startBuilder_ == null
            ? start_
            : startBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.end_ = endBuilder_ == null
            ? end_
            : endBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.commons.org.DayInterval) {
        return mergeFrom((com.tcn.cloud.api.api.commons.org.DayInterval)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.commons.org.DayInterval other) {
      if (other == com.tcn.cloud.api.api.commons.org.DayInterval.getDefaultInstance()) return this;
      if (other.day_ != 0) {
        setDayValue(other.getDayValue());
      }
      if (other.hasStart()) {
        mergeStart(other.getStart());
      }
      if (other.hasEnd()) {
        mergeEnd(other.getEnd());
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
              day_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getStartFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getEndFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private int day_ = 0;
    /**
     * <pre>
     * The specified day of the interval.
     * </pre>
     *
     * <code>.api.commons.Weekday.Enum day = 1 [json_name = "day"];</code>
     * @return The enum numeric value on the wire for day.
     */
    @java.lang.Override public int getDayValue() {
      return day_;
    }
    /**
     * <pre>
     * The specified day of the interval.
     * </pre>
     *
     * <code>.api.commons.Weekday.Enum day = 1 [json_name = "day"];</code>
     * @param value The enum numeric value on the wire for day to set.
     * @return This builder for chaining.
     */
    public Builder setDayValue(int value) {
      day_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The specified day of the interval.
     * </pre>
     *
     * <code>.api.commons.Weekday.Enum day = 1 [json_name = "day"];</code>
     * @return The day.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.Weekday.Enum getDay() {
      com.tcn.cloud.api.api.commons.Weekday.Enum result = com.tcn.cloud.api.api.commons.Weekday.Enum.forNumber(day_);
      return result == null ? com.tcn.cloud.api.api.commons.Weekday.Enum.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The specified day of the interval.
     * </pre>
     *
     * <code>.api.commons.Weekday.Enum day = 1 [json_name = "day"];</code>
     * @param value The day to set.
     * @return This builder for chaining.
     */
    public Builder setDay(com.tcn.cloud.api.api.commons.Weekday.Enum value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      day_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The specified day of the interval.
     * </pre>
     *
     * <code>.api.commons.Weekday.Enum day = 1 [json_name = "day"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDay() {
      bitField0_ = (bitField0_ & ~0x00000001);
      day_ = 0;
      onChanged();
      return this;
    }

    private com.tcn.cloud.api.api.commons.org.TimeOfDay start_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.org.TimeOfDay, com.tcn.cloud.api.api.commons.org.TimeOfDay.Builder, com.tcn.cloud.api.api.commons.org.TimeOfDayOrBuilder> startBuilder_;
    /**
     * <pre>
     * The starting time of the interval.
     * </pre>
     *
     * <code>.api.commons.org.TimeOfDay start = 2 [json_name = "start"];</code>
     * @return Whether the start field is set.
     */
    public boolean hasStart() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The starting time of the interval.
     * </pre>
     *
     * <code>.api.commons.org.TimeOfDay start = 2 [json_name = "start"];</code>
     * @return The start.
     */
    public com.tcn.cloud.api.api.commons.org.TimeOfDay getStart() {
      if (startBuilder_ == null) {
        return start_ == null ? com.tcn.cloud.api.api.commons.org.TimeOfDay.getDefaultInstance() : start_;
      } else {
        return startBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The starting time of the interval.
     * </pre>
     *
     * <code>.api.commons.org.TimeOfDay start = 2 [json_name = "start"];</code>
     */
    public Builder setStart(com.tcn.cloud.api.api.commons.org.TimeOfDay value) {
      if (startBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        start_ = value;
      } else {
        startBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The starting time of the interval.
     * </pre>
     *
     * <code>.api.commons.org.TimeOfDay start = 2 [json_name = "start"];</code>
     */
    public Builder setStart(
        com.tcn.cloud.api.api.commons.org.TimeOfDay.Builder builderForValue) {
      if (startBuilder_ == null) {
        start_ = builderForValue.build();
      } else {
        startBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The starting time of the interval.
     * </pre>
     *
     * <code>.api.commons.org.TimeOfDay start = 2 [json_name = "start"];</code>
     */
    public Builder mergeStart(com.tcn.cloud.api.api.commons.org.TimeOfDay value) {
      if (startBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          start_ != null &&
          start_ != com.tcn.cloud.api.api.commons.org.TimeOfDay.getDefaultInstance()) {
          getStartBuilder().mergeFrom(value);
        } else {
          start_ = value;
        }
      } else {
        startBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The starting time of the interval.
     * </pre>
     *
     * <code>.api.commons.org.TimeOfDay start = 2 [json_name = "start"];</code>
     */
    public Builder clearStart() {
      bitField0_ = (bitField0_ & ~0x00000002);
      start_ = null;
      if (startBuilder_ != null) {
        startBuilder_.dispose();
        startBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The starting time of the interval.
     * </pre>
     *
     * <code>.api.commons.org.TimeOfDay start = 2 [json_name = "start"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.TimeOfDay.Builder getStartBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getStartFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The starting time of the interval.
     * </pre>
     *
     * <code>.api.commons.org.TimeOfDay start = 2 [json_name = "start"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.TimeOfDayOrBuilder getStartOrBuilder() {
      if (startBuilder_ != null) {
        return startBuilder_.getMessageOrBuilder();
      } else {
        return start_ == null ?
            com.tcn.cloud.api.api.commons.org.TimeOfDay.getDefaultInstance() : start_;
      }
    }
    /**
     * <pre>
     * The starting time of the interval.
     * </pre>
     *
     * <code>.api.commons.org.TimeOfDay start = 2 [json_name = "start"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.org.TimeOfDay, com.tcn.cloud.api.api.commons.org.TimeOfDay.Builder, com.tcn.cloud.api.api.commons.org.TimeOfDayOrBuilder> 
        getStartFieldBuilder() {
      if (startBuilder_ == null) {
        startBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.commons.org.TimeOfDay, com.tcn.cloud.api.api.commons.org.TimeOfDay.Builder, com.tcn.cloud.api.api.commons.org.TimeOfDayOrBuilder>(
                getStart(),
                getParentForChildren(),
                isClean());
        start_ = null;
      }
      return startBuilder_;
    }

    private com.tcn.cloud.api.api.commons.org.TimeOfDay end_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.org.TimeOfDay, com.tcn.cloud.api.api.commons.org.TimeOfDay.Builder, com.tcn.cloud.api.api.commons.org.TimeOfDayOrBuilder> endBuilder_;
    /**
     * <pre>
     * The ending time of the interval.
     * </pre>
     *
     * <code>.api.commons.org.TimeOfDay end = 3 [json_name = "end"];</code>
     * @return Whether the end field is set.
     */
    public boolean hasEnd() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * The ending time of the interval.
     * </pre>
     *
     * <code>.api.commons.org.TimeOfDay end = 3 [json_name = "end"];</code>
     * @return The end.
     */
    public com.tcn.cloud.api.api.commons.org.TimeOfDay getEnd() {
      if (endBuilder_ == null) {
        return end_ == null ? com.tcn.cloud.api.api.commons.org.TimeOfDay.getDefaultInstance() : end_;
      } else {
        return endBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The ending time of the interval.
     * </pre>
     *
     * <code>.api.commons.org.TimeOfDay end = 3 [json_name = "end"];</code>
     */
    public Builder setEnd(com.tcn.cloud.api.api.commons.org.TimeOfDay value) {
      if (endBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        end_ = value;
      } else {
        endBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ending time of the interval.
     * </pre>
     *
     * <code>.api.commons.org.TimeOfDay end = 3 [json_name = "end"];</code>
     */
    public Builder setEnd(
        com.tcn.cloud.api.api.commons.org.TimeOfDay.Builder builderForValue) {
      if (endBuilder_ == null) {
        end_ = builderForValue.build();
      } else {
        endBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ending time of the interval.
     * </pre>
     *
     * <code>.api.commons.org.TimeOfDay end = 3 [json_name = "end"];</code>
     */
    public Builder mergeEnd(com.tcn.cloud.api.api.commons.org.TimeOfDay value) {
      if (endBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          end_ != null &&
          end_ != com.tcn.cloud.api.api.commons.org.TimeOfDay.getDefaultInstance()) {
          getEndBuilder().mergeFrom(value);
        } else {
          end_ = value;
        }
      } else {
        endBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ending time of the interval.
     * </pre>
     *
     * <code>.api.commons.org.TimeOfDay end = 3 [json_name = "end"];</code>
     */
    public Builder clearEnd() {
      bitField0_ = (bitField0_ & ~0x00000004);
      end_ = null;
      if (endBuilder_ != null) {
        endBuilder_.dispose();
        endBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ending time of the interval.
     * </pre>
     *
     * <code>.api.commons.org.TimeOfDay end = 3 [json_name = "end"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.TimeOfDay.Builder getEndBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getEndFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The ending time of the interval.
     * </pre>
     *
     * <code>.api.commons.org.TimeOfDay end = 3 [json_name = "end"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.TimeOfDayOrBuilder getEndOrBuilder() {
      if (endBuilder_ != null) {
        return endBuilder_.getMessageOrBuilder();
      } else {
        return end_ == null ?
            com.tcn.cloud.api.api.commons.org.TimeOfDay.getDefaultInstance() : end_;
      }
    }
    /**
     * <pre>
     * The ending time of the interval.
     * </pre>
     *
     * <code>.api.commons.org.TimeOfDay end = 3 [json_name = "end"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.org.TimeOfDay, com.tcn.cloud.api.api.commons.org.TimeOfDay.Builder, com.tcn.cloud.api.api.commons.org.TimeOfDayOrBuilder> 
        getEndFieldBuilder() {
      if (endBuilder_ == null) {
        endBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.commons.org.TimeOfDay, com.tcn.cloud.api.api.commons.org.TimeOfDay.Builder, com.tcn.cloud.api.api.commons.org.TimeOfDayOrBuilder>(
                getEnd(),
                getParentForChildren(),
                isClean());
        end_ = null;
      }
      return endBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.commons.org.DayInterval)
  }

  // @@protoc_insertion_point(class_scope:api.commons.org.DayInterval)
  private static final com.tcn.cloud.api.api.commons.org.DayInterval DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.commons.org.DayInterval();
  }

  public static com.tcn.cloud.api.api.commons.org.DayInterval getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DayInterval>
      PARSER = new com.google.protobuf.AbstractParser<DayInterval>() {
    @java.lang.Override
    public DayInterval parsePartialFrom(
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

  public static com.google.protobuf.Parser<DayInterval> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DayInterval> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.DayInterval getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

