// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/lms.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.DateTime}
 */
public final class DateTime extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.DateTime)
    DateTimeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DateTime.newBuilder() to construct.
  private DateTime(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DateTime() {
    rawValue_ = "";
    format_ = "";
    precision_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DateTime();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_DateTime_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_DateTime_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.DateTime.class, com.tcn.cloud.api.api.v0alpha.DateTime.Builder.class);
  }

  public static final int RAW_VALUE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object rawValue_ = "";
  /**
   * <pre>
   * the raw string given when parsing the datetime obj
   * </pre>
   *
   * <code>string raw_value = 1 [json_name = "rawValue"];</code>
   * @return The rawValue.
   */
  @java.lang.Override
  public java.lang.String getRawValue() {
    java.lang.Object ref = rawValue_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      rawValue_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * the raw string given when parsing the datetime obj
   * </pre>
   *
   * <code>string raw_value = 1 [json_name = "rawValue"];</code>
   * @return The bytes for rawValue.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRawValueBytes() {
    java.lang.Object ref = rawValue_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      rawValue_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FORMAT_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object format_ = "";
  /**
   * <pre>
   * the format string used to create this datetime object
   * </pre>
   *
   * <code>string format = 2 [json_name = "format"];</code>
   * @return The format.
   */
  @java.lang.Override
  public java.lang.String getFormat() {
    java.lang.Object ref = format_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      format_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * the format string used to create this datetime object
   * </pre>
   *
   * <code>string format = 2 [json_name = "format"];</code>
   * @return The bytes for format.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFormatBytes() {
    java.lang.Object ref = format_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      format_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PRECISION_FIELD_NUMBER = 3;
  private int precision_ = 0;
  /**
   * <pre>
   * our date value ordered from most specific to least
   * </pre>
   *
   * <code>.api.commons.DateTimePrecision precision = 3 [json_name = "precision"];</code>
   * @return The enum numeric value on the wire for precision.
   */
  @java.lang.Override public int getPrecisionValue() {
    return precision_;
  }
  /**
   * <pre>
   * our date value ordered from most specific to least
   * </pre>
   *
   * <code>.api.commons.DateTimePrecision precision = 3 [json_name = "precision"];</code>
   * @return The precision.
   */
  @java.lang.Override public com.tcn.cloud.api.api.commons.DateTimePrecision getPrecision() {
    com.tcn.cloud.api.api.commons.DateTimePrecision result = com.tcn.cloud.api.api.commons.DateTimePrecision.forNumber(precision_);
    return result == null ? com.tcn.cloud.api.api.commons.DateTimePrecision.UNRECOGNIZED : result;
  }

  public static final int MODIFIER_FIELD_NUMBER = 11;
  private com.tcn.cloud.api.api.v0alpha.DateTimeModifier modifier_;
  /**
   * <pre>
   * modifier to apply to our value when comparing
   * </pre>
   *
   * <code>.api.v0alpha.DateTimeModifier modifier = 11 [json_name = "modifier"];</code>
   * @return Whether the modifier field is set.
   */
  @java.lang.Override
  public boolean hasModifier() {
    return modifier_ != null;
  }
  /**
   * <pre>
   * modifier to apply to our value when comparing
   * </pre>
   *
   * <code>.api.v0alpha.DateTimeModifier modifier = 11 [json_name = "modifier"];</code>
   * @return The modifier.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.DateTimeModifier getModifier() {
    return modifier_ == null ? com.tcn.cloud.api.api.v0alpha.DateTimeModifier.getDefaultInstance() : modifier_;
  }
  /**
   * <pre>
   * modifier to apply to our value when comparing
   * </pre>
   *
   * <code>.api.v0alpha.DateTimeModifier modifier = 11 [json_name = "modifier"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.DateTimeModifierOrBuilder getModifierOrBuilder() {
    return modifier_ == null ? com.tcn.cloud.api.api.v0alpha.DateTimeModifier.getDefaultInstance() : modifier_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(rawValue_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, rawValue_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(format_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, format_);
    }
    if (precision_ != com.tcn.cloud.api.api.commons.DateTimePrecision.DATETIME_PRECISION_NOW.getNumber()) {
      output.writeEnum(3, precision_);
    }
    if (modifier_ != null) {
      output.writeMessage(11, getModifier());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(rawValue_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, rawValue_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(format_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, format_);
    }
    if (precision_ != com.tcn.cloud.api.api.commons.DateTimePrecision.DATETIME_PRECISION_NOW.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, precision_);
    }
    if (modifier_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(11, getModifier());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.DateTime)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.DateTime other = (com.tcn.cloud.api.api.v0alpha.DateTime) obj;

    if (!getRawValue()
        .equals(other.getRawValue())) return false;
    if (!getFormat()
        .equals(other.getFormat())) return false;
    if (precision_ != other.precision_) return false;
    if (hasModifier() != other.hasModifier()) return false;
    if (hasModifier()) {
      if (!getModifier()
          .equals(other.getModifier())) return false;
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
    hash = (37 * hash) + RAW_VALUE_FIELD_NUMBER;
    hash = (53 * hash) + getRawValue().hashCode();
    hash = (37 * hash) + FORMAT_FIELD_NUMBER;
    hash = (53 * hash) + getFormat().hashCode();
    hash = (37 * hash) + PRECISION_FIELD_NUMBER;
    hash = (53 * hash) + precision_;
    if (hasModifier()) {
      hash = (37 * hash) + MODIFIER_FIELD_NUMBER;
      hash = (53 * hash) + getModifier().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.DateTime parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.DateTime parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.DateTime parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.DateTime parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.DateTime parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.DateTime parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.DateTime parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.DateTime parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.DateTime parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.DateTime parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.DateTime parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.DateTime parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.DateTime prototype) {
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
   * Protobuf type {@code api.v0alpha.DateTime}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.DateTime)
      com.tcn.cloud.api.api.v0alpha.DateTimeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_DateTime_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_DateTime_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.DateTime.class, com.tcn.cloud.api.api.v0alpha.DateTime.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.DateTime.newBuilder()
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
      rawValue_ = "";
      format_ = "";
      precision_ = 0;
      modifier_ = null;
      if (modifierBuilder_ != null) {
        modifierBuilder_.dispose();
        modifierBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_DateTime_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.DateTime getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.DateTime.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.DateTime build() {
      com.tcn.cloud.api.api.v0alpha.DateTime result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.DateTime buildPartial() {
      com.tcn.cloud.api.api.v0alpha.DateTime result = new com.tcn.cloud.api.api.v0alpha.DateTime(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.DateTime result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.rawValue_ = rawValue_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.format_ = format_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.precision_ = precision_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.modifier_ = modifierBuilder_ == null
            ? modifier_
            : modifierBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v0alpha.DateTime) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.DateTime)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.DateTime other) {
      if (other == com.tcn.cloud.api.api.v0alpha.DateTime.getDefaultInstance()) return this;
      if (!other.getRawValue().isEmpty()) {
        rawValue_ = other.rawValue_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getFormat().isEmpty()) {
        format_ = other.format_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.precision_ != 0) {
        setPrecisionValue(other.getPrecisionValue());
      }
      if (other.hasModifier()) {
        mergeModifier(other.getModifier());
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
            case 10: {
              rawValue_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              format_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              precision_ = input.readEnum();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 90: {
              input.readMessage(
                  getModifierFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000008;
              break;
            } // case 90
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

    private java.lang.Object rawValue_ = "";
    /**
     * <pre>
     * the raw string given when parsing the datetime obj
     * </pre>
     *
     * <code>string raw_value = 1 [json_name = "rawValue"];</code>
     * @return The rawValue.
     */
    public java.lang.String getRawValue() {
      java.lang.Object ref = rawValue_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        rawValue_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * the raw string given when parsing the datetime obj
     * </pre>
     *
     * <code>string raw_value = 1 [json_name = "rawValue"];</code>
     * @return The bytes for rawValue.
     */
    public com.google.protobuf.ByteString
        getRawValueBytes() {
      java.lang.Object ref = rawValue_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        rawValue_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * the raw string given when parsing the datetime obj
     * </pre>
     *
     * <code>string raw_value = 1 [json_name = "rawValue"];</code>
     * @param value The rawValue to set.
     * @return This builder for chaining.
     */
    public Builder setRawValue(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      rawValue_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the raw string given when parsing the datetime obj
     * </pre>
     *
     * <code>string raw_value = 1 [json_name = "rawValue"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRawValue() {
      rawValue_ = getDefaultInstance().getRawValue();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the raw string given when parsing the datetime obj
     * </pre>
     *
     * <code>string raw_value = 1 [json_name = "rawValue"];</code>
     * @param value The bytes for rawValue to set.
     * @return This builder for chaining.
     */
    public Builder setRawValueBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      rawValue_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object format_ = "";
    /**
     * <pre>
     * the format string used to create this datetime object
     * </pre>
     *
     * <code>string format = 2 [json_name = "format"];</code>
     * @return The format.
     */
    public java.lang.String getFormat() {
      java.lang.Object ref = format_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        format_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * the format string used to create this datetime object
     * </pre>
     *
     * <code>string format = 2 [json_name = "format"];</code>
     * @return The bytes for format.
     */
    public com.google.protobuf.ByteString
        getFormatBytes() {
      java.lang.Object ref = format_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        format_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * the format string used to create this datetime object
     * </pre>
     *
     * <code>string format = 2 [json_name = "format"];</code>
     * @param value The format to set.
     * @return This builder for chaining.
     */
    public Builder setFormat(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      format_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the format string used to create this datetime object
     * </pre>
     *
     * <code>string format = 2 [json_name = "format"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFormat() {
      format_ = getDefaultInstance().getFormat();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the format string used to create this datetime object
     * </pre>
     *
     * <code>string format = 2 [json_name = "format"];</code>
     * @param value The bytes for format to set.
     * @return This builder for chaining.
     */
    public Builder setFormatBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      format_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private int precision_ = 0;
    /**
     * <pre>
     * our date value ordered from most specific to least
     * </pre>
     *
     * <code>.api.commons.DateTimePrecision precision = 3 [json_name = "precision"];</code>
     * @return The enum numeric value on the wire for precision.
     */
    @java.lang.Override public int getPrecisionValue() {
      return precision_;
    }
    /**
     * <pre>
     * our date value ordered from most specific to least
     * </pre>
     *
     * <code>.api.commons.DateTimePrecision precision = 3 [json_name = "precision"];</code>
     * @param value The enum numeric value on the wire for precision to set.
     * @return This builder for chaining.
     */
    public Builder setPrecisionValue(int value) {
      precision_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * our date value ordered from most specific to least
     * </pre>
     *
     * <code>.api.commons.DateTimePrecision precision = 3 [json_name = "precision"];</code>
     * @return The precision.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.DateTimePrecision getPrecision() {
      com.tcn.cloud.api.api.commons.DateTimePrecision result = com.tcn.cloud.api.api.commons.DateTimePrecision.forNumber(precision_);
      return result == null ? com.tcn.cloud.api.api.commons.DateTimePrecision.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * our date value ordered from most specific to least
     * </pre>
     *
     * <code>.api.commons.DateTimePrecision precision = 3 [json_name = "precision"];</code>
     * @param value The precision to set.
     * @return This builder for chaining.
     */
    public Builder setPrecision(com.tcn.cloud.api.api.commons.DateTimePrecision value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      precision_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * our date value ordered from most specific to least
     * </pre>
     *
     * <code>.api.commons.DateTimePrecision precision = 3 [json_name = "precision"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPrecision() {
      bitField0_ = (bitField0_ & ~0x00000004);
      precision_ = 0;
      onChanged();
      return this;
    }

    private com.tcn.cloud.api.api.v0alpha.DateTimeModifier modifier_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.DateTimeModifier, com.tcn.cloud.api.api.v0alpha.DateTimeModifier.Builder, com.tcn.cloud.api.api.v0alpha.DateTimeModifierOrBuilder> modifierBuilder_;
    /**
     * <pre>
     * modifier to apply to our value when comparing
     * </pre>
     *
     * <code>.api.v0alpha.DateTimeModifier modifier = 11 [json_name = "modifier"];</code>
     * @return Whether the modifier field is set.
     */
    public boolean hasModifier() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * modifier to apply to our value when comparing
     * </pre>
     *
     * <code>.api.v0alpha.DateTimeModifier modifier = 11 [json_name = "modifier"];</code>
     * @return The modifier.
     */
    public com.tcn.cloud.api.api.v0alpha.DateTimeModifier getModifier() {
      if (modifierBuilder_ == null) {
        return modifier_ == null ? com.tcn.cloud.api.api.v0alpha.DateTimeModifier.getDefaultInstance() : modifier_;
      } else {
        return modifierBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * modifier to apply to our value when comparing
     * </pre>
     *
     * <code>.api.v0alpha.DateTimeModifier modifier = 11 [json_name = "modifier"];</code>
     */
    public Builder setModifier(com.tcn.cloud.api.api.v0alpha.DateTimeModifier value) {
      if (modifierBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        modifier_ = value;
      } else {
        modifierBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * modifier to apply to our value when comparing
     * </pre>
     *
     * <code>.api.v0alpha.DateTimeModifier modifier = 11 [json_name = "modifier"];</code>
     */
    public Builder setModifier(
        com.tcn.cloud.api.api.v0alpha.DateTimeModifier.Builder builderForValue) {
      if (modifierBuilder_ == null) {
        modifier_ = builderForValue.build();
      } else {
        modifierBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * modifier to apply to our value when comparing
     * </pre>
     *
     * <code>.api.v0alpha.DateTimeModifier modifier = 11 [json_name = "modifier"];</code>
     */
    public Builder mergeModifier(com.tcn.cloud.api.api.v0alpha.DateTimeModifier value) {
      if (modifierBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          modifier_ != null &&
          modifier_ != com.tcn.cloud.api.api.v0alpha.DateTimeModifier.getDefaultInstance()) {
          getModifierBuilder().mergeFrom(value);
        } else {
          modifier_ = value;
        }
      } else {
        modifierBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * modifier to apply to our value when comparing
     * </pre>
     *
     * <code>.api.v0alpha.DateTimeModifier modifier = 11 [json_name = "modifier"];</code>
     */
    public Builder clearModifier() {
      bitField0_ = (bitField0_ & ~0x00000008);
      modifier_ = null;
      if (modifierBuilder_ != null) {
        modifierBuilder_.dispose();
        modifierBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * modifier to apply to our value when comparing
     * </pre>
     *
     * <code>.api.v0alpha.DateTimeModifier modifier = 11 [json_name = "modifier"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.DateTimeModifier.Builder getModifierBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getModifierFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * modifier to apply to our value when comparing
     * </pre>
     *
     * <code>.api.v0alpha.DateTimeModifier modifier = 11 [json_name = "modifier"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.DateTimeModifierOrBuilder getModifierOrBuilder() {
      if (modifierBuilder_ != null) {
        return modifierBuilder_.getMessageOrBuilder();
      } else {
        return modifier_ == null ?
            com.tcn.cloud.api.api.v0alpha.DateTimeModifier.getDefaultInstance() : modifier_;
      }
    }
    /**
     * <pre>
     * modifier to apply to our value when comparing
     * </pre>
     *
     * <code>.api.v0alpha.DateTimeModifier modifier = 11 [json_name = "modifier"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.DateTimeModifier, com.tcn.cloud.api.api.v0alpha.DateTimeModifier.Builder, com.tcn.cloud.api.api.v0alpha.DateTimeModifierOrBuilder> 
        getModifierFieldBuilder() {
      if (modifierBuilder_ == null) {
        modifierBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.DateTimeModifier, com.tcn.cloud.api.api.v0alpha.DateTimeModifier.Builder, com.tcn.cloud.api.api.v0alpha.DateTimeModifierOrBuilder>(
                getModifier(),
                getParentForChildren(),
                isClean());
        modifier_ = null;
      }
      return modifierBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.DateTime)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.DateTime)
  private static final com.tcn.cloud.api.api.v0alpha.DateTime DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.DateTime();
  }

  public static com.tcn.cloud.api.api.v0alpha.DateTime getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DateTime>
      PARSER = new com.google.protobuf.AbstractParser<DateTime>() {
    @java.lang.Override
    public DateTime parsePartialFrom(
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

  public static com.google.protobuf.Parser<DateTime> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DateTime> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.DateTime getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

