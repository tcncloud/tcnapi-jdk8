// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/legacy/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.legacy;

/**
 * Protobuf type {@code api.v1alpha1.org.legacy.ContactFieldStyle}
 */
public final class ContactFieldStyle extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.org.legacy.ContactFieldStyle)
    ContactFieldStyleOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ContactFieldStyle.newBuilder() to construct.
  private ContactFieldStyle(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ContactFieldStyle() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ContactFieldStyle();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_ContactFieldStyle_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_ContactFieldStyle_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.org.legacy.ContactFieldStyle.class, com.tcn.cloud.api.api.v1alpha1.org.legacy.ContactFieldStyle.Builder.class);
  }

  private int bitField0_;
  public static final int CONTACT_FIELD_DESCRIPTION_SID_FIELD_NUMBER = 1;
  private long contactFieldDescriptionSid_ = 0L;
  /**
   * <code>int64 contact_field_description_sid = 1 [json_name = "contactFieldDescriptionSid"];</code>
   * @return The contactFieldDescriptionSid.
   */
  @java.lang.Override
  public long getContactFieldDescriptionSid() {
    return contactFieldDescriptionSid_;
  }

  public static final int TEXT_COLOR_FIELD_NUMBER = 2;
  private com.tcn.cloud.api.api.v1alpha1.org.legacy.Color textColor_;
  /**
   * <code>.api.v1alpha1.org.legacy.Color text_color = 2 [json_name = "textColor"];</code>
   * @return Whether the textColor field is set.
   */
  @java.lang.Override
  public boolean hasTextColor() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.api.v1alpha1.org.legacy.Color text_color = 2 [json_name = "textColor"];</code>
   * @return The textColor.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.legacy.Color getTextColor() {
    return textColor_ == null ? com.tcn.cloud.api.api.v1alpha1.org.legacy.Color.getDefaultInstance() : textColor_;
  }
  /**
   * <code>.api.v1alpha1.org.legacy.Color text_color = 2 [json_name = "textColor"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.legacy.ColorOrBuilder getTextColorOrBuilder() {
    return textColor_ == null ? com.tcn.cloud.api.api.v1alpha1.org.legacy.Color.getDefaultInstance() : textColor_;
  }

  public static final int BACKGROUND_COLOR_FIELD_NUMBER = 3;
  private com.tcn.cloud.api.api.v1alpha1.org.legacy.Color backgroundColor_;
  /**
   * <code>.api.v1alpha1.org.legacy.Color background_color = 3 [json_name = "backgroundColor"];</code>
   * @return Whether the backgroundColor field is set.
   */
  @java.lang.Override
  public boolean hasBackgroundColor() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>.api.v1alpha1.org.legacy.Color background_color = 3 [json_name = "backgroundColor"];</code>
   * @return The backgroundColor.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.legacy.Color getBackgroundColor() {
    return backgroundColor_ == null ? com.tcn.cloud.api.api.v1alpha1.org.legacy.Color.getDefaultInstance() : backgroundColor_;
  }
  /**
   * <code>.api.v1alpha1.org.legacy.Color background_color = 3 [json_name = "backgroundColor"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.legacy.ColorOrBuilder getBackgroundColorOrBuilder() {
    return backgroundColor_ == null ? com.tcn.cloud.api.api.v1alpha1.org.legacy.Color.getDefaultInstance() : backgroundColor_;
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
    if (contactFieldDescriptionSid_ != 0L) {
      output.writeInt64(1, contactFieldDescriptionSid_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getTextColor());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(3, getBackgroundColor());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (contactFieldDescriptionSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, contactFieldDescriptionSid_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getTextColor());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getBackgroundColor());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.org.legacy.ContactFieldStyle)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.org.legacy.ContactFieldStyle other = (com.tcn.cloud.api.api.v1alpha1.org.legacy.ContactFieldStyle) obj;

    if (getContactFieldDescriptionSid()
        != other.getContactFieldDescriptionSid()) return false;
    if (hasTextColor() != other.hasTextColor()) return false;
    if (hasTextColor()) {
      if (!getTextColor()
          .equals(other.getTextColor())) return false;
    }
    if (hasBackgroundColor() != other.hasBackgroundColor()) return false;
    if (hasBackgroundColor()) {
      if (!getBackgroundColor()
          .equals(other.getBackgroundColor())) return false;
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
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getContactFieldDescriptionSid());
    if (hasTextColor()) {
      hash = (37 * hash) + TEXT_COLOR_FIELD_NUMBER;
      hash = (53 * hash) + getTextColor().hashCode();
    }
    if (hasBackgroundColor()) {
      hash = (37 * hash) + BACKGROUND_COLOR_FIELD_NUMBER;
      hash = (53 * hash) + getBackgroundColor().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.ContactFieldStyle parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.ContactFieldStyle parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.ContactFieldStyle parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.ContactFieldStyle parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.ContactFieldStyle parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.ContactFieldStyle parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.ContactFieldStyle parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.ContactFieldStyle parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.ContactFieldStyle parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.ContactFieldStyle parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.ContactFieldStyle parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.ContactFieldStyle parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.org.legacy.ContactFieldStyle prototype) {
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
   * Protobuf type {@code api.v1alpha1.org.legacy.ContactFieldStyle}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.org.legacy.ContactFieldStyle)
      com.tcn.cloud.api.api.v1alpha1.org.legacy.ContactFieldStyleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_ContactFieldStyle_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_ContactFieldStyle_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.org.legacy.ContactFieldStyle.class, com.tcn.cloud.api.api.v1alpha1.org.legacy.ContactFieldStyle.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.org.legacy.ContactFieldStyle.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getTextColorFieldBuilder();
        getBackgroundColorFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      contactFieldDescriptionSid_ = 0L;
      textColor_ = null;
      if (textColorBuilder_ != null) {
        textColorBuilder_.dispose();
        textColorBuilder_ = null;
      }
      backgroundColor_ = null;
      if (backgroundColorBuilder_ != null) {
        backgroundColorBuilder_.dispose();
        backgroundColorBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_ContactFieldStyle_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.ContactFieldStyle getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.ContactFieldStyle.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.ContactFieldStyle build() {
      com.tcn.cloud.api.api.v1alpha1.org.legacy.ContactFieldStyle result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.ContactFieldStyle buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.org.legacy.ContactFieldStyle result = new com.tcn.cloud.api.api.v1alpha1.org.legacy.ContactFieldStyle(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.org.legacy.ContactFieldStyle result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.contactFieldDescriptionSid_ = contactFieldDescriptionSid_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.textColor_ = textColorBuilder_ == null
            ? textColor_
            : textColorBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.backgroundColor_ = backgroundColorBuilder_ == null
            ? backgroundColor_
            : backgroundColorBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.org.legacy.ContactFieldStyle) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.org.legacy.ContactFieldStyle)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.org.legacy.ContactFieldStyle other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.org.legacy.ContactFieldStyle.getDefaultInstance()) return this;
      if (other.getContactFieldDescriptionSid() != 0L) {
        setContactFieldDescriptionSid(other.getContactFieldDescriptionSid());
      }
      if (other.hasTextColor()) {
        mergeTextColor(other.getTextColor());
      }
      if (other.hasBackgroundColor()) {
        mergeBackgroundColor(other.getBackgroundColor());
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
              contactFieldDescriptionSid_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getTextColorFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getBackgroundColorFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
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
    private int bitField0_;

    private long contactFieldDescriptionSid_ ;
    /**
     * <code>int64 contact_field_description_sid = 1 [json_name = "contactFieldDescriptionSid"];</code>
     * @return The contactFieldDescriptionSid.
     */
    @java.lang.Override
    public long getContactFieldDescriptionSid() {
      return contactFieldDescriptionSid_;
    }
    /**
     * <code>int64 contact_field_description_sid = 1 [json_name = "contactFieldDescriptionSid"];</code>
     * @param value The contactFieldDescriptionSid to set.
     * @return This builder for chaining.
     */
    public Builder setContactFieldDescriptionSid(long value) {

      contactFieldDescriptionSid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int64 contact_field_description_sid = 1 [json_name = "contactFieldDescriptionSid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearContactFieldDescriptionSid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      contactFieldDescriptionSid_ = 0L;
      onChanged();
      return this;
    }

    private com.tcn.cloud.api.api.v1alpha1.org.legacy.Color textColor_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.org.legacy.Color, com.tcn.cloud.api.api.v1alpha1.org.legacy.Color.Builder, com.tcn.cloud.api.api.v1alpha1.org.legacy.ColorOrBuilder> textColorBuilder_;
    /**
     * <code>.api.v1alpha1.org.legacy.Color text_color = 2 [json_name = "textColor"];</code>
     * @return Whether the textColor field is set.
     */
    public boolean hasTextColor() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.api.v1alpha1.org.legacy.Color text_color = 2 [json_name = "textColor"];</code>
     * @return The textColor.
     */
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.Color getTextColor() {
      if (textColorBuilder_ == null) {
        return textColor_ == null ? com.tcn.cloud.api.api.v1alpha1.org.legacy.Color.getDefaultInstance() : textColor_;
      } else {
        return textColorBuilder_.getMessage();
      }
    }
    /**
     * <code>.api.v1alpha1.org.legacy.Color text_color = 2 [json_name = "textColor"];</code>
     */
    public Builder setTextColor(com.tcn.cloud.api.api.v1alpha1.org.legacy.Color value) {
      if (textColorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        textColor_ = value;
      } else {
        textColorBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v1alpha1.org.legacy.Color text_color = 2 [json_name = "textColor"];</code>
     */
    public Builder setTextColor(
        com.tcn.cloud.api.api.v1alpha1.org.legacy.Color.Builder builderForValue) {
      if (textColorBuilder_ == null) {
        textColor_ = builderForValue.build();
      } else {
        textColorBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v1alpha1.org.legacy.Color text_color = 2 [json_name = "textColor"];</code>
     */
    public Builder mergeTextColor(com.tcn.cloud.api.api.v1alpha1.org.legacy.Color value) {
      if (textColorBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          textColor_ != null &&
          textColor_ != com.tcn.cloud.api.api.v1alpha1.org.legacy.Color.getDefaultInstance()) {
          getTextColorBuilder().mergeFrom(value);
        } else {
          textColor_ = value;
        }
      } else {
        textColorBuilder_.mergeFrom(value);
      }
      if (textColor_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.api.v1alpha1.org.legacy.Color text_color = 2 [json_name = "textColor"];</code>
     */
    public Builder clearTextColor() {
      bitField0_ = (bitField0_ & ~0x00000002);
      textColor_ = null;
      if (textColorBuilder_ != null) {
        textColorBuilder_.dispose();
        textColorBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.api.v1alpha1.org.legacy.Color text_color = 2 [json_name = "textColor"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.Color.Builder getTextColorBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getTextColorFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.v1alpha1.org.legacy.Color text_color = 2 [json_name = "textColor"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.ColorOrBuilder getTextColorOrBuilder() {
      if (textColorBuilder_ != null) {
        return textColorBuilder_.getMessageOrBuilder();
      } else {
        return textColor_ == null ?
            com.tcn.cloud.api.api.v1alpha1.org.legacy.Color.getDefaultInstance() : textColor_;
      }
    }
    /**
     * <code>.api.v1alpha1.org.legacy.Color text_color = 2 [json_name = "textColor"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.org.legacy.Color, com.tcn.cloud.api.api.v1alpha1.org.legacy.Color.Builder, com.tcn.cloud.api.api.v1alpha1.org.legacy.ColorOrBuilder> 
        getTextColorFieldBuilder() {
      if (textColorBuilder_ == null) {
        textColorBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.org.legacy.Color, com.tcn.cloud.api.api.v1alpha1.org.legacy.Color.Builder, com.tcn.cloud.api.api.v1alpha1.org.legacy.ColorOrBuilder>(
                getTextColor(),
                getParentForChildren(),
                isClean());
        textColor_ = null;
      }
      return textColorBuilder_;
    }

    private com.tcn.cloud.api.api.v1alpha1.org.legacy.Color backgroundColor_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.org.legacy.Color, com.tcn.cloud.api.api.v1alpha1.org.legacy.Color.Builder, com.tcn.cloud.api.api.v1alpha1.org.legacy.ColorOrBuilder> backgroundColorBuilder_;
    /**
     * <code>.api.v1alpha1.org.legacy.Color background_color = 3 [json_name = "backgroundColor"];</code>
     * @return Whether the backgroundColor field is set.
     */
    public boolean hasBackgroundColor() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.api.v1alpha1.org.legacy.Color background_color = 3 [json_name = "backgroundColor"];</code>
     * @return The backgroundColor.
     */
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.Color getBackgroundColor() {
      if (backgroundColorBuilder_ == null) {
        return backgroundColor_ == null ? com.tcn.cloud.api.api.v1alpha1.org.legacy.Color.getDefaultInstance() : backgroundColor_;
      } else {
        return backgroundColorBuilder_.getMessage();
      }
    }
    /**
     * <code>.api.v1alpha1.org.legacy.Color background_color = 3 [json_name = "backgroundColor"];</code>
     */
    public Builder setBackgroundColor(com.tcn.cloud.api.api.v1alpha1.org.legacy.Color value) {
      if (backgroundColorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        backgroundColor_ = value;
      } else {
        backgroundColorBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v1alpha1.org.legacy.Color background_color = 3 [json_name = "backgroundColor"];</code>
     */
    public Builder setBackgroundColor(
        com.tcn.cloud.api.api.v1alpha1.org.legacy.Color.Builder builderForValue) {
      if (backgroundColorBuilder_ == null) {
        backgroundColor_ = builderForValue.build();
      } else {
        backgroundColorBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v1alpha1.org.legacy.Color background_color = 3 [json_name = "backgroundColor"];</code>
     */
    public Builder mergeBackgroundColor(com.tcn.cloud.api.api.v1alpha1.org.legacy.Color value) {
      if (backgroundColorBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          backgroundColor_ != null &&
          backgroundColor_ != com.tcn.cloud.api.api.v1alpha1.org.legacy.Color.getDefaultInstance()) {
          getBackgroundColorBuilder().mergeFrom(value);
        } else {
          backgroundColor_ = value;
        }
      } else {
        backgroundColorBuilder_.mergeFrom(value);
      }
      if (backgroundColor_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.api.v1alpha1.org.legacy.Color background_color = 3 [json_name = "backgroundColor"];</code>
     */
    public Builder clearBackgroundColor() {
      bitField0_ = (bitField0_ & ~0x00000004);
      backgroundColor_ = null;
      if (backgroundColorBuilder_ != null) {
        backgroundColorBuilder_.dispose();
        backgroundColorBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.api.v1alpha1.org.legacy.Color background_color = 3 [json_name = "backgroundColor"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.Color.Builder getBackgroundColorBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getBackgroundColorFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.v1alpha1.org.legacy.Color background_color = 3 [json_name = "backgroundColor"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.ColorOrBuilder getBackgroundColorOrBuilder() {
      if (backgroundColorBuilder_ != null) {
        return backgroundColorBuilder_.getMessageOrBuilder();
      } else {
        return backgroundColor_ == null ?
            com.tcn.cloud.api.api.v1alpha1.org.legacy.Color.getDefaultInstance() : backgroundColor_;
      }
    }
    /**
     * <code>.api.v1alpha1.org.legacy.Color background_color = 3 [json_name = "backgroundColor"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.org.legacy.Color, com.tcn.cloud.api.api.v1alpha1.org.legacy.Color.Builder, com.tcn.cloud.api.api.v1alpha1.org.legacy.ColorOrBuilder> 
        getBackgroundColorFieldBuilder() {
      if (backgroundColorBuilder_ == null) {
        backgroundColorBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.org.legacy.Color, com.tcn.cloud.api.api.v1alpha1.org.legacy.Color.Builder, com.tcn.cloud.api.api.v1alpha1.org.legacy.ColorOrBuilder>(
                getBackgroundColor(),
                getParentForChildren(),
                isClean());
        backgroundColor_ = null;
      }
      return backgroundColorBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.org.legacy.ContactFieldStyle)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.org.legacy.ContactFieldStyle)
  private static final com.tcn.cloud.api.api.v1alpha1.org.legacy.ContactFieldStyle DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.org.legacy.ContactFieldStyle();
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.ContactFieldStyle getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ContactFieldStyle>
      PARSER = new com.google.protobuf.AbstractParser<ContactFieldStyle>() {
    @java.lang.Override
    public ContactFieldStyle parsePartialFrom(
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

  public static com.google.protobuf.Parser<ContactFieldStyle> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ContactFieldStyle> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.legacy.ContactFieldStyle getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

