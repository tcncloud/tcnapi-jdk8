// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/org/preferences.proto

package com.tcn.cloud.api.api.commons.org;

/**
 * <pre>
 * Preferences for business intelligence settings/controls in analytics.
 * </pre>
 *
 * Protobuf type {@code api.commons.org.BusinessPreferences}
 */
public final class BusinessPreferences extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.commons.org.BusinessPreferences)
    BusinessPreferencesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BusinessPreferences.newBuilder() to construct.
  private BusinessPreferences(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BusinessPreferences() {
    orgId_ = "";
    timeZone_ = 0;
    timeFilter_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BusinessPreferences();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.commons.org.PreferencesProto.internal_static_api_commons_org_BusinessPreferences_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.commons.org.PreferencesProto.internal_static_api_commons_org_BusinessPreferences_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.commons.org.BusinessPreferences.class, com.tcn.cloud.api.api.commons.org.BusinessPreferences.Builder.class);
  }

  public static final int ORG_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object orgId_ = "";
  /**
   * <pre>
   * Org ID.
   * </pre>
   *
   * <code>string org_id = 1 [json_name = "orgId"];</code>
   * @return The orgId.
   */
  @java.lang.Override
  public java.lang.String getOrgId() {
    java.lang.Object ref = orgId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      orgId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Org ID.
   * </pre>
   *
   * <code>string org_id = 1 [json_name = "orgId"];</code>
   * @return The bytes for orgId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOrgIdBytes() {
    java.lang.Object ref = orgId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      orgId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int WEEKS_OF_DATA_FIELD_NUMBER = 10;
  private int weeksOfData_ = 0;
  /**
   * <pre>
   * Number of weeks of past data that are accessible.
   * </pre>
   *
   * <code>int32 weeks_of_data = 10 [json_name = "weeksOfData"];</code>
   * @return The weeksOfData.
   */
  @java.lang.Override
  public int getWeeksOfData() {
    return weeksOfData_;
  }

  public static final int TIME_ZONE_FIELD_NUMBER = 11;
  private int timeZone_ = 0;
  /**
   * <pre>
   * Default time zone for business intelligence.
   * </pre>
   *
   * <code>.api.commons.AnaTimeZone time_zone = 11 [json_name = "timeZone"];</code>
   * @return The enum numeric value on the wire for timeZone.
   */
  @java.lang.Override public int getTimeZoneValue() {
    return timeZone_;
  }
  /**
   * <pre>
   * Default time zone for business intelligence.
   * </pre>
   *
   * <code>.api.commons.AnaTimeZone time_zone = 11 [json_name = "timeZone"];</code>
   * @return The timeZone.
   */
  @java.lang.Override public com.tcn.cloud.api.api.commons.AnaTimeZone getTimeZone() {
    com.tcn.cloud.api.api.commons.AnaTimeZone result = com.tcn.cloud.api.api.commons.AnaTimeZone.forNumber(timeZone_);
    return result == null ? com.tcn.cloud.api.api.commons.AnaTimeZone.UNRECOGNIZED : result;
  }

  public static final int MULTI_CLIENT_ACCESS_FIELD_NUMBER = 12;
  private boolean multiClientAccess_ = false;
  /**
   * <pre>
   * Whether to allow multi-client access.
   * </pre>
   *
   * <code>bool multi_client_access = 12 [json_name = "multiClientAccess"];</code>
   * @return The multiClientAccess.
   */
  @java.lang.Override
  public boolean getMultiClientAccess() {
    return multiClientAccess_;
  }

  public static final int CUSTOM_VISUALIZATIONS_FIELD_NUMBER = 13;
  private boolean customVisualizations_ = false;
  /**
   * <pre>
   * Enable/disable of custom visualizations in BI.
   * </pre>
   *
   * <code>bool custom_visualizations = 13 [json_name = "customVisualizations"];</code>
   * @return The customVisualizations.
   */
  @java.lang.Override
  public boolean getCustomVisualizations() {
    return customVisualizations_;
  }

  public static final int TIME_FILTER_FIELD_NUMBER = 14;
  @SuppressWarnings("serial")
  private volatile java.lang.Object timeFilter_ = "";
  /**
   * <pre>
   * Time filter for custom dashboard and visualizations.
   * </pre>
   *
   * <code>string time_filter = 14 [json_name = "timeFilter"];</code>
   * @return The timeFilter.
   */
  @java.lang.Override
  public java.lang.String getTimeFilter() {
    java.lang.Object ref = timeFilter_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      timeFilter_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Time filter for custom dashboard and visualizations.
   * </pre>
   *
   * <code>string time_filter = 14 [json_name = "timeFilter"];</code>
   * @return The bytes for timeFilter.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTimeFilterBytes() {
    java.lang.Object ref = timeFilter_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      timeFilter_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(orgId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, orgId_);
    }
    if (weeksOfData_ != 0) {
      output.writeInt32(10, weeksOfData_);
    }
    if (timeZone_ != com.tcn.cloud.api.api.commons.AnaTimeZone.ANA_TIME_ZONE_UNKNOWN.getNumber()) {
      output.writeEnum(11, timeZone_);
    }
    if (multiClientAccess_ != false) {
      output.writeBool(12, multiClientAccess_);
    }
    if (customVisualizations_ != false) {
      output.writeBool(13, customVisualizations_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(timeFilter_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 14, timeFilter_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(orgId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, orgId_);
    }
    if (weeksOfData_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(10, weeksOfData_);
    }
    if (timeZone_ != com.tcn.cloud.api.api.commons.AnaTimeZone.ANA_TIME_ZONE_UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(11, timeZone_);
    }
    if (multiClientAccess_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(12, multiClientAccess_);
    }
    if (customVisualizations_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(13, customVisualizations_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(timeFilter_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(14, timeFilter_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.commons.org.BusinessPreferences)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.commons.org.BusinessPreferences other = (com.tcn.cloud.api.api.commons.org.BusinessPreferences) obj;

    if (!getOrgId()
        .equals(other.getOrgId())) return false;
    if (getWeeksOfData()
        != other.getWeeksOfData()) return false;
    if (timeZone_ != other.timeZone_) return false;
    if (getMultiClientAccess()
        != other.getMultiClientAccess()) return false;
    if (getCustomVisualizations()
        != other.getCustomVisualizations()) return false;
    if (!getTimeFilter()
        .equals(other.getTimeFilter())) return false;
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
    hash = (37 * hash) + ORG_ID_FIELD_NUMBER;
    hash = (53 * hash) + getOrgId().hashCode();
    hash = (37 * hash) + WEEKS_OF_DATA_FIELD_NUMBER;
    hash = (53 * hash) + getWeeksOfData();
    hash = (37 * hash) + TIME_ZONE_FIELD_NUMBER;
    hash = (53 * hash) + timeZone_;
    hash = (37 * hash) + MULTI_CLIENT_ACCESS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getMultiClientAccess());
    hash = (37 * hash) + CUSTOM_VISUALIZATIONS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getCustomVisualizations());
    hash = (37 * hash) + TIME_FILTER_FIELD_NUMBER;
    hash = (53 * hash) + getTimeFilter().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.commons.org.BusinessPreferences parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.org.BusinessPreferences parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.org.BusinessPreferences parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.org.BusinessPreferences parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.org.BusinessPreferences parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.org.BusinessPreferences parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.org.BusinessPreferences parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.org.BusinessPreferences parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.commons.org.BusinessPreferences parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.commons.org.BusinessPreferences parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.org.BusinessPreferences parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.org.BusinessPreferences parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.commons.org.BusinessPreferences prototype) {
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
   * Preferences for business intelligence settings/controls in analytics.
   * </pre>
   *
   * Protobuf type {@code api.commons.org.BusinessPreferences}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.commons.org.BusinessPreferences)
      com.tcn.cloud.api.api.commons.org.BusinessPreferencesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.org.PreferencesProto.internal_static_api_commons_org_BusinessPreferences_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.commons.org.PreferencesProto.internal_static_api_commons_org_BusinessPreferences_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.commons.org.BusinessPreferences.class, com.tcn.cloud.api.api.commons.org.BusinessPreferences.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.commons.org.BusinessPreferences.newBuilder()
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
      orgId_ = "";
      weeksOfData_ = 0;
      timeZone_ = 0;
      multiClientAccess_ = false;
      customVisualizations_ = false;
      timeFilter_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.commons.org.PreferencesProto.internal_static_api_commons_org_BusinessPreferences_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.org.BusinessPreferences getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.commons.org.BusinessPreferences.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.org.BusinessPreferences build() {
      com.tcn.cloud.api.api.commons.org.BusinessPreferences result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.org.BusinessPreferences buildPartial() {
      com.tcn.cloud.api.api.commons.org.BusinessPreferences result = new com.tcn.cloud.api.api.commons.org.BusinessPreferences(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.commons.org.BusinessPreferences result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.orgId_ = orgId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.weeksOfData_ = weeksOfData_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.timeZone_ = timeZone_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.multiClientAccess_ = multiClientAccess_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.customVisualizations_ = customVisualizations_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.timeFilter_ = timeFilter_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.commons.org.BusinessPreferences) {
        return mergeFrom((com.tcn.cloud.api.api.commons.org.BusinessPreferences)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.commons.org.BusinessPreferences other) {
      if (other == com.tcn.cloud.api.api.commons.org.BusinessPreferences.getDefaultInstance()) return this;
      if (!other.getOrgId().isEmpty()) {
        orgId_ = other.orgId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getWeeksOfData() != 0) {
        setWeeksOfData(other.getWeeksOfData());
      }
      if (other.timeZone_ != 0) {
        setTimeZoneValue(other.getTimeZoneValue());
      }
      if (other.getMultiClientAccess() != false) {
        setMultiClientAccess(other.getMultiClientAccess());
      }
      if (other.getCustomVisualizations() != false) {
        setCustomVisualizations(other.getCustomVisualizations());
      }
      if (!other.getTimeFilter().isEmpty()) {
        timeFilter_ = other.timeFilter_;
        bitField0_ |= 0x00000020;
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
              orgId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 80: {
              weeksOfData_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 80
            case 88: {
              timeZone_ = input.readEnum();
              bitField0_ |= 0x00000004;
              break;
            } // case 88
            case 96: {
              multiClientAccess_ = input.readBool();
              bitField0_ |= 0x00000008;
              break;
            } // case 96
            case 104: {
              customVisualizations_ = input.readBool();
              bitField0_ |= 0x00000010;
              break;
            } // case 104
            case 114: {
              timeFilter_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000020;
              break;
            } // case 114
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

    private java.lang.Object orgId_ = "";
    /**
     * <pre>
     * Org ID.
     * </pre>
     *
     * <code>string org_id = 1 [json_name = "orgId"];</code>
     * @return The orgId.
     */
    public java.lang.String getOrgId() {
      java.lang.Object ref = orgId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        orgId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Org ID.
     * </pre>
     *
     * <code>string org_id = 1 [json_name = "orgId"];</code>
     * @return The bytes for orgId.
     */
    public com.google.protobuf.ByteString
        getOrgIdBytes() {
      java.lang.Object ref = orgId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        orgId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Org ID.
     * </pre>
     *
     * <code>string org_id = 1 [json_name = "orgId"];</code>
     * @param value The orgId to set.
     * @return This builder for chaining.
     */
    public Builder setOrgId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      orgId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Org ID.
     * </pre>
     *
     * <code>string org_id = 1 [json_name = "orgId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearOrgId() {
      orgId_ = getDefaultInstance().getOrgId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Org ID.
     * </pre>
     *
     * <code>string org_id = 1 [json_name = "orgId"];</code>
     * @param value The bytes for orgId to set.
     * @return This builder for chaining.
     */
    public Builder setOrgIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      orgId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int weeksOfData_ ;
    /**
     * <pre>
     * Number of weeks of past data that are accessible.
     * </pre>
     *
     * <code>int32 weeks_of_data = 10 [json_name = "weeksOfData"];</code>
     * @return The weeksOfData.
     */
    @java.lang.Override
    public int getWeeksOfData() {
      return weeksOfData_;
    }
    /**
     * <pre>
     * Number of weeks of past data that are accessible.
     * </pre>
     *
     * <code>int32 weeks_of_data = 10 [json_name = "weeksOfData"];</code>
     * @param value The weeksOfData to set.
     * @return This builder for chaining.
     */
    public Builder setWeeksOfData(int value) {

      weeksOfData_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Number of weeks of past data that are accessible.
     * </pre>
     *
     * <code>int32 weeks_of_data = 10 [json_name = "weeksOfData"];</code>
     * @return This builder for chaining.
     */
    public Builder clearWeeksOfData() {
      bitField0_ = (bitField0_ & ~0x00000002);
      weeksOfData_ = 0;
      onChanged();
      return this;
    }

    private int timeZone_ = 0;
    /**
     * <pre>
     * Default time zone for business intelligence.
     * </pre>
     *
     * <code>.api.commons.AnaTimeZone time_zone = 11 [json_name = "timeZone"];</code>
     * @return The enum numeric value on the wire for timeZone.
     */
    @java.lang.Override public int getTimeZoneValue() {
      return timeZone_;
    }
    /**
     * <pre>
     * Default time zone for business intelligence.
     * </pre>
     *
     * <code>.api.commons.AnaTimeZone time_zone = 11 [json_name = "timeZone"];</code>
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
     * Default time zone for business intelligence.
     * </pre>
     *
     * <code>.api.commons.AnaTimeZone time_zone = 11 [json_name = "timeZone"];</code>
     * @return The timeZone.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.AnaTimeZone getTimeZone() {
      com.tcn.cloud.api.api.commons.AnaTimeZone result = com.tcn.cloud.api.api.commons.AnaTimeZone.forNumber(timeZone_);
      return result == null ? com.tcn.cloud.api.api.commons.AnaTimeZone.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Default time zone for business intelligence.
     * </pre>
     *
     * <code>.api.commons.AnaTimeZone time_zone = 11 [json_name = "timeZone"];</code>
     * @param value The timeZone to set.
     * @return This builder for chaining.
     */
    public Builder setTimeZone(com.tcn.cloud.api.api.commons.AnaTimeZone value) {
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
     * Default time zone for business intelligence.
     * </pre>
     *
     * <code>.api.commons.AnaTimeZone time_zone = 11 [json_name = "timeZone"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTimeZone() {
      bitField0_ = (bitField0_ & ~0x00000004);
      timeZone_ = 0;
      onChanged();
      return this;
    }

    private boolean multiClientAccess_ ;
    /**
     * <pre>
     * Whether to allow multi-client access.
     * </pre>
     *
     * <code>bool multi_client_access = 12 [json_name = "multiClientAccess"];</code>
     * @return The multiClientAccess.
     */
    @java.lang.Override
    public boolean getMultiClientAccess() {
      return multiClientAccess_;
    }
    /**
     * <pre>
     * Whether to allow multi-client access.
     * </pre>
     *
     * <code>bool multi_client_access = 12 [json_name = "multiClientAccess"];</code>
     * @param value The multiClientAccess to set.
     * @return This builder for chaining.
     */
    public Builder setMultiClientAccess(boolean value) {

      multiClientAccess_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Whether to allow multi-client access.
     * </pre>
     *
     * <code>bool multi_client_access = 12 [json_name = "multiClientAccess"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMultiClientAccess() {
      bitField0_ = (bitField0_ & ~0x00000008);
      multiClientAccess_ = false;
      onChanged();
      return this;
    }

    private boolean customVisualizations_ ;
    /**
     * <pre>
     * Enable/disable of custom visualizations in BI.
     * </pre>
     *
     * <code>bool custom_visualizations = 13 [json_name = "customVisualizations"];</code>
     * @return The customVisualizations.
     */
    @java.lang.Override
    public boolean getCustomVisualizations() {
      return customVisualizations_;
    }
    /**
     * <pre>
     * Enable/disable of custom visualizations in BI.
     * </pre>
     *
     * <code>bool custom_visualizations = 13 [json_name = "customVisualizations"];</code>
     * @param value The customVisualizations to set.
     * @return This builder for chaining.
     */
    public Builder setCustomVisualizations(boolean value) {

      customVisualizations_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Enable/disable of custom visualizations in BI.
     * </pre>
     *
     * <code>bool custom_visualizations = 13 [json_name = "customVisualizations"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCustomVisualizations() {
      bitField0_ = (bitField0_ & ~0x00000010);
      customVisualizations_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object timeFilter_ = "";
    /**
     * <pre>
     * Time filter for custom dashboard and visualizations.
     * </pre>
     *
     * <code>string time_filter = 14 [json_name = "timeFilter"];</code>
     * @return The timeFilter.
     */
    public java.lang.String getTimeFilter() {
      java.lang.Object ref = timeFilter_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        timeFilter_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Time filter for custom dashboard and visualizations.
     * </pre>
     *
     * <code>string time_filter = 14 [json_name = "timeFilter"];</code>
     * @return The bytes for timeFilter.
     */
    public com.google.protobuf.ByteString
        getTimeFilterBytes() {
      java.lang.Object ref = timeFilter_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        timeFilter_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Time filter for custom dashboard and visualizations.
     * </pre>
     *
     * <code>string time_filter = 14 [json_name = "timeFilter"];</code>
     * @param value The timeFilter to set.
     * @return This builder for chaining.
     */
    public Builder setTimeFilter(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      timeFilter_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Time filter for custom dashboard and visualizations.
     * </pre>
     *
     * <code>string time_filter = 14 [json_name = "timeFilter"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTimeFilter() {
      timeFilter_ = getDefaultInstance().getTimeFilter();
      bitField0_ = (bitField0_ & ~0x00000020);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Time filter for custom dashboard and visualizations.
     * </pre>
     *
     * <code>string time_filter = 14 [json_name = "timeFilter"];</code>
     * @param value The bytes for timeFilter to set.
     * @return This builder for chaining.
     */
    public Builder setTimeFilterBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      timeFilter_ = value;
      bitField0_ |= 0x00000020;
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


    // @@protoc_insertion_point(builder_scope:api.commons.org.BusinessPreferences)
  }

  // @@protoc_insertion_point(class_scope:api.commons.org.BusinessPreferences)
  private static final com.tcn.cloud.api.api.commons.org.BusinessPreferences DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.commons.org.BusinessPreferences();
  }

  public static com.tcn.cloud.api.api.commons.org.BusinessPreferences getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BusinessPreferences>
      PARSER = new com.google.protobuf.AbstractParser<BusinessPreferences>() {
    @java.lang.Override
    public BusinessPreferences parsePartialFrom(
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

  public static com.google.protobuf.Parser<BusinessPreferences> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BusinessPreferences> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.BusinessPreferences getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

