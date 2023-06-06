// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/legacy/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.legacy;

/**
 * <pre>
 * Wrapper BusinessPreferences object for get response and update request
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.org.legacy.BusinessPreferences}
 */
public final class BusinessPreferences extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.org.legacy.BusinessPreferences)
    BusinessPreferencesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BusinessPreferences.newBuilder() to construct.
  private BusinessPreferences(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BusinessPreferences() {
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
    return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_BusinessPreferences_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_BusinessPreferences_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.org.legacy.BusinessPreferences.class, com.tcn.cloud.api.api.v1alpha1.org.legacy.BusinessPreferences.Builder.class);
  }

  public static final int WEEKS_OF_DATA_FIELD_NUMBER = 1;
  private int weeksOfData_ = 0;
  /**
   * <pre>
   * Default number of weeks shown in business intelligence analytics visualizer
   * </pre>
   *
   * <code>int32 weeks_of_data = 1 [json_name = "weeksOfData"];</code>
   * @return The weeksOfData.
   */
  @java.lang.Override
  public int getWeeksOfData() {
    return weeksOfData_;
  }

  public static final int TIME_ZONE_FIELD_NUMBER = 2;
  private int timeZone_ = 0;
  /**
   * <pre>
   * Time zone for business intelligence
   * </pre>
   *
   * <code>.api.commons.AnaTimeZone time_zone = 2 [json_name = "timeZone"];</code>
   * @return The enum numeric value on the wire for timeZone.
   */
  @java.lang.Override public int getTimeZoneValue() {
    return timeZone_;
  }
  /**
   * <pre>
   * Time zone for business intelligence
   * </pre>
   *
   * <code>.api.commons.AnaTimeZone time_zone = 2 [json_name = "timeZone"];</code>
   * @return The timeZone.
   */
  @java.lang.Override public com.tcn.cloud.api.api.commons.AnaTimeZone getTimeZone() {
    com.tcn.cloud.api.api.commons.AnaTimeZone result = com.tcn.cloud.api.api.commons.AnaTimeZone.forNumber(timeZone_);
    return result == null ? com.tcn.cloud.api.api.commons.AnaTimeZone.UNRECOGNIZED : result;
  }

  public static final int MULTI_CLIENT_ACCESS_FIELD_NUMBER = 3;
  private boolean multiClientAccess_ = false;
  /**
   * <pre>
   * Controls adoption for multi-client access
   * </pre>
   *
   * <code>bool multi_client_access = 3 [json_name = "multiClientAccess"];</code>
   * @return The multiClientAccess.
   */
  @java.lang.Override
  public boolean getMultiClientAccess() {
    return multiClientAccess_;
  }

  public static final int CUSTOM_VISUALIZATIONS_FIELD_NUMBER = 4;
  private boolean customVisualizations_ = false;
  /**
   * <pre>
   * Controls custom reports visualization
   * </pre>
   *
   * <code>bool custom_visualizations = 4 [json_name = "customVisualizations"];</code>
   * @return The customVisualizations.
   */
  @java.lang.Override
  public boolean getCustomVisualizations() {
    return customVisualizations_;
  }

  public static final int TIME_FILTER_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object timeFilter_ = "";
  /**
   * <pre>
   * Default time filter in custom dashboard and visualizations
   * </pre>
   *
   * <code>string time_filter = 5 [json_name = "timeFilter"];</code>
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
   * Default time filter in custom dashboard and visualizations
   * </pre>
   *
   * <code>string time_filter = 5 [json_name = "timeFilter"];</code>
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
    if (weeksOfData_ != 0) {
      output.writeInt32(1, weeksOfData_);
    }
    if (timeZone_ != com.tcn.cloud.api.api.commons.AnaTimeZone.ANA_TIME_ZONE_UNKNOWN.getNumber()) {
      output.writeEnum(2, timeZone_);
    }
    if (multiClientAccess_ != false) {
      output.writeBool(3, multiClientAccess_);
    }
    if (customVisualizations_ != false) {
      output.writeBool(4, customVisualizations_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(timeFilter_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, timeFilter_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (weeksOfData_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, weeksOfData_);
    }
    if (timeZone_ != com.tcn.cloud.api.api.commons.AnaTimeZone.ANA_TIME_ZONE_UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, timeZone_);
    }
    if (multiClientAccess_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, multiClientAccess_);
    }
    if (customVisualizations_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, customVisualizations_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(timeFilter_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, timeFilter_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.org.legacy.BusinessPreferences)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.org.legacy.BusinessPreferences other = (com.tcn.cloud.api.api.v1alpha1.org.legacy.BusinessPreferences) obj;

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

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.BusinessPreferences parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.BusinessPreferences parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.BusinessPreferences parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.BusinessPreferences parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.BusinessPreferences parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.BusinessPreferences parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.BusinessPreferences parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.BusinessPreferences parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.BusinessPreferences parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.BusinessPreferences parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.BusinessPreferences parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.BusinessPreferences parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.org.legacy.BusinessPreferences prototype) {
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
   * Wrapper BusinessPreferences object for get response and update request
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.org.legacy.BusinessPreferences}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.org.legacy.BusinessPreferences)
      com.tcn.cloud.api.api.v1alpha1.org.legacy.BusinessPreferencesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_BusinessPreferences_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_BusinessPreferences_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.org.legacy.BusinessPreferences.class, com.tcn.cloud.api.api.v1alpha1.org.legacy.BusinessPreferences.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.org.legacy.BusinessPreferences.newBuilder()
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
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_BusinessPreferences_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.BusinessPreferences getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.BusinessPreferences.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.BusinessPreferences build() {
      com.tcn.cloud.api.api.v1alpha1.org.legacy.BusinessPreferences result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.BusinessPreferences buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.org.legacy.BusinessPreferences result = new com.tcn.cloud.api.api.v1alpha1.org.legacy.BusinessPreferences(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.org.legacy.BusinessPreferences result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.weeksOfData_ = weeksOfData_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.timeZone_ = timeZone_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.multiClientAccess_ = multiClientAccess_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.customVisualizations_ = customVisualizations_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.timeFilter_ = timeFilter_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.org.legacy.BusinessPreferences) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.org.legacy.BusinessPreferences)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.org.legacy.BusinessPreferences other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.org.legacy.BusinessPreferences.getDefaultInstance()) return this;
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
        bitField0_ |= 0x00000010;
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
            case 8: {
              weeksOfData_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              timeZone_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              multiClientAccess_ = input.readBool();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              customVisualizations_ = input.readBool();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 42: {
              timeFilter_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000010;
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

    private int weeksOfData_ ;
    /**
     * <pre>
     * Default number of weeks shown in business intelligence analytics visualizer
     * </pre>
     *
     * <code>int32 weeks_of_data = 1 [json_name = "weeksOfData"];</code>
     * @return The weeksOfData.
     */
    @java.lang.Override
    public int getWeeksOfData() {
      return weeksOfData_;
    }
    /**
     * <pre>
     * Default number of weeks shown in business intelligence analytics visualizer
     * </pre>
     *
     * <code>int32 weeks_of_data = 1 [json_name = "weeksOfData"];</code>
     * @param value The weeksOfData to set.
     * @return This builder for chaining.
     */
    public Builder setWeeksOfData(int value) {

      weeksOfData_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Default number of weeks shown in business intelligence analytics visualizer
     * </pre>
     *
     * <code>int32 weeks_of_data = 1 [json_name = "weeksOfData"];</code>
     * @return This builder for chaining.
     */
    public Builder clearWeeksOfData() {
      bitField0_ = (bitField0_ & ~0x00000001);
      weeksOfData_ = 0;
      onChanged();
      return this;
    }

    private int timeZone_ = 0;
    /**
     * <pre>
     * Time zone for business intelligence
     * </pre>
     *
     * <code>.api.commons.AnaTimeZone time_zone = 2 [json_name = "timeZone"];</code>
     * @return The enum numeric value on the wire for timeZone.
     */
    @java.lang.Override public int getTimeZoneValue() {
      return timeZone_;
    }
    /**
     * <pre>
     * Time zone for business intelligence
     * </pre>
     *
     * <code>.api.commons.AnaTimeZone time_zone = 2 [json_name = "timeZone"];</code>
     * @param value The enum numeric value on the wire for timeZone to set.
     * @return This builder for chaining.
     */
    public Builder setTimeZoneValue(int value) {
      timeZone_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Time zone for business intelligence
     * </pre>
     *
     * <code>.api.commons.AnaTimeZone time_zone = 2 [json_name = "timeZone"];</code>
     * @return The timeZone.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.AnaTimeZone getTimeZone() {
      com.tcn.cloud.api.api.commons.AnaTimeZone result = com.tcn.cloud.api.api.commons.AnaTimeZone.forNumber(timeZone_);
      return result == null ? com.tcn.cloud.api.api.commons.AnaTimeZone.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Time zone for business intelligence
     * </pre>
     *
     * <code>.api.commons.AnaTimeZone time_zone = 2 [json_name = "timeZone"];</code>
     * @param value The timeZone to set.
     * @return This builder for chaining.
     */
    public Builder setTimeZone(com.tcn.cloud.api.api.commons.AnaTimeZone value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      timeZone_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Time zone for business intelligence
     * </pre>
     *
     * <code>.api.commons.AnaTimeZone time_zone = 2 [json_name = "timeZone"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTimeZone() {
      bitField0_ = (bitField0_ & ~0x00000002);
      timeZone_ = 0;
      onChanged();
      return this;
    }

    private boolean multiClientAccess_ ;
    /**
     * <pre>
     * Controls adoption for multi-client access
     * </pre>
     *
     * <code>bool multi_client_access = 3 [json_name = "multiClientAccess"];</code>
     * @return The multiClientAccess.
     */
    @java.lang.Override
    public boolean getMultiClientAccess() {
      return multiClientAccess_;
    }
    /**
     * <pre>
     * Controls adoption for multi-client access
     * </pre>
     *
     * <code>bool multi_client_access = 3 [json_name = "multiClientAccess"];</code>
     * @param value The multiClientAccess to set.
     * @return This builder for chaining.
     */
    public Builder setMultiClientAccess(boolean value) {

      multiClientAccess_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Controls adoption for multi-client access
     * </pre>
     *
     * <code>bool multi_client_access = 3 [json_name = "multiClientAccess"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMultiClientAccess() {
      bitField0_ = (bitField0_ & ~0x00000004);
      multiClientAccess_ = false;
      onChanged();
      return this;
    }

    private boolean customVisualizations_ ;
    /**
     * <pre>
     * Controls custom reports visualization
     * </pre>
     *
     * <code>bool custom_visualizations = 4 [json_name = "customVisualizations"];</code>
     * @return The customVisualizations.
     */
    @java.lang.Override
    public boolean getCustomVisualizations() {
      return customVisualizations_;
    }
    /**
     * <pre>
     * Controls custom reports visualization
     * </pre>
     *
     * <code>bool custom_visualizations = 4 [json_name = "customVisualizations"];</code>
     * @param value The customVisualizations to set.
     * @return This builder for chaining.
     */
    public Builder setCustomVisualizations(boolean value) {

      customVisualizations_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Controls custom reports visualization
     * </pre>
     *
     * <code>bool custom_visualizations = 4 [json_name = "customVisualizations"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCustomVisualizations() {
      bitField0_ = (bitField0_ & ~0x00000008);
      customVisualizations_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object timeFilter_ = "";
    /**
     * <pre>
     * Default time filter in custom dashboard and visualizations
     * </pre>
     *
     * <code>string time_filter = 5 [json_name = "timeFilter"];</code>
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
     * Default time filter in custom dashboard and visualizations
     * </pre>
     *
     * <code>string time_filter = 5 [json_name = "timeFilter"];</code>
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
     * Default time filter in custom dashboard and visualizations
     * </pre>
     *
     * <code>string time_filter = 5 [json_name = "timeFilter"];</code>
     * @param value The timeFilter to set.
     * @return This builder for chaining.
     */
    public Builder setTimeFilter(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      timeFilter_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Default time filter in custom dashboard and visualizations
     * </pre>
     *
     * <code>string time_filter = 5 [json_name = "timeFilter"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTimeFilter() {
      timeFilter_ = getDefaultInstance().getTimeFilter();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Default time filter in custom dashboard and visualizations
     * </pre>
     *
     * <code>string time_filter = 5 [json_name = "timeFilter"];</code>
     * @param value The bytes for timeFilter to set.
     * @return This builder for chaining.
     */
    public Builder setTimeFilterBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      timeFilter_ = value;
      bitField0_ |= 0x00000010;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.org.legacy.BusinessPreferences)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.org.legacy.BusinessPreferences)
  private static final com.tcn.cloud.api.api.v1alpha1.org.legacy.BusinessPreferences DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.org.legacy.BusinessPreferences();
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.BusinessPreferences getDefaultInstance() {
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
  public com.tcn.cloud.api.api.v1alpha1.org.legacy.BusinessPreferences getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

