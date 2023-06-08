// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/org/preferences.proto

package com.tcn.cloud.api.api.commons.org;

/**
 * <pre>
 * Broadcast start/stop time properties.
 * </pre>
 *
 * Protobuf type {@code api.commons.org.BroadcastTime}
 */
public final class BroadcastTime extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.commons.org.BroadcastTime)
    BroadcastTimeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BroadcastTime.newBuilder() to construct.
  private BroadcastTime(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BroadcastTime() {
    timezone_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BroadcastTime();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.commons.org.PreferencesProto.internal_static_api_commons_org_BroadcastTime_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.commons.org.PreferencesProto.internal_static_api_commons_org_BroadcastTime_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.commons.org.BroadcastTime.class, com.tcn.cloud.api.api.commons.org.BroadcastTime.Builder.class);
  }

  public static final int HOURS_FIELD_NUMBER = 1;
  private int hours_ = 0;
  /**
   * <pre>
   * Hour of the day (0-23).
   * </pre>
   *
   * <code>int32 hours = 1 [json_name = "hours"];</code>
   * @return The hours.
   */
  @java.lang.Override
  public int getHours() {
    return hours_;
  }

  public static final int MINUTES_FIELD_NUMBER = 2;
  private int minutes_ = 0;
  /**
   * <pre>
   * Minute of the hour (0-59).
   * </pre>
   *
   * <code>int32 minutes = 2 [json_name = "minutes"];</code>
   * @return The minutes.
   */
  @java.lang.Override
  public int getMinutes() {
    return minutes_;
  }

  public static final int TIMEZONE_FIELD_NUMBER = 3;
  private int timezone_ = 0;
  /**
   * <pre>
   * Time zone.
   * </pre>
   *
   * <code>.api.commons.TimeZone timezone = 3 [json_name = "timezone"];</code>
   * @return The enum numeric value on the wire for timezone.
   */
  @java.lang.Override public int getTimezoneValue() {
    return timezone_;
  }
  /**
   * <pre>
   * Time zone.
   * </pre>
   *
   * <code>.api.commons.TimeZone timezone = 3 [json_name = "timezone"];</code>
   * @return The timezone.
   */
  @java.lang.Override public com.tcn.cloud.api.api.commons.TimeZone getTimezone() {
    com.tcn.cloud.api.api.commons.TimeZone result = com.tcn.cloud.api.api.commons.TimeZone.forNumber(timezone_);
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
    if (hours_ != 0) {
      output.writeInt32(1, hours_);
    }
    if (minutes_ != 0) {
      output.writeInt32(2, minutes_);
    }
    if (timezone_ != com.tcn.cloud.api.api.commons.TimeZone.TIME_ZONE_AMERICA_PUERTO_RICO.getNumber()) {
      output.writeEnum(3, timezone_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (hours_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, hours_);
    }
    if (minutes_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, minutes_);
    }
    if (timezone_ != com.tcn.cloud.api.api.commons.TimeZone.TIME_ZONE_AMERICA_PUERTO_RICO.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, timezone_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.commons.org.BroadcastTime)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.commons.org.BroadcastTime other = (com.tcn.cloud.api.api.commons.org.BroadcastTime) obj;

    if (getHours()
        != other.getHours()) return false;
    if (getMinutes()
        != other.getMinutes()) return false;
    if (timezone_ != other.timezone_) return false;
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
    hash = (37 * hash) + HOURS_FIELD_NUMBER;
    hash = (53 * hash) + getHours();
    hash = (37 * hash) + MINUTES_FIELD_NUMBER;
    hash = (53 * hash) + getMinutes();
    hash = (37 * hash) + TIMEZONE_FIELD_NUMBER;
    hash = (53 * hash) + timezone_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.commons.org.BroadcastTime parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.org.BroadcastTime parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.org.BroadcastTime parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.org.BroadcastTime parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.org.BroadcastTime parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.org.BroadcastTime parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.org.BroadcastTime parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.org.BroadcastTime parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.commons.org.BroadcastTime parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.commons.org.BroadcastTime parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.org.BroadcastTime parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.org.BroadcastTime parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.commons.org.BroadcastTime prototype) {
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
   * Broadcast start/stop time properties.
   * </pre>
   *
   * Protobuf type {@code api.commons.org.BroadcastTime}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.commons.org.BroadcastTime)
      com.tcn.cloud.api.api.commons.org.BroadcastTimeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.org.PreferencesProto.internal_static_api_commons_org_BroadcastTime_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.commons.org.PreferencesProto.internal_static_api_commons_org_BroadcastTime_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.commons.org.BroadcastTime.class, com.tcn.cloud.api.api.commons.org.BroadcastTime.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.commons.org.BroadcastTime.newBuilder()
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
      hours_ = 0;
      minutes_ = 0;
      timezone_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.commons.org.PreferencesProto.internal_static_api_commons_org_BroadcastTime_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.org.BroadcastTime getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.commons.org.BroadcastTime.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.org.BroadcastTime build() {
      com.tcn.cloud.api.api.commons.org.BroadcastTime result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.org.BroadcastTime buildPartial() {
      com.tcn.cloud.api.api.commons.org.BroadcastTime result = new com.tcn.cloud.api.api.commons.org.BroadcastTime(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.commons.org.BroadcastTime result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.hours_ = hours_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.minutes_ = minutes_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.timezone_ = timezone_;
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
      if (other instanceof com.tcn.cloud.api.api.commons.org.BroadcastTime) {
        return mergeFrom((com.tcn.cloud.api.api.commons.org.BroadcastTime)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.commons.org.BroadcastTime other) {
      if (other == com.tcn.cloud.api.api.commons.org.BroadcastTime.getDefaultInstance()) return this;
      if (other.getHours() != 0) {
        setHours(other.getHours());
      }
      if (other.getMinutes() != 0) {
        setMinutes(other.getMinutes());
      }
      if (other.timezone_ != 0) {
        setTimezoneValue(other.getTimezoneValue());
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
              hours_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              minutes_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              timezone_ = input.readEnum();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
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

    private int hours_ ;
    /**
     * <pre>
     * Hour of the day (0-23).
     * </pre>
     *
     * <code>int32 hours = 1 [json_name = "hours"];</code>
     * @return The hours.
     */
    @java.lang.Override
    public int getHours() {
      return hours_;
    }
    /**
     * <pre>
     * Hour of the day (0-23).
     * </pre>
     *
     * <code>int32 hours = 1 [json_name = "hours"];</code>
     * @param value The hours to set.
     * @return This builder for chaining.
     */
    public Builder setHours(int value) {

      hours_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Hour of the day (0-23).
     * </pre>
     *
     * <code>int32 hours = 1 [json_name = "hours"];</code>
     * @return This builder for chaining.
     */
    public Builder clearHours() {
      bitField0_ = (bitField0_ & ~0x00000001);
      hours_ = 0;
      onChanged();
      return this;
    }

    private int minutes_ ;
    /**
     * <pre>
     * Minute of the hour (0-59).
     * </pre>
     *
     * <code>int32 minutes = 2 [json_name = "minutes"];</code>
     * @return The minutes.
     */
    @java.lang.Override
    public int getMinutes() {
      return minutes_;
    }
    /**
     * <pre>
     * Minute of the hour (0-59).
     * </pre>
     *
     * <code>int32 minutes = 2 [json_name = "minutes"];</code>
     * @param value The minutes to set.
     * @return This builder for chaining.
     */
    public Builder setMinutes(int value) {

      minutes_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Minute of the hour (0-59).
     * </pre>
     *
     * <code>int32 minutes = 2 [json_name = "minutes"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMinutes() {
      bitField0_ = (bitField0_ & ~0x00000002);
      minutes_ = 0;
      onChanged();
      return this;
    }

    private int timezone_ = 0;
    /**
     * <pre>
     * Time zone.
     * </pre>
     *
     * <code>.api.commons.TimeZone timezone = 3 [json_name = "timezone"];</code>
     * @return The enum numeric value on the wire for timezone.
     */
    @java.lang.Override public int getTimezoneValue() {
      return timezone_;
    }
    /**
     * <pre>
     * Time zone.
     * </pre>
     *
     * <code>.api.commons.TimeZone timezone = 3 [json_name = "timezone"];</code>
     * @param value The enum numeric value on the wire for timezone to set.
     * @return This builder for chaining.
     */
    public Builder setTimezoneValue(int value) {
      timezone_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Time zone.
     * </pre>
     *
     * <code>.api.commons.TimeZone timezone = 3 [json_name = "timezone"];</code>
     * @return The timezone.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.TimeZone getTimezone() {
      com.tcn.cloud.api.api.commons.TimeZone result = com.tcn.cloud.api.api.commons.TimeZone.forNumber(timezone_);
      return result == null ? com.tcn.cloud.api.api.commons.TimeZone.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Time zone.
     * </pre>
     *
     * <code>.api.commons.TimeZone timezone = 3 [json_name = "timezone"];</code>
     * @param value The timezone to set.
     * @return This builder for chaining.
     */
    public Builder setTimezone(com.tcn.cloud.api.api.commons.TimeZone value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      timezone_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Time zone.
     * </pre>
     *
     * <code>.api.commons.TimeZone timezone = 3 [json_name = "timezone"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTimezone() {
      bitField0_ = (bitField0_ & ~0x00000004);
      timezone_ = 0;
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


    // @@protoc_insertion_point(builder_scope:api.commons.org.BroadcastTime)
  }

  // @@protoc_insertion_point(class_scope:api.commons.org.BroadcastTime)
  private static final com.tcn.cloud.api.api.commons.org.BroadcastTime DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.commons.org.BroadcastTime();
  }

  public static com.tcn.cloud.api.api.commons.org.BroadcastTime getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BroadcastTime>
      PARSER = new com.google.protobuf.AbstractParser<BroadcastTime>() {
    @java.lang.Override
    public BroadcastTime parsePartialFrom(
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

  public static com.google.protobuf.Parser<BroadcastTime> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BroadcastTime> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.BroadcastTime getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

