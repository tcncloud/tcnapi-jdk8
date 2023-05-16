// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/legacy/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.legacy;

/**
 * Protobuf type {@code api.v1alpha1.org.legacy.BillingRegionRate}
 */
public final class BillingRegionRate extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.org.legacy.BillingRegionRate)
    BillingRegionRateOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BillingRegionRate.newBuilder() to construct.
  private BillingRegionRate(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BillingRegionRate() {
    billingRegionId_ = "";
    countryId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BillingRegionRate();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_BillingRegionRate_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_BillingRegionRate_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRegionRate.class, com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRegionRate.Builder.class);
  }

  public static final int BILLING_REGION_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRegion billingRegion_;
  /**
   * <code>.api.v1alpha1.org.legacy.BillingRegion billing_region = 1 [json_name = "billingRegion"];</code>
   * @return Whether the billingRegion field is set.
   */
  @java.lang.Override
  public boolean hasBillingRegion() {
    return billingRegion_ != null;
  }
  /**
   * <code>.api.v1alpha1.org.legacy.BillingRegion billing_region = 1 [json_name = "billingRegion"];</code>
   * @return The billingRegion.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRegion getBillingRegion() {
    return billingRegion_ == null ? com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRegion.getDefaultInstance() : billingRegion_;
  }
  /**
   * <code>.api.v1alpha1.org.legacy.BillingRegion billing_region = 1 [json_name = "billingRegion"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRegionOrBuilder getBillingRegionOrBuilder() {
    return billingRegion_ == null ? com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRegion.getDefaultInstance() : billingRegion_;
  }

  public static final int BILLING_RATE_FIELD_NUMBER = 2;
  private com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRate billingRate_;
  /**
   * <code>.api.v1alpha1.org.legacy.BillingRate billing_rate = 2 [json_name = "billingRate"];</code>
   * @return Whether the billingRate field is set.
   */
  @java.lang.Override
  public boolean hasBillingRate() {
    return billingRate_ != null;
  }
  /**
   * <code>.api.v1alpha1.org.legacy.BillingRate billing_rate = 2 [json_name = "billingRate"];</code>
   * @return The billingRate.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRate getBillingRate() {
    return billingRate_ == null ? com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRate.getDefaultInstance() : billingRate_;
  }
  /**
   * <code>.api.v1alpha1.org.legacy.BillingRate billing_rate = 2 [json_name = "billingRate"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRateOrBuilder getBillingRateOrBuilder() {
    return billingRate_ == null ? com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRate.getDefaultInstance() : billingRate_;
  }

  public static final int BILLING_REGION_ID_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object billingRegionId_ = "";
  /**
   * <code>string billing_region_id = 3 [json_name = "billingRegionId"];</code>
   * @return The billingRegionId.
   */
  @java.lang.Override
  public java.lang.String getBillingRegionId() {
    java.lang.Object ref = billingRegionId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      billingRegionId_ = s;
      return s;
    }
  }
  /**
   * <code>string billing_region_id = 3 [json_name = "billingRegionId"];</code>
   * @return The bytes for billingRegionId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBillingRegionIdBytes() {
    java.lang.Object ref = billingRegionId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      billingRegionId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COUNTRY_ID_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object countryId_ = "";
  /**
   * <code>string country_id = 4 [json_name = "countryId"];</code>
   * @return The countryId.
   */
  @java.lang.Override
  public java.lang.String getCountryId() {
    java.lang.Object ref = countryId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      countryId_ = s;
      return s;
    }
  }
  /**
   * <code>string country_id = 4 [json_name = "countryId"];</code>
   * @return The bytes for countryId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCountryIdBytes() {
    java.lang.Object ref = countryId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      countryId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IS_CUSTOM_FIELD_NUMBER = 5;
  private boolean isCustom_ = false;
  /**
   * <code>bool is_custom = 5 [json_name = "isCustom"];</code>
   * @return The isCustom.
   */
  @java.lang.Override
  public boolean getIsCustom() {
    return isCustom_;
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
    if (billingRegion_ != null) {
      output.writeMessage(1, getBillingRegion());
    }
    if (billingRate_ != null) {
      output.writeMessage(2, getBillingRate());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(billingRegionId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, billingRegionId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(countryId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, countryId_);
    }
    if (isCustom_ != false) {
      output.writeBool(5, isCustom_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (billingRegion_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getBillingRegion());
    }
    if (billingRate_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getBillingRate());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(billingRegionId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, billingRegionId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(countryId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, countryId_);
    }
    if (isCustom_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, isCustom_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRegionRate)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRegionRate other = (com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRegionRate) obj;

    if (hasBillingRegion() != other.hasBillingRegion()) return false;
    if (hasBillingRegion()) {
      if (!getBillingRegion()
          .equals(other.getBillingRegion())) return false;
    }
    if (hasBillingRate() != other.hasBillingRate()) return false;
    if (hasBillingRate()) {
      if (!getBillingRate()
          .equals(other.getBillingRate())) return false;
    }
    if (!getBillingRegionId()
        .equals(other.getBillingRegionId())) return false;
    if (!getCountryId()
        .equals(other.getCountryId())) return false;
    if (getIsCustom()
        != other.getIsCustom()) return false;
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
    if (hasBillingRegion()) {
      hash = (37 * hash) + BILLING_REGION_FIELD_NUMBER;
      hash = (53 * hash) + getBillingRegion().hashCode();
    }
    if (hasBillingRate()) {
      hash = (37 * hash) + BILLING_RATE_FIELD_NUMBER;
      hash = (53 * hash) + getBillingRate().hashCode();
    }
    hash = (37 * hash) + BILLING_REGION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getBillingRegionId().hashCode();
    hash = (37 * hash) + COUNTRY_ID_FIELD_NUMBER;
    hash = (53 * hash) + getCountryId().hashCode();
    hash = (37 * hash) + IS_CUSTOM_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsCustom());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRegionRate parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRegionRate parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRegionRate parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRegionRate parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRegionRate parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRegionRate parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRegionRate parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRegionRate parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRegionRate parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRegionRate parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRegionRate parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRegionRate parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRegionRate prototype) {
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
   * Protobuf type {@code api.v1alpha1.org.legacy.BillingRegionRate}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.org.legacy.BillingRegionRate)
      com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRegionRateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_BillingRegionRate_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_BillingRegionRate_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRegionRate.class, com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRegionRate.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRegionRate.newBuilder()
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
      billingRegion_ = null;
      if (billingRegionBuilder_ != null) {
        billingRegionBuilder_.dispose();
        billingRegionBuilder_ = null;
      }
      billingRate_ = null;
      if (billingRateBuilder_ != null) {
        billingRateBuilder_.dispose();
        billingRateBuilder_ = null;
      }
      billingRegionId_ = "";
      countryId_ = "";
      isCustom_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_BillingRegionRate_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRegionRate getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRegionRate.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRegionRate build() {
      com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRegionRate result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRegionRate buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRegionRate result = new com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRegionRate(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRegionRate result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.billingRegion_ = billingRegionBuilder_ == null
            ? billingRegion_
            : billingRegionBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.billingRate_ = billingRateBuilder_ == null
            ? billingRate_
            : billingRateBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.billingRegionId_ = billingRegionId_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.countryId_ = countryId_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.isCustom_ = isCustom_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRegionRate) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRegionRate)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRegionRate other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRegionRate.getDefaultInstance()) return this;
      if (other.hasBillingRegion()) {
        mergeBillingRegion(other.getBillingRegion());
      }
      if (other.hasBillingRate()) {
        mergeBillingRate(other.getBillingRate());
      }
      if (!other.getBillingRegionId().isEmpty()) {
        billingRegionId_ = other.billingRegionId_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getCountryId().isEmpty()) {
        countryId_ = other.countryId_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      if (other.getIsCustom() != false) {
        setIsCustom(other.getIsCustom());
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
              input.readMessage(
                  getBillingRegionFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getBillingRateFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              billingRegionId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              countryId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 40: {
              isCustom_ = input.readBool();
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

    private com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRegion billingRegion_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRegion, com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRegion.Builder, com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRegionOrBuilder> billingRegionBuilder_;
    /**
     * <code>.api.v1alpha1.org.legacy.BillingRegion billing_region = 1 [json_name = "billingRegion"];</code>
     * @return Whether the billingRegion field is set.
     */
    public boolean hasBillingRegion() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.api.v1alpha1.org.legacy.BillingRegion billing_region = 1 [json_name = "billingRegion"];</code>
     * @return The billingRegion.
     */
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRegion getBillingRegion() {
      if (billingRegionBuilder_ == null) {
        return billingRegion_ == null ? com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRegion.getDefaultInstance() : billingRegion_;
      } else {
        return billingRegionBuilder_.getMessage();
      }
    }
    /**
     * <code>.api.v1alpha1.org.legacy.BillingRegion billing_region = 1 [json_name = "billingRegion"];</code>
     */
    public Builder setBillingRegion(com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRegion value) {
      if (billingRegionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        billingRegion_ = value;
      } else {
        billingRegionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v1alpha1.org.legacy.BillingRegion billing_region = 1 [json_name = "billingRegion"];</code>
     */
    public Builder setBillingRegion(
        com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRegion.Builder builderForValue) {
      if (billingRegionBuilder_ == null) {
        billingRegion_ = builderForValue.build();
      } else {
        billingRegionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v1alpha1.org.legacy.BillingRegion billing_region = 1 [json_name = "billingRegion"];</code>
     */
    public Builder mergeBillingRegion(com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRegion value) {
      if (billingRegionBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          billingRegion_ != null &&
          billingRegion_ != com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRegion.getDefaultInstance()) {
          getBillingRegionBuilder().mergeFrom(value);
        } else {
          billingRegion_ = value;
        }
      } else {
        billingRegionBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v1alpha1.org.legacy.BillingRegion billing_region = 1 [json_name = "billingRegion"];</code>
     */
    public Builder clearBillingRegion() {
      bitField0_ = (bitField0_ & ~0x00000001);
      billingRegion_ = null;
      if (billingRegionBuilder_ != null) {
        billingRegionBuilder_.dispose();
        billingRegionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.api.v1alpha1.org.legacy.BillingRegion billing_region = 1 [json_name = "billingRegion"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRegion.Builder getBillingRegionBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getBillingRegionFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.v1alpha1.org.legacy.BillingRegion billing_region = 1 [json_name = "billingRegion"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRegionOrBuilder getBillingRegionOrBuilder() {
      if (billingRegionBuilder_ != null) {
        return billingRegionBuilder_.getMessageOrBuilder();
      } else {
        return billingRegion_ == null ?
            com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRegion.getDefaultInstance() : billingRegion_;
      }
    }
    /**
     * <code>.api.v1alpha1.org.legacy.BillingRegion billing_region = 1 [json_name = "billingRegion"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRegion, com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRegion.Builder, com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRegionOrBuilder> 
        getBillingRegionFieldBuilder() {
      if (billingRegionBuilder_ == null) {
        billingRegionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRegion, com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRegion.Builder, com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRegionOrBuilder>(
                getBillingRegion(),
                getParentForChildren(),
                isClean());
        billingRegion_ = null;
      }
      return billingRegionBuilder_;
    }

    private com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRate billingRate_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRate, com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRate.Builder, com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRateOrBuilder> billingRateBuilder_;
    /**
     * <code>.api.v1alpha1.org.legacy.BillingRate billing_rate = 2 [json_name = "billingRate"];</code>
     * @return Whether the billingRate field is set.
     */
    public boolean hasBillingRate() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.api.v1alpha1.org.legacy.BillingRate billing_rate = 2 [json_name = "billingRate"];</code>
     * @return The billingRate.
     */
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRate getBillingRate() {
      if (billingRateBuilder_ == null) {
        return billingRate_ == null ? com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRate.getDefaultInstance() : billingRate_;
      } else {
        return billingRateBuilder_.getMessage();
      }
    }
    /**
     * <code>.api.v1alpha1.org.legacy.BillingRate billing_rate = 2 [json_name = "billingRate"];</code>
     */
    public Builder setBillingRate(com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRate value) {
      if (billingRateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        billingRate_ = value;
      } else {
        billingRateBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v1alpha1.org.legacy.BillingRate billing_rate = 2 [json_name = "billingRate"];</code>
     */
    public Builder setBillingRate(
        com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRate.Builder builderForValue) {
      if (billingRateBuilder_ == null) {
        billingRate_ = builderForValue.build();
      } else {
        billingRateBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v1alpha1.org.legacy.BillingRate billing_rate = 2 [json_name = "billingRate"];</code>
     */
    public Builder mergeBillingRate(com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRate value) {
      if (billingRateBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          billingRate_ != null &&
          billingRate_ != com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRate.getDefaultInstance()) {
          getBillingRateBuilder().mergeFrom(value);
        } else {
          billingRate_ = value;
        }
      } else {
        billingRateBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v1alpha1.org.legacy.BillingRate billing_rate = 2 [json_name = "billingRate"];</code>
     */
    public Builder clearBillingRate() {
      bitField0_ = (bitField0_ & ~0x00000002);
      billingRate_ = null;
      if (billingRateBuilder_ != null) {
        billingRateBuilder_.dispose();
        billingRateBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.api.v1alpha1.org.legacy.BillingRate billing_rate = 2 [json_name = "billingRate"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRate.Builder getBillingRateBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getBillingRateFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.v1alpha1.org.legacy.BillingRate billing_rate = 2 [json_name = "billingRate"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRateOrBuilder getBillingRateOrBuilder() {
      if (billingRateBuilder_ != null) {
        return billingRateBuilder_.getMessageOrBuilder();
      } else {
        return billingRate_ == null ?
            com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRate.getDefaultInstance() : billingRate_;
      }
    }
    /**
     * <code>.api.v1alpha1.org.legacy.BillingRate billing_rate = 2 [json_name = "billingRate"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRate, com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRate.Builder, com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRateOrBuilder> 
        getBillingRateFieldBuilder() {
      if (billingRateBuilder_ == null) {
        billingRateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRate, com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRate.Builder, com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRateOrBuilder>(
                getBillingRate(),
                getParentForChildren(),
                isClean());
        billingRate_ = null;
      }
      return billingRateBuilder_;
    }

    private java.lang.Object billingRegionId_ = "";
    /**
     * <code>string billing_region_id = 3 [json_name = "billingRegionId"];</code>
     * @return The billingRegionId.
     */
    public java.lang.String getBillingRegionId() {
      java.lang.Object ref = billingRegionId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        billingRegionId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string billing_region_id = 3 [json_name = "billingRegionId"];</code>
     * @return The bytes for billingRegionId.
     */
    public com.google.protobuf.ByteString
        getBillingRegionIdBytes() {
      java.lang.Object ref = billingRegionId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        billingRegionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string billing_region_id = 3 [json_name = "billingRegionId"];</code>
     * @param value The billingRegionId to set.
     * @return This builder for chaining.
     */
    public Builder setBillingRegionId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      billingRegionId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string billing_region_id = 3 [json_name = "billingRegionId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearBillingRegionId() {
      billingRegionId_ = getDefaultInstance().getBillingRegionId();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string billing_region_id = 3 [json_name = "billingRegionId"];</code>
     * @param value The bytes for billingRegionId to set.
     * @return This builder for chaining.
     */
    public Builder setBillingRegionIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      billingRegionId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object countryId_ = "";
    /**
     * <code>string country_id = 4 [json_name = "countryId"];</code>
     * @return The countryId.
     */
    public java.lang.String getCountryId() {
      java.lang.Object ref = countryId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        countryId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string country_id = 4 [json_name = "countryId"];</code>
     * @return The bytes for countryId.
     */
    public com.google.protobuf.ByteString
        getCountryIdBytes() {
      java.lang.Object ref = countryId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        countryId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string country_id = 4 [json_name = "countryId"];</code>
     * @param value The countryId to set.
     * @return This builder for chaining.
     */
    public Builder setCountryId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      countryId_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>string country_id = 4 [json_name = "countryId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCountryId() {
      countryId_ = getDefaultInstance().getCountryId();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>string country_id = 4 [json_name = "countryId"];</code>
     * @param value The bytes for countryId to set.
     * @return This builder for chaining.
     */
    public Builder setCountryIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      countryId_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private boolean isCustom_ ;
    /**
     * <code>bool is_custom = 5 [json_name = "isCustom"];</code>
     * @return The isCustom.
     */
    @java.lang.Override
    public boolean getIsCustom() {
      return isCustom_;
    }
    /**
     * <code>bool is_custom = 5 [json_name = "isCustom"];</code>
     * @param value The isCustom to set.
     * @return This builder for chaining.
     */
    public Builder setIsCustom(boolean value) {

      isCustom_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>bool is_custom = 5 [json_name = "isCustom"];</code>
     * @return This builder for chaining.
     */
    public Builder clearIsCustom() {
      bitField0_ = (bitField0_ & ~0x00000010);
      isCustom_ = false;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.org.legacy.BillingRegionRate)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.org.legacy.BillingRegionRate)
  private static final com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRegionRate DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRegionRate();
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRegionRate getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BillingRegionRate>
      PARSER = new com.google.protobuf.AbstractParser<BillingRegionRate>() {
    @java.lang.Override
    public BillingRegionRate parsePartialFrom(
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

  public static com.google.protobuf.Parser<BillingRegionRate> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BillingRegionRate> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.legacy.BillingRegionRate getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

