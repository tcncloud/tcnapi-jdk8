// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/lms.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * <pre>
 * a specific time of day. 24 hour format. 12:00:00AM = 0,0,0
 * </pre>
 *
 * Protobuf type {@code api.v0alpha.TimeOfDay}
 */
public final class TimeOfDay extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.TimeOfDay)
    TimeOfDayOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TimeOfDay.newBuilder() to construct.
  private TimeOfDay(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TimeOfDay() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TimeOfDay();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_TimeOfDay_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_TimeOfDay_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.TimeOfDay.class, com.tcn.cloud.api.api.v0alpha.TimeOfDay.Builder.class);
  }

  public static final int HOUR_FIELD_NUMBER = 3;
  private int hour_ = 0;
  /**
   * <code>int32 hour = 3 [json_name = "hour"];</code>
   * @return The hour.
   */
  @java.lang.Override
  public int getHour() {
    return hour_;
  }

  public static final int MINUTE_FIELD_NUMBER = 4;
  private int minute_ = 0;
  /**
   * <code>int32 minute = 4 [json_name = "minute"];</code>
   * @return The minute.
   */
  @java.lang.Override
  public int getMinute() {
    return minute_;
  }

  public static final int SECOND_FIELD_NUMBER = 5;
  private int second_ = 0;
  /**
   * <code>int32 second = 5 [json_name = "second"];</code>
   * @return The second.
   */
  @java.lang.Override
  public int getSecond() {
    return second_;
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
    if (hour_ != 0) {
      output.writeInt32(3, hour_);
    }
    if (minute_ != 0) {
      output.writeInt32(4, minute_);
    }
    if (second_ != 0) {
      output.writeInt32(5, second_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (hour_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, hour_);
    }
    if (minute_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, minute_);
    }
    if (second_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, second_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.TimeOfDay)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.TimeOfDay other = (com.tcn.cloud.api.api.v0alpha.TimeOfDay) obj;

    if (getHour()
        != other.getHour()) return false;
    if (getMinute()
        != other.getMinute()) return false;
    if (getSecond()
        != other.getSecond()) return false;
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
    hash = (37 * hash) + HOUR_FIELD_NUMBER;
    hash = (53 * hash) + getHour();
    hash = (37 * hash) + MINUTE_FIELD_NUMBER;
    hash = (53 * hash) + getMinute();
    hash = (37 * hash) + SECOND_FIELD_NUMBER;
    hash = (53 * hash) + getSecond();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.TimeOfDay parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.TimeOfDay parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.TimeOfDay parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.TimeOfDay parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.TimeOfDay parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.TimeOfDay parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.TimeOfDay parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.TimeOfDay parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.TimeOfDay parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.TimeOfDay parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.TimeOfDay parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.TimeOfDay parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.TimeOfDay prototype) {
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
   * a specific time of day. 24 hour format. 12:00:00AM = 0,0,0
   * </pre>
   *
   * Protobuf type {@code api.v0alpha.TimeOfDay}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.TimeOfDay)
      com.tcn.cloud.api.api.v0alpha.TimeOfDayOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_TimeOfDay_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_TimeOfDay_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.TimeOfDay.class, com.tcn.cloud.api.api.v0alpha.TimeOfDay.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.TimeOfDay.newBuilder()
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
      hour_ = 0;
      minute_ = 0;
      second_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_TimeOfDay_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.TimeOfDay getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.TimeOfDay.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.TimeOfDay build() {
      com.tcn.cloud.api.api.v0alpha.TimeOfDay result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.TimeOfDay buildPartial() {
      com.tcn.cloud.api.api.v0alpha.TimeOfDay result = new com.tcn.cloud.api.api.v0alpha.TimeOfDay(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.TimeOfDay result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.hour_ = hour_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.minute_ = minute_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.second_ = second_;
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.TimeOfDay) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.TimeOfDay)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.TimeOfDay other) {
      if (other == com.tcn.cloud.api.api.v0alpha.TimeOfDay.getDefaultInstance()) return this;
      if (other.getHour() != 0) {
        setHour(other.getHour());
      }
      if (other.getMinute() != 0) {
        setMinute(other.getMinute());
      }
      if (other.getSecond() != 0) {
        setSecond(other.getSecond());
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
              hour_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 24
            case 32: {
              minute_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 32
            case 40: {
              second_ = input.readInt32();
              bitField0_ |= 0x00000004;
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

    private int hour_ ;
    /**
     * <code>int32 hour = 3 [json_name = "hour"];</code>
     * @return The hour.
     */
    @java.lang.Override
    public int getHour() {
      return hour_;
    }
    /**
     * <code>int32 hour = 3 [json_name = "hour"];</code>
     * @param value The hour to set.
     * @return This builder for chaining.
     */
    public Builder setHour(int value) {

      hour_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int32 hour = 3 [json_name = "hour"];</code>
     * @return This builder for chaining.
     */
    public Builder clearHour() {
      bitField0_ = (bitField0_ & ~0x00000001);
      hour_ = 0;
      onChanged();
      return this;
    }

    private int minute_ ;
    /**
     * <code>int32 minute = 4 [json_name = "minute"];</code>
     * @return The minute.
     */
    @java.lang.Override
    public int getMinute() {
      return minute_;
    }
    /**
     * <code>int32 minute = 4 [json_name = "minute"];</code>
     * @param value The minute to set.
     * @return This builder for chaining.
     */
    public Builder setMinute(int value) {

      minute_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>int32 minute = 4 [json_name = "minute"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMinute() {
      bitField0_ = (bitField0_ & ~0x00000002);
      minute_ = 0;
      onChanged();
      return this;
    }

    private int second_ ;
    /**
     * <code>int32 second = 5 [json_name = "second"];</code>
     * @return The second.
     */
    @java.lang.Override
    public int getSecond() {
      return second_;
    }
    /**
     * <code>int32 second = 5 [json_name = "second"];</code>
     * @param value The second to set.
     * @return This builder for chaining.
     */
    public Builder setSecond(int value) {

      second_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>int32 second = 5 [json_name = "second"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSecond() {
      bitField0_ = (bitField0_ & ~0x00000004);
      second_ = 0;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.TimeOfDay)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.TimeOfDay)
  private static final com.tcn.cloud.api.api.v0alpha.TimeOfDay DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.TimeOfDay();
  }

  public static com.tcn.cloud.api.api.v0alpha.TimeOfDay getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TimeOfDay>
      PARSER = new com.google.protobuf.AbstractParser<TimeOfDay>() {
    @java.lang.Override
    public TimeOfDay parsePartialFrom(
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

  public static com.google.protobuf.Parser<TimeOfDay> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TimeOfDay> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.TimeOfDay getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

