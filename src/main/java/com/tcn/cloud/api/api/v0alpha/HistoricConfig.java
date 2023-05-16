// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/dashboards.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * <pre>
 * Historic Dashboard type
 * </pre>
 *
 * Protobuf type {@code api.v0alpha.HistoricConfig}
 */
public final class HistoricConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.HistoricConfig)
    HistoricConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HistoricConfig.newBuilder() to construct.
  private HistoricConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HistoricConfig() {
    timeZone_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HistoricConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.DashboardsProto.internal_static_api_v0alpha_HistoricConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.DashboardsProto.internal_static_api_v0alpha_HistoricConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.HistoricConfig.class, com.tcn.cloud.api.api.v0alpha.HistoricConfig.Builder.class);
  }

  private int timeSpanCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object timeSpan_;
  public enum TimeSpanCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    TIME_SPAN_SIMPLE(1),
    TIME_SPAN_RANGE(3),
    TIMESPAN_NOT_SET(0);
    private final int value;
    private TimeSpanCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static TimeSpanCase valueOf(int value) {
      return forNumber(value);
    }

    public static TimeSpanCase forNumber(int value) {
      switch (value) {
        case 1: return TIME_SPAN_SIMPLE;
        case 3: return TIME_SPAN_RANGE;
        case 0: return TIMESPAN_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public TimeSpanCase
  getTimeSpanCase() {
    return TimeSpanCase.forNumber(
        timeSpanCase_);
  }

  public static final int TIME_SPAN_SIMPLE_FIELD_NUMBER = 1;
  /**
   * <code>.api.v0alpha.TimeSpan.Interval time_span_simple = 1 [json_name = "timeSpanSimple"];</code>
   * @return Whether the timeSpanSimple field is set.
   */
  public boolean hasTimeSpanSimple() {
    return timeSpanCase_ == 1;
  }
  /**
   * <code>.api.v0alpha.TimeSpan.Interval time_span_simple = 1 [json_name = "timeSpanSimple"];</code>
   * @return The enum numeric value on the wire for timeSpanSimple.
   */
  public int getTimeSpanSimpleValue() {
    if (timeSpanCase_ == 1) {
      return (java.lang.Integer) timeSpan_;
    }
    return 0;
  }
  /**
   * <code>.api.v0alpha.TimeSpan.Interval time_span_simple = 1 [json_name = "timeSpanSimple"];</code>
   * @return The timeSpanSimple.
   */
  public com.tcn.cloud.api.api.v0alpha.TimeSpan.Interval getTimeSpanSimple() {
    if (timeSpanCase_ == 1) {
      com.tcn.cloud.api.api.v0alpha.TimeSpan.Interval result = com.tcn.cloud.api.api.v0alpha.TimeSpan.Interval.forNumber(
          (java.lang.Integer) timeSpan_);
      return result == null ? com.tcn.cloud.api.api.v0alpha.TimeSpan.Interval.UNRECOGNIZED : result;
    }
    return com.tcn.cloud.api.api.v0alpha.TimeSpan.Interval.TODAY;
  }

  public static final int TIME_SPAN_RANGE_FIELD_NUMBER = 3;
  /**
   * <code>.api.v0alpha.TimeSpan.Range time_span_range = 3 [json_name = "timeSpanRange"];</code>
   * @return Whether the timeSpanRange field is set.
   */
  @java.lang.Override
  public boolean hasTimeSpanRange() {
    return timeSpanCase_ == 3;
  }
  /**
   * <code>.api.v0alpha.TimeSpan.Range time_span_range = 3 [json_name = "timeSpanRange"];</code>
   * @return The timeSpanRange.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.TimeSpan.Range getTimeSpanRange() {
    if (timeSpanCase_ == 3) {
       return (com.tcn.cloud.api.api.v0alpha.TimeSpan.Range) timeSpan_;
    }
    return com.tcn.cloud.api.api.v0alpha.TimeSpan.Range.getDefaultInstance();
  }
  /**
   * <code>.api.v0alpha.TimeSpan.Range time_span_range = 3 [json_name = "timeSpanRange"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.TimeSpan.RangeOrBuilder getTimeSpanRangeOrBuilder() {
    if (timeSpanCase_ == 3) {
       return (com.tcn.cloud.api.api.v0alpha.TimeSpan.Range) timeSpan_;
    }
    return com.tcn.cloud.api.api.v0alpha.TimeSpan.Range.getDefaultInstance();
  }

  public static final int TIME_ZONE_FIELD_NUMBER = 4;
  private int timeZone_ = 0;
  /**
   * <pre>
   * The default time zone to view the historic data by
   * </pre>
   *
   * <code>.api.commons.TimeZone time_zone = 4 [json_name = "timeZone"];</code>
   * @return The enum numeric value on the wire for timeZone.
   */
  @java.lang.Override public int getTimeZoneValue() {
    return timeZone_;
  }
  /**
   * <pre>
   * The default time zone to view the historic data by
   * </pre>
   *
   * <code>.api.commons.TimeZone time_zone = 4 [json_name = "timeZone"];</code>
   * @return The timeZone.
   */
  @java.lang.Override public com.tcn.cloud.api.api.commons.TimeZone getTimeZone() {
    com.tcn.cloud.api.api.commons.TimeZone result = com.tcn.cloud.api.api.commons.TimeZone.forNumber(timeZone_);
    return result == null ? com.tcn.cloud.api.api.commons.TimeZone.UNRECOGNIZED : result;
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
    if (timeSpanCase_ == 1) {
      output.writeEnum(1, ((java.lang.Integer) timeSpan_));
    }
    if (timeSpanCase_ == 3) {
      output.writeMessage(3, (com.tcn.cloud.api.api.v0alpha.TimeSpan.Range) timeSpan_);
    }
    if (timeZone_ != com.tcn.cloud.api.api.commons.TimeZone.TIME_ZONE_AMERICA_PUERTO_RICO.getNumber()) {
      output.writeEnum(4, timeZone_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (timeSpanCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, ((java.lang.Integer) timeSpan_));
    }
    if (timeSpanCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, (com.tcn.cloud.api.api.v0alpha.TimeSpan.Range) timeSpan_);
    }
    if (timeZone_ != com.tcn.cloud.api.api.commons.TimeZone.TIME_ZONE_AMERICA_PUERTO_RICO.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, timeZone_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.HistoricConfig)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.HistoricConfig other = (com.tcn.cloud.api.api.v0alpha.HistoricConfig) obj;

    if (timeZone_ != other.timeZone_) return false;
    if (!getTimeSpanCase().equals(other.getTimeSpanCase())) return false;
    switch (timeSpanCase_) {
      case 1:
        if (getTimeSpanSimpleValue()
            != other.getTimeSpanSimpleValue()) return false;
        break;
      case 3:
        if (!getTimeSpanRange()
            .equals(other.getTimeSpanRange())) return false;
        break;
      case 0:
      default:
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
    hash = (37 * hash) + TIME_ZONE_FIELD_NUMBER;
    hash = (53 * hash) + timeZone_;
    switch (timeSpanCase_) {
      case 1:
        hash = (37 * hash) + TIME_SPAN_SIMPLE_FIELD_NUMBER;
        hash = (53 * hash) + getTimeSpanSimpleValue();
        break;
      case 3:
        hash = (37 * hash) + TIME_SPAN_RANGE_FIELD_NUMBER;
        hash = (53 * hash) + getTimeSpanRange().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.HistoricConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.HistoricConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.HistoricConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.HistoricConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.HistoricConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.HistoricConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.HistoricConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.HistoricConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.HistoricConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.HistoricConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.HistoricConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.HistoricConfig parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.HistoricConfig prototype) {
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
   * Historic Dashboard type
   * </pre>
   *
   * Protobuf type {@code api.v0alpha.HistoricConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.HistoricConfig)
      com.tcn.cloud.api.api.v0alpha.HistoricConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.DashboardsProto.internal_static_api_v0alpha_HistoricConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.DashboardsProto.internal_static_api_v0alpha_HistoricConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.HistoricConfig.class, com.tcn.cloud.api.api.v0alpha.HistoricConfig.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.HistoricConfig.newBuilder()
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
      if (timeSpanRangeBuilder_ != null) {
        timeSpanRangeBuilder_.clear();
      }
      timeZone_ = 0;
      timeSpanCase_ = 0;
      timeSpan_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.DashboardsProto.internal_static_api_v0alpha_HistoricConfig_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.HistoricConfig getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.HistoricConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.HistoricConfig build() {
      com.tcn.cloud.api.api.v0alpha.HistoricConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.HistoricConfig buildPartial() {
      com.tcn.cloud.api.api.v0alpha.HistoricConfig result = new com.tcn.cloud.api.api.v0alpha.HistoricConfig(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.HistoricConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.timeZone_ = timeZone_;
      }
    }

    private void buildPartialOneofs(com.tcn.cloud.api.api.v0alpha.HistoricConfig result) {
      result.timeSpanCase_ = timeSpanCase_;
      result.timeSpan_ = this.timeSpan_;
      if (timeSpanCase_ == 3 &&
          timeSpanRangeBuilder_ != null) {
        result.timeSpan_ = timeSpanRangeBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v0alpha.HistoricConfig) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.HistoricConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.HistoricConfig other) {
      if (other == com.tcn.cloud.api.api.v0alpha.HistoricConfig.getDefaultInstance()) return this;
      if (other.timeZone_ != 0) {
        setTimeZoneValue(other.getTimeZoneValue());
      }
      switch (other.getTimeSpanCase()) {
        case TIME_SPAN_SIMPLE: {
          setTimeSpanSimpleValue(other.getTimeSpanSimpleValue());
          break;
        }
        case TIME_SPAN_RANGE: {
          mergeTimeSpanRange(other.getTimeSpanRange());
          break;
        }
        case TIMESPAN_NOT_SET: {
          break;
        }
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
              int rawValue = input.readEnum();
              timeSpanCase_ = 1;
              timeSpan_ = rawValue;
              break;
            } // case 8
            case 26: {
              input.readMessage(
                  getTimeSpanRangeFieldBuilder().getBuilder(),
                  extensionRegistry);
              timeSpanCase_ = 3;
              break;
            } // case 26
            case 32: {
              timeZone_ = input.readEnum();
              bitField0_ |= 0x00000004;
              break;
            } // case 32
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
    private int timeSpanCase_ = 0;
    private java.lang.Object timeSpan_;
    public TimeSpanCase
        getTimeSpanCase() {
      return TimeSpanCase.forNumber(
          timeSpanCase_);
    }

    public Builder clearTimeSpan() {
      timeSpanCase_ = 0;
      timeSpan_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    /**
     * <code>.api.v0alpha.TimeSpan.Interval time_span_simple = 1 [json_name = "timeSpanSimple"];</code>
     * @return Whether the timeSpanSimple field is set.
     */
    @java.lang.Override
    public boolean hasTimeSpanSimple() {
      return timeSpanCase_ == 1;
    }
    /**
     * <code>.api.v0alpha.TimeSpan.Interval time_span_simple = 1 [json_name = "timeSpanSimple"];</code>
     * @return The enum numeric value on the wire for timeSpanSimple.
     */
    @java.lang.Override
    public int getTimeSpanSimpleValue() {
      if (timeSpanCase_ == 1) {
        return ((java.lang.Integer) timeSpan_).intValue();
      }
      return 0;
    }
    /**
     * <code>.api.v0alpha.TimeSpan.Interval time_span_simple = 1 [json_name = "timeSpanSimple"];</code>
     * @param value The enum numeric value on the wire for timeSpanSimple to set.
     * @return This builder for chaining.
     */
    public Builder setTimeSpanSimpleValue(int value) {
      timeSpanCase_ = 1;
      timeSpan_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.TimeSpan.Interval time_span_simple = 1 [json_name = "timeSpanSimple"];</code>
     * @return The timeSpanSimple.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.TimeSpan.Interval getTimeSpanSimple() {
      if (timeSpanCase_ == 1) {
        com.tcn.cloud.api.api.v0alpha.TimeSpan.Interval result = com.tcn.cloud.api.api.v0alpha.TimeSpan.Interval.forNumber(
            (java.lang.Integer) timeSpan_);
        return result == null ? com.tcn.cloud.api.api.v0alpha.TimeSpan.Interval.UNRECOGNIZED : result;
      }
      return com.tcn.cloud.api.api.v0alpha.TimeSpan.Interval.TODAY;
    }
    /**
     * <code>.api.v0alpha.TimeSpan.Interval time_span_simple = 1 [json_name = "timeSpanSimple"];</code>
     * @param value The timeSpanSimple to set.
     * @return This builder for chaining.
     */
    public Builder setTimeSpanSimple(com.tcn.cloud.api.api.v0alpha.TimeSpan.Interval value) {
      if (value == null) {
        throw new NullPointerException();
      }
      timeSpanCase_ = 1;
      timeSpan_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.TimeSpan.Interval time_span_simple = 1 [json_name = "timeSpanSimple"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTimeSpanSimple() {
      if (timeSpanCase_ == 1) {
        timeSpanCase_ = 0;
        timeSpan_ = null;
        onChanged();
      }
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.TimeSpan.Range, com.tcn.cloud.api.api.v0alpha.TimeSpan.Range.Builder, com.tcn.cloud.api.api.v0alpha.TimeSpan.RangeOrBuilder> timeSpanRangeBuilder_;
    /**
     * <code>.api.v0alpha.TimeSpan.Range time_span_range = 3 [json_name = "timeSpanRange"];</code>
     * @return Whether the timeSpanRange field is set.
     */
    @java.lang.Override
    public boolean hasTimeSpanRange() {
      return timeSpanCase_ == 3;
    }
    /**
     * <code>.api.v0alpha.TimeSpan.Range time_span_range = 3 [json_name = "timeSpanRange"];</code>
     * @return The timeSpanRange.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.TimeSpan.Range getTimeSpanRange() {
      if (timeSpanRangeBuilder_ == null) {
        if (timeSpanCase_ == 3) {
          return (com.tcn.cloud.api.api.v0alpha.TimeSpan.Range) timeSpan_;
        }
        return com.tcn.cloud.api.api.v0alpha.TimeSpan.Range.getDefaultInstance();
      } else {
        if (timeSpanCase_ == 3) {
          return timeSpanRangeBuilder_.getMessage();
        }
        return com.tcn.cloud.api.api.v0alpha.TimeSpan.Range.getDefaultInstance();
      }
    }
    /**
     * <code>.api.v0alpha.TimeSpan.Range time_span_range = 3 [json_name = "timeSpanRange"];</code>
     */
    public Builder setTimeSpanRange(com.tcn.cloud.api.api.v0alpha.TimeSpan.Range value) {
      if (timeSpanRangeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        timeSpan_ = value;
        onChanged();
      } else {
        timeSpanRangeBuilder_.setMessage(value);
      }
      timeSpanCase_ = 3;
      return this;
    }
    /**
     * <code>.api.v0alpha.TimeSpan.Range time_span_range = 3 [json_name = "timeSpanRange"];</code>
     */
    public Builder setTimeSpanRange(
        com.tcn.cloud.api.api.v0alpha.TimeSpan.Range.Builder builderForValue) {
      if (timeSpanRangeBuilder_ == null) {
        timeSpan_ = builderForValue.build();
        onChanged();
      } else {
        timeSpanRangeBuilder_.setMessage(builderForValue.build());
      }
      timeSpanCase_ = 3;
      return this;
    }
    /**
     * <code>.api.v0alpha.TimeSpan.Range time_span_range = 3 [json_name = "timeSpanRange"];</code>
     */
    public Builder mergeTimeSpanRange(com.tcn.cloud.api.api.v0alpha.TimeSpan.Range value) {
      if (timeSpanRangeBuilder_ == null) {
        if (timeSpanCase_ == 3 &&
            timeSpan_ != com.tcn.cloud.api.api.v0alpha.TimeSpan.Range.getDefaultInstance()) {
          timeSpan_ = com.tcn.cloud.api.api.v0alpha.TimeSpan.Range.newBuilder((com.tcn.cloud.api.api.v0alpha.TimeSpan.Range) timeSpan_)
              .mergeFrom(value).buildPartial();
        } else {
          timeSpan_ = value;
        }
        onChanged();
      } else {
        if (timeSpanCase_ == 3) {
          timeSpanRangeBuilder_.mergeFrom(value);
        } else {
          timeSpanRangeBuilder_.setMessage(value);
        }
      }
      timeSpanCase_ = 3;
      return this;
    }
    /**
     * <code>.api.v0alpha.TimeSpan.Range time_span_range = 3 [json_name = "timeSpanRange"];</code>
     */
    public Builder clearTimeSpanRange() {
      if (timeSpanRangeBuilder_ == null) {
        if (timeSpanCase_ == 3) {
          timeSpanCase_ = 0;
          timeSpan_ = null;
          onChanged();
        }
      } else {
        if (timeSpanCase_ == 3) {
          timeSpanCase_ = 0;
          timeSpan_ = null;
        }
        timeSpanRangeBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.api.v0alpha.TimeSpan.Range time_span_range = 3 [json_name = "timeSpanRange"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.TimeSpan.Range.Builder getTimeSpanRangeBuilder() {
      return getTimeSpanRangeFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.v0alpha.TimeSpan.Range time_span_range = 3 [json_name = "timeSpanRange"];</code>
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.TimeSpan.RangeOrBuilder getTimeSpanRangeOrBuilder() {
      if ((timeSpanCase_ == 3) && (timeSpanRangeBuilder_ != null)) {
        return timeSpanRangeBuilder_.getMessageOrBuilder();
      } else {
        if (timeSpanCase_ == 3) {
          return (com.tcn.cloud.api.api.v0alpha.TimeSpan.Range) timeSpan_;
        }
        return com.tcn.cloud.api.api.v0alpha.TimeSpan.Range.getDefaultInstance();
      }
    }
    /**
     * <code>.api.v0alpha.TimeSpan.Range time_span_range = 3 [json_name = "timeSpanRange"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.TimeSpan.Range, com.tcn.cloud.api.api.v0alpha.TimeSpan.Range.Builder, com.tcn.cloud.api.api.v0alpha.TimeSpan.RangeOrBuilder> 
        getTimeSpanRangeFieldBuilder() {
      if (timeSpanRangeBuilder_ == null) {
        if (!(timeSpanCase_ == 3)) {
          timeSpan_ = com.tcn.cloud.api.api.v0alpha.TimeSpan.Range.getDefaultInstance();
        }
        timeSpanRangeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.TimeSpan.Range, com.tcn.cloud.api.api.v0alpha.TimeSpan.Range.Builder, com.tcn.cloud.api.api.v0alpha.TimeSpan.RangeOrBuilder>(
                (com.tcn.cloud.api.api.v0alpha.TimeSpan.Range) timeSpan_,
                getParentForChildren(),
                isClean());
        timeSpan_ = null;
      }
      timeSpanCase_ = 3;
      onChanged();
      return timeSpanRangeBuilder_;
    }

    private int timeZone_ = 0;
    /**
     * <pre>
     * The default time zone to view the historic data by
     * </pre>
     *
     * <code>.api.commons.TimeZone time_zone = 4 [json_name = "timeZone"];</code>
     * @return The enum numeric value on the wire for timeZone.
     */
    @java.lang.Override public int getTimeZoneValue() {
      return timeZone_;
    }
    /**
     * <pre>
     * The default time zone to view the historic data by
     * </pre>
     *
     * <code>.api.commons.TimeZone time_zone = 4 [json_name = "timeZone"];</code>
     * @param value The enum numeric value on the wire for timeZone to set.
     * @return This builder for chaining.
     */
    public Builder setTimeZoneValue(int value) {
      timeZone_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The default time zone to view the historic data by
     * </pre>
     *
     * <code>.api.commons.TimeZone time_zone = 4 [json_name = "timeZone"];</code>
     * @return The timeZone.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.TimeZone getTimeZone() {
      com.tcn.cloud.api.api.commons.TimeZone result = com.tcn.cloud.api.api.commons.TimeZone.forNumber(timeZone_);
      return result == null ? com.tcn.cloud.api.api.commons.TimeZone.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The default time zone to view the historic data by
     * </pre>
     *
     * <code>.api.commons.TimeZone time_zone = 4 [json_name = "timeZone"];</code>
     * @param value The timeZone to set.
     * @return This builder for chaining.
     */
    public Builder setTimeZone(com.tcn.cloud.api.api.commons.TimeZone value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      timeZone_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The default time zone to view the historic data by
     * </pre>
     *
     * <code>.api.commons.TimeZone time_zone = 4 [json_name = "timeZone"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTimeZone() {
      bitField0_ = (bitField0_ & ~0x00000004);
      timeZone_ = 0;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.HistoricConfig)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.HistoricConfig)
  private static final com.tcn.cloud.api.api.v0alpha.HistoricConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.HistoricConfig();
  }

  public static com.tcn.cloud.api.api.v0alpha.HistoricConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HistoricConfig>
      PARSER = new com.google.protobuf.AbstractParser<HistoricConfig>() {
    @java.lang.Override
    public HistoricConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<HistoricConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HistoricConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.HistoricConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

