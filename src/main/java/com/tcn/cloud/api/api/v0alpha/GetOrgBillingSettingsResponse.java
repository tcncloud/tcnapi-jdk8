// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/org.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * <pre>
 * Response message for the GetOrgBillingSettings rpc.
 * </pre>
 *
 * Protobuf type {@code api.v0alpha.GetOrgBillingSettingsResponse}
 */
public final class GetOrgBillingSettingsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.GetOrgBillingSettingsResponse)
    GetOrgBillingSettingsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetOrgBillingSettingsResponse.newBuilder() to construct.
  private GetOrgBillingSettingsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetOrgBillingSettingsResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetOrgBillingSettingsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_GetOrgBillingSettingsResponse_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 3:
        return internalGetCountryDefaultRegions();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_GetOrgBillingSettingsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.GetOrgBillingSettingsResponse.class, com.tcn.cloud.api.api.v0alpha.GetOrgBillingSettingsResponse.Builder.class);
  }

  public static final int SETTINGS_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.v0alpha.OrgBillingSettings settings_;
  /**
   * <code>.api.v0alpha.OrgBillingSettings settings = 1 [json_name = "settings"];</code>
   * @return Whether the settings field is set.
   */
  @java.lang.Override
  public boolean hasSettings() {
    return settings_ != null;
  }
  /**
   * <code>.api.v0alpha.OrgBillingSettings settings = 1 [json_name = "settings"];</code>
   * @return The settings.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.OrgBillingSettings getSettings() {
    return settings_ == null ? com.tcn.cloud.api.api.v0alpha.OrgBillingSettings.getDefaultInstance() : settings_;
  }
  /**
   * <code>.api.v0alpha.OrgBillingSettings settings = 1 [json_name = "settings"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.OrgBillingSettingsOrBuilder getSettingsOrBuilder() {
    return settings_ == null ? com.tcn.cloud.api.api.v0alpha.OrgBillingSettings.getDefaultInstance() : settings_;
  }

  public static final int COUNTRY_DEFAULT_REGIONS_FIELD_NUMBER = 3;
  private static final class CountryDefaultRegionsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.Integer, com.tcn.cloud.api.api.v0alpha.BillingRegionMap> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.Integer, com.tcn.cloud.api.api.v0alpha.BillingRegionMap>newDefaultInstance(
                com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_GetOrgBillingSettingsResponse_CountryDefaultRegionsEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.INT32,
                0,
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                com.tcn.cloud.api.api.v0alpha.BillingRegionMap.getDefaultInstance());
  }
  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<
      java.lang.Integer, com.tcn.cloud.api.api.v0alpha.BillingRegionMap> countryDefaultRegions_;
  private com.google.protobuf.MapField<java.lang.Integer, com.tcn.cloud.api.api.v0alpha.BillingRegionMap>
  internalGetCountryDefaultRegions() {
    if (countryDefaultRegions_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          CountryDefaultRegionsDefaultEntryHolder.defaultEntry);
    }
    return countryDefaultRegions_;
  }
  public int getCountryDefaultRegionsCount() {
    return internalGetCountryDefaultRegions().getMap().size();
  }
  /**
   * <pre>
   * country_default_regions contains the billing data for regions
   * that belong to the orgs allowed countries that don't
   * have custom overrides.
   * Key: api.commons.Country as int32
   * </pre>
   *
   * <code>map&lt;int32, .api.v0alpha.BillingRegionMap&gt; country_default_regions = 3 [json_name = "countryDefaultRegions"];</code>
   */
  @java.lang.Override
  public boolean containsCountryDefaultRegions(
      int key) {

    return internalGetCountryDefaultRegions().getMap().containsKey(key);
  }
  /**
   * Use {@link #getCountryDefaultRegionsMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.Integer, com.tcn.cloud.api.api.v0alpha.BillingRegionMap> getCountryDefaultRegions() {
    return getCountryDefaultRegionsMap();
  }
  /**
   * <pre>
   * country_default_regions contains the billing data for regions
   * that belong to the orgs allowed countries that don't
   * have custom overrides.
   * Key: api.commons.Country as int32
   * </pre>
   *
   * <code>map&lt;int32, .api.v0alpha.BillingRegionMap&gt; country_default_regions = 3 [json_name = "countryDefaultRegions"];</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.Integer, com.tcn.cloud.api.api.v0alpha.BillingRegionMap> getCountryDefaultRegionsMap() {
    return internalGetCountryDefaultRegions().getMap();
  }
  /**
   * <pre>
   * country_default_regions contains the billing data for regions
   * that belong to the orgs allowed countries that don't
   * have custom overrides.
   * Key: api.commons.Country as int32
   * </pre>
   *
   * <code>map&lt;int32, .api.v0alpha.BillingRegionMap&gt; country_default_regions = 3 [json_name = "countryDefaultRegions"];</code>
   */
  @java.lang.Override
  public /* nullable */
com.tcn.cloud.api.api.v0alpha.BillingRegionMap getCountryDefaultRegionsOrDefault(
      int key,
      /* nullable */
com.tcn.cloud.api.api.v0alpha.BillingRegionMap defaultValue) {

    java.util.Map<java.lang.Integer, com.tcn.cloud.api.api.v0alpha.BillingRegionMap> map =
        internalGetCountryDefaultRegions().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * country_default_regions contains the billing data for regions
   * that belong to the orgs allowed countries that don't
   * have custom overrides.
   * Key: api.commons.Country as int32
   * </pre>
   *
   * <code>map&lt;int32, .api.v0alpha.BillingRegionMap&gt; country_default_regions = 3 [json_name = "countryDefaultRegions"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.BillingRegionMap getCountryDefaultRegionsOrThrow(
      int key) {

    java.util.Map<java.lang.Integer, com.tcn.cloud.api.api.v0alpha.BillingRegionMap> map =
        internalGetCountryDefaultRegions().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    if (settings_ != null) {
      output.writeMessage(1, getSettings());
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeIntegerMapTo(
        output,
        internalGetCountryDefaultRegions(),
        CountryDefaultRegionsDefaultEntryHolder.defaultEntry,
        3);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (settings_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getSettings());
    }
    for (java.util.Map.Entry<java.lang.Integer, com.tcn.cloud.api.api.v0alpha.BillingRegionMap> entry
         : internalGetCountryDefaultRegions().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.Integer, com.tcn.cloud.api.api.v0alpha.BillingRegionMap>
      countryDefaultRegions__ = CountryDefaultRegionsDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, countryDefaultRegions__);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.GetOrgBillingSettingsResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.GetOrgBillingSettingsResponse other = (com.tcn.cloud.api.api.v0alpha.GetOrgBillingSettingsResponse) obj;

    if (hasSettings() != other.hasSettings()) return false;
    if (hasSettings()) {
      if (!getSettings()
          .equals(other.getSettings())) return false;
    }
    if (!internalGetCountryDefaultRegions().equals(
        other.internalGetCountryDefaultRegions())) return false;
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
    if (hasSettings()) {
      hash = (37 * hash) + SETTINGS_FIELD_NUMBER;
      hash = (53 * hash) + getSettings().hashCode();
    }
    if (!internalGetCountryDefaultRegions().getMap().isEmpty()) {
      hash = (37 * hash) + COUNTRY_DEFAULT_REGIONS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetCountryDefaultRegions().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.GetOrgBillingSettingsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetOrgBillingSettingsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetOrgBillingSettingsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetOrgBillingSettingsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetOrgBillingSettingsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetOrgBillingSettingsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetOrgBillingSettingsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetOrgBillingSettingsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.GetOrgBillingSettingsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.GetOrgBillingSettingsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetOrgBillingSettingsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetOrgBillingSettingsResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.GetOrgBillingSettingsResponse prototype) {
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
   * Response message for the GetOrgBillingSettings rpc.
   * </pre>
   *
   * Protobuf type {@code api.v0alpha.GetOrgBillingSettingsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.GetOrgBillingSettingsResponse)
      com.tcn.cloud.api.api.v0alpha.GetOrgBillingSettingsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_GetOrgBillingSettingsResponse_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 3:
          return internalGetCountryDefaultRegions();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 3:
          return internalGetMutableCountryDefaultRegions();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_GetOrgBillingSettingsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.GetOrgBillingSettingsResponse.class, com.tcn.cloud.api.api.v0alpha.GetOrgBillingSettingsResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.GetOrgBillingSettingsResponse.newBuilder()
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
      settings_ = null;
      if (settingsBuilder_ != null) {
        settingsBuilder_.dispose();
        settingsBuilder_ = null;
      }
      internalGetMutableCountryDefaultRegions().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_GetOrgBillingSettingsResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetOrgBillingSettingsResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.GetOrgBillingSettingsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetOrgBillingSettingsResponse build() {
      com.tcn.cloud.api.api.v0alpha.GetOrgBillingSettingsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetOrgBillingSettingsResponse buildPartial() {
      com.tcn.cloud.api.api.v0alpha.GetOrgBillingSettingsResponse result = new com.tcn.cloud.api.api.v0alpha.GetOrgBillingSettingsResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.GetOrgBillingSettingsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.settings_ = settingsBuilder_ == null
            ? settings_
            : settingsBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.countryDefaultRegions_ = internalGetCountryDefaultRegions();
        result.countryDefaultRegions_.makeImmutable();
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.GetOrgBillingSettingsResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.GetOrgBillingSettingsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.GetOrgBillingSettingsResponse other) {
      if (other == com.tcn.cloud.api.api.v0alpha.GetOrgBillingSettingsResponse.getDefaultInstance()) return this;
      if (other.hasSettings()) {
        mergeSettings(other.getSettings());
      }
      internalGetMutableCountryDefaultRegions().mergeFrom(
          other.internalGetCountryDefaultRegions());
      bitField0_ |= 0x00000002;
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
              input.readMessage(
                  getSettingsFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 26: {
              com.google.protobuf.MapEntry<java.lang.Integer, com.tcn.cloud.api.api.v0alpha.BillingRegionMap>
              countryDefaultRegions__ = input.readMessage(
                  CountryDefaultRegionsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableCountryDefaultRegions().getMutableMap().put(
                  countryDefaultRegions__.getKey(), countryDefaultRegions__.getValue());
              bitField0_ |= 0x00000002;
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

    private com.tcn.cloud.api.api.v0alpha.OrgBillingSettings settings_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.OrgBillingSettings, com.tcn.cloud.api.api.v0alpha.OrgBillingSettings.Builder, com.tcn.cloud.api.api.v0alpha.OrgBillingSettingsOrBuilder> settingsBuilder_;
    /**
     * <code>.api.v0alpha.OrgBillingSettings settings = 1 [json_name = "settings"];</code>
     * @return Whether the settings field is set.
     */
    public boolean hasSettings() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.api.v0alpha.OrgBillingSettings settings = 1 [json_name = "settings"];</code>
     * @return The settings.
     */
    public com.tcn.cloud.api.api.v0alpha.OrgBillingSettings getSettings() {
      if (settingsBuilder_ == null) {
        return settings_ == null ? com.tcn.cloud.api.api.v0alpha.OrgBillingSettings.getDefaultInstance() : settings_;
      } else {
        return settingsBuilder_.getMessage();
      }
    }
    /**
     * <code>.api.v0alpha.OrgBillingSettings settings = 1 [json_name = "settings"];</code>
     */
    public Builder setSettings(com.tcn.cloud.api.api.v0alpha.OrgBillingSettings value) {
      if (settingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        settings_ = value;
      } else {
        settingsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.OrgBillingSettings settings = 1 [json_name = "settings"];</code>
     */
    public Builder setSettings(
        com.tcn.cloud.api.api.v0alpha.OrgBillingSettings.Builder builderForValue) {
      if (settingsBuilder_ == null) {
        settings_ = builderForValue.build();
      } else {
        settingsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.OrgBillingSettings settings = 1 [json_name = "settings"];</code>
     */
    public Builder mergeSettings(com.tcn.cloud.api.api.v0alpha.OrgBillingSettings value) {
      if (settingsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          settings_ != null &&
          settings_ != com.tcn.cloud.api.api.v0alpha.OrgBillingSettings.getDefaultInstance()) {
          getSettingsBuilder().mergeFrom(value);
        } else {
          settings_ = value;
        }
      } else {
        settingsBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.OrgBillingSettings settings = 1 [json_name = "settings"];</code>
     */
    public Builder clearSettings() {
      bitField0_ = (bitField0_ & ~0x00000001);
      settings_ = null;
      if (settingsBuilder_ != null) {
        settingsBuilder_.dispose();
        settingsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.OrgBillingSettings settings = 1 [json_name = "settings"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.OrgBillingSettings.Builder getSettingsBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getSettingsFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.v0alpha.OrgBillingSettings settings = 1 [json_name = "settings"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.OrgBillingSettingsOrBuilder getSettingsOrBuilder() {
      if (settingsBuilder_ != null) {
        return settingsBuilder_.getMessageOrBuilder();
      } else {
        return settings_ == null ?
            com.tcn.cloud.api.api.v0alpha.OrgBillingSettings.getDefaultInstance() : settings_;
      }
    }
    /**
     * <code>.api.v0alpha.OrgBillingSettings settings = 1 [json_name = "settings"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.OrgBillingSettings, com.tcn.cloud.api.api.v0alpha.OrgBillingSettings.Builder, com.tcn.cloud.api.api.v0alpha.OrgBillingSettingsOrBuilder> 
        getSettingsFieldBuilder() {
      if (settingsBuilder_ == null) {
        settingsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.OrgBillingSettings, com.tcn.cloud.api.api.v0alpha.OrgBillingSettings.Builder, com.tcn.cloud.api.api.v0alpha.OrgBillingSettingsOrBuilder>(
                getSettings(),
                getParentForChildren(),
                isClean());
        settings_ = null;
      }
      return settingsBuilder_;
    }

    private com.google.protobuf.MapField<
        java.lang.Integer, com.tcn.cloud.api.api.v0alpha.BillingRegionMap> countryDefaultRegions_;
    private com.google.protobuf.MapField<java.lang.Integer, com.tcn.cloud.api.api.v0alpha.BillingRegionMap>
        internalGetCountryDefaultRegions() {
      if (countryDefaultRegions_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            CountryDefaultRegionsDefaultEntryHolder.defaultEntry);
      }
      return countryDefaultRegions_;
    }
    private com.google.protobuf.MapField<java.lang.Integer, com.tcn.cloud.api.api.v0alpha.BillingRegionMap>
        internalGetMutableCountryDefaultRegions() {
      if (countryDefaultRegions_ == null) {
        countryDefaultRegions_ = com.google.protobuf.MapField.newMapField(
            CountryDefaultRegionsDefaultEntryHolder.defaultEntry);
      }
      if (!countryDefaultRegions_.isMutable()) {
        countryDefaultRegions_ = countryDefaultRegions_.copy();
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return countryDefaultRegions_;
    }
    public int getCountryDefaultRegionsCount() {
      return internalGetCountryDefaultRegions().getMap().size();
    }
    /**
     * <pre>
     * country_default_regions contains the billing data for regions
     * that belong to the orgs allowed countries that don't
     * have custom overrides.
     * Key: api.commons.Country as int32
     * </pre>
     *
     * <code>map&lt;int32, .api.v0alpha.BillingRegionMap&gt; country_default_regions = 3 [json_name = "countryDefaultRegions"];</code>
     */
    @java.lang.Override
    public boolean containsCountryDefaultRegions(
        int key) {

      return internalGetCountryDefaultRegions().getMap().containsKey(key);
    }
    /**
     * Use {@link #getCountryDefaultRegionsMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, com.tcn.cloud.api.api.v0alpha.BillingRegionMap> getCountryDefaultRegions() {
      return getCountryDefaultRegionsMap();
    }
    /**
     * <pre>
     * country_default_regions contains the billing data for regions
     * that belong to the orgs allowed countries that don't
     * have custom overrides.
     * Key: api.commons.Country as int32
     * </pre>
     *
     * <code>map&lt;int32, .api.v0alpha.BillingRegionMap&gt; country_default_regions = 3 [json_name = "countryDefaultRegions"];</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.Integer, com.tcn.cloud.api.api.v0alpha.BillingRegionMap> getCountryDefaultRegionsMap() {
      return internalGetCountryDefaultRegions().getMap();
    }
    /**
     * <pre>
     * country_default_regions contains the billing data for regions
     * that belong to the orgs allowed countries that don't
     * have custom overrides.
     * Key: api.commons.Country as int32
     * </pre>
     *
     * <code>map&lt;int32, .api.v0alpha.BillingRegionMap&gt; country_default_regions = 3 [json_name = "countryDefaultRegions"];</code>
     */
    @java.lang.Override
    public /* nullable */
com.tcn.cloud.api.api.v0alpha.BillingRegionMap getCountryDefaultRegionsOrDefault(
        int key,
        /* nullable */
com.tcn.cloud.api.api.v0alpha.BillingRegionMap defaultValue) {

      java.util.Map<java.lang.Integer, com.tcn.cloud.api.api.v0alpha.BillingRegionMap> map =
          internalGetCountryDefaultRegions().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * country_default_regions contains the billing data for regions
     * that belong to the orgs allowed countries that don't
     * have custom overrides.
     * Key: api.commons.Country as int32
     * </pre>
     *
     * <code>map&lt;int32, .api.v0alpha.BillingRegionMap&gt; country_default_regions = 3 [json_name = "countryDefaultRegions"];</code>
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.BillingRegionMap getCountryDefaultRegionsOrThrow(
        int key) {

      java.util.Map<java.lang.Integer, com.tcn.cloud.api.api.v0alpha.BillingRegionMap> map =
          internalGetCountryDefaultRegions().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }
    public Builder clearCountryDefaultRegions() {
      bitField0_ = (bitField0_ & ~0x00000002);
      internalGetMutableCountryDefaultRegions().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * country_default_regions contains the billing data for regions
     * that belong to the orgs allowed countries that don't
     * have custom overrides.
     * Key: api.commons.Country as int32
     * </pre>
     *
     * <code>map&lt;int32, .api.v0alpha.BillingRegionMap&gt; country_default_regions = 3 [json_name = "countryDefaultRegions"];</code>
     */
    public Builder removeCountryDefaultRegions(
        int key) {

      internalGetMutableCountryDefaultRegions().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, com.tcn.cloud.api.api.v0alpha.BillingRegionMap>
        getMutableCountryDefaultRegions() {
      bitField0_ |= 0x00000002;
      return internalGetMutableCountryDefaultRegions().getMutableMap();
    }
    /**
     * <pre>
     * country_default_regions contains the billing data for regions
     * that belong to the orgs allowed countries that don't
     * have custom overrides.
     * Key: api.commons.Country as int32
     * </pre>
     *
     * <code>map&lt;int32, .api.v0alpha.BillingRegionMap&gt; country_default_regions = 3 [json_name = "countryDefaultRegions"];</code>
     */
    public Builder putCountryDefaultRegions(
        int key,
        com.tcn.cloud.api.api.v0alpha.BillingRegionMap value) {

      if (value == null) { throw new NullPointerException("map value"); }
      internalGetMutableCountryDefaultRegions().getMutableMap()
          .put(key, value);
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <pre>
     * country_default_regions contains the billing data for regions
     * that belong to the orgs allowed countries that don't
     * have custom overrides.
     * Key: api.commons.Country as int32
     * </pre>
     *
     * <code>map&lt;int32, .api.v0alpha.BillingRegionMap&gt; country_default_regions = 3 [json_name = "countryDefaultRegions"];</code>
     */
    public Builder putAllCountryDefaultRegions(
        java.util.Map<java.lang.Integer, com.tcn.cloud.api.api.v0alpha.BillingRegionMap> values) {
      internalGetMutableCountryDefaultRegions().getMutableMap()
          .putAll(values);
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.GetOrgBillingSettingsResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.GetOrgBillingSettingsResponse)
  private static final com.tcn.cloud.api.api.v0alpha.GetOrgBillingSettingsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.GetOrgBillingSettingsResponse();
  }

  public static com.tcn.cloud.api.api.v0alpha.GetOrgBillingSettingsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetOrgBillingSettingsResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetOrgBillingSettingsResponse>() {
    @java.lang.Override
    public GetOrgBillingSettingsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetOrgBillingSettingsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetOrgBillingSettingsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.GetOrgBillingSettingsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

