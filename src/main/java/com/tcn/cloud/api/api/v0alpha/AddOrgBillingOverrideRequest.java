// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/org.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * <pre>
 * Request message for the AddOrgBillingOverride rpc.
 * </pre>
 *
 * Protobuf type {@code api.v0alpha.AddOrgBillingOverrideRequest}
 */
public final class AddOrgBillingOverrideRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.AddOrgBillingOverrideRequest)
    AddOrgBillingOverrideRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AddOrgBillingOverrideRequest.newBuilder() to construct.
  private AddOrgBillingOverrideRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AddOrgBillingOverrideRequest() {
    orgId_ = "";
    region_ = "";
    country_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AddOrgBillingOverrideRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_AddOrgBillingOverrideRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_AddOrgBillingOverrideRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.AddOrgBillingOverrideRequest.class, com.tcn.cloud.api.api.v0alpha.AddOrgBillingOverrideRequest.Builder.class);
  }

  private int bitField0_;
  public static final int ORG_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object orgId_ = "";
  /**
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

  public static final int REGION_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object region_ = "";
  /**
   * <code>string region = 2 [json_name = "region"];</code>
   * @return The region.
   */
  @java.lang.Override
  public java.lang.String getRegion() {
    java.lang.Object ref = region_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      region_ = s;
      return s;
    }
  }
  /**
   * <code>string region = 2 [json_name = "region"];</code>
   * @return The bytes for region.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRegionBytes() {
    java.lang.Object ref = region_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      region_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RATES_FIELD_NUMBER = 3;
  private com.tcn.cloud.api.api.v0alpha.PhoneBillingRates rates_;
  /**
   * <code>.api.v0alpha.PhoneBillingRates rates = 3 [json_name = "rates"];</code>
   * @return Whether the rates field is set.
   */
  @java.lang.Override
  public boolean hasRates() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.api.v0alpha.PhoneBillingRates rates = 3 [json_name = "rates"];</code>
   * @return The rates.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.PhoneBillingRates getRates() {
    return rates_ == null ? com.tcn.cloud.api.api.v0alpha.PhoneBillingRates.getDefaultInstance() : rates_;
  }
  /**
   * <code>.api.v0alpha.PhoneBillingRates rates = 3 [json_name = "rates"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.PhoneBillingRatesOrBuilder getRatesOrBuilder() {
    return rates_ == null ? com.tcn.cloud.api.api.v0alpha.PhoneBillingRates.getDefaultInstance() : rates_;
  }

  public static final int COUNTRY_FIELD_NUMBER = 4;
  private int country_ = 0;
  /**
   * <code>.api.commons.Country country = 4 [json_name = "country"];</code>
   * @return The enum numeric value on the wire for country.
   */
  @java.lang.Override public int getCountryValue() {
    return country_;
  }
  /**
   * <code>.api.commons.Country country = 4 [json_name = "country"];</code>
   * @return The country.
   */
  @java.lang.Override public com.tcn.cloud.api.api.commons.Country getCountry() {
    com.tcn.cloud.api.api.commons.Country result = com.tcn.cloud.api.api.commons.Country.forNumber(country_);
    return result == null ? com.tcn.cloud.api.api.commons.Country.UNRECOGNIZED : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(region_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, region_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(3, getRates());
    }
    if (country_ != com.tcn.cloud.api.api.commons.Country.COUNTRY_UNDEFINED.getNumber()) {
      output.writeEnum(4, country_);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(region_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, region_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getRates());
    }
    if (country_ != com.tcn.cloud.api.api.commons.Country.COUNTRY_UNDEFINED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, country_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.AddOrgBillingOverrideRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.AddOrgBillingOverrideRequest other = (com.tcn.cloud.api.api.v0alpha.AddOrgBillingOverrideRequest) obj;

    if (!getOrgId()
        .equals(other.getOrgId())) return false;
    if (!getRegion()
        .equals(other.getRegion())) return false;
    if (hasRates() != other.hasRates()) return false;
    if (hasRates()) {
      if (!getRates()
          .equals(other.getRates())) return false;
    }
    if (country_ != other.country_) return false;
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
    hash = (37 * hash) + REGION_FIELD_NUMBER;
    hash = (53 * hash) + getRegion().hashCode();
    if (hasRates()) {
      hash = (37 * hash) + RATES_FIELD_NUMBER;
      hash = (53 * hash) + getRates().hashCode();
    }
    hash = (37 * hash) + COUNTRY_FIELD_NUMBER;
    hash = (53 * hash) + country_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.AddOrgBillingOverrideRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.AddOrgBillingOverrideRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.AddOrgBillingOverrideRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.AddOrgBillingOverrideRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.AddOrgBillingOverrideRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.AddOrgBillingOverrideRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.AddOrgBillingOverrideRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.AddOrgBillingOverrideRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.AddOrgBillingOverrideRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.AddOrgBillingOverrideRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.AddOrgBillingOverrideRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.AddOrgBillingOverrideRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.AddOrgBillingOverrideRequest prototype) {
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
   * Request message for the AddOrgBillingOverride rpc.
   * </pre>
   *
   * Protobuf type {@code api.v0alpha.AddOrgBillingOverrideRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.AddOrgBillingOverrideRequest)
      com.tcn.cloud.api.api.v0alpha.AddOrgBillingOverrideRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_AddOrgBillingOverrideRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_AddOrgBillingOverrideRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.AddOrgBillingOverrideRequest.class, com.tcn.cloud.api.api.v0alpha.AddOrgBillingOverrideRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.AddOrgBillingOverrideRequest.newBuilder()
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
        getRatesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      orgId_ = "";
      region_ = "";
      rates_ = null;
      if (ratesBuilder_ != null) {
        ratesBuilder_.dispose();
        ratesBuilder_ = null;
      }
      country_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_AddOrgBillingOverrideRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.AddOrgBillingOverrideRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.AddOrgBillingOverrideRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.AddOrgBillingOverrideRequest build() {
      com.tcn.cloud.api.api.v0alpha.AddOrgBillingOverrideRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.AddOrgBillingOverrideRequest buildPartial() {
      com.tcn.cloud.api.api.v0alpha.AddOrgBillingOverrideRequest result = new com.tcn.cloud.api.api.v0alpha.AddOrgBillingOverrideRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.AddOrgBillingOverrideRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.orgId_ = orgId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.region_ = region_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.rates_ = ratesBuilder_ == null
            ? rates_
            : ratesBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.country_ = country_;
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.AddOrgBillingOverrideRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.AddOrgBillingOverrideRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.AddOrgBillingOverrideRequest other) {
      if (other == com.tcn.cloud.api.api.v0alpha.AddOrgBillingOverrideRequest.getDefaultInstance()) return this;
      if (!other.getOrgId().isEmpty()) {
        orgId_ = other.orgId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getRegion().isEmpty()) {
        region_ = other.region_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasRates()) {
        mergeRates(other.getRates());
      }
      if (other.country_ != 0) {
        setCountryValue(other.getCountryValue());
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
            case 18: {
              region_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getRatesFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              country_ = input.readEnum();
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

    private java.lang.Object orgId_ = "";
    /**
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

    private java.lang.Object region_ = "";
    /**
     * <code>string region = 2 [json_name = "region"];</code>
     * @return The region.
     */
    public java.lang.String getRegion() {
      java.lang.Object ref = region_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        region_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string region = 2 [json_name = "region"];</code>
     * @return The bytes for region.
     */
    public com.google.protobuf.ByteString
        getRegionBytes() {
      java.lang.Object ref = region_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        region_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string region = 2 [json_name = "region"];</code>
     * @param value The region to set.
     * @return This builder for chaining.
     */
    public Builder setRegion(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      region_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string region = 2 [json_name = "region"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRegion() {
      region_ = getDefaultInstance().getRegion();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string region = 2 [json_name = "region"];</code>
     * @param value The bytes for region to set.
     * @return This builder for chaining.
     */
    public Builder setRegionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      region_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.tcn.cloud.api.api.v0alpha.PhoneBillingRates rates_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.PhoneBillingRates, com.tcn.cloud.api.api.v0alpha.PhoneBillingRates.Builder, com.tcn.cloud.api.api.v0alpha.PhoneBillingRatesOrBuilder> ratesBuilder_;
    /**
     * <code>.api.v0alpha.PhoneBillingRates rates = 3 [json_name = "rates"];</code>
     * @return Whether the rates field is set.
     */
    public boolean hasRates() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.api.v0alpha.PhoneBillingRates rates = 3 [json_name = "rates"];</code>
     * @return The rates.
     */
    public com.tcn.cloud.api.api.v0alpha.PhoneBillingRates getRates() {
      if (ratesBuilder_ == null) {
        return rates_ == null ? com.tcn.cloud.api.api.v0alpha.PhoneBillingRates.getDefaultInstance() : rates_;
      } else {
        return ratesBuilder_.getMessage();
      }
    }
    /**
     * <code>.api.v0alpha.PhoneBillingRates rates = 3 [json_name = "rates"];</code>
     */
    public Builder setRates(com.tcn.cloud.api.api.v0alpha.PhoneBillingRates value) {
      if (ratesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        rates_ = value;
      } else {
        ratesBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.PhoneBillingRates rates = 3 [json_name = "rates"];</code>
     */
    public Builder setRates(
        com.tcn.cloud.api.api.v0alpha.PhoneBillingRates.Builder builderForValue) {
      if (ratesBuilder_ == null) {
        rates_ = builderForValue.build();
      } else {
        ratesBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.PhoneBillingRates rates = 3 [json_name = "rates"];</code>
     */
    public Builder mergeRates(com.tcn.cloud.api.api.v0alpha.PhoneBillingRates value) {
      if (ratesBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          rates_ != null &&
          rates_ != com.tcn.cloud.api.api.v0alpha.PhoneBillingRates.getDefaultInstance()) {
          getRatesBuilder().mergeFrom(value);
        } else {
          rates_ = value;
        }
      } else {
        ratesBuilder_.mergeFrom(value);
      }
      if (rates_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.api.v0alpha.PhoneBillingRates rates = 3 [json_name = "rates"];</code>
     */
    public Builder clearRates() {
      bitField0_ = (bitField0_ & ~0x00000004);
      rates_ = null;
      if (ratesBuilder_ != null) {
        ratesBuilder_.dispose();
        ratesBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.PhoneBillingRates rates = 3 [json_name = "rates"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.PhoneBillingRates.Builder getRatesBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getRatesFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.v0alpha.PhoneBillingRates rates = 3 [json_name = "rates"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.PhoneBillingRatesOrBuilder getRatesOrBuilder() {
      if (ratesBuilder_ != null) {
        return ratesBuilder_.getMessageOrBuilder();
      } else {
        return rates_ == null ?
            com.tcn.cloud.api.api.v0alpha.PhoneBillingRates.getDefaultInstance() : rates_;
      }
    }
    /**
     * <code>.api.v0alpha.PhoneBillingRates rates = 3 [json_name = "rates"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.PhoneBillingRates, com.tcn.cloud.api.api.v0alpha.PhoneBillingRates.Builder, com.tcn.cloud.api.api.v0alpha.PhoneBillingRatesOrBuilder> 
        getRatesFieldBuilder() {
      if (ratesBuilder_ == null) {
        ratesBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.PhoneBillingRates, com.tcn.cloud.api.api.v0alpha.PhoneBillingRates.Builder, com.tcn.cloud.api.api.v0alpha.PhoneBillingRatesOrBuilder>(
                getRates(),
                getParentForChildren(),
                isClean());
        rates_ = null;
      }
      return ratesBuilder_;
    }

    private int country_ = 0;
    /**
     * <code>.api.commons.Country country = 4 [json_name = "country"];</code>
     * @return The enum numeric value on the wire for country.
     */
    @java.lang.Override public int getCountryValue() {
      return country_;
    }
    /**
     * <code>.api.commons.Country country = 4 [json_name = "country"];</code>
     * @param value The enum numeric value on the wire for country to set.
     * @return This builder for chaining.
     */
    public Builder setCountryValue(int value) {
      country_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.Country country = 4 [json_name = "country"];</code>
     * @return The country.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.Country getCountry() {
      com.tcn.cloud.api.api.commons.Country result = com.tcn.cloud.api.api.commons.Country.forNumber(country_);
      return result == null ? com.tcn.cloud.api.api.commons.Country.UNRECOGNIZED : result;
    }
    /**
     * <code>.api.commons.Country country = 4 [json_name = "country"];</code>
     * @param value The country to set.
     * @return This builder for chaining.
     */
    public Builder setCountry(com.tcn.cloud.api.api.commons.Country value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000008;
      country_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.Country country = 4 [json_name = "country"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCountry() {
      bitField0_ = (bitField0_ & ~0x00000008);
      country_ = 0;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.AddOrgBillingOverrideRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.AddOrgBillingOverrideRequest)
  private static final com.tcn.cloud.api.api.v0alpha.AddOrgBillingOverrideRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.AddOrgBillingOverrideRequest();
  }

  public static com.tcn.cloud.api.api.v0alpha.AddOrgBillingOverrideRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AddOrgBillingOverrideRequest>
      PARSER = new com.google.protobuf.AbstractParser<AddOrgBillingOverrideRequest>() {
    @java.lang.Override
    public AddOrgBillingOverrideRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<AddOrgBillingOverrideRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AddOrgBillingOverrideRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.AddOrgBillingOverrideRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

