// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/bireportgenerator.proto

package com.tcn.cloud.api.api.commons;

/**
 * <pre>
 * DayFilter is used to specify days for a report to be delivered.
 * </pre>
 *
 * Protobuf type {@code api.commons.DayFilter}
 */
public final class DayFilter extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.commons.DayFilter)
    DayFilterOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DayFilter.newBuilder() to construct.
  private DayFilter(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DayFilter() {
    type_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DayFilter();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.commons.BireportgeneratorProto.internal_static_api_commons_DayFilter_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.commons.BireportgeneratorProto.internal_static_api_commons_DayFilter_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.commons.DayFilter.class, com.tcn.cloud.api.api.commons.DayFilter.Builder.class);
  }

  private int filterCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object filter_;
  public enum FilterCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    DAY_OF_WEEK_FILTER(2),
    DAY_OF_MONTH_FILTER(3),
    FILTER_NOT_SET(0);
    private final int value;
    private FilterCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static FilterCase valueOf(int value) {
      return forNumber(value);
    }

    public static FilterCase forNumber(int value) {
      switch (value) {
        case 2: return DAY_OF_WEEK_FILTER;
        case 3: return DAY_OF_MONTH_FILTER;
        case 0: return FILTER_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public FilterCase
  getFilterCase() {
    return FilterCase.forNumber(
        filterCase_);
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_ = 0;
  /**
   * <pre>
   * type is the type of day filter.
   * </pre>
   *
   * <code>.api.commons.DayFilterType type = 1 [json_name = "type"];</code>
   * @return The enum numeric value on the wire for type.
   */
  @java.lang.Override public int getTypeValue() {
    return type_;
  }
  /**
   * <pre>
   * type is the type of day filter.
   * </pre>
   *
   * <code>.api.commons.DayFilterType type = 1 [json_name = "type"];</code>
   * @return The type.
   */
  @java.lang.Override public com.tcn.cloud.api.api.commons.DayFilterType getType() {
    com.tcn.cloud.api.api.commons.DayFilterType result = com.tcn.cloud.api.api.commons.DayFilterType.forNumber(type_);
    return result == null ? com.tcn.cloud.api.api.commons.DayFilterType.UNRECOGNIZED : result;
  }

  public static final int DAY_OF_WEEK_FILTER_FIELD_NUMBER = 2;
  /**
   * <pre>
   * day_of_week_filter is the filter for days of the week.
   * </pre>
   *
   * <code>.api.commons.DayOfWeekFilter day_of_week_filter = 2 [json_name = "dayOfWeekFilter"];</code>
   * @return Whether the dayOfWeekFilter field is set.
   */
  @java.lang.Override
  public boolean hasDayOfWeekFilter() {
    return filterCase_ == 2;
  }
  /**
   * <pre>
   * day_of_week_filter is the filter for days of the week.
   * </pre>
   *
   * <code>.api.commons.DayOfWeekFilter day_of_week_filter = 2 [json_name = "dayOfWeekFilter"];</code>
   * @return The dayOfWeekFilter.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.DayOfWeekFilter getDayOfWeekFilter() {
    if (filterCase_ == 2) {
       return (com.tcn.cloud.api.api.commons.DayOfWeekFilter) filter_;
    }
    return com.tcn.cloud.api.api.commons.DayOfWeekFilter.getDefaultInstance();
  }
  /**
   * <pre>
   * day_of_week_filter is the filter for days of the week.
   * </pre>
   *
   * <code>.api.commons.DayOfWeekFilter day_of_week_filter = 2 [json_name = "dayOfWeekFilter"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.DayOfWeekFilterOrBuilder getDayOfWeekFilterOrBuilder() {
    if (filterCase_ == 2) {
       return (com.tcn.cloud.api.api.commons.DayOfWeekFilter) filter_;
    }
    return com.tcn.cloud.api.api.commons.DayOfWeekFilter.getDefaultInstance();
  }

  public static final int DAY_OF_MONTH_FILTER_FIELD_NUMBER = 3;
  /**
   * <pre>
   * day_of_month_filter is the filter for days of the month.
   * </pre>
   *
   * <code>.api.commons.DayOfMonthFilter day_of_month_filter = 3 [json_name = "dayOfMonthFilter"];</code>
   * @return Whether the dayOfMonthFilter field is set.
   */
  @java.lang.Override
  public boolean hasDayOfMonthFilter() {
    return filterCase_ == 3;
  }
  /**
   * <pre>
   * day_of_month_filter is the filter for days of the month.
   * </pre>
   *
   * <code>.api.commons.DayOfMonthFilter day_of_month_filter = 3 [json_name = "dayOfMonthFilter"];</code>
   * @return The dayOfMonthFilter.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.DayOfMonthFilter getDayOfMonthFilter() {
    if (filterCase_ == 3) {
       return (com.tcn.cloud.api.api.commons.DayOfMonthFilter) filter_;
    }
    return com.tcn.cloud.api.api.commons.DayOfMonthFilter.getDefaultInstance();
  }
  /**
   * <pre>
   * day_of_month_filter is the filter for days of the month.
   * </pre>
   *
   * <code>.api.commons.DayOfMonthFilter day_of_month_filter = 3 [json_name = "dayOfMonthFilter"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.DayOfMonthFilterOrBuilder getDayOfMonthFilterOrBuilder() {
    if (filterCase_ == 3) {
       return (com.tcn.cloud.api.api.commons.DayOfMonthFilter) filter_;
    }
    return com.tcn.cloud.api.api.commons.DayOfMonthFilter.getDefaultInstance();
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
    if (type_ != com.tcn.cloud.api.api.commons.DayFilterType.DAY_FILTER_TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, type_);
    }
    if (filterCase_ == 2) {
      output.writeMessage(2, (com.tcn.cloud.api.api.commons.DayOfWeekFilter) filter_);
    }
    if (filterCase_ == 3) {
      output.writeMessage(3, (com.tcn.cloud.api.api.commons.DayOfMonthFilter) filter_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_ != com.tcn.cloud.api.api.commons.DayFilterType.DAY_FILTER_TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, type_);
    }
    if (filterCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (com.tcn.cloud.api.api.commons.DayOfWeekFilter) filter_);
    }
    if (filterCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, (com.tcn.cloud.api.api.commons.DayOfMonthFilter) filter_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.commons.DayFilter)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.commons.DayFilter other = (com.tcn.cloud.api.api.commons.DayFilter) obj;

    if (type_ != other.type_) return false;
    if (!getFilterCase().equals(other.getFilterCase())) return false;
    switch (filterCase_) {
      case 2:
        if (!getDayOfWeekFilter()
            .equals(other.getDayOfWeekFilter())) return false;
        break;
      case 3:
        if (!getDayOfMonthFilter()
            .equals(other.getDayOfMonthFilter())) return false;
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
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    switch (filterCase_) {
      case 2:
        hash = (37 * hash) + DAY_OF_WEEK_FILTER_FIELD_NUMBER;
        hash = (53 * hash) + getDayOfWeekFilter().hashCode();
        break;
      case 3:
        hash = (37 * hash) + DAY_OF_MONTH_FILTER_FIELD_NUMBER;
        hash = (53 * hash) + getDayOfMonthFilter().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.commons.DayFilter parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.DayFilter parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.DayFilter parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.DayFilter parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.DayFilter parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.DayFilter parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.DayFilter parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.DayFilter parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.commons.DayFilter parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.commons.DayFilter parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.DayFilter parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.DayFilter parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.commons.DayFilter prototype) {
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
   * DayFilter is used to specify days for a report to be delivered.
   * </pre>
   *
   * Protobuf type {@code api.commons.DayFilter}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.commons.DayFilter)
      com.tcn.cloud.api.api.commons.DayFilterOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.BireportgeneratorProto.internal_static_api_commons_DayFilter_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.commons.BireportgeneratorProto.internal_static_api_commons_DayFilter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.commons.DayFilter.class, com.tcn.cloud.api.api.commons.DayFilter.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.commons.DayFilter.newBuilder()
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
      type_ = 0;
      if (dayOfWeekFilterBuilder_ != null) {
        dayOfWeekFilterBuilder_.clear();
      }
      if (dayOfMonthFilterBuilder_ != null) {
        dayOfMonthFilterBuilder_.clear();
      }
      filterCase_ = 0;
      filter_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.commons.BireportgeneratorProto.internal_static_api_commons_DayFilter_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.DayFilter getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.commons.DayFilter.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.DayFilter build() {
      com.tcn.cloud.api.api.commons.DayFilter result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.DayFilter buildPartial() {
      com.tcn.cloud.api.api.commons.DayFilter result = new com.tcn.cloud.api.api.commons.DayFilter(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.commons.DayFilter result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.type_ = type_;
      }
    }

    private void buildPartialOneofs(com.tcn.cloud.api.api.commons.DayFilter result) {
      result.filterCase_ = filterCase_;
      result.filter_ = this.filter_;
      if (filterCase_ == 2 &&
          dayOfWeekFilterBuilder_ != null) {
        result.filter_ = dayOfWeekFilterBuilder_.build();
      }
      if (filterCase_ == 3 &&
          dayOfMonthFilterBuilder_ != null) {
        result.filter_ = dayOfMonthFilterBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.commons.DayFilter) {
        return mergeFrom((com.tcn.cloud.api.api.commons.DayFilter)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.commons.DayFilter other) {
      if (other == com.tcn.cloud.api.api.commons.DayFilter.getDefaultInstance()) return this;
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      switch (other.getFilterCase()) {
        case DAY_OF_WEEK_FILTER: {
          mergeDayOfWeekFilter(other.getDayOfWeekFilter());
          break;
        }
        case DAY_OF_MONTH_FILTER: {
          mergeDayOfMonthFilter(other.getDayOfMonthFilter());
          break;
        }
        case FILTER_NOT_SET: {
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
              type_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getDayOfWeekFilterFieldBuilder().getBuilder(),
                  extensionRegistry);
              filterCase_ = 2;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getDayOfMonthFilterFieldBuilder().getBuilder(),
                  extensionRegistry);
              filterCase_ = 3;
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
    private int filterCase_ = 0;
    private java.lang.Object filter_;
    public FilterCase
        getFilterCase() {
      return FilterCase.forNumber(
          filterCase_);
    }

    public Builder clearFilter() {
      filterCase_ = 0;
      filter_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private int type_ = 0;
    /**
     * <pre>
     * type is the type of day filter.
     * </pre>
     *
     * <code>.api.commons.DayFilterType type = 1 [json_name = "type"];</code>
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override public int getTypeValue() {
      return type_;
    }
    /**
     * <pre>
     * type is the type of day filter.
     * </pre>
     *
     * <code>.api.commons.DayFilterType type = 1 [json_name = "type"];</code>
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * type is the type of day filter.
     * </pre>
     *
     * <code>.api.commons.DayFilterType type = 1 [json_name = "type"];</code>
     * @return The type.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.DayFilterType getType() {
      com.tcn.cloud.api.api.commons.DayFilterType result = com.tcn.cloud.api.api.commons.DayFilterType.forNumber(type_);
      return result == null ? com.tcn.cloud.api.api.commons.DayFilterType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * type is the type of day filter.
     * </pre>
     *
     * <code>.api.commons.DayFilterType type = 1 [json_name = "type"];</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(com.tcn.cloud.api.api.commons.DayFilterType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * type is the type of day filter.
     * </pre>
     *
     * <code>.api.commons.DayFilterType type = 1 [json_name = "type"];</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      type_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.DayOfWeekFilter, com.tcn.cloud.api.api.commons.DayOfWeekFilter.Builder, com.tcn.cloud.api.api.commons.DayOfWeekFilterOrBuilder> dayOfWeekFilterBuilder_;
    /**
     * <pre>
     * day_of_week_filter is the filter for days of the week.
     * </pre>
     *
     * <code>.api.commons.DayOfWeekFilter day_of_week_filter = 2 [json_name = "dayOfWeekFilter"];</code>
     * @return Whether the dayOfWeekFilter field is set.
     */
    @java.lang.Override
    public boolean hasDayOfWeekFilter() {
      return filterCase_ == 2;
    }
    /**
     * <pre>
     * day_of_week_filter is the filter for days of the week.
     * </pre>
     *
     * <code>.api.commons.DayOfWeekFilter day_of_week_filter = 2 [json_name = "dayOfWeekFilter"];</code>
     * @return The dayOfWeekFilter.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.DayOfWeekFilter getDayOfWeekFilter() {
      if (dayOfWeekFilterBuilder_ == null) {
        if (filterCase_ == 2) {
          return (com.tcn.cloud.api.api.commons.DayOfWeekFilter) filter_;
        }
        return com.tcn.cloud.api.api.commons.DayOfWeekFilter.getDefaultInstance();
      } else {
        if (filterCase_ == 2) {
          return dayOfWeekFilterBuilder_.getMessage();
        }
        return com.tcn.cloud.api.api.commons.DayOfWeekFilter.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * day_of_week_filter is the filter for days of the week.
     * </pre>
     *
     * <code>.api.commons.DayOfWeekFilter day_of_week_filter = 2 [json_name = "dayOfWeekFilter"];</code>
     */
    public Builder setDayOfWeekFilter(com.tcn.cloud.api.api.commons.DayOfWeekFilter value) {
      if (dayOfWeekFilterBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        filter_ = value;
        onChanged();
      } else {
        dayOfWeekFilterBuilder_.setMessage(value);
      }
      filterCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * day_of_week_filter is the filter for days of the week.
     * </pre>
     *
     * <code>.api.commons.DayOfWeekFilter day_of_week_filter = 2 [json_name = "dayOfWeekFilter"];</code>
     */
    public Builder setDayOfWeekFilter(
        com.tcn.cloud.api.api.commons.DayOfWeekFilter.Builder builderForValue) {
      if (dayOfWeekFilterBuilder_ == null) {
        filter_ = builderForValue.build();
        onChanged();
      } else {
        dayOfWeekFilterBuilder_.setMessage(builderForValue.build());
      }
      filterCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * day_of_week_filter is the filter for days of the week.
     * </pre>
     *
     * <code>.api.commons.DayOfWeekFilter day_of_week_filter = 2 [json_name = "dayOfWeekFilter"];</code>
     */
    public Builder mergeDayOfWeekFilter(com.tcn.cloud.api.api.commons.DayOfWeekFilter value) {
      if (dayOfWeekFilterBuilder_ == null) {
        if (filterCase_ == 2 &&
            filter_ != com.tcn.cloud.api.api.commons.DayOfWeekFilter.getDefaultInstance()) {
          filter_ = com.tcn.cloud.api.api.commons.DayOfWeekFilter.newBuilder((com.tcn.cloud.api.api.commons.DayOfWeekFilter) filter_)
              .mergeFrom(value).buildPartial();
        } else {
          filter_ = value;
        }
        onChanged();
      } else {
        if (filterCase_ == 2) {
          dayOfWeekFilterBuilder_.mergeFrom(value);
        } else {
          dayOfWeekFilterBuilder_.setMessage(value);
        }
      }
      filterCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * day_of_week_filter is the filter for days of the week.
     * </pre>
     *
     * <code>.api.commons.DayOfWeekFilter day_of_week_filter = 2 [json_name = "dayOfWeekFilter"];</code>
     */
    public Builder clearDayOfWeekFilter() {
      if (dayOfWeekFilterBuilder_ == null) {
        if (filterCase_ == 2) {
          filterCase_ = 0;
          filter_ = null;
          onChanged();
        }
      } else {
        if (filterCase_ == 2) {
          filterCase_ = 0;
          filter_ = null;
        }
        dayOfWeekFilterBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * day_of_week_filter is the filter for days of the week.
     * </pre>
     *
     * <code>.api.commons.DayOfWeekFilter day_of_week_filter = 2 [json_name = "dayOfWeekFilter"];</code>
     */
    public com.tcn.cloud.api.api.commons.DayOfWeekFilter.Builder getDayOfWeekFilterBuilder() {
      return getDayOfWeekFilterFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * day_of_week_filter is the filter for days of the week.
     * </pre>
     *
     * <code>.api.commons.DayOfWeekFilter day_of_week_filter = 2 [json_name = "dayOfWeekFilter"];</code>
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.DayOfWeekFilterOrBuilder getDayOfWeekFilterOrBuilder() {
      if ((filterCase_ == 2) && (dayOfWeekFilterBuilder_ != null)) {
        return dayOfWeekFilterBuilder_.getMessageOrBuilder();
      } else {
        if (filterCase_ == 2) {
          return (com.tcn.cloud.api.api.commons.DayOfWeekFilter) filter_;
        }
        return com.tcn.cloud.api.api.commons.DayOfWeekFilter.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * day_of_week_filter is the filter for days of the week.
     * </pre>
     *
     * <code>.api.commons.DayOfWeekFilter day_of_week_filter = 2 [json_name = "dayOfWeekFilter"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.DayOfWeekFilter, com.tcn.cloud.api.api.commons.DayOfWeekFilter.Builder, com.tcn.cloud.api.api.commons.DayOfWeekFilterOrBuilder> 
        getDayOfWeekFilterFieldBuilder() {
      if (dayOfWeekFilterBuilder_ == null) {
        if (!(filterCase_ == 2)) {
          filter_ = com.tcn.cloud.api.api.commons.DayOfWeekFilter.getDefaultInstance();
        }
        dayOfWeekFilterBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.commons.DayOfWeekFilter, com.tcn.cloud.api.api.commons.DayOfWeekFilter.Builder, com.tcn.cloud.api.api.commons.DayOfWeekFilterOrBuilder>(
                (com.tcn.cloud.api.api.commons.DayOfWeekFilter) filter_,
                getParentForChildren(),
                isClean());
        filter_ = null;
      }
      filterCase_ = 2;
      onChanged();
      return dayOfWeekFilterBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.DayOfMonthFilter, com.tcn.cloud.api.api.commons.DayOfMonthFilter.Builder, com.tcn.cloud.api.api.commons.DayOfMonthFilterOrBuilder> dayOfMonthFilterBuilder_;
    /**
     * <pre>
     * day_of_month_filter is the filter for days of the month.
     * </pre>
     *
     * <code>.api.commons.DayOfMonthFilter day_of_month_filter = 3 [json_name = "dayOfMonthFilter"];</code>
     * @return Whether the dayOfMonthFilter field is set.
     */
    @java.lang.Override
    public boolean hasDayOfMonthFilter() {
      return filterCase_ == 3;
    }
    /**
     * <pre>
     * day_of_month_filter is the filter for days of the month.
     * </pre>
     *
     * <code>.api.commons.DayOfMonthFilter day_of_month_filter = 3 [json_name = "dayOfMonthFilter"];</code>
     * @return The dayOfMonthFilter.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.DayOfMonthFilter getDayOfMonthFilter() {
      if (dayOfMonthFilterBuilder_ == null) {
        if (filterCase_ == 3) {
          return (com.tcn.cloud.api.api.commons.DayOfMonthFilter) filter_;
        }
        return com.tcn.cloud.api.api.commons.DayOfMonthFilter.getDefaultInstance();
      } else {
        if (filterCase_ == 3) {
          return dayOfMonthFilterBuilder_.getMessage();
        }
        return com.tcn.cloud.api.api.commons.DayOfMonthFilter.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * day_of_month_filter is the filter for days of the month.
     * </pre>
     *
     * <code>.api.commons.DayOfMonthFilter day_of_month_filter = 3 [json_name = "dayOfMonthFilter"];</code>
     */
    public Builder setDayOfMonthFilter(com.tcn.cloud.api.api.commons.DayOfMonthFilter value) {
      if (dayOfMonthFilterBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        filter_ = value;
        onChanged();
      } else {
        dayOfMonthFilterBuilder_.setMessage(value);
      }
      filterCase_ = 3;
      return this;
    }
    /**
     * <pre>
     * day_of_month_filter is the filter for days of the month.
     * </pre>
     *
     * <code>.api.commons.DayOfMonthFilter day_of_month_filter = 3 [json_name = "dayOfMonthFilter"];</code>
     */
    public Builder setDayOfMonthFilter(
        com.tcn.cloud.api.api.commons.DayOfMonthFilter.Builder builderForValue) {
      if (dayOfMonthFilterBuilder_ == null) {
        filter_ = builderForValue.build();
        onChanged();
      } else {
        dayOfMonthFilterBuilder_.setMessage(builderForValue.build());
      }
      filterCase_ = 3;
      return this;
    }
    /**
     * <pre>
     * day_of_month_filter is the filter for days of the month.
     * </pre>
     *
     * <code>.api.commons.DayOfMonthFilter day_of_month_filter = 3 [json_name = "dayOfMonthFilter"];</code>
     */
    public Builder mergeDayOfMonthFilter(com.tcn.cloud.api.api.commons.DayOfMonthFilter value) {
      if (dayOfMonthFilterBuilder_ == null) {
        if (filterCase_ == 3 &&
            filter_ != com.tcn.cloud.api.api.commons.DayOfMonthFilter.getDefaultInstance()) {
          filter_ = com.tcn.cloud.api.api.commons.DayOfMonthFilter.newBuilder((com.tcn.cloud.api.api.commons.DayOfMonthFilter) filter_)
              .mergeFrom(value).buildPartial();
        } else {
          filter_ = value;
        }
        onChanged();
      } else {
        if (filterCase_ == 3) {
          dayOfMonthFilterBuilder_.mergeFrom(value);
        } else {
          dayOfMonthFilterBuilder_.setMessage(value);
        }
      }
      filterCase_ = 3;
      return this;
    }
    /**
     * <pre>
     * day_of_month_filter is the filter for days of the month.
     * </pre>
     *
     * <code>.api.commons.DayOfMonthFilter day_of_month_filter = 3 [json_name = "dayOfMonthFilter"];</code>
     */
    public Builder clearDayOfMonthFilter() {
      if (dayOfMonthFilterBuilder_ == null) {
        if (filterCase_ == 3) {
          filterCase_ = 0;
          filter_ = null;
          onChanged();
        }
      } else {
        if (filterCase_ == 3) {
          filterCase_ = 0;
          filter_ = null;
        }
        dayOfMonthFilterBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * day_of_month_filter is the filter for days of the month.
     * </pre>
     *
     * <code>.api.commons.DayOfMonthFilter day_of_month_filter = 3 [json_name = "dayOfMonthFilter"];</code>
     */
    public com.tcn.cloud.api.api.commons.DayOfMonthFilter.Builder getDayOfMonthFilterBuilder() {
      return getDayOfMonthFilterFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * day_of_month_filter is the filter for days of the month.
     * </pre>
     *
     * <code>.api.commons.DayOfMonthFilter day_of_month_filter = 3 [json_name = "dayOfMonthFilter"];</code>
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.DayOfMonthFilterOrBuilder getDayOfMonthFilterOrBuilder() {
      if ((filterCase_ == 3) && (dayOfMonthFilterBuilder_ != null)) {
        return dayOfMonthFilterBuilder_.getMessageOrBuilder();
      } else {
        if (filterCase_ == 3) {
          return (com.tcn.cloud.api.api.commons.DayOfMonthFilter) filter_;
        }
        return com.tcn.cloud.api.api.commons.DayOfMonthFilter.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * day_of_month_filter is the filter for days of the month.
     * </pre>
     *
     * <code>.api.commons.DayOfMonthFilter day_of_month_filter = 3 [json_name = "dayOfMonthFilter"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.DayOfMonthFilter, com.tcn.cloud.api.api.commons.DayOfMonthFilter.Builder, com.tcn.cloud.api.api.commons.DayOfMonthFilterOrBuilder> 
        getDayOfMonthFilterFieldBuilder() {
      if (dayOfMonthFilterBuilder_ == null) {
        if (!(filterCase_ == 3)) {
          filter_ = com.tcn.cloud.api.api.commons.DayOfMonthFilter.getDefaultInstance();
        }
        dayOfMonthFilterBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.commons.DayOfMonthFilter, com.tcn.cloud.api.api.commons.DayOfMonthFilter.Builder, com.tcn.cloud.api.api.commons.DayOfMonthFilterOrBuilder>(
                (com.tcn.cloud.api.api.commons.DayOfMonthFilter) filter_,
                getParentForChildren(),
                isClean());
        filter_ = null;
      }
      filterCase_ = 3;
      onChanged();
      return dayOfMonthFilterBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.commons.DayFilter)
  }

  // @@protoc_insertion_point(class_scope:api.commons.DayFilter)
  private static final com.tcn.cloud.api.api.commons.DayFilter DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.commons.DayFilter();
  }

  public static com.tcn.cloud.api.api.commons.DayFilter getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DayFilter>
      PARSER = new com.google.protobuf.AbstractParser<DayFilter>() {
    @java.lang.Override
    public DayFilter parsePartialFrom(
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

  public static com.google.protobuf.Parser<DayFilter> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DayFilter> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.commons.DayFilter getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
