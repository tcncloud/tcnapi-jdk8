// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/p3api.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.ContactFieldDescription}
 */
public final class ContactFieldDescription extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.ContactFieldDescription)
    ContactFieldDescriptionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ContactFieldDescription.newBuilder() to construct.
  private ContactFieldDescription(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ContactFieldDescription() {
    fieldName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ContactFieldDescription();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_ContactFieldDescription_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_ContactFieldDescription_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.ContactFieldDescription.class, com.tcn.cloud.api.api.v0alpha.ContactFieldDescription.Builder.class);
  }

  public static final int CONTACT_FIELD_DESCRIPTION_SID_FIELD_NUMBER = 1;
  private int contactFieldDescriptionSid_ = 0;
  /**
   * <code>int32 contact_field_description_sid = 1 [json_name = "contactFieldDescriptionSid"];</code>
   * @return The contactFieldDescriptionSid.
   */
  @java.lang.Override
  public int getContactFieldDescriptionSid() {
    return contactFieldDescriptionSid_;
  }

  public static final int FIELD_NAME_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object fieldName_ = "";
  /**
   * <code>string field_name = 3 [json_name = "fieldName"];</code>
   * @return The fieldName.
   */
  @java.lang.Override
  public java.lang.String getFieldName() {
    java.lang.Object ref = fieldName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fieldName_ = s;
      return s;
    }
  }
  /**
   * <code>string field_name = 3 [json_name = "fieldName"];</code>
   * @return The bytes for fieldName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFieldNameBytes() {
    java.lang.Object ref = fieldName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fieldName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IS_PHONE_FIELD_NUMBER = 4;
  private boolean isPhone_ = false;
  /**
   * <code>bool is_phone = 4 [json_name = "isPhone"];</code>
   * @return The isPhone.
   */
  @java.lang.Override
  public boolean getIsPhone() {
    return isPhone_;
  }

  public static final int DISPLAY_FORMAT_STRING_FIELD_NUMBER = 5;
  private com.google.protobuf.StringValue displayFormatString_;
  /**
   * <code>.google.protobuf.StringValue display_format_string = 5 [json_name = "displayFormatString"];</code>
   * @return Whether the displayFormatString field is set.
   */
  @java.lang.Override
  public boolean hasDisplayFormatString() {
    return displayFormatString_ != null;
  }
  /**
   * <code>.google.protobuf.StringValue display_format_string = 5 [json_name = "displayFormatString"];</code>
   * @return The displayFormatString.
   */
  @java.lang.Override
  public com.google.protobuf.StringValue getDisplayFormatString() {
    return displayFormatString_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : displayFormatString_;
  }
  /**
   * <code>.google.protobuf.StringValue display_format_string = 5 [json_name = "displayFormatString"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.StringValueOrBuilder getDisplayFormatStringOrBuilder() {
    return displayFormatString_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : displayFormatString_;
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
    if (contactFieldDescriptionSid_ != 0) {
      output.writeInt32(1, contactFieldDescriptionSid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fieldName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, fieldName_);
    }
    if (isPhone_ != false) {
      output.writeBool(4, isPhone_);
    }
    if (displayFormatString_ != null) {
      output.writeMessage(5, getDisplayFormatString());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (contactFieldDescriptionSid_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, contactFieldDescriptionSid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fieldName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, fieldName_);
    }
    if (isPhone_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, isPhone_);
    }
    if (displayFormatString_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getDisplayFormatString());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.ContactFieldDescription)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.ContactFieldDescription other = (com.tcn.cloud.api.api.v0alpha.ContactFieldDescription) obj;

    if (getContactFieldDescriptionSid()
        != other.getContactFieldDescriptionSid()) return false;
    if (!getFieldName()
        .equals(other.getFieldName())) return false;
    if (getIsPhone()
        != other.getIsPhone()) return false;
    if (hasDisplayFormatString() != other.hasDisplayFormatString()) return false;
    if (hasDisplayFormatString()) {
      if (!getDisplayFormatString()
          .equals(other.getDisplayFormatString())) return false;
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
    hash = (37 * hash) + CONTACT_FIELD_DESCRIPTION_SID_FIELD_NUMBER;
    hash = (53 * hash) + getContactFieldDescriptionSid();
    hash = (37 * hash) + FIELD_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getFieldName().hashCode();
    hash = (37 * hash) + IS_PHONE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsPhone());
    if (hasDisplayFormatString()) {
      hash = (37 * hash) + DISPLAY_FORMAT_STRING_FIELD_NUMBER;
      hash = (53 * hash) + getDisplayFormatString().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.ContactFieldDescription parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ContactFieldDescription parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ContactFieldDescription parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ContactFieldDescription parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ContactFieldDescription parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ContactFieldDescription parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ContactFieldDescription parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.ContactFieldDescription parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.ContactFieldDescription parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.ContactFieldDescription parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ContactFieldDescription parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.ContactFieldDescription parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.ContactFieldDescription prototype) {
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
   * Protobuf type {@code api.v0alpha.ContactFieldDescription}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.ContactFieldDescription)
      com.tcn.cloud.api.api.v0alpha.ContactFieldDescriptionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_ContactFieldDescription_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_ContactFieldDescription_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.ContactFieldDescription.class, com.tcn.cloud.api.api.v0alpha.ContactFieldDescription.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.ContactFieldDescription.newBuilder()
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
      contactFieldDescriptionSid_ = 0;
      fieldName_ = "";
      isPhone_ = false;
      displayFormatString_ = null;
      if (displayFormatStringBuilder_ != null) {
        displayFormatStringBuilder_.dispose();
        displayFormatStringBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_ContactFieldDescription_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ContactFieldDescription getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.ContactFieldDescription.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ContactFieldDescription build() {
      com.tcn.cloud.api.api.v0alpha.ContactFieldDescription result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ContactFieldDescription buildPartial() {
      com.tcn.cloud.api.api.v0alpha.ContactFieldDescription result = new com.tcn.cloud.api.api.v0alpha.ContactFieldDescription(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.ContactFieldDescription result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.contactFieldDescriptionSid_ = contactFieldDescriptionSid_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.fieldName_ = fieldName_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.isPhone_ = isPhone_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.displayFormatString_ = displayFormatStringBuilder_ == null
            ? displayFormatString_
            : displayFormatStringBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.ContactFieldDescription) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.ContactFieldDescription)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.ContactFieldDescription other) {
      if (other == com.tcn.cloud.api.api.v0alpha.ContactFieldDescription.getDefaultInstance()) return this;
      if (other.getContactFieldDescriptionSid() != 0) {
        setContactFieldDescriptionSid(other.getContactFieldDescriptionSid());
      }
      if (!other.getFieldName().isEmpty()) {
        fieldName_ = other.fieldName_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getIsPhone() != false) {
        setIsPhone(other.getIsPhone());
      }
      if (other.hasDisplayFormatString()) {
        mergeDisplayFormatString(other.getDisplayFormatString());
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
              contactFieldDescriptionSid_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 26: {
              fieldName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 26
            case 32: {
              isPhone_ = input.readBool();
              bitField0_ |= 0x00000004;
              break;
            } // case 32
            case 42: {
              input.readMessage(
                  getDisplayFormatStringFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000008;
              break;
            } // case 42
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

    private int contactFieldDescriptionSid_ ;
    /**
     * <code>int32 contact_field_description_sid = 1 [json_name = "contactFieldDescriptionSid"];</code>
     * @return The contactFieldDescriptionSid.
     */
    @java.lang.Override
    public int getContactFieldDescriptionSid() {
      return contactFieldDescriptionSid_;
    }
    /**
     * <code>int32 contact_field_description_sid = 1 [json_name = "contactFieldDescriptionSid"];</code>
     * @param value The contactFieldDescriptionSid to set.
     * @return This builder for chaining.
     */
    public Builder setContactFieldDescriptionSid(int value) {

      contactFieldDescriptionSid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int32 contact_field_description_sid = 1 [json_name = "contactFieldDescriptionSid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearContactFieldDescriptionSid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      contactFieldDescriptionSid_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object fieldName_ = "";
    /**
     * <code>string field_name = 3 [json_name = "fieldName"];</code>
     * @return The fieldName.
     */
    public java.lang.String getFieldName() {
      java.lang.Object ref = fieldName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fieldName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string field_name = 3 [json_name = "fieldName"];</code>
     * @return The bytes for fieldName.
     */
    public com.google.protobuf.ByteString
        getFieldNameBytes() {
      java.lang.Object ref = fieldName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fieldName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string field_name = 3 [json_name = "fieldName"];</code>
     * @param value The fieldName to set.
     * @return This builder for chaining.
     */
    public Builder setFieldName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      fieldName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string field_name = 3 [json_name = "fieldName"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFieldName() {
      fieldName_ = getDefaultInstance().getFieldName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string field_name = 3 [json_name = "fieldName"];</code>
     * @param value The bytes for fieldName to set.
     * @return This builder for chaining.
     */
    public Builder setFieldNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      fieldName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private boolean isPhone_ ;
    /**
     * <code>bool is_phone = 4 [json_name = "isPhone"];</code>
     * @return The isPhone.
     */
    @java.lang.Override
    public boolean getIsPhone() {
      return isPhone_;
    }
    /**
     * <code>bool is_phone = 4 [json_name = "isPhone"];</code>
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
     * <code>bool is_phone = 4 [json_name = "isPhone"];</code>
     * @return This builder for chaining.
     */
    public Builder clearIsPhone() {
      bitField0_ = (bitField0_ & ~0x00000004);
      isPhone_ = false;
      onChanged();
      return this;
    }

    private com.google.protobuf.StringValue displayFormatString_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> displayFormatStringBuilder_;
    /**
     * <code>.google.protobuf.StringValue display_format_string = 5 [json_name = "displayFormatString"];</code>
     * @return Whether the displayFormatString field is set.
     */
    public boolean hasDisplayFormatString() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>.google.protobuf.StringValue display_format_string = 5 [json_name = "displayFormatString"];</code>
     * @return The displayFormatString.
     */
    public com.google.protobuf.StringValue getDisplayFormatString() {
      if (displayFormatStringBuilder_ == null) {
        return displayFormatString_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : displayFormatString_;
      } else {
        return displayFormatStringBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.StringValue display_format_string = 5 [json_name = "displayFormatString"];</code>
     */
    public Builder setDisplayFormatString(com.google.protobuf.StringValue value) {
      if (displayFormatStringBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        displayFormatString_ = value;
      } else {
        displayFormatStringBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.StringValue display_format_string = 5 [json_name = "displayFormatString"];</code>
     */
    public Builder setDisplayFormatString(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (displayFormatStringBuilder_ == null) {
        displayFormatString_ = builderForValue.build();
      } else {
        displayFormatStringBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.StringValue display_format_string = 5 [json_name = "displayFormatString"];</code>
     */
    public Builder mergeDisplayFormatString(com.google.protobuf.StringValue value) {
      if (displayFormatStringBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          displayFormatString_ != null &&
          displayFormatString_ != com.google.protobuf.StringValue.getDefaultInstance()) {
          getDisplayFormatStringBuilder().mergeFrom(value);
        } else {
          displayFormatString_ = value;
        }
      } else {
        displayFormatStringBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.StringValue display_format_string = 5 [json_name = "displayFormatString"];</code>
     */
    public Builder clearDisplayFormatString() {
      bitField0_ = (bitField0_ & ~0x00000008);
      displayFormatString_ = null;
      if (displayFormatStringBuilder_ != null) {
        displayFormatStringBuilder_.dispose();
        displayFormatStringBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.StringValue display_format_string = 5 [json_name = "displayFormatString"];</code>
     */
    public com.google.protobuf.StringValue.Builder getDisplayFormatStringBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getDisplayFormatStringFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.StringValue display_format_string = 5 [json_name = "displayFormatString"];</code>
     */
    public com.google.protobuf.StringValueOrBuilder getDisplayFormatStringOrBuilder() {
      if (displayFormatStringBuilder_ != null) {
        return displayFormatStringBuilder_.getMessageOrBuilder();
      } else {
        return displayFormatString_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : displayFormatString_;
      }
    }
    /**
     * <code>.google.protobuf.StringValue display_format_string = 5 [json_name = "displayFormatString"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getDisplayFormatStringFieldBuilder() {
      if (displayFormatStringBuilder_ == null) {
        displayFormatStringBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getDisplayFormatString(),
                getParentForChildren(),
                isClean());
        displayFormatString_ = null;
      }
      return displayFormatStringBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.ContactFieldDescription)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.ContactFieldDescription)
  private static final com.tcn.cloud.api.api.v0alpha.ContactFieldDescription DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.ContactFieldDescription();
  }

  public static com.tcn.cloud.api.api.v0alpha.ContactFieldDescription getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ContactFieldDescription>
      PARSER = new com.google.protobuf.AbstractParser<ContactFieldDescription>() {
    @java.lang.Override
    public ContactFieldDescription parsePartialFrom(
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

  public static com.google.protobuf.Parser<ContactFieldDescription> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ContactFieldDescription> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.ContactFieldDescription getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

