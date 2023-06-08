// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/p3api.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * <pre>
 * A standard phone number
 * </pre>
 *
 * Protobuf type {@code api.v0alpha.PhoneBookStandardNumber}
 */
public final class PhoneBookStandardNumber extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.PhoneBookStandardNumber)
    PhoneBookStandardNumberOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PhoneBookStandardNumber.newBuilder() to construct.
  private PhoneBookStandardNumber(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PhoneBookStandardNumber() {
    phoneNumber_ = "";
    phoneNumberTypes_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PhoneBookStandardNumber();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_PhoneBookStandardNumber_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_PhoneBookStandardNumber_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.PhoneBookStandardNumber.class, com.tcn.cloud.api.api.v0alpha.PhoneBookStandardNumber.Builder.class);
  }

  public static final int PHONE_NUMBER_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object phoneNumber_ = "";
  /**
   * <pre>
   * The phone number
   * </pre>
   *
   * <code>string phone_number = 1 [json_name = "phoneNumber"];</code>
   * @return The phoneNumber.
   */
  @java.lang.Override
  public java.lang.String getPhoneNumber() {
    java.lang.Object ref = phoneNumber_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      phoneNumber_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The phone number
   * </pre>
   *
   * <code>string phone_number = 1 [json_name = "phoneNumber"];</code>
   * @return The bytes for phoneNumber.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPhoneNumberBytes() {
    java.lang.Object ref = phoneNumber_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      phoneNumber_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PHONE_NUMBER_TYPES_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<java.lang.Integer> phoneNumberTypes_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
      java.lang.Integer, com.tcn.cloud.api.api.commons.PhoneBookPhoneNumberType> phoneNumberTypes_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, com.tcn.cloud.api.api.commons.PhoneBookPhoneNumberType>() {
            public com.tcn.cloud.api.api.commons.PhoneBookPhoneNumberType convert(java.lang.Integer from) {
              com.tcn.cloud.api.api.commons.PhoneBookPhoneNumberType result = com.tcn.cloud.api.api.commons.PhoneBookPhoneNumberType.forNumber(from);
              return result == null ? com.tcn.cloud.api.api.commons.PhoneBookPhoneNumberType.UNRECOGNIZED : result;
            }
          };
  /**
   * <pre>
   * The phone number types determines where this phone book is used.
   * It can be any combination of Caller ID, Outbound, and Transfer, separated by a colon.
   * For example -&gt; Caller ID:Outbound:Transfer would be all three.
   * </pre>
   *
   * <code>repeated .api.commons.PhoneBookPhoneNumberType phone_number_types = 2 [json_name = "phoneNumberTypes"];</code>
   * @return A list containing the phoneNumberTypes.
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.commons.PhoneBookPhoneNumberType> getPhoneNumberTypesList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, com.tcn.cloud.api.api.commons.PhoneBookPhoneNumberType>(phoneNumberTypes_, phoneNumberTypes_converter_);
  }
  /**
   * <pre>
   * The phone number types determines where this phone book is used.
   * It can be any combination of Caller ID, Outbound, and Transfer, separated by a colon.
   * For example -&gt; Caller ID:Outbound:Transfer would be all three.
   * </pre>
   *
   * <code>repeated .api.commons.PhoneBookPhoneNumberType phone_number_types = 2 [json_name = "phoneNumberTypes"];</code>
   * @return The count of phoneNumberTypes.
   */
  @java.lang.Override
  public int getPhoneNumberTypesCount() {
    return phoneNumberTypes_.size();
  }
  /**
   * <pre>
   * The phone number types determines where this phone book is used.
   * It can be any combination of Caller ID, Outbound, and Transfer, separated by a colon.
   * For example -&gt; Caller ID:Outbound:Transfer would be all three.
   * </pre>
   *
   * <code>repeated .api.commons.PhoneBookPhoneNumberType phone_number_types = 2 [json_name = "phoneNumberTypes"];</code>
   * @param index The index of the element to return.
   * @return The phoneNumberTypes at the given index.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.PhoneBookPhoneNumberType getPhoneNumberTypes(int index) {
    return phoneNumberTypes_converter_.convert(phoneNumberTypes_.get(index));
  }
  /**
   * <pre>
   * The phone number types determines where this phone book is used.
   * It can be any combination of Caller ID, Outbound, and Transfer, separated by a colon.
   * For example -&gt; Caller ID:Outbound:Transfer would be all three.
   * </pre>
   *
   * <code>repeated .api.commons.PhoneBookPhoneNumberType phone_number_types = 2 [json_name = "phoneNumberTypes"];</code>
   * @return A list containing the enum numeric values on the wire for phoneNumberTypes.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
  getPhoneNumberTypesValueList() {
    return phoneNumberTypes_;
  }
  /**
   * <pre>
   * The phone number types determines where this phone book is used.
   * It can be any combination of Caller ID, Outbound, and Transfer, separated by a colon.
   * For example -&gt; Caller ID:Outbound:Transfer would be all three.
   * </pre>
   *
   * <code>repeated .api.commons.PhoneBookPhoneNumberType phone_number_types = 2 [json_name = "phoneNumberTypes"];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of phoneNumberTypes at the given index.
   */
  @java.lang.Override
  public int getPhoneNumberTypesValue(int index) {
    return phoneNumberTypes_.get(index);
  }
  private int phoneNumberTypesMemoizedSerializedSize;

  public static final int WHITE_LIST_FIELD_NUMBER = 3;
  private boolean whiteList_ = false;
  /**
   * <code>bool white_list = 3 [json_name = "whiteList"];</code>
   * @return The whiteList.
   */
  @java.lang.Override
  public boolean getWhiteList() {
    return whiteList_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(phoneNumber_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, phoneNumber_);
    }
    if (getPhoneNumberTypesList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(phoneNumberTypesMemoizedSerializedSize);
    }
    for (int i = 0; i < phoneNumberTypes_.size(); i++) {
      output.writeEnumNoTag(phoneNumberTypes_.get(i));
    }
    if (whiteList_ != false) {
      output.writeBool(3, whiteList_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(phoneNumber_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, phoneNumber_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < phoneNumberTypes_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeEnumSizeNoTag(phoneNumberTypes_.get(i));
      }
      size += dataSize;
      if (!getPhoneNumberTypesList().isEmpty()) {  size += 1;
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(dataSize);
      }phoneNumberTypesMemoizedSerializedSize = dataSize;
    }
    if (whiteList_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, whiteList_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.PhoneBookStandardNumber)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.PhoneBookStandardNumber other = (com.tcn.cloud.api.api.v0alpha.PhoneBookStandardNumber) obj;

    if (!getPhoneNumber()
        .equals(other.getPhoneNumber())) return false;
    if (!phoneNumberTypes_.equals(other.phoneNumberTypes_)) return false;
    if (getWhiteList()
        != other.getWhiteList()) return false;
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
    hash = (37 * hash) + PHONE_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getPhoneNumber().hashCode();
    if (getPhoneNumberTypesCount() > 0) {
      hash = (37 * hash) + PHONE_NUMBER_TYPES_FIELD_NUMBER;
      hash = (53 * hash) + phoneNumberTypes_.hashCode();
    }
    hash = (37 * hash) + WHITE_LIST_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getWhiteList());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.PhoneBookStandardNumber parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.PhoneBookStandardNumber parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.PhoneBookStandardNumber parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.PhoneBookStandardNumber parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.PhoneBookStandardNumber parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.PhoneBookStandardNumber parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.PhoneBookStandardNumber parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.PhoneBookStandardNumber parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.PhoneBookStandardNumber parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.PhoneBookStandardNumber parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.PhoneBookStandardNumber parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.PhoneBookStandardNumber parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.PhoneBookStandardNumber prototype) {
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
   * A standard phone number
   * </pre>
   *
   * Protobuf type {@code api.v0alpha.PhoneBookStandardNumber}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.PhoneBookStandardNumber)
      com.tcn.cloud.api.api.v0alpha.PhoneBookStandardNumberOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_PhoneBookStandardNumber_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_PhoneBookStandardNumber_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.PhoneBookStandardNumber.class, com.tcn.cloud.api.api.v0alpha.PhoneBookStandardNumber.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.PhoneBookStandardNumber.newBuilder()
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
      phoneNumber_ = "";
      phoneNumberTypes_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      whiteList_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_PhoneBookStandardNumber_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.PhoneBookStandardNumber getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.PhoneBookStandardNumber.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.PhoneBookStandardNumber build() {
      com.tcn.cloud.api.api.v0alpha.PhoneBookStandardNumber result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.PhoneBookStandardNumber buildPartial() {
      com.tcn.cloud.api.api.v0alpha.PhoneBookStandardNumber result = new com.tcn.cloud.api.api.v0alpha.PhoneBookStandardNumber(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v0alpha.PhoneBookStandardNumber result) {
      if (((bitField0_ & 0x00000002) != 0)) {
        phoneNumberTypes_ = java.util.Collections.unmodifiableList(phoneNumberTypes_);
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.phoneNumberTypes_ = phoneNumberTypes_;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.PhoneBookStandardNumber result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.phoneNumber_ = phoneNumber_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.whiteList_ = whiteList_;
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.PhoneBookStandardNumber) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.PhoneBookStandardNumber)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.PhoneBookStandardNumber other) {
      if (other == com.tcn.cloud.api.api.v0alpha.PhoneBookStandardNumber.getDefaultInstance()) return this;
      if (!other.getPhoneNumber().isEmpty()) {
        phoneNumber_ = other.phoneNumber_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.phoneNumberTypes_.isEmpty()) {
        if (phoneNumberTypes_.isEmpty()) {
          phoneNumberTypes_ = other.phoneNumberTypes_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensurePhoneNumberTypesIsMutable();
          phoneNumberTypes_.addAll(other.phoneNumberTypes_);
        }
        onChanged();
      }
      if (other.getWhiteList() != false) {
        setWhiteList(other.getWhiteList());
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
              phoneNumber_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              int tmpRaw = input.readEnum();
              ensurePhoneNumberTypesIsMutable();
              phoneNumberTypes_.add(tmpRaw);
              break;
            } // case 16
            case 18: {
              int length = input.readRawVarint32();
              int oldLimit = input.pushLimit(length);
              while(input.getBytesUntilLimit() > 0) {
                int tmpRaw = input.readEnum();
                ensurePhoneNumberTypesIsMutable();
                phoneNumberTypes_.add(tmpRaw);
              }
              input.popLimit(oldLimit);
              break;
            } // case 18
            case 24: {
              whiteList_ = input.readBool();
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

    private java.lang.Object phoneNumber_ = "";
    /**
     * <pre>
     * The phone number
     * </pre>
     *
     * <code>string phone_number = 1 [json_name = "phoneNumber"];</code>
     * @return The phoneNumber.
     */
    public java.lang.String getPhoneNumber() {
      java.lang.Object ref = phoneNumber_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        phoneNumber_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The phone number
     * </pre>
     *
     * <code>string phone_number = 1 [json_name = "phoneNumber"];</code>
     * @return The bytes for phoneNumber.
     */
    public com.google.protobuf.ByteString
        getPhoneNumberBytes() {
      java.lang.Object ref = phoneNumber_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        phoneNumber_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The phone number
     * </pre>
     *
     * <code>string phone_number = 1 [json_name = "phoneNumber"];</code>
     * @param value The phoneNumber to set.
     * @return This builder for chaining.
     */
    public Builder setPhoneNumber(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      phoneNumber_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The phone number
     * </pre>
     *
     * <code>string phone_number = 1 [json_name = "phoneNumber"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPhoneNumber() {
      phoneNumber_ = getDefaultInstance().getPhoneNumber();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The phone number
     * </pre>
     *
     * <code>string phone_number = 1 [json_name = "phoneNumber"];</code>
     * @param value The bytes for phoneNumber to set.
     * @return This builder for chaining.
     */
    public Builder setPhoneNumberBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      phoneNumber_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.util.List<java.lang.Integer> phoneNumberTypes_ =
      java.util.Collections.emptyList();
    private void ensurePhoneNumberTypesIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        phoneNumberTypes_ = new java.util.ArrayList<java.lang.Integer>(phoneNumberTypes_);
        bitField0_ |= 0x00000002;
      }
    }
    /**
     * <pre>
     * The phone number types determines where this phone book is used.
     * It can be any combination of Caller ID, Outbound, and Transfer, separated by a colon.
     * For example -&gt; Caller ID:Outbound:Transfer would be all three.
     * </pre>
     *
     * <code>repeated .api.commons.PhoneBookPhoneNumberType phone_number_types = 2 [json_name = "phoneNumberTypes"];</code>
     * @return A list containing the phoneNumberTypes.
     */
    public java.util.List<com.tcn.cloud.api.api.commons.PhoneBookPhoneNumberType> getPhoneNumberTypesList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, com.tcn.cloud.api.api.commons.PhoneBookPhoneNumberType>(phoneNumberTypes_, phoneNumberTypes_converter_);
    }
    /**
     * <pre>
     * The phone number types determines where this phone book is used.
     * It can be any combination of Caller ID, Outbound, and Transfer, separated by a colon.
     * For example -&gt; Caller ID:Outbound:Transfer would be all three.
     * </pre>
     *
     * <code>repeated .api.commons.PhoneBookPhoneNumberType phone_number_types = 2 [json_name = "phoneNumberTypes"];</code>
     * @return The count of phoneNumberTypes.
     */
    public int getPhoneNumberTypesCount() {
      return phoneNumberTypes_.size();
    }
    /**
     * <pre>
     * The phone number types determines where this phone book is used.
     * It can be any combination of Caller ID, Outbound, and Transfer, separated by a colon.
     * For example -&gt; Caller ID:Outbound:Transfer would be all three.
     * </pre>
     *
     * <code>repeated .api.commons.PhoneBookPhoneNumberType phone_number_types = 2 [json_name = "phoneNumberTypes"];</code>
     * @param index The index of the element to return.
     * @return The phoneNumberTypes at the given index.
     */
    public com.tcn.cloud.api.api.commons.PhoneBookPhoneNumberType getPhoneNumberTypes(int index) {
      return phoneNumberTypes_converter_.convert(phoneNumberTypes_.get(index));
    }
    /**
     * <pre>
     * The phone number types determines where this phone book is used.
     * It can be any combination of Caller ID, Outbound, and Transfer, separated by a colon.
     * For example -&gt; Caller ID:Outbound:Transfer would be all three.
     * </pre>
     *
     * <code>repeated .api.commons.PhoneBookPhoneNumberType phone_number_types = 2 [json_name = "phoneNumberTypes"];</code>
     * @param index The index to set the value at.
     * @param value The phoneNumberTypes to set.
     * @return This builder for chaining.
     */
    public Builder setPhoneNumberTypes(
        int index, com.tcn.cloud.api.api.commons.PhoneBookPhoneNumberType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensurePhoneNumberTypesIsMutable();
      phoneNumberTypes_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The phone number types determines where this phone book is used.
     * It can be any combination of Caller ID, Outbound, and Transfer, separated by a colon.
     * For example -&gt; Caller ID:Outbound:Transfer would be all three.
     * </pre>
     *
     * <code>repeated .api.commons.PhoneBookPhoneNumberType phone_number_types = 2 [json_name = "phoneNumberTypes"];</code>
     * @param value The phoneNumberTypes to add.
     * @return This builder for chaining.
     */
    public Builder addPhoneNumberTypes(com.tcn.cloud.api.api.commons.PhoneBookPhoneNumberType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensurePhoneNumberTypesIsMutable();
      phoneNumberTypes_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The phone number types determines where this phone book is used.
     * It can be any combination of Caller ID, Outbound, and Transfer, separated by a colon.
     * For example -&gt; Caller ID:Outbound:Transfer would be all three.
     * </pre>
     *
     * <code>repeated .api.commons.PhoneBookPhoneNumberType phone_number_types = 2 [json_name = "phoneNumberTypes"];</code>
     * @param values The phoneNumberTypes to add.
     * @return This builder for chaining.
     */
    public Builder addAllPhoneNumberTypes(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.commons.PhoneBookPhoneNumberType> values) {
      ensurePhoneNumberTypesIsMutable();
      for (com.tcn.cloud.api.api.commons.PhoneBookPhoneNumberType value : values) {
        phoneNumberTypes_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The phone number types determines where this phone book is used.
     * It can be any combination of Caller ID, Outbound, and Transfer, separated by a colon.
     * For example -&gt; Caller ID:Outbound:Transfer would be all three.
     * </pre>
     *
     * <code>repeated .api.commons.PhoneBookPhoneNumberType phone_number_types = 2 [json_name = "phoneNumberTypes"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPhoneNumberTypes() {
      phoneNumberTypes_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The phone number types determines where this phone book is used.
     * It can be any combination of Caller ID, Outbound, and Transfer, separated by a colon.
     * For example -&gt; Caller ID:Outbound:Transfer would be all three.
     * </pre>
     *
     * <code>repeated .api.commons.PhoneBookPhoneNumberType phone_number_types = 2 [json_name = "phoneNumberTypes"];</code>
     * @return A list containing the enum numeric values on the wire for phoneNumberTypes.
     */
    public java.util.List<java.lang.Integer>
    getPhoneNumberTypesValueList() {
      return java.util.Collections.unmodifiableList(phoneNumberTypes_);
    }
    /**
     * <pre>
     * The phone number types determines where this phone book is used.
     * It can be any combination of Caller ID, Outbound, and Transfer, separated by a colon.
     * For example -&gt; Caller ID:Outbound:Transfer would be all three.
     * </pre>
     *
     * <code>repeated .api.commons.PhoneBookPhoneNumberType phone_number_types = 2 [json_name = "phoneNumberTypes"];</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of phoneNumberTypes at the given index.
     */
    public int getPhoneNumberTypesValue(int index) {
      return phoneNumberTypes_.get(index);
    }
    /**
     * <pre>
     * The phone number types determines where this phone book is used.
     * It can be any combination of Caller ID, Outbound, and Transfer, separated by a colon.
     * For example -&gt; Caller ID:Outbound:Transfer would be all three.
     * </pre>
     *
     * <code>repeated .api.commons.PhoneBookPhoneNumberType phone_number_types = 2 [json_name = "phoneNumberTypes"];</code>
     * @param index The index to set the value at.
     * @param value The enum numeric value on the wire for phoneNumberTypes to set.
     * @return This builder for chaining.
     */
    public Builder setPhoneNumberTypesValue(
        int index, int value) {
      ensurePhoneNumberTypesIsMutable();
      phoneNumberTypes_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The phone number types determines where this phone book is used.
     * It can be any combination of Caller ID, Outbound, and Transfer, separated by a colon.
     * For example -&gt; Caller ID:Outbound:Transfer would be all three.
     * </pre>
     *
     * <code>repeated .api.commons.PhoneBookPhoneNumberType phone_number_types = 2 [json_name = "phoneNumberTypes"];</code>
     * @param value The enum numeric value on the wire for phoneNumberTypes to add.
     * @return This builder for chaining.
     */
    public Builder addPhoneNumberTypesValue(int value) {
      ensurePhoneNumberTypesIsMutable();
      phoneNumberTypes_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The phone number types determines where this phone book is used.
     * It can be any combination of Caller ID, Outbound, and Transfer, separated by a colon.
     * For example -&gt; Caller ID:Outbound:Transfer would be all three.
     * </pre>
     *
     * <code>repeated .api.commons.PhoneBookPhoneNumberType phone_number_types = 2 [json_name = "phoneNumberTypes"];</code>
     * @param values The enum numeric values on the wire for phoneNumberTypes to add.
     * @return This builder for chaining.
     */
    public Builder addAllPhoneNumberTypesValue(
        java.lang.Iterable<java.lang.Integer> values) {
      ensurePhoneNumberTypesIsMutable();
      for (int value : values) {
        phoneNumberTypes_.add(value);
      }
      onChanged();
      return this;
    }

    private boolean whiteList_ ;
    /**
     * <code>bool white_list = 3 [json_name = "whiteList"];</code>
     * @return The whiteList.
     */
    @java.lang.Override
    public boolean getWhiteList() {
      return whiteList_;
    }
    /**
     * <code>bool white_list = 3 [json_name = "whiteList"];</code>
     * @param value The whiteList to set.
     * @return This builder for chaining.
     */
    public Builder setWhiteList(boolean value) {

      whiteList_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>bool white_list = 3 [json_name = "whiteList"];</code>
     * @return This builder for chaining.
     */
    public Builder clearWhiteList() {
      bitField0_ = (bitField0_ & ~0x00000004);
      whiteList_ = false;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.PhoneBookStandardNumber)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.PhoneBookStandardNumber)
  private static final com.tcn.cloud.api.api.v0alpha.PhoneBookStandardNumber DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.PhoneBookStandardNumber();
  }

  public static com.tcn.cloud.api.api.v0alpha.PhoneBookStandardNumber getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PhoneBookStandardNumber>
      PARSER = new com.google.protobuf.AbstractParser<PhoneBookStandardNumber>() {
    @java.lang.Override
    public PhoneBookStandardNumber parsePartialFrom(
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

  public static com.google.protobuf.Parser<PhoneBookStandardNumber> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PhoneBookStandardNumber> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.PhoneBookStandardNumber getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

