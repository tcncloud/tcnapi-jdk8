// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/p3api.proto

package com.tcn.cloud.api.api.commons;

/**
 * Protobuf type {@code api.commons.ClientInfoDataRow}
 */
public final class ClientInfoDataRow extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.commons.ClientInfoDataRow)
    ClientInfoDataRowOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ClientInfoDataRow.newBuilder() to construct.
  private ClientInfoDataRow(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ClientInfoDataRow() {
    fieldLabel_ = "";
    fieldValue_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ClientInfoDataRow();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.commons.P3apiProto.internal_static_api_commons_ClientInfoDataRow_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.commons.P3apiProto.internal_static_api_commons_ClientInfoDataRow_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.commons.ClientInfoDataRow.class, com.tcn.cloud.api.api.commons.ClientInfoDataRow.Builder.class);
  }

  public static final int FIELD_LABEL_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object fieldLabel_ = "";
  /**
   * <code>string field_label = 1 [json_name = "fieldLabel"];</code>
   * @return The fieldLabel.
   */
  @java.lang.Override
  public java.lang.String getFieldLabel() {
    java.lang.Object ref = fieldLabel_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fieldLabel_ = s;
      return s;
    }
  }
  /**
   * <code>string field_label = 1 [json_name = "fieldLabel"];</code>
   * @return The bytes for fieldLabel.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFieldLabelBytes() {
    java.lang.Object ref = fieldLabel_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fieldLabel_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FIELD_VALUE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object fieldValue_ = "";
  /**
   * <code>string field_value = 2 [json_name = "fieldValue"];</code>
   * @return The fieldValue.
   */
  @java.lang.Override
  public java.lang.String getFieldValue() {
    java.lang.Object ref = fieldValue_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fieldValue_ = s;
      return s;
    }
  }
  /**
   * <code>string field_value = 2 [json_name = "fieldValue"];</code>
   * @return The bytes for fieldValue.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFieldValueBytes() {
    java.lang.Object ref = fieldValue_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fieldValue_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IS_PHONE_FIELD_NUMBER = 3;
  private boolean isPhone_ = false;
  /**
   * <code>bool is_phone = 3 [json_name = "isPhone"];</code>
   * @return The isPhone.
   */
  @java.lang.Override
  public boolean getIsPhone() {
    return isPhone_;
  }

  public static final int DIALED_NUMBER_FIELD_NUMBER = 4;
  private boolean dialedNumber_ = false;
  /**
   * <code>bool dialed_number = 4 [json_name = "dialedNumber"];</code>
   * @return The dialedNumber.
   */
  @java.lang.Override
  public boolean getDialedNumber() {
    return dialedNumber_;
  }

  public static final int CONTACT_FIELD_DESCRIPTION_SID_FIELD_NUMBER = 5;
  private long contactFieldDescriptionSid_ = 0L;
  /**
   * <code>int64 contact_field_description_sid = 5 [json_name = "contactFieldDescriptionSid"];</code>
   * @return The contactFieldDescriptionSid.
   */
  @java.lang.Override
  public long getContactFieldDescriptionSid() {
    return contactFieldDescriptionSid_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fieldLabel_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, fieldLabel_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fieldValue_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, fieldValue_);
    }
    if (isPhone_ != false) {
      output.writeBool(3, isPhone_);
    }
    if (dialedNumber_ != false) {
      output.writeBool(4, dialedNumber_);
    }
    if (contactFieldDescriptionSid_ != 0L) {
      output.writeInt64(5, contactFieldDescriptionSid_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fieldLabel_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, fieldLabel_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fieldValue_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, fieldValue_);
    }
    if (isPhone_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, isPhone_);
    }
    if (dialedNumber_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, dialedNumber_);
    }
    if (contactFieldDescriptionSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, contactFieldDescriptionSid_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.commons.ClientInfoDataRow)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.commons.ClientInfoDataRow other = (com.tcn.cloud.api.api.commons.ClientInfoDataRow) obj;

    if (!getFieldLabel()
        .equals(other.getFieldLabel())) return false;
    if (!getFieldValue()
        .equals(other.getFieldValue())) return false;
    if (getIsPhone()
        != other.getIsPhone()) return false;
    if (getDialedNumber()
        != other.getDialedNumber()) return false;
    if (getContactFieldDescriptionSid()
        != other.getContactFieldDescriptionSid()) return false;
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
    hash = (37 * hash) + FIELD_LABEL_FIELD_NUMBER;
    hash = (53 * hash) + getFieldLabel().hashCode();
    hash = (37 * hash) + FIELD_VALUE_FIELD_NUMBER;
    hash = (53 * hash) + getFieldValue().hashCode();
    hash = (37 * hash) + IS_PHONE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsPhone());
    hash = (37 * hash) + DIALED_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDialedNumber());
    hash = (37 * hash) + CONTACT_FIELD_DESCRIPTION_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getContactFieldDescriptionSid());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.commons.ClientInfoDataRow parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.ClientInfoDataRow parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.ClientInfoDataRow parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.ClientInfoDataRow parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.ClientInfoDataRow parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.ClientInfoDataRow parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.ClientInfoDataRow parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.ClientInfoDataRow parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.commons.ClientInfoDataRow parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.commons.ClientInfoDataRow parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.ClientInfoDataRow parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.ClientInfoDataRow parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.commons.ClientInfoDataRow prototype) {
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
   * Protobuf type {@code api.commons.ClientInfoDataRow}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.commons.ClientInfoDataRow)
      com.tcn.cloud.api.api.commons.ClientInfoDataRowOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.P3apiProto.internal_static_api_commons_ClientInfoDataRow_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.commons.P3apiProto.internal_static_api_commons_ClientInfoDataRow_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.commons.ClientInfoDataRow.class, com.tcn.cloud.api.api.commons.ClientInfoDataRow.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.commons.ClientInfoDataRow.newBuilder()
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
      fieldLabel_ = "";
      fieldValue_ = "";
      isPhone_ = false;
      dialedNumber_ = false;
      contactFieldDescriptionSid_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.commons.P3apiProto.internal_static_api_commons_ClientInfoDataRow_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.ClientInfoDataRow getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.commons.ClientInfoDataRow.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.ClientInfoDataRow build() {
      com.tcn.cloud.api.api.commons.ClientInfoDataRow result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.ClientInfoDataRow buildPartial() {
      com.tcn.cloud.api.api.commons.ClientInfoDataRow result = new com.tcn.cloud.api.api.commons.ClientInfoDataRow(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.commons.ClientInfoDataRow result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.fieldLabel_ = fieldLabel_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.fieldValue_ = fieldValue_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.isPhone_ = isPhone_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.dialedNumber_ = dialedNumber_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.contactFieldDescriptionSid_ = contactFieldDescriptionSid_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.commons.ClientInfoDataRow) {
        return mergeFrom((com.tcn.cloud.api.api.commons.ClientInfoDataRow)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.commons.ClientInfoDataRow other) {
      if (other == com.tcn.cloud.api.api.commons.ClientInfoDataRow.getDefaultInstance()) return this;
      if (!other.getFieldLabel().isEmpty()) {
        fieldLabel_ = other.fieldLabel_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getFieldValue().isEmpty()) {
        fieldValue_ = other.fieldValue_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getIsPhone() != false) {
        setIsPhone(other.getIsPhone());
      }
      if (other.getDialedNumber() != false) {
        setDialedNumber(other.getDialedNumber());
      }
      if (other.getContactFieldDescriptionSid() != 0L) {
        setContactFieldDescriptionSid(other.getContactFieldDescriptionSid());
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
              fieldLabel_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              fieldValue_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              isPhone_ = input.readBool();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              dialedNumber_ = input.readBool();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 40: {
              contactFieldDescriptionSid_ = input.readInt64();
              bitField0_ |= 0x00000010;
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

    private java.lang.Object fieldLabel_ = "";
    /**
     * <code>string field_label = 1 [json_name = "fieldLabel"];</code>
     * @return The fieldLabel.
     */
    public java.lang.String getFieldLabel() {
      java.lang.Object ref = fieldLabel_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fieldLabel_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string field_label = 1 [json_name = "fieldLabel"];</code>
     * @return The bytes for fieldLabel.
     */
    public com.google.protobuf.ByteString
        getFieldLabelBytes() {
      java.lang.Object ref = fieldLabel_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fieldLabel_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string field_label = 1 [json_name = "fieldLabel"];</code>
     * @param value The fieldLabel to set.
     * @return This builder for chaining.
     */
    public Builder setFieldLabel(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      fieldLabel_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string field_label = 1 [json_name = "fieldLabel"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFieldLabel() {
      fieldLabel_ = getDefaultInstance().getFieldLabel();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string field_label = 1 [json_name = "fieldLabel"];</code>
     * @param value The bytes for fieldLabel to set.
     * @return This builder for chaining.
     */
    public Builder setFieldLabelBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      fieldLabel_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object fieldValue_ = "";
    /**
     * <code>string field_value = 2 [json_name = "fieldValue"];</code>
     * @return The fieldValue.
     */
    public java.lang.String getFieldValue() {
      java.lang.Object ref = fieldValue_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fieldValue_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string field_value = 2 [json_name = "fieldValue"];</code>
     * @return The bytes for fieldValue.
     */
    public com.google.protobuf.ByteString
        getFieldValueBytes() {
      java.lang.Object ref = fieldValue_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fieldValue_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string field_value = 2 [json_name = "fieldValue"];</code>
     * @param value The fieldValue to set.
     * @return This builder for chaining.
     */
    public Builder setFieldValue(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      fieldValue_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string field_value = 2 [json_name = "fieldValue"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFieldValue() {
      fieldValue_ = getDefaultInstance().getFieldValue();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string field_value = 2 [json_name = "fieldValue"];</code>
     * @param value The bytes for fieldValue to set.
     * @return This builder for chaining.
     */
    public Builder setFieldValueBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      fieldValue_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private boolean isPhone_ ;
    /**
     * <code>bool is_phone = 3 [json_name = "isPhone"];</code>
     * @return The isPhone.
     */
    @java.lang.Override
    public boolean getIsPhone() {
      return isPhone_;
    }
    /**
     * <code>bool is_phone = 3 [json_name = "isPhone"];</code>
     * @param value The isPhone to set.
     * @return This builder for chaining.
     */
    public Builder setIsPhone(boolean value) {

      isPhone_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>bool is_phone = 3 [json_name = "isPhone"];</code>
     * @return This builder for chaining.
     */
    public Builder clearIsPhone() {
      bitField0_ = (bitField0_ & ~0x00000004);
      isPhone_ = false;
      onChanged();
      return this;
    }

    private boolean dialedNumber_ ;
    /**
     * <code>bool dialed_number = 4 [json_name = "dialedNumber"];</code>
     * @return The dialedNumber.
     */
    @java.lang.Override
    public boolean getDialedNumber() {
      return dialedNumber_;
    }
    /**
     * <code>bool dialed_number = 4 [json_name = "dialedNumber"];</code>
     * @param value The dialedNumber to set.
     * @return This builder for chaining.
     */
    public Builder setDialedNumber(boolean value) {

      dialedNumber_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>bool dialed_number = 4 [json_name = "dialedNumber"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDialedNumber() {
      bitField0_ = (bitField0_ & ~0x00000008);
      dialedNumber_ = false;
      onChanged();
      return this;
    }

    private long contactFieldDescriptionSid_ ;
    /**
     * <code>int64 contact_field_description_sid = 5 [json_name = "contactFieldDescriptionSid"];</code>
     * @return The contactFieldDescriptionSid.
     */
    @java.lang.Override
    public long getContactFieldDescriptionSid() {
      return contactFieldDescriptionSid_;
    }
    /**
     * <code>int64 contact_field_description_sid = 5 [json_name = "contactFieldDescriptionSid"];</code>
     * @param value The contactFieldDescriptionSid to set.
     * @return This builder for chaining.
     */
    public Builder setContactFieldDescriptionSid(long value) {

      contactFieldDescriptionSid_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>int64 contact_field_description_sid = 5 [json_name = "contactFieldDescriptionSid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearContactFieldDescriptionSid() {
      bitField0_ = (bitField0_ & ~0x00000010);
      contactFieldDescriptionSid_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:api.commons.ClientInfoDataRow)
  }

  // @@protoc_insertion_point(class_scope:api.commons.ClientInfoDataRow)
  private static final com.tcn.cloud.api.api.commons.ClientInfoDataRow DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.commons.ClientInfoDataRow();
  }

  public static com.tcn.cloud.api.api.commons.ClientInfoDataRow getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ClientInfoDataRow>
      PARSER = new com.google.protobuf.AbstractParser<ClientInfoDataRow>() {
    @java.lang.Override
    public ClientInfoDataRow parsePartialFrom(
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

  public static com.google.protobuf.Parser<ClientInfoDataRow> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ClientInfoDataRow> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.commons.ClientInfoDataRow getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

