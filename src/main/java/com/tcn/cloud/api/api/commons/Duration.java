// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/tickets.proto

package com.tcn.cloud.api.api.commons;

/**
 * Protobuf type {@code api.commons.Duration}
 */
public final class Duration extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.commons.Duration)
    DurationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Duration.newBuilder() to construct.
  private Duration(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Duration() {
    scale_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Duration();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.commons.TicketsProto.internal_static_api_commons_Duration_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.commons.TicketsProto.internal_static_api_commons_Duration_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.commons.Duration.class, com.tcn.cloud.api.api.commons.Duration.Builder.class);
  }

  public static final int VALUE_FIELD_NUMBER = 1;
  private long value_ = 0L;
  /**
   * <pre>
   * Value of of the Scale
   * </pre>
   *
   * <code>int64 value = 1 [json_name = "value", jstype = JS_STRING];</code>
   * @return The value.
   */
  @java.lang.Override
  public long getValue() {
    return value_;
  }

  public static final int SCALE_FIELD_NUMBER = 2;
  private int scale_ = 0;
  /**
   * <pre>
   * Scale - In minutes,hour,day,week,month,year
   * </pre>
   *
   * <code>.api.commons.TimeScale scale = 2 [json_name = "scale"];</code>
   * @return The enum numeric value on the wire for scale.
   */
  @java.lang.Override public int getScaleValue() {
    return scale_;
  }
  /**
   * <pre>
   * Scale - In minutes,hour,day,week,month,year
   * </pre>
   *
   * <code>.api.commons.TimeScale scale = 2 [json_name = "scale"];</code>
   * @return The scale.
   */
  @java.lang.Override public com.tcn.cloud.api.api.commons.TimeScale getScale() {
    com.tcn.cloud.api.api.commons.TimeScale result = com.tcn.cloud.api.api.commons.TimeScale.forNumber(scale_);
    return result == null ? com.tcn.cloud.api.api.commons.TimeScale.UNRECOGNIZED : result;
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
    if (value_ != 0L) {
      output.writeInt64(1, value_);
    }
    if (scale_ != com.tcn.cloud.api.api.commons.TimeScale.TIME_SCALE_MINUTE.getNumber()) {
      output.writeEnum(2, scale_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (value_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, value_);
    }
    if (scale_ != com.tcn.cloud.api.api.commons.TimeScale.TIME_SCALE_MINUTE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, scale_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.commons.Duration)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.commons.Duration other = (com.tcn.cloud.api.api.commons.Duration) obj;

    if (getValue()
        != other.getValue()) return false;
    if (scale_ != other.scale_) return false;
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
    hash = (37 * hash) + VALUE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getValue());
    hash = (37 * hash) + SCALE_FIELD_NUMBER;
    hash = (53 * hash) + scale_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.commons.Duration parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.Duration parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.Duration parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.Duration parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.Duration parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.Duration parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.Duration parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.Duration parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.commons.Duration parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.commons.Duration parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.Duration parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.Duration parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.commons.Duration prototype) {
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
   * Protobuf type {@code api.commons.Duration}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.commons.Duration)
      com.tcn.cloud.api.api.commons.DurationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.TicketsProto.internal_static_api_commons_Duration_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.commons.TicketsProto.internal_static_api_commons_Duration_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.commons.Duration.class, com.tcn.cloud.api.api.commons.Duration.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.commons.Duration.newBuilder()
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
      value_ = 0L;
      scale_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.commons.TicketsProto.internal_static_api_commons_Duration_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.Duration getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.commons.Duration.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.Duration build() {
      com.tcn.cloud.api.api.commons.Duration result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.Duration buildPartial() {
      com.tcn.cloud.api.api.commons.Duration result = new com.tcn.cloud.api.api.commons.Duration(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.commons.Duration result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.value_ = value_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.scale_ = scale_;
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
      if (other instanceof com.tcn.cloud.api.api.commons.Duration) {
        return mergeFrom((com.tcn.cloud.api.api.commons.Duration)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.commons.Duration other) {
      if (other == com.tcn.cloud.api.api.commons.Duration.getDefaultInstance()) return this;
      if (other.getValue() != 0L) {
        setValue(other.getValue());
      }
      if (other.scale_ != 0) {
        setScaleValue(other.getScaleValue());
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
              value_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              scale_ = input.readEnum();
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

    private long value_ ;
    /**
     * <pre>
     * Value of of the Scale
     * </pre>
     *
     * <code>int64 value = 1 [json_name = "value", jstype = JS_STRING];</code>
     * @return The value.
     */
    @java.lang.Override
    public long getValue() {
      return value_;
    }
    /**
     * <pre>
     * Value of of the Scale
     * </pre>
     *
     * <code>int64 value = 1 [json_name = "value", jstype = JS_STRING];</code>
     * @param value The value to set.
     * @return This builder for chaining.
     */
    public Builder setValue(long value) {

      value_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Value of of the Scale
     * </pre>
     *
     * <code>int64 value = 1 [json_name = "value", jstype = JS_STRING];</code>
     * @return This builder for chaining.
     */
    public Builder clearValue() {
      bitField0_ = (bitField0_ & ~0x00000001);
      value_ = 0L;
      onChanged();
      return this;
    }

    private int scale_ = 0;
    /**
     * <pre>
     * Scale - In minutes,hour,day,week,month,year
     * </pre>
     *
     * <code>.api.commons.TimeScale scale = 2 [json_name = "scale"];</code>
     * @return The enum numeric value on the wire for scale.
     */
    @java.lang.Override public int getScaleValue() {
      return scale_;
    }
    /**
     * <pre>
     * Scale - In minutes,hour,day,week,month,year
     * </pre>
     *
     * <code>.api.commons.TimeScale scale = 2 [json_name = "scale"];</code>
     * @param value The enum numeric value on the wire for scale to set.
     * @return This builder for chaining.
     */
    public Builder setScaleValue(int value) {
      scale_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Scale - In minutes,hour,day,week,month,year
     * </pre>
     *
     * <code>.api.commons.TimeScale scale = 2 [json_name = "scale"];</code>
     * @return The scale.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.TimeScale getScale() {
      com.tcn.cloud.api.api.commons.TimeScale result = com.tcn.cloud.api.api.commons.TimeScale.forNumber(scale_);
      return result == null ? com.tcn.cloud.api.api.commons.TimeScale.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Scale - In minutes,hour,day,week,month,year
     * </pre>
     *
     * <code>.api.commons.TimeScale scale = 2 [json_name = "scale"];</code>
     * @param value The scale to set.
     * @return This builder for chaining.
     */
    public Builder setScale(com.tcn.cloud.api.api.commons.TimeScale value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      scale_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Scale - In minutes,hour,day,week,month,year
     * </pre>
     *
     * <code>.api.commons.TimeScale scale = 2 [json_name = "scale"];</code>
     * @return This builder for chaining.
     */
    public Builder clearScale() {
      bitField0_ = (bitField0_ & ~0x00000002);
      scale_ = 0;
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


    // @@protoc_insertion_point(builder_scope:api.commons.Duration)
  }

  // @@protoc_insertion_point(class_scope:api.commons.Duration)
  private static final com.tcn.cloud.api.api.commons.Duration DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.commons.Duration();
  }

  public static com.tcn.cloud.api.api.commons.Duration getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Duration>
      PARSER = new com.google.protobuf.AbstractParser<Duration>() {
    @java.lang.Override
    public Duration parsePartialFrom(
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

  public static com.google.protobuf.Parser<Duration> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Duration> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.commons.Duration getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

