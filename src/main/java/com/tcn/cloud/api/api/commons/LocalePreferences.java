// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/org_preferences.proto

package com.tcn.cloud.api.api.commons;

/**
 * <pre>
 * LocalePreferences represents the organization's locale settings.
 * </pre>
 *
 * Protobuf type {@code api.commons.LocalePreferences}
 */
public final class LocalePreferences extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.commons.LocalePreferences)
    LocalePreferencesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LocalePreferences.newBuilder() to construct.
  private LocalePreferences(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LocalePreferences() {
    languageTag_ = "";
    defaultCurrency_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LocalePreferences();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.commons.OrgPreferencesProto.internal_static_api_commons_LocalePreferences_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.commons.OrgPreferencesProto.internal_static_api_commons_LocalePreferences_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.commons.LocalePreferences.class, com.tcn.cloud.api.api.commons.LocalePreferences.Builder.class);
  }

  public static final int LANGUAGE_TAG_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object languageTag_ = "";
  /**
   * <pre>
   * Display language in Operator for users of the organization.
   * Must be a valid language tag supported in Operator.
   * IETF BCP 47 - https://en.wikipedia.org/wiki/IETF_language_tag
   * </pre>
   *
   * <code>string language_tag = 1 [json_name = "languageTag"];</code>
   * @return The languageTag.
   */
  @java.lang.Override
  public java.lang.String getLanguageTag() {
    java.lang.Object ref = languageTag_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      languageTag_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Display language in Operator for users of the organization.
   * Must be a valid language tag supported in Operator.
   * IETF BCP 47 - https://en.wikipedia.org/wiki/IETF_language_tag
   * </pre>
   *
   * <code>string language_tag = 1 [json_name = "languageTag"];</code>
   * @return The bytes for languageTag.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLanguageTagBytes() {
    java.lang.Object ref = languageTag_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      languageTag_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USE_SCRIPT_DIRECTION_RIGHT_TO_LEFT_FIELD_NUMBER = 2;
  private boolean useScriptDirectionRightToLeft_ = false;
  /**
   * <pre>
   * The direction of the script in Operator used in the organization.
   * By default, it is set to false to indicate left-to-right.
   * </pre>
   *
   * <code>bool use_script_direction_right_to_left = 2 [json_name = "useScriptDirectionRightToLeft", deprecated = true];</code>
   * @deprecated api.commons.LocalePreferences.use_script_direction_right_to_left is deprecated.
   *     See api/commons/org_preferences.proto;l=92
   * @return The useScriptDirectionRightToLeft.
   */
  @java.lang.Override
  @java.lang.Deprecated public boolean getUseScriptDirectionRightToLeft() {
    return useScriptDirectionRightToLeft_;
  }

  public static final int DEFAULT_CURRENCY_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object defaultCurrency_ = "";
  /**
   * <pre>
   * The default currency used in the organization.
   * Must be a valid currency code supported in Operator.
   * ISO 4217 - https://en.wikipedia.org/wiki/ISO_4217.
   * </pre>
   *
   * <code>string default_currency = 3 [json_name = "defaultCurrency"];</code>
   * @return The defaultCurrency.
   */
  @java.lang.Override
  public java.lang.String getDefaultCurrency() {
    java.lang.Object ref = defaultCurrency_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      defaultCurrency_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The default currency used in the organization.
   * Must be a valid currency code supported in Operator.
   * ISO 4217 - https://en.wikipedia.org/wiki/ISO_4217.
   * </pre>
   *
   * <code>string default_currency = 3 [json_name = "defaultCurrency"];</code>
   * @return The bytes for defaultCurrency.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDefaultCurrencyBytes() {
    java.lang.Object ref = defaultCurrency_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      defaultCurrency_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(languageTag_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, languageTag_);
    }
    if (useScriptDirectionRightToLeft_ != false) {
      output.writeBool(2, useScriptDirectionRightToLeft_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(defaultCurrency_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, defaultCurrency_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(languageTag_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, languageTag_);
    }
    if (useScriptDirectionRightToLeft_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, useScriptDirectionRightToLeft_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(defaultCurrency_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, defaultCurrency_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.commons.LocalePreferences)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.commons.LocalePreferences other = (com.tcn.cloud.api.api.commons.LocalePreferences) obj;

    if (!getLanguageTag()
        .equals(other.getLanguageTag())) return false;
    if (getUseScriptDirectionRightToLeft()
        != other.getUseScriptDirectionRightToLeft()) return false;
    if (!getDefaultCurrency()
        .equals(other.getDefaultCurrency())) return false;
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
    hash = (37 * hash) + LANGUAGE_TAG_FIELD_NUMBER;
    hash = (53 * hash) + getLanguageTag().hashCode();
    hash = (37 * hash) + USE_SCRIPT_DIRECTION_RIGHT_TO_LEFT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getUseScriptDirectionRightToLeft());
    hash = (37 * hash) + DEFAULT_CURRENCY_FIELD_NUMBER;
    hash = (53 * hash) + getDefaultCurrency().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.commons.LocalePreferences parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.LocalePreferences parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.LocalePreferences parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.LocalePreferences parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.LocalePreferences parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.LocalePreferences parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.LocalePreferences parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.LocalePreferences parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.commons.LocalePreferences parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.commons.LocalePreferences parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.LocalePreferences parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.LocalePreferences parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.commons.LocalePreferences prototype) {
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
   * LocalePreferences represents the organization's locale settings.
   * </pre>
   *
   * Protobuf type {@code api.commons.LocalePreferences}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.commons.LocalePreferences)
      com.tcn.cloud.api.api.commons.LocalePreferencesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.OrgPreferencesProto.internal_static_api_commons_LocalePreferences_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.commons.OrgPreferencesProto.internal_static_api_commons_LocalePreferences_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.commons.LocalePreferences.class, com.tcn.cloud.api.api.commons.LocalePreferences.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.commons.LocalePreferences.newBuilder()
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
      languageTag_ = "";
      useScriptDirectionRightToLeft_ = false;
      defaultCurrency_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.commons.OrgPreferencesProto.internal_static_api_commons_LocalePreferences_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.LocalePreferences getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.commons.LocalePreferences.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.LocalePreferences build() {
      com.tcn.cloud.api.api.commons.LocalePreferences result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.LocalePreferences buildPartial() {
      com.tcn.cloud.api.api.commons.LocalePreferences result = new com.tcn.cloud.api.api.commons.LocalePreferences(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.commons.LocalePreferences result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.languageTag_ = languageTag_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.useScriptDirectionRightToLeft_ = useScriptDirectionRightToLeft_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.defaultCurrency_ = defaultCurrency_;
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
      if (other instanceof com.tcn.cloud.api.api.commons.LocalePreferences) {
        return mergeFrom((com.tcn.cloud.api.api.commons.LocalePreferences)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.commons.LocalePreferences other) {
      if (other == com.tcn.cloud.api.api.commons.LocalePreferences.getDefaultInstance()) return this;
      if (!other.getLanguageTag().isEmpty()) {
        languageTag_ = other.languageTag_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getUseScriptDirectionRightToLeft() != false) {
        setUseScriptDirectionRightToLeft(other.getUseScriptDirectionRightToLeft());
      }
      if (!other.getDefaultCurrency().isEmpty()) {
        defaultCurrency_ = other.defaultCurrency_;
        bitField0_ |= 0x00000004;
        onChanged();
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
              languageTag_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              useScriptDirectionRightToLeft_ = input.readBool();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              defaultCurrency_ = input.readStringRequireUtf8();
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

    private java.lang.Object languageTag_ = "";
    /**
     * <pre>
     * Display language in Operator for users of the organization.
     * Must be a valid language tag supported in Operator.
     * IETF BCP 47 - https://en.wikipedia.org/wiki/IETF_language_tag
     * </pre>
     *
     * <code>string language_tag = 1 [json_name = "languageTag"];</code>
     * @return The languageTag.
     */
    public java.lang.String getLanguageTag() {
      java.lang.Object ref = languageTag_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        languageTag_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Display language in Operator for users of the organization.
     * Must be a valid language tag supported in Operator.
     * IETF BCP 47 - https://en.wikipedia.org/wiki/IETF_language_tag
     * </pre>
     *
     * <code>string language_tag = 1 [json_name = "languageTag"];</code>
     * @return The bytes for languageTag.
     */
    public com.google.protobuf.ByteString
        getLanguageTagBytes() {
      java.lang.Object ref = languageTag_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        languageTag_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Display language in Operator for users of the organization.
     * Must be a valid language tag supported in Operator.
     * IETF BCP 47 - https://en.wikipedia.org/wiki/IETF_language_tag
     * </pre>
     *
     * <code>string language_tag = 1 [json_name = "languageTag"];</code>
     * @param value The languageTag to set.
     * @return This builder for chaining.
     */
    public Builder setLanguageTag(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      languageTag_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Display language in Operator for users of the organization.
     * Must be a valid language tag supported in Operator.
     * IETF BCP 47 - https://en.wikipedia.org/wiki/IETF_language_tag
     * </pre>
     *
     * <code>string language_tag = 1 [json_name = "languageTag"];</code>
     * @return This builder for chaining.
     */
    public Builder clearLanguageTag() {
      languageTag_ = getDefaultInstance().getLanguageTag();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Display language in Operator for users of the organization.
     * Must be a valid language tag supported in Operator.
     * IETF BCP 47 - https://en.wikipedia.org/wiki/IETF_language_tag
     * </pre>
     *
     * <code>string language_tag = 1 [json_name = "languageTag"];</code>
     * @param value The bytes for languageTag to set.
     * @return This builder for chaining.
     */
    public Builder setLanguageTagBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      languageTag_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private boolean useScriptDirectionRightToLeft_ ;
    /**
     * <pre>
     * The direction of the script in Operator used in the organization.
     * By default, it is set to false to indicate left-to-right.
     * </pre>
     *
     * <code>bool use_script_direction_right_to_left = 2 [json_name = "useScriptDirectionRightToLeft", deprecated = true];</code>
     * @deprecated api.commons.LocalePreferences.use_script_direction_right_to_left is deprecated.
     *     See api/commons/org_preferences.proto;l=92
     * @return The useScriptDirectionRightToLeft.
     */
    @java.lang.Override
    @java.lang.Deprecated public boolean getUseScriptDirectionRightToLeft() {
      return useScriptDirectionRightToLeft_;
    }
    /**
     * <pre>
     * The direction of the script in Operator used in the organization.
     * By default, it is set to false to indicate left-to-right.
     * </pre>
     *
     * <code>bool use_script_direction_right_to_left = 2 [json_name = "useScriptDirectionRightToLeft", deprecated = true];</code>
     * @deprecated api.commons.LocalePreferences.use_script_direction_right_to_left is deprecated.
     *     See api/commons/org_preferences.proto;l=92
     * @param value The useScriptDirectionRightToLeft to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder setUseScriptDirectionRightToLeft(boolean value) {

      useScriptDirectionRightToLeft_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The direction of the script in Operator used in the organization.
     * By default, it is set to false to indicate left-to-right.
     * </pre>
     *
     * <code>bool use_script_direction_right_to_left = 2 [json_name = "useScriptDirectionRightToLeft", deprecated = true];</code>
     * @deprecated api.commons.LocalePreferences.use_script_direction_right_to_left is deprecated.
     *     See api/commons/org_preferences.proto;l=92
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder clearUseScriptDirectionRightToLeft() {
      bitField0_ = (bitField0_ & ~0x00000002);
      useScriptDirectionRightToLeft_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object defaultCurrency_ = "";
    /**
     * <pre>
     * The default currency used in the organization.
     * Must be a valid currency code supported in Operator.
     * ISO 4217 - https://en.wikipedia.org/wiki/ISO_4217.
     * </pre>
     *
     * <code>string default_currency = 3 [json_name = "defaultCurrency"];</code>
     * @return The defaultCurrency.
     */
    public java.lang.String getDefaultCurrency() {
      java.lang.Object ref = defaultCurrency_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        defaultCurrency_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The default currency used in the organization.
     * Must be a valid currency code supported in Operator.
     * ISO 4217 - https://en.wikipedia.org/wiki/ISO_4217.
     * </pre>
     *
     * <code>string default_currency = 3 [json_name = "defaultCurrency"];</code>
     * @return The bytes for defaultCurrency.
     */
    public com.google.protobuf.ByteString
        getDefaultCurrencyBytes() {
      java.lang.Object ref = defaultCurrency_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        defaultCurrency_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The default currency used in the organization.
     * Must be a valid currency code supported in Operator.
     * ISO 4217 - https://en.wikipedia.org/wiki/ISO_4217.
     * </pre>
     *
     * <code>string default_currency = 3 [json_name = "defaultCurrency"];</code>
     * @param value The defaultCurrency to set.
     * @return This builder for chaining.
     */
    public Builder setDefaultCurrency(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      defaultCurrency_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The default currency used in the organization.
     * Must be a valid currency code supported in Operator.
     * ISO 4217 - https://en.wikipedia.org/wiki/ISO_4217.
     * </pre>
     *
     * <code>string default_currency = 3 [json_name = "defaultCurrency"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDefaultCurrency() {
      defaultCurrency_ = getDefaultInstance().getDefaultCurrency();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The default currency used in the organization.
     * Must be a valid currency code supported in Operator.
     * ISO 4217 - https://en.wikipedia.org/wiki/ISO_4217.
     * </pre>
     *
     * <code>string default_currency = 3 [json_name = "defaultCurrency"];</code>
     * @param value The bytes for defaultCurrency to set.
     * @return This builder for chaining.
     */
    public Builder setDefaultCurrencyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      defaultCurrency_ = value;
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:api.commons.LocalePreferences)
  }

  // @@protoc_insertion_point(class_scope:api.commons.LocalePreferences)
  private static final com.tcn.cloud.api.api.commons.LocalePreferences DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.commons.LocalePreferences();
  }

  public static com.tcn.cloud.api.api.commons.LocalePreferences getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LocalePreferences>
      PARSER = new com.google.protobuf.AbstractParser<LocalePreferences>() {
    @java.lang.Override
    public LocalePreferences parsePartialFrom(
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

  public static com.google.protobuf.Parser<LocalePreferences> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LocalePreferences> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.commons.LocalePreferences getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

