// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/omnichannel.proto

package com.tcn.cloud.api.api.commons;

/**
 * <pre>
 * SmsNumber
 * </pre>
 *
 * Protobuf type {@code api.commons.SmsNumber}
 */
public final class SmsNumber extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.commons.SmsNumber)
    SmsNumberOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SmsNumber.newBuilder() to construct.
  private SmsNumber(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SmsNumber() {
    number_ = "";
    type_ = 0;
    provider_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SmsNumber();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.commons.OmnichannelProto.internal_static_api_commons_SmsNumber_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.commons.OmnichannelProto.internal_static_api_commons_SmsNumber_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.commons.SmsNumber.class, com.tcn.cloud.api.api.commons.SmsNumber.Builder.class);
  }

  public static final int NUMBER_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object number_ = "";
  /**
   * <pre>
   * string representation of the sms number
   * </pre>
   *
   * <code>string number = 1 [json_name = "number"];</code>
   * @return The number.
   */
  @java.lang.Override
  public java.lang.String getNumber() {
    java.lang.Object ref = number_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      number_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * string representation of the sms number
   * </pre>
   *
   * <code>string number = 1 [json_name = "number"];</code>
   * @return The bytes for number.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNumberBytes() {
    java.lang.Object ref = number_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      number_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TYPE_FIELD_NUMBER = 2;
  private int type_ = 0;
  /**
   * <pre>
   * the type of sms number (Alphanumeric|Short Code|Number)
   * </pre>
   *
   * <code>.api.commons.SmsNumberType type = 2 [json_name = "type"];</code>
   * @return The enum numeric value on the wire for type.
   */
  @java.lang.Override public int getTypeValue() {
    return type_;
  }
  /**
   * <pre>
   * the type of sms number (Alphanumeric|Short Code|Number)
   * </pre>
   *
   * <code>.api.commons.SmsNumberType type = 2 [json_name = "type"];</code>
   * @return The type.
   */
  @java.lang.Override public com.tcn.cloud.api.api.commons.SmsNumberType getType() {
    com.tcn.cloud.api.api.commons.SmsNumberType result = com.tcn.cloud.api.api.commons.SmsNumberType.forNumber(type_);
    return result == null ? com.tcn.cloud.api.api.commons.SmsNumberType.UNRECOGNIZED : result;
  }

  public static final int PROVIDER_FIELD_NUMBER = 3;
  private int provider_ = 0;
  /**
   * <pre>
   * associated provider (Bandwidth|BurstSMS|etc.)
   * </pre>
   *
   * <code>.api.commons.SmsNumberProvider provider = 3 [json_name = "provider"];</code>
   * @return The enum numeric value on the wire for provider.
   */
  @java.lang.Override public int getProviderValue() {
    return provider_;
  }
  /**
   * <pre>
   * associated provider (Bandwidth|BurstSMS|etc.)
   * </pre>
   *
   * <code>.api.commons.SmsNumberProvider provider = 3 [json_name = "provider"];</code>
   * @return The provider.
   */
  @java.lang.Override public com.tcn.cloud.api.api.commons.SmsNumberProvider getProvider() {
    com.tcn.cloud.api.api.commons.SmsNumberProvider result = com.tcn.cloud.api.api.commons.SmsNumberProvider.forNumber(provider_);
    return result == null ? com.tcn.cloud.api.api.commons.SmsNumberProvider.UNRECOGNIZED : result;
  }

  public static final int COUNTRY_CODE_FIELD_NUMBER = 4;
  private int countryCode_ = 0;
  /**
   * <pre>
   * country code the sms number belongs to
   * </pre>
   *
   * <code>int32 country_code = 4 [json_name = "countryCode"];</code>
   * @return The countryCode.
   */
  @java.lang.Override
  public int getCountryCode() {
    return countryCode_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(number_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, number_);
    }
    if (type_ != com.tcn.cloud.api.api.commons.SmsNumberType.SMS_SHORT_CODE_TYPE.getNumber()) {
      output.writeEnum(2, type_);
    }
    if (provider_ != com.tcn.cloud.api.api.commons.SmsNumberProvider.UNKNOWN_PROVIDER.getNumber()) {
      output.writeEnum(3, provider_);
    }
    if (countryCode_ != 0) {
      output.writeInt32(4, countryCode_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(number_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, number_);
    }
    if (type_ != com.tcn.cloud.api.api.commons.SmsNumberType.SMS_SHORT_CODE_TYPE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, type_);
    }
    if (provider_ != com.tcn.cloud.api.api.commons.SmsNumberProvider.UNKNOWN_PROVIDER.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, provider_);
    }
    if (countryCode_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, countryCode_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.commons.SmsNumber)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.commons.SmsNumber other = (com.tcn.cloud.api.api.commons.SmsNumber) obj;

    if (!getNumber()
        .equals(other.getNumber())) return false;
    if (type_ != other.type_) return false;
    if (provider_ != other.provider_) return false;
    if (getCountryCode()
        != other.getCountryCode()) return false;
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
    hash = (37 * hash) + NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getNumber().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (37 * hash) + PROVIDER_FIELD_NUMBER;
    hash = (53 * hash) + provider_;
    hash = (37 * hash) + COUNTRY_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getCountryCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.commons.SmsNumber parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.SmsNumber parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.SmsNumber parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.SmsNumber parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.SmsNumber parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.SmsNumber parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.SmsNumber parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.SmsNumber parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.commons.SmsNumber parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.commons.SmsNumber parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.SmsNumber parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.SmsNumber parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.commons.SmsNumber prototype) {
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
   * SmsNumber
   * </pre>
   *
   * Protobuf type {@code api.commons.SmsNumber}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.commons.SmsNumber)
      com.tcn.cloud.api.api.commons.SmsNumberOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.OmnichannelProto.internal_static_api_commons_SmsNumber_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.commons.OmnichannelProto.internal_static_api_commons_SmsNumber_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.commons.SmsNumber.class, com.tcn.cloud.api.api.commons.SmsNumber.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.commons.SmsNumber.newBuilder()
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
      number_ = "";
      type_ = 0;
      provider_ = 0;
      countryCode_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.commons.OmnichannelProto.internal_static_api_commons_SmsNumber_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.SmsNumber getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.commons.SmsNumber.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.SmsNumber build() {
      com.tcn.cloud.api.api.commons.SmsNumber result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.SmsNumber buildPartial() {
      com.tcn.cloud.api.api.commons.SmsNumber result = new com.tcn.cloud.api.api.commons.SmsNumber(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.commons.SmsNumber result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.number_ = number_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.type_ = type_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.provider_ = provider_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.countryCode_ = countryCode_;
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
      if (other instanceof com.tcn.cloud.api.api.commons.SmsNumber) {
        return mergeFrom((com.tcn.cloud.api.api.commons.SmsNumber)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.commons.SmsNumber other) {
      if (other == com.tcn.cloud.api.api.commons.SmsNumber.getDefaultInstance()) return this;
      if (!other.getNumber().isEmpty()) {
        number_ = other.number_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (other.provider_ != 0) {
        setProviderValue(other.getProviderValue());
      }
      if (other.getCountryCode() != 0) {
        setCountryCode(other.getCountryCode());
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
              number_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              type_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              provider_ = input.readEnum();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              countryCode_ = input.readInt32();
              bitField0_ |= 0x00000008;
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
    private int bitField0_;

    private java.lang.Object number_ = "";
    /**
     * <pre>
     * string representation of the sms number
     * </pre>
     *
     * <code>string number = 1 [json_name = "number"];</code>
     * @return The number.
     */
    public java.lang.String getNumber() {
      java.lang.Object ref = number_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        number_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * string representation of the sms number
     * </pre>
     *
     * <code>string number = 1 [json_name = "number"];</code>
     * @return The bytes for number.
     */
    public com.google.protobuf.ByteString
        getNumberBytes() {
      java.lang.Object ref = number_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        number_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * string representation of the sms number
     * </pre>
     *
     * <code>string number = 1 [json_name = "number"];</code>
     * @param value The number to set.
     * @return This builder for chaining.
     */
    public Builder setNumber(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      number_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * string representation of the sms number
     * </pre>
     *
     * <code>string number = 1 [json_name = "number"];</code>
     * @return This builder for chaining.
     */
    public Builder clearNumber() {
      number_ = getDefaultInstance().getNumber();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * string representation of the sms number
     * </pre>
     *
     * <code>string number = 1 [json_name = "number"];</code>
     * @param value The bytes for number to set.
     * @return This builder for chaining.
     */
    public Builder setNumberBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      number_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int type_ = 0;
    /**
     * <pre>
     * the type of sms number (Alphanumeric|Short Code|Number)
     * </pre>
     *
     * <code>.api.commons.SmsNumberType type = 2 [json_name = "type"];</code>
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override public int getTypeValue() {
      return type_;
    }
    /**
     * <pre>
     * the type of sms number (Alphanumeric|Short Code|Number)
     * </pre>
     *
     * <code>.api.commons.SmsNumberType type = 2 [json_name = "type"];</code>
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the type of sms number (Alphanumeric|Short Code|Number)
     * </pre>
     *
     * <code>.api.commons.SmsNumberType type = 2 [json_name = "type"];</code>
     * @return The type.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.SmsNumberType getType() {
      com.tcn.cloud.api.api.commons.SmsNumberType result = com.tcn.cloud.api.api.commons.SmsNumberType.forNumber(type_);
      return result == null ? com.tcn.cloud.api.api.commons.SmsNumberType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * the type of sms number (Alphanumeric|Short Code|Number)
     * </pre>
     *
     * <code>.api.commons.SmsNumberType type = 2 [json_name = "type"];</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(com.tcn.cloud.api.api.commons.SmsNumberType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the type of sms number (Alphanumeric|Short Code|Number)
     * </pre>
     *
     * <code>.api.commons.SmsNumberType type = 2 [json_name = "type"];</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      bitField0_ = (bitField0_ & ~0x00000002);
      type_ = 0;
      onChanged();
      return this;
    }

    private int provider_ = 0;
    /**
     * <pre>
     * associated provider (Bandwidth|BurstSMS|etc.)
     * </pre>
     *
     * <code>.api.commons.SmsNumberProvider provider = 3 [json_name = "provider"];</code>
     * @return The enum numeric value on the wire for provider.
     */
    @java.lang.Override public int getProviderValue() {
      return provider_;
    }
    /**
     * <pre>
     * associated provider (Bandwidth|BurstSMS|etc.)
     * </pre>
     *
     * <code>.api.commons.SmsNumberProvider provider = 3 [json_name = "provider"];</code>
     * @param value The enum numeric value on the wire for provider to set.
     * @return This builder for chaining.
     */
    public Builder setProviderValue(int value) {
      provider_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * associated provider (Bandwidth|BurstSMS|etc.)
     * </pre>
     *
     * <code>.api.commons.SmsNumberProvider provider = 3 [json_name = "provider"];</code>
     * @return The provider.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.SmsNumberProvider getProvider() {
      com.tcn.cloud.api.api.commons.SmsNumberProvider result = com.tcn.cloud.api.api.commons.SmsNumberProvider.forNumber(provider_);
      return result == null ? com.tcn.cloud.api.api.commons.SmsNumberProvider.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * associated provider (Bandwidth|BurstSMS|etc.)
     * </pre>
     *
     * <code>.api.commons.SmsNumberProvider provider = 3 [json_name = "provider"];</code>
     * @param value The provider to set.
     * @return This builder for chaining.
     */
    public Builder setProvider(com.tcn.cloud.api.api.commons.SmsNumberProvider value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      provider_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * associated provider (Bandwidth|BurstSMS|etc.)
     * </pre>
     *
     * <code>.api.commons.SmsNumberProvider provider = 3 [json_name = "provider"];</code>
     * @return This builder for chaining.
     */
    public Builder clearProvider() {
      bitField0_ = (bitField0_ & ~0x00000004);
      provider_ = 0;
      onChanged();
      return this;
    }

    private int countryCode_ ;
    /**
     * <pre>
     * country code the sms number belongs to
     * </pre>
     *
     * <code>int32 country_code = 4 [json_name = "countryCode"];</code>
     * @return The countryCode.
     */
    @java.lang.Override
    public int getCountryCode() {
      return countryCode_;
    }
    /**
     * <pre>
     * country code the sms number belongs to
     * </pre>
     *
     * <code>int32 country_code = 4 [json_name = "countryCode"];</code>
     * @param value The countryCode to set.
     * @return This builder for chaining.
     */
    public Builder setCountryCode(int value) {

      countryCode_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * country code the sms number belongs to
     * </pre>
     *
     * <code>int32 country_code = 4 [json_name = "countryCode"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCountryCode() {
      bitField0_ = (bitField0_ & ~0x00000008);
      countryCode_ = 0;
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


    // @@protoc_insertion_point(builder_scope:api.commons.SmsNumber)
  }

  // @@protoc_insertion_point(class_scope:api.commons.SmsNumber)
  private static final com.tcn.cloud.api.api.commons.SmsNumber DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.commons.SmsNumber();
  }

  public static com.tcn.cloud.api.api.commons.SmsNumber getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SmsNumber>
      PARSER = new com.google.protobuf.AbstractParser<SmsNumber>() {
    @java.lang.Override
    public SmsNumber parsePartialFrom(
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

  public static com.google.protobuf.Parser<SmsNumber> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SmsNumber> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.commons.SmsNumber getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

