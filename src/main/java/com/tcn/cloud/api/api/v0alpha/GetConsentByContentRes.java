// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/compliance.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.GetConsentByContentRes}
 */
public final class GetConsentByContentRes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.GetConsentByContentRes)
    GetConsentByContentResOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetConsentByContentRes.newBuilder() to construct.
  private GetConsentByContentRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetConsentByContentRes() {
    orgId_ = "";
    profileName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetConsentByContentRes();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.ComplianceProto.internal_static_api_v0alpha_GetConsentByContentRes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.ComplianceProto.internal_static_api_v0alpha_GetConsentByContentRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.GetConsentByContentRes.class, com.tcn.cloud.api.api.v0alpha.GetConsentByContentRes.Builder.class);
  }

  public static final int ORG_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object orgId_ = "";
  /**
   * <pre>
   * id of assigned org
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
   * id of assigned org
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

  public static final int PROFILE_NAME_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object profileName_ = "";
  /**
   * <pre>
   * name of consent profile
   * </pre>
   *
   * <code>string profile_name = 2 [json_name = "profileName"];</code>
   * @return The profileName.
   */
  @java.lang.Override
  public java.lang.String getProfileName() {
    java.lang.Object ref = profileName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      profileName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * name of consent profile
   * </pre>
   *
   * <code>string profile_name = 2 [json_name = "profileName"];</code>
   * @return The bytes for profileName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getProfileNameBytes() {
    java.lang.Object ref = profileName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      profileName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONSENT_FIELD_NUMBER = 3;
  private com.tcn.cloud.api.api.v0alpha.Consent consent_;
  /**
   * <pre>
   * consent entity
   * </pre>
   *
   * <code>.api.v0alpha.Consent consent = 3 [json_name = "consent"];</code>
   * @return Whether the consent field is set.
   */
  @java.lang.Override
  public boolean hasConsent() {
    return consent_ != null;
  }
  /**
   * <pre>
   * consent entity
   * </pre>
   *
   * <code>.api.v0alpha.Consent consent = 3 [json_name = "consent"];</code>
   * @return The consent.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.Consent getConsent() {
    return consent_ == null ? com.tcn.cloud.api.api.v0alpha.Consent.getDefaultInstance() : consent_;
  }
  /**
   * <pre>
   * consent entity
   * </pre>
   *
   * <code>.api.v0alpha.Consent consent = 3 [json_name = "consent"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.ConsentOrBuilder getConsentOrBuilder() {
    return consent_ == null ? com.tcn.cloud.api.api.v0alpha.Consent.getDefaultInstance() : consent_;
  }

  public static final int DISABLED_FIELD_NUMBER = 4;
  private boolean disabled_ = false;
  /**
   * <pre>
   * consent profile disabled
   * </pre>
   *
   * <code>bool disabled = 4 [json_name = "disabled"];</code>
   * @return The disabled.
   */
  @java.lang.Override
  public boolean getDisabled() {
    return disabled_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(profileName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, profileName_);
    }
    if (consent_ != null) {
      output.writeMessage(3, getConsent());
    }
    if (disabled_ != false) {
      output.writeBool(4, disabled_);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(profileName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, profileName_);
    }
    if (consent_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getConsent());
    }
    if (disabled_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, disabled_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.GetConsentByContentRes)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.GetConsentByContentRes other = (com.tcn.cloud.api.api.v0alpha.GetConsentByContentRes) obj;

    if (!getOrgId()
        .equals(other.getOrgId())) return false;
    if (!getProfileName()
        .equals(other.getProfileName())) return false;
    if (hasConsent() != other.hasConsent()) return false;
    if (hasConsent()) {
      if (!getConsent()
          .equals(other.getConsent())) return false;
    }
    if (getDisabled()
        != other.getDisabled()) return false;
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
    hash = (37 * hash) + PROFILE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getProfileName().hashCode();
    if (hasConsent()) {
      hash = (37 * hash) + CONSENT_FIELD_NUMBER;
      hash = (53 * hash) + getConsent().hashCode();
    }
    hash = (37 * hash) + DISABLED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDisabled());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.GetConsentByContentRes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetConsentByContentRes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetConsentByContentRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetConsentByContentRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetConsentByContentRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetConsentByContentRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetConsentByContentRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetConsentByContentRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.GetConsentByContentRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.GetConsentByContentRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetConsentByContentRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetConsentByContentRes parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.GetConsentByContentRes prototype) {
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
   * Protobuf type {@code api.v0alpha.GetConsentByContentRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.GetConsentByContentRes)
      com.tcn.cloud.api.api.v0alpha.GetConsentByContentResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.ComplianceProto.internal_static_api_v0alpha_GetConsentByContentRes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.ComplianceProto.internal_static_api_v0alpha_GetConsentByContentRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.GetConsentByContentRes.class, com.tcn.cloud.api.api.v0alpha.GetConsentByContentRes.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.GetConsentByContentRes.newBuilder()
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
      profileName_ = "";
      consent_ = null;
      if (consentBuilder_ != null) {
        consentBuilder_.dispose();
        consentBuilder_ = null;
      }
      disabled_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.ComplianceProto.internal_static_api_v0alpha_GetConsentByContentRes_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetConsentByContentRes getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.GetConsentByContentRes.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetConsentByContentRes build() {
      com.tcn.cloud.api.api.v0alpha.GetConsentByContentRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetConsentByContentRes buildPartial() {
      com.tcn.cloud.api.api.v0alpha.GetConsentByContentRes result = new com.tcn.cloud.api.api.v0alpha.GetConsentByContentRes(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.GetConsentByContentRes result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.orgId_ = orgId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.profileName_ = profileName_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.consent_ = consentBuilder_ == null
            ? consent_
            : consentBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.disabled_ = disabled_;
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.GetConsentByContentRes) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.GetConsentByContentRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.GetConsentByContentRes other) {
      if (other == com.tcn.cloud.api.api.v0alpha.GetConsentByContentRes.getDefaultInstance()) return this;
      if (!other.getOrgId().isEmpty()) {
        orgId_ = other.orgId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getProfileName().isEmpty()) {
        profileName_ = other.profileName_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasConsent()) {
        mergeConsent(other.getConsent());
      }
      if (other.getDisabled() != false) {
        setDisabled(other.getDisabled());
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
              profileName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getConsentFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              disabled_ = input.readBool();
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
     * <pre>
     * id of assigned org
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
     * id of assigned org
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
     * id of assigned org
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
     * id of assigned org
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
     * id of assigned org
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

    private java.lang.Object profileName_ = "";
    /**
     * <pre>
     * name of consent profile
     * </pre>
     *
     * <code>string profile_name = 2 [json_name = "profileName"];</code>
     * @return The profileName.
     */
    public java.lang.String getProfileName() {
      java.lang.Object ref = profileName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        profileName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * name of consent profile
     * </pre>
     *
     * <code>string profile_name = 2 [json_name = "profileName"];</code>
     * @return The bytes for profileName.
     */
    public com.google.protobuf.ByteString
        getProfileNameBytes() {
      java.lang.Object ref = profileName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        profileName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * name of consent profile
     * </pre>
     *
     * <code>string profile_name = 2 [json_name = "profileName"];</code>
     * @param value The profileName to set.
     * @return This builder for chaining.
     */
    public Builder setProfileName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      profileName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * name of consent profile
     * </pre>
     *
     * <code>string profile_name = 2 [json_name = "profileName"];</code>
     * @return This builder for chaining.
     */
    public Builder clearProfileName() {
      profileName_ = getDefaultInstance().getProfileName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * name of consent profile
     * </pre>
     *
     * <code>string profile_name = 2 [json_name = "profileName"];</code>
     * @param value The bytes for profileName to set.
     * @return This builder for chaining.
     */
    public Builder setProfileNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      profileName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.tcn.cloud.api.api.v0alpha.Consent consent_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.Consent, com.tcn.cloud.api.api.v0alpha.Consent.Builder, com.tcn.cloud.api.api.v0alpha.ConsentOrBuilder> consentBuilder_;
    /**
     * <pre>
     * consent entity
     * </pre>
     *
     * <code>.api.v0alpha.Consent consent = 3 [json_name = "consent"];</code>
     * @return Whether the consent field is set.
     */
    public boolean hasConsent() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * consent entity
     * </pre>
     *
     * <code>.api.v0alpha.Consent consent = 3 [json_name = "consent"];</code>
     * @return The consent.
     */
    public com.tcn.cloud.api.api.v0alpha.Consent getConsent() {
      if (consentBuilder_ == null) {
        return consent_ == null ? com.tcn.cloud.api.api.v0alpha.Consent.getDefaultInstance() : consent_;
      } else {
        return consentBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * consent entity
     * </pre>
     *
     * <code>.api.v0alpha.Consent consent = 3 [json_name = "consent"];</code>
     */
    public Builder setConsent(com.tcn.cloud.api.api.v0alpha.Consent value) {
      if (consentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        consent_ = value;
      } else {
        consentBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * consent entity
     * </pre>
     *
     * <code>.api.v0alpha.Consent consent = 3 [json_name = "consent"];</code>
     */
    public Builder setConsent(
        com.tcn.cloud.api.api.v0alpha.Consent.Builder builderForValue) {
      if (consentBuilder_ == null) {
        consent_ = builderForValue.build();
      } else {
        consentBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * consent entity
     * </pre>
     *
     * <code>.api.v0alpha.Consent consent = 3 [json_name = "consent"];</code>
     */
    public Builder mergeConsent(com.tcn.cloud.api.api.v0alpha.Consent value) {
      if (consentBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          consent_ != null &&
          consent_ != com.tcn.cloud.api.api.v0alpha.Consent.getDefaultInstance()) {
          getConsentBuilder().mergeFrom(value);
        } else {
          consent_ = value;
        }
      } else {
        consentBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * consent entity
     * </pre>
     *
     * <code>.api.v0alpha.Consent consent = 3 [json_name = "consent"];</code>
     */
    public Builder clearConsent() {
      bitField0_ = (bitField0_ & ~0x00000004);
      consent_ = null;
      if (consentBuilder_ != null) {
        consentBuilder_.dispose();
        consentBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * consent entity
     * </pre>
     *
     * <code>.api.v0alpha.Consent consent = 3 [json_name = "consent"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.Consent.Builder getConsentBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getConsentFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * consent entity
     * </pre>
     *
     * <code>.api.v0alpha.Consent consent = 3 [json_name = "consent"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.ConsentOrBuilder getConsentOrBuilder() {
      if (consentBuilder_ != null) {
        return consentBuilder_.getMessageOrBuilder();
      } else {
        return consent_ == null ?
            com.tcn.cloud.api.api.v0alpha.Consent.getDefaultInstance() : consent_;
      }
    }
    /**
     * <pre>
     * consent entity
     * </pre>
     *
     * <code>.api.v0alpha.Consent consent = 3 [json_name = "consent"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.Consent, com.tcn.cloud.api.api.v0alpha.Consent.Builder, com.tcn.cloud.api.api.v0alpha.ConsentOrBuilder> 
        getConsentFieldBuilder() {
      if (consentBuilder_ == null) {
        consentBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.Consent, com.tcn.cloud.api.api.v0alpha.Consent.Builder, com.tcn.cloud.api.api.v0alpha.ConsentOrBuilder>(
                getConsent(),
                getParentForChildren(),
                isClean());
        consent_ = null;
      }
      return consentBuilder_;
    }

    private boolean disabled_ ;
    /**
     * <pre>
     * consent profile disabled
     * </pre>
     *
     * <code>bool disabled = 4 [json_name = "disabled"];</code>
     * @return The disabled.
     */
    @java.lang.Override
    public boolean getDisabled() {
      return disabled_;
    }
    /**
     * <pre>
     * consent profile disabled
     * </pre>
     *
     * <code>bool disabled = 4 [json_name = "disabled"];</code>
     * @param value The disabled to set.
     * @return This builder for chaining.
     */
    public Builder setDisabled(boolean value) {

      disabled_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * consent profile disabled
     * </pre>
     *
     * <code>bool disabled = 4 [json_name = "disabled"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDisabled() {
      bitField0_ = (bitField0_ & ~0x00000008);
      disabled_ = false;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.GetConsentByContentRes)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.GetConsentByContentRes)
  private static final com.tcn.cloud.api.api.v0alpha.GetConsentByContentRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.GetConsentByContentRes();
  }

  public static com.tcn.cloud.api.api.v0alpha.GetConsentByContentRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetConsentByContentRes>
      PARSER = new com.google.protobuf.AbstractParser<GetConsentByContentRes>() {
    @java.lang.Override
    public GetConsentByContentRes parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetConsentByContentRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetConsentByContentRes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.GetConsentByContentRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

