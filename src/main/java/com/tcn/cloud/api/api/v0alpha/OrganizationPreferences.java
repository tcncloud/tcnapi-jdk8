// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/org.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * <pre>
 * Wrapper OrganizationPreferences object for get response and update request
 * </pre>
 *
 * Protobuf type {@code api.v0alpha.OrganizationPreferences}
 */
public final class OrganizationPreferences extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.OrganizationPreferences)
    OrganizationPreferencesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OrganizationPreferences.newBuilder() to construct.
  private OrganizationPreferences(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OrganizationPreferences() {
    allowedCountries_ = java.util.Collections.emptyList();
    defaultCountry_ = 0;
    timeZone_ = 0;
    displayLanguage_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OrganizationPreferences();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_OrganizationPreferences_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_OrganizationPreferences_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.OrganizationPreferences.class, com.tcn.cloud.api.api.v0alpha.OrganizationPreferences.Builder.class);
  }

  public static final int ALLOWED_COUNTRIES_FIELD_NUMBER = 10;
  @SuppressWarnings("serial")
  private java.util.List<java.lang.Integer> allowedCountries_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
      java.lang.Integer, com.tcn.cloud.api.api.commons.Country> allowedCountries_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, com.tcn.cloud.api.api.commons.Country>() {
            public com.tcn.cloud.api.api.commons.Country convert(java.lang.Integer from) {
              com.tcn.cloud.api.api.commons.Country result = com.tcn.cloud.api.api.commons.Country.forNumber(from);
              return result == null ? com.tcn.cloud.api.api.commons.Country.UNRECOGNIZED : result;
            }
          };
  /**
   * <pre>
   * List of country enums that the organization uses.
   * </pre>
   *
   * <code>repeated .api.commons.Country allowed_countries = 10 [json_name = "allowedCountries"];</code>
   * @return A list containing the allowedCountries.
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.commons.Country> getAllowedCountriesList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, com.tcn.cloud.api.api.commons.Country>(allowedCountries_, allowedCountries_converter_);
  }
  /**
   * <pre>
   * List of country enums that the organization uses.
   * </pre>
   *
   * <code>repeated .api.commons.Country allowed_countries = 10 [json_name = "allowedCountries"];</code>
   * @return The count of allowedCountries.
   */
  @java.lang.Override
  public int getAllowedCountriesCount() {
    return allowedCountries_.size();
  }
  /**
   * <pre>
   * List of country enums that the organization uses.
   * </pre>
   *
   * <code>repeated .api.commons.Country allowed_countries = 10 [json_name = "allowedCountries"];</code>
   * @param index The index of the element to return.
   * @return The allowedCountries at the given index.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.Country getAllowedCountries(int index) {
    return allowedCountries_converter_.convert(allowedCountries_.get(index));
  }
  /**
   * <pre>
   * List of country enums that the organization uses.
   * </pre>
   *
   * <code>repeated .api.commons.Country allowed_countries = 10 [json_name = "allowedCountries"];</code>
   * @return A list containing the enum numeric values on the wire for allowedCountries.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
  getAllowedCountriesValueList() {
    return allowedCountries_;
  }
  /**
   * <pre>
   * List of country enums that the organization uses.
   * </pre>
   *
   * <code>repeated .api.commons.Country allowed_countries = 10 [json_name = "allowedCountries"];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of allowedCountries at the given index.
   */
  @java.lang.Override
  public int getAllowedCountriesValue(int index) {
    return allowedCountries_.get(index);
  }
  private int allowedCountriesMemoizedSerializedSize;

  public static final int DEFAULT_COUNTRY_FIELD_NUMBER = 11;
  private int defaultCountry_ = 0;
  /**
   * <pre>
   * Default country for organization
   * </pre>
   *
   * <code>.api.commons.Country default_country = 11 [json_name = "defaultCountry"];</code>
   * @return The enum numeric value on the wire for defaultCountry.
   */
  @java.lang.Override public int getDefaultCountryValue() {
    return defaultCountry_;
  }
  /**
   * <pre>
   * Default country for organization
   * </pre>
   *
   * <code>.api.commons.Country default_country = 11 [json_name = "defaultCountry"];</code>
   * @return The defaultCountry.
   */
  @java.lang.Override public com.tcn.cloud.api.api.commons.Country getDefaultCountry() {
    com.tcn.cloud.api.api.commons.Country result = com.tcn.cloud.api.api.commons.Country.forNumber(defaultCountry_);
    return result == null ? com.tcn.cloud.api.api.commons.Country.UNRECOGNIZED : result;
  }

  public static final int TIME_ZONE_FIELD_NUMBER = 12;
  private int timeZone_ = 0;
  /**
   * <pre>
   * Organization's time zone
   * </pre>
   *
   * <code>.api.commons.TimeZone time_zone = 12 [json_name = "timeZone"];</code>
   * @return The enum numeric value on the wire for timeZone.
   */
  @java.lang.Override public int getTimeZoneValue() {
    return timeZone_;
  }
  /**
   * <pre>
   * Organization's time zone
   * </pre>
   *
   * <code>.api.commons.TimeZone time_zone = 12 [json_name = "timeZone"];</code>
   * @return The timeZone.
   */
  @java.lang.Override public com.tcn.cloud.api.api.commons.TimeZone getTimeZone() {
    com.tcn.cloud.api.api.commons.TimeZone result = com.tcn.cloud.api.api.commons.TimeZone.forNumber(timeZone_);
    return result == null ? com.tcn.cloud.api.api.commons.TimeZone.UNRECOGNIZED : result;
  }

  public static final int DISPLAY_LANGUAGE_FIELD_NUMBER = 13;
  private int displayLanguage_ = 0;
  /**
   * <pre>
   * Default organization display language
   * </pre>
   *
   * <code>.api.commons.DisplayLanguage display_language = 13 [json_name = "displayLanguage"];</code>
   * @return The enum numeric value on the wire for displayLanguage.
   */
  @java.lang.Override public int getDisplayLanguageValue() {
    return displayLanguage_;
  }
  /**
   * <pre>
   * Default organization display language
   * </pre>
   *
   * <code>.api.commons.DisplayLanguage display_language = 13 [json_name = "displayLanguage"];</code>
   * @return The displayLanguage.
   */
  @java.lang.Override public com.tcn.cloud.api.api.commons.DisplayLanguage getDisplayLanguage() {
    com.tcn.cloud.api.api.commons.DisplayLanguage result = com.tcn.cloud.api.api.commons.DisplayLanguage.forNumber(displayLanguage_);
    return result == null ? com.tcn.cloud.api.api.commons.DisplayLanguage.UNRECOGNIZED : result;
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
    if (getAllowedCountriesList().size() > 0) {
      output.writeUInt32NoTag(82);
      output.writeUInt32NoTag(allowedCountriesMemoizedSerializedSize);
    }
    for (int i = 0; i < allowedCountries_.size(); i++) {
      output.writeEnumNoTag(allowedCountries_.get(i));
    }
    if (defaultCountry_ != com.tcn.cloud.api.api.commons.Country.COUNTRY_UNDEFINED.getNumber()) {
      output.writeEnum(11, defaultCountry_);
    }
    if (timeZone_ != com.tcn.cloud.api.api.commons.TimeZone.TIME_ZONE_AMERICA_PUERTO_RICO.getNumber()) {
      output.writeEnum(12, timeZone_);
    }
    if (displayLanguage_ != com.tcn.cloud.api.api.commons.DisplayLanguage.DISPLAY_LANGUAGE_SPANISH.getNumber()) {
      output.writeEnum(13, displayLanguage_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < allowedCountries_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeEnumSizeNoTag(allowedCountries_.get(i));
      }
      size += dataSize;
      if (!getAllowedCountriesList().isEmpty()) {  size += 1;
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(dataSize);
      }allowedCountriesMemoizedSerializedSize = dataSize;
    }
    if (defaultCountry_ != com.tcn.cloud.api.api.commons.Country.COUNTRY_UNDEFINED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(11, defaultCountry_);
    }
    if (timeZone_ != com.tcn.cloud.api.api.commons.TimeZone.TIME_ZONE_AMERICA_PUERTO_RICO.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(12, timeZone_);
    }
    if (displayLanguage_ != com.tcn.cloud.api.api.commons.DisplayLanguage.DISPLAY_LANGUAGE_SPANISH.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(13, displayLanguage_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.OrganizationPreferences)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.OrganizationPreferences other = (com.tcn.cloud.api.api.v0alpha.OrganizationPreferences) obj;

    if (!allowedCountries_.equals(other.allowedCountries_)) return false;
    if (defaultCountry_ != other.defaultCountry_) return false;
    if (timeZone_ != other.timeZone_) return false;
    if (displayLanguage_ != other.displayLanguage_) return false;
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
    if (getAllowedCountriesCount() > 0) {
      hash = (37 * hash) + ALLOWED_COUNTRIES_FIELD_NUMBER;
      hash = (53 * hash) + allowedCountries_.hashCode();
    }
    hash = (37 * hash) + DEFAULT_COUNTRY_FIELD_NUMBER;
    hash = (53 * hash) + defaultCountry_;
    hash = (37 * hash) + TIME_ZONE_FIELD_NUMBER;
    hash = (53 * hash) + timeZone_;
    hash = (37 * hash) + DISPLAY_LANGUAGE_FIELD_NUMBER;
    hash = (53 * hash) + displayLanguage_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.OrganizationPreferences parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.OrganizationPreferences parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.OrganizationPreferences parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.OrganizationPreferences parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.OrganizationPreferences parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.OrganizationPreferences parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.OrganizationPreferences parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.OrganizationPreferences parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.OrganizationPreferences parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.OrganizationPreferences parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.OrganizationPreferences parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.OrganizationPreferences parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.OrganizationPreferences prototype) {
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
   * Wrapper OrganizationPreferences object for get response and update request
   * </pre>
   *
   * Protobuf type {@code api.v0alpha.OrganizationPreferences}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.OrganizationPreferences)
      com.tcn.cloud.api.api.v0alpha.OrganizationPreferencesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_OrganizationPreferences_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_OrganizationPreferences_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.OrganizationPreferences.class, com.tcn.cloud.api.api.v0alpha.OrganizationPreferences.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.OrganizationPreferences.newBuilder()
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
      allowedCountries_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      defaultCountry_ = 0;
      timeZone_ = 0;
      displayLanguage_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_OrganizationPreferences_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.OrganizationPreferences getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.OrganizationPreferences.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.OrganizationPreferences build() {
      com.tcn.cloud.api.api.v0alpha.OrganizationPreferences result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.OrganizationPreferences buildPartial() {
      com.tcn.cloud.api.api.v0alpha.OrganizationPreferences result = new com.tcn.cloud.api.api.v0alpha.OrganizationPreferences(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v0alpha.OrganizationPreferences result) {
      if (((bitField0_ & 0x00000001) != 0)) {
        allowedCountries_ = java.util.Collections.unmodifiableList(allowedCountries_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.allowedCountries_ = allowedCountries_;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.OrganizationPreferences result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.defaultCountry_ = defaultCountry_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.timeZone_ = timeZone_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.displayLanguage_ = displayLanguage_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v0alpha.OrganizationPreferences) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.OrganizationPreferences)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.OrganizationPreferences other) {
      if (other == com.tcn.cloud.api.api.v0alpha.OrganizationPreferences.getDefaultInstance()) return this;
      if (!other.allowedCountries_.isEmpty()) {
        if (allowedCountries_.isEmpty()) {
          allowedCountries_ = other.allowedCountries_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureAllowedCountriesIsMutable();
          allowedCountries_.addAll(other.allowedCountries_);
        }
        onChanged();
      }
      if (other.defaultCountry_ != 0) {
        setDefaultCountryValue(other.getDefaultCountryValue());
      }
      if (other.timeZone_ != 0) {
        setTimeZoneValue(other.getTimeZoneValue());
      }
      if (other.displayLanguage_ != 0) {
        setDisplayLanguageValue(other.getDisplayLanguageValue());
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
            case 80: {
              int tmpRaw = input.readEnum();
              ensureAllowedCountriesIsMutable();
              allowedCountries_.add(tmpRaw);
              break;
            } // case 80
            case 82: {
              int length = input.readRawVarint32();
              int oldLimit = input.pushLimit(length);
              while(input.getBytesUntilLimit() > 0) {
                int tmpRaw = input.readEnum();
                ensureAllowedCountriesIsMutable();
                allowedCountries_.add(tmpRaw);
              }
              input.popLimit(oldLimit);
              break;
            } // case 82
            case 88: {
              defaultCountry_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 88
            case 96: {
              timeZone_ = input.readEnum();
              bitField0_ |= 0x00000004;
              break;
            } // case 96
            case 104: {
              displayLanguage_ = input.readEnum();
              bitField0_ |= 0x00000008;
              break;
            } // case 104
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

    private java.util.List<java.lang.Integer> allowedCountries_ =
      java.util.Collections.emptyList();
    private void ensureAllowedCountriesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        allowedCountries_ = new java.util.ArrayList<java.lang.Integer>(allowedCountries_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <pre>
     * List of country enums that the organization uses.
     * </pre>
     *
     * <code>repeated .api.commons.Country allowed_countries = 10 [json_name = "allowedCountries"];</code>
     * @return A list containing the allowedCountries.
     */
    public java.util.List<com.tcn.cloud.api.api.commons.Country> getAllowedCountriesList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, com.tcn.cloud.api.api.commons.Country>(allowedCountries_, allowedCountries_converter_);
    }
    /**
     * <pre>
     * List of country enums that the organization uses.
     * </pre>
     *
     * <code>repeated .api.commons.Country allowed_countries = 10 [json_name = "allowedCountries"];</code>
     * @return The count of allowedCountries.
     */
    public int getAllowedCountriesCount() {
      return allowedCountries_.size();
    }
    /**
     * <pre>
     * List of country enums that the organization uses.
     * </pre>
     *
     * <code>repeated .api.commons.Country allowed_countries = 10 [json_name = "allowedCountries"];</code>
     * @param index The index of the element to return.
     * @return The allowedCountries at the given index.
     */
    public com.tcn.cloud.api.api.commons.Country getAllowedCountries(int index) {
      return allowedCountries_converter_.convert(allowedCountries_.get(index));
    }
    /**
     * <pre>
     * List of country enums that the organization uses.
     * </pre>
     *
     * <code>repeated .api.commons.Country allowed_countries = 10 [json_name = "allowedCountries"];</code>
     * @param index The index to set the value at.
     * @param value The allowedCountries to set.
     * @return This builder for chaining.
     */
    public Builder setAllowedCountries(
        int index, com.tcn.cloud.api.api.commons.Country value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureAllowedCountriesIsMutable();
      allowedCountries_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of country enums that the organization uses.
     * </pre>
     *
     * <code>repeated .api.commons.Country allowed_countries = 10 [json_name = "allowedCountries"];</code>
     * @param value The allowedCountries to add.
     * @return This builder for chaining.
     */
    public Builder addAllowedCountries(com.tcn.cloud.api.api.commons.Country value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureAllowedCountriesIsMutable();
      allowedCountries_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of country enums that the organization uses.
     * </pre>
     *
     * <code>repeated .api.commons.Country allowed_countries = 10 [json_name = "allowedCountries"];</code>
     * @param values The allowedCountries to add.
     * @return This builder for chaining.
     */
    public Builder addAllAllowedCountries(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.commons.Country> values) {
      ensureAllowedCountriesIsMutable();
      for (com.tcn.cloud.api.api.commons.Country value : values) {
        allowedCountries_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of country enums that the organization uses.
     * </pre>
     *
     * <code>repeated .api.commons.Country allowed_countries = 10 [json_name = "allowedCountries"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAllowedCountries() {
      allowedCountries_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of country enums that the organization uses.
     * </pre>
     *
     * <code>repeated .api.commons.Country allowed_countries = 10 [json_name = "allowedCountries"];</code>
     * @return A list containing the enum numeric values on the wire for allowedCountries.
     */
    public java.util.List<java.lang.Integer>
    getAllowedCountriesValueList() {
      return java.util.Collections.unmodifiableList(allowedCountries_);
    }
    /**
     * <pre>
     * List of country enums that the organization uses.
     * </pre>
     *
     * <code>repeated .api.commons.Country allowed_countries = 10 [json_name = "allowedCountries"];</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of allowedCountries at the given index.
     */
    public int getAllowedCountriesValue(int index) {
      return allowedCountries_.get(index);
    }
    /**
     * <pre>
     * List of country enums that the organization uses.
     * </pre>
     *
     * <code>repeated .api.commons.Country allowed_countries = 10 [json_name = "allowedCountries"];</code>
     * @param index The index to set the value at.
     * @param value The enum numeric value on the wire for allowedCountries to set.
     * @return This builder for chaining.
     */
    public Builder setAllowedCountriesValue(
        int index, int value) {
      ensureAllowedCountriesIsMutable();
      allowedCountries_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of country enums that the organization uses.
     * </pre>
     *
     * <code>repeated .api.commons.Country allowed_countries = 10 [json_name = "allowedCountries"];</code>
     * @param value The enum numeric value on the wire for allowedCountries to add.
     * @return This builder for chaining.
     */
    public Builder addAllowedCountriesValue(int value) {
      ensureAllowedCountriesIsMutable();
      allowedCountries_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of country enums that the organization uses.
     * </pre>
     *
     * <code>repeated .api.commons.Country allowed_countries = 10 [json_name = "allowedCountries"];</code>
     * @param values The enum numeric values on the wire for allowedCountries to add.
     * @return This builder for chaining.
     */
    public Builder addAllAllowedCountriesValue(
        java.lang.Iterable<java.lang.Integer> values) {
      ensureAllowedCountriesIsMutable();
      for (int value : values) {
        allowedCountries_.add(value);
      }
      onChanged();
      return this;
    }

    private int defaultCountry_ = 0;
    /**
     * <pre>
     * Default country for organization
     * </pre>
     *
     * <code>.api.commons.Country default_country = 11 [json_name = "defaultCountry"];</code>
     * @return The enum numeric value on the wire for defaultCountry.
     */
    @java.lang.Override public int getDefaultCountryValue() {
      return defaultCountry_;
    }
    /**
     * <pre>
     * Default country for organization
     * </pre>
     *
     * <code>.api.commons.Country default_country = 11 [json_name = "defaultCountry"];</code>
     * @param value The enum numeric value on the wire for defaultCountry to set.
     * @return This builder for chaining.
     */
    public Builder setDefaultCountryValue(int value) {
      defaultCountry_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Default country for organization
     * </pre>
     *
     * <code>.api.commons.Country default_country = 11 [json_name = "defaultCountry"];</code>
     * @return The defaultCountry.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.Country getDefaultCountry() {
      com.tcn.cloud.api.api.commons.Country result = com.tcn.cloud.api.api.commons.Country.forNumber(defaultCountry_);
      return result == null ? com.tcn.cloud.api.api.commons.Country.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Default country for organization
     * </pre>
     *
     * <code>.api.commons.Country default_country = 11 [json_name = "defaultCountry"];</code>
     * @param value The defaultCountry to set.
     * @return This builder for chaining.
     */
    public Builder setDefaultCountry(com.tcn.cloud.api.api.commons.Country value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      defaultCountry_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Default country for organization
     * </pre>
     *
     * <code>.api.commons.Country default_country = 11 [json_name = "defaultCountry"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDefaultCountry() {
      bitField0_ = (bitField0_ & ~0x00000002);
      defaultCountry_ = 0;
      onChanged();
      return this;
    }

    private int timeZone_ = 0;
    /**
     * <pre>
     * Organization's time zone
     * </pre>
     *
     * <code>.api.commons.TimeZone time_zone = 12 [json_name = "timeZone"];</code>
     * @return The enum numeric value on the wire for timeZone.
     */
    @java.lang.Override public int getTimeZoneValue() {
      return timeZone_;
    }
    /**
     * <pre>
     * Organization's time zone
     * </pre>
     *
     * <code>.api.commons.TimeZone time_zone = 12 [json_name = "timeZone"];</code>
     * @param value The enum numeric value on the wire for timeZone to set.
     * @return This builder for chaining.
     */
    public Builder setTimeZoneValue(int value) {
      timeZone_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Organization's time zone
     * </pre>
     *
     * <code>.api.commons.TimeZone time_zone = 12 [json_name = "timeZone"];</code>
     * @return The timeZone.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.TimeZone getTimeZone() {
      com.tcn.cloud.api.api.commons.TimeZone result = com.tcn.cloud.api.api.commons.TimeZone.forNumber(timeZone_);
      return result == null ? com.tcn.cloud.api.api.commons.TimeZone.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Organization's time zone
     * </pre>
     *
     * <code>.api.commons.TimeZone time_zone = 12 [json_name = "timeZone"];</code>
     * @param value The timeZone to set.
     * @return This builder for chaining.
     */
    public Builder setTimeZone(com.tcn.cloud.api.api.commons.TimeZone value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      timeZone_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Organization's time zone
     * </pre>
     *
     * <code>.api.commons.TimeZone time_zone = 12 [json_name = "timeZone"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTimeZone() {
      bitField0_ = (bitField0_ & ~0x00000004);
      timeZone_ = 0;
      onChanged();
      return this;
    }

    private int displayLanguage_ = 0;
    /**
     * <pre>
     * Default organization display language
     * </pre>
     *
     * <code>.api.commons.DisplayLanguage display_language = 13 [json_name = "displayLanguage"];</code>
     * @return The enum numeric value on the wire for displayLanguage.
     */
    @java.lang.Override public int getDisplayLanguageValue() {
      return displayLanguage_;
    }
    /**
     * <pre>
     * Default organization display language
     * </pre>
     *
     * <code>.api.commons.DisplayLanguage display_language = 13 [json_name = "displayLanguage"];</code>
     * @param value The enum numeric value on the wire for displayLanguage to set.
     * @return This builder for chaining.
     */
    public Builder setDisplayLanguageValue(int value) {
      displayLanguage_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Default organization display language
     * </pre>
     *
     * <code>.api.commons.DisplayLanguage display_language = 13 [json_name = "displayLanguage"];</code>
     * @return The displayLanguage.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.DisplayLanguage getDisplayLanguage() {
      com.tcn.cloud.api.api.commons.DisplayLanguage result = com.tcn.cloud.api.api.commons.DisplayLanguage.forNumber(displayLanguage_);
      return result == null ? com.tcn.cloud.api.api.commons.DisplayLanguage.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Default organization display language
     * </pre>
     *
     * <code>.api.commons.DisplayLanguage display_language = 13 [json_name = "displayLanguage"];</code>
     * @param value The displayLanguage to set.
     * @return This builder for chaining.
     */
    public Builder setDisplayLanguage(com.tcn.cloud.api.api.commons.DisplayLanguage value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000008;
      displayLanguage_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Default organization display language
     * </pre>
     *
     * <code>.api.commons.DisplayLanguage display_language = 13 [json_name = "displayLanguage"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDisplayLanguage() {
      bitField0_ = (bitField0_ & ~0x00000008);
      displayLanguage_ = 0;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.OrganizationPreferences)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.OrganizationPreferences)
  private static final com.tcn.cloud.api.api.v0alpha.OrganizationPreferences DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.OrganizationPreferences();
  }

  public static com.tcn.cloud.api.api.v0alpha.OrganizationPreferences getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OrganizationPreferences>
      PARSER = new com.google.protobuf.AbstractParser<OrganizationPreferences>() {
    @java.lang.Override
    public OrganizationPreferences parsePartialFrom(
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

  public static com.google.protobuf.Parser<OrganizationPreferences> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OrganizationPreferences> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.OrganizationPreferences getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

