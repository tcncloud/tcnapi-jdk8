// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/bireportgenerator.proto

package com.tcn.cloud.api.api.commons;

/**
 * <pre>
 * DayOfMonthFilter filters the days of the month for a report.
 * </pre>
 *
 * Protobuf type {@code api.commons.DayOfMonthFilter}
 */
@java.lang.Deprecated public final class DayOfMonthFilter extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.commons.DayOfMonthFilter)
    DayOfMonthFilterOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DayOfMonthFilter.newBuilder() to construct.
  private DayOfMonthFilter(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DayOfMonthFilter() {
    dayOfMonths_ = emptyIntList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DayOfMonthFilter();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.commons.BireportgeneratorProto.internal_static_api_commons_DayOfMonthFilter_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.commons.BireportgeneratorProto.internal_static_api_commons_DayOfMonthFilter_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.commons.DayOfMonthFilter.class, com.tcn.cloud.api.api.commons.DayOfMonthFilter.Builder.class);
  }

  public static final int DAY_OF_MONTHS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.IntList dayOfMonths_;
  /**
   * <pre>
   * day_of_months is a list of days of the month.
   * </pre>
   *
   * <code>repeated int32 day_of_months = 1 [json_name = "dayOfMonths"];</code>
   * @return A list containing the dayOfMonths.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
      getDayOfMonthsList() {
    return dayOfMonths_;
  }
  /**
   * <pre>
   * day_of_months is a list of days of the month.
   * </pre>
   *
   * <code>repeated int32 day_of_months = 1 [json_name = "dayOfMonths"];</code>
   * @return The count of dayOfMonths.
   */
  public int getDayOfMonthsCount() {
    return dayOfMonths_.size();
  }
  /**
   * <pre>
   * day_of_months is a list of days of the month.
   * </pre>
   *
   * <code>repeated int32 day_of_months = 1 [json_name = "dayOfMonths"];</code>
   * @param index The index of the element to return.
   * @return The dayOfMonths at the given index.
   */
  public int getDayOfMonths(int index) {
    return dayOfMonths_.getInt(index);
  }
  private int dayOfMonthsMemoizedSerializedSize = -1;

  public static final int IS_LAST_DAY_OF_MONTH_FIELD_NUMBER = 2;
  private boolean isLastDayOfMonth_ = false;
  /**
   * <pre>
   * is_last_day_of_month is a flag for the last day of the month.
   * </pre>
   *
   * <code>bool is_last_day_of_month = 2 [json_name = "isLastDayOfMonth"];</code>
   * @return The isLastDayOfMonth.
   */
  @java.lang.Override
  public boolean getIsLastDayOfMonth() {
    return isLastDayOfMonth_;
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
    getSerializedSize();
    if (getDayOfMonthsList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(dayOfMonthsMemoizedSerializedSize);
    }
    for (int i = 0; i < dayOfMonths_.size(); i++) {
      output.writeInt32NoTag(dayOfMonths_.getInt(i));
    }
    if (isLastDayOfMonth_ != false) {
      output.writeBool(2, isLastDayOfMonth_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < dayOfMonths_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(dayOfMonths_.getInt(i));
      }
      size += dataSize;
      if (!getDayOfMonthsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      dayOfMonthsMemoizedSerializedSize = dataSize;
    }
    if (isLastDayOfMonth_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, isLastDayOfMonth_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.commons.DayOfMonthFilter)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.commons.DayOfMonthFilter other = (com.tcn.cloud.api.api.commons.DayOfMonthFilter) obj;

    if (!getDayOfMonthsList()
        .equals(other.getDayOfMonthsList())) return false;
    if (getIsLastDayOfMonth()
        != other.getIsLastDayOfMonth()) return false;
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
    if (getDayOfMonthsCount() > 0) {
      hash = (37 * hash) + DAY_OF_MONTHS_FIELD_NUMBER;
      hash = (53 * hash) + getDayOfMonthsList().hashCode();
    }
    hash = (37 * hash) + IS_LAST_DAY_OF_MONTH_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsLastDayOfMonth());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.commons.DayOfMonthFilter parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.DayOfMonthFilter parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.DayOfMonthFilter parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.DayOfMonthFilter parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.DayOfMonthFilter parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.DayOfMonthFilter parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.DayOfMonthFilter parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.DayOfMonthFilter parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.commons.DayOfMonthFilter parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.commons.DayOfMonthFilter parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.DayOfMonthFilter parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.DayOfMonthFilter parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.commons.DayOfMonthFilter prototype) {
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
   * DayOfMonthFilter filters the days of the month for a report.
   * </pre>
   *
   * Protobuf type {@code api.commons.DayOfMonthFilter}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.commons.DayOfMonthFilter)
      com.tcn.cloud.api.api.commons.DayOfMonthFilterOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.BireportgeneratorProto.internal_static_api_commons_DayOfMonthFilter_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.commons.BireportgeneratorProto.internal_static_api_commons_DayOfMonthFilter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.commons.DayOfMonthFilter.class, com.tcn.cloud.api.api.commons.DayOfMonthFilter.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.commons.DayOfMonthFilter.newBuilder()
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
      dayOfMonths_ = emptyIntList();
      isLastDayOfMonth_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.commons.BireportgeneratorProto.internal_static_api_commons_DayOfMonthFilter_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.DayOfMonthFilter getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.commons.DayOfMonthFilter.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.DayOfMonthFilter build() {
      com.tcn.cloud.api.api.commons.DayOfMonthFilter result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.DayOfMonthFilter buildPartial() {
      com.tcn.cloud.api.api.commons.DayOfMonthFilter result = new com.tcn.cloud.api.api.commons.DayOfMonthFilter(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.commons.DayOfMonthFilter result) {
      if (((bitField0_ & 0x00000001) != 0)) {
        dayOfMonths_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.dayOfMonths_ = dayOfMonths_;
    }

    private void buildPartial0(com.tcn.cloud.api.api.commons.DayOfMonthFilter result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.isLastDayOfMonth_ = isLastDayOfMonth_;
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
      if (other instanceof com.tcn.cloud.api.api.commons.DayOfMonthFilter) {
        return mergeFrom((com.tcn.cloud.api.api.commons.DayOfMonthFilter)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.commons.DayOfMonthFilter other) {
      if (other == com.tcn.cloud.api.api.commons.DayOfMonthFilter.getDefaultInstance()) return this;
      if (!other.dayOfMonths_.isEmpty()) {
        if (dayOfMonths_.isEmpty()) {
          dayOfMonths_ = other.dayOfMonths_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureDayOfMonthsIsMutable();
          dayOfMonths_.addAll(other.dayOfMonths_);
        }
        onChanged();
      }
      if (other.getIsLastDayOfMonth() != false) {
        setIsLastDayOfMonth(other.getIsLastDayOfMonth());
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
              int v = input.readInt32();
              ensureDayOfMonthsIsMutable();
              dayOfMonths_.addInt(v);
              break;
            } // case 8
            case 10: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              ensureDayOfMonthsIsMutable();
              while (input.getBytesUntilLimit() > 0) {
                dayOfMonths_.addInt(input.readInt32());
              }
              input.popLimit(limit);
              break;
            } // case 10
            case 16: {
              isLastDayOfMonth_ = input.readBool();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private com.google.protobuf.Internal.IntList dayOfMonths_ = emptyIntList();
    private void ensureDayOfMonthsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        dayOfMonths_ = mutableCopy(dayOfMonths_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <pre>
     * day_of_months is a list of days of the month.
     * </pre>
     *
     * <code>repeated int32 day_of_months = 1 [json_name = "dayOfMonths"];</code>
     * @return A list containing the dayOfMonths.
     */
    public java.util.List<java.lang.Integer>
        getDayOfMonthsList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(dayOfMonths_) : dayOfMonths_;
    }
    /**
     * <pre>
     * day_of_months is a list of days of the month.
     * </pre>
     *
     * <code>repeated int32 day_of_months = 1 [json_name = "dayOfMonths"];</code>
     * @return The count of dayOfMonths.
     */
    public int getDayOfMonthsCount() {
      return dayOfMonths_.size();
    }
    /**
     * <pre>
     * day_of_months is a list of days of the month.
     * </pre>
     *
     * <code>repeated int32 day_of_months = 1 [json_name = "dayOfMonths"];</code>
     * @param index The index of the element to return.
     * @return The dayOfMonths at the given index.
     */
    public int getDayOfMonths(int index) {
      return dayOfMonths_.getInt(index);
    }
    /**
     * <pre>
     * day_of_months is a list of days of the month.
     * </pre>
     *
     * <code>repeated int32 day_of_months = 1 [json_name = "dayOfMonths"];</code>
     * @param index The index to set the value at.
     * @param value The dayOfMonths to set.
     * @return This builder for chaining.
     */
    public Builder setDayOfMonths(
        int index, int value) {

      ensureDayOfMonthsIsMutable();
      dayOfMonths_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * day_of_months is a list of days of the month.
     * </pre>
     *
     * <code>repeated int32 day_of_months = 1 [json_name = "dayOfMonths"];</code>
     * @param value The dayOfMonths to add.
     * @return This builder for chaining.
     */
    public Builder addDayOfMonths(int value) {

      ensureDayOfMonthsIsMutable();
      dayOfMonths_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * day_of_months is a list of days of the month.
     * </pre>
     *
     * <code>repeated int32 day_of_months = 1 [json_name = "dayOfMonths"];</code>
     * @param values The dayOfMonths to add.
     * @return This builder for chaining.
     */
    public Builder addAllDayOfMonths(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureDayOfMonthsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, dayOfMonths_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * day_of_months is a list of days of the month.
     * </pre>
     *
     * <code>repeated int32 day_of_months = 1 [json_name = "dayOfMonths"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDayOfMonths() {
      dayOfMonths_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private boolean isLastDayOfMonth_ ;
    /**
     * <pre>
     * is_last_day_of_month is a flag for the last day of the month.
     * </pre>
     *
     * <code>bool is_last_day_of_month = 2 [json_name = "isLastDayOfMonth"];</code>
     * @return The isLastDayOfMonth.
     */
    @java.lang.Override
    public boolean getIsLastDayOfMonth() {
      return isLastDayOfMonth_;
    }
    /**
     * <pre>
     * is_last_day_of_month is a flag for the last day of the month.
     * </pre>
     *
     * <code>bool is_last_day_of_month = 2 [json_name = "isLastDayOfMonth"];</code>
     * @param value The isLastDayOfMonth to set.
     * @return This builder for chaining.
     */
    public Builder setIsLastDayOfMonth(boolean value) {

      isLastDayOfMonth_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * is_last_day_of_month is a flag for the last day of the month.
     * </pre>
     *
     * <code>bool is_last_day_of_month = 2 [json_name = "isLastDayOfMonth"];</code>
     * @return This builder for chaining.
     */
    public Builder clearIsLastDayOfMonth() {
      bitField0_ = (bitField0_ & ~0x00000002);
      isLastDayOfMonth_ = false;
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


    // @@protoc_insertion_point(builder_scope:api.commons.DayOfMonthFilter)
  }

  // @@protoc_insertion_point(class_scope:api.commons.DayOfMonthFilter)
  private static final com.tcn.cloud.api.api.commons.DayOfMonthFilter DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.commons.DayOfMonthFilter();
  }

  public static com.tcn.cloud.api.api.commons.DayOfMonthFilter getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DayOfMonthFilter>
      PARSER = new com.google.protobuf.AbstractParser<DayOfMonthFilter>() {
    @java.lang.Override
    public DayOfMonthFilter parsePartialFrom(
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

  public static com.google.protobuf.Parser<DayOfMonthFilter> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DayOfMonthFilter> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.commons.DayOfMonthFilter getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

