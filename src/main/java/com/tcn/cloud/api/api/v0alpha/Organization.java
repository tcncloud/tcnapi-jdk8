// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/org.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * <pre>
 * The message that serves as a datastore entity for the
 * Organization table.
 * </pre>
 *
 * Protobuf type {@code api.v0alpha.Organization}
 */
public final class Organization extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.Organization)
    OrganizationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Organization.newBuilder() to construct.
  private Organization(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Organization() {
    backofficeTheme_ = 0;
    contractNumber_ = "";
    cRMID_ = "";
    timeZoneEnum_ = 0;
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Organization();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_Organization_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_Organization_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.Organization.class, com.tcn.cloud.api.api.v0alpha.Organization.Builder.class);
  }

  public static final int IS_MANUAL_ONLY_ACCOUNT_FIELD_NUMBER = 3;
  private boolean isManualOnlyAccount_ = false;
  /**
   * <code>bool is_manual_only_account = 3 [json_name = "isManualOnlyAccount"];</code>
   * @return The isManualOnlyAccount.
   */
  @java.lang.Override
  public boolean getIsManualOnlyAccount() {
    return isManualOnlyAccount_;
  }

  public static final int BACKOFFICE_THEME_FIELD_NUMBER = 16;
  private int backofficeTheme_ = 0;
  /**
   * <pre>
   * Requried. Must match one of the timezones returned by
   * api.v0alpha.GetTimezones.
   * </pre>
   *
   * <code>.api.commons.ClientSkin backoffice_theme = 16 [json_name = "backofficeTheme"];</code>
   * @return The enum numeric value on the wire for backofficeTheme.
   */
  @java.lang.Override public int getBackofficeThemeValue() {
    return backofficeTheme_;
  }
  /**
   * <pre>
   * Requried. Must match one of the timezones returned by
   * api.v0alpha.GetTimezones.
   * </pre>
   *
   * <code>.api.commons.ClientSkin backoffice_theme = 16 [json_name = "backofficeTheme"];</code>
   * @return The backofficeTheme.
   */
  @java.lang.Override public com.tcn.cloud.api.api.commons.ClientSkin getBackofficeTheme() {
    com.tcn.cloud.api.api.commons.ClientSkin result = com.tcn.cloud.api.api.commons.ClientSkin.forNumber(backofficeTheme_);
    return result == null ? com.tcn.cloud.api.api.commons.ClientSkin.UNRECOGNIZED : result;
  }

  public static final int CONTRACT_NUMBER_FIELD_NUMBER = 17;
  @SuppressWarnings("serial")
  private volatile java.lang.Object contractNumber_ = "";
  /**
   * <pre>
   * DEPRECATED. Use CRM_ID.
   * </pre>
   *
   * <code>string contract_number = 17 [json_name = "contractNumber"];</code>
   * @return The contractNumber.
   */
  @java.lang.Override
  public java.lang.String getContractNumber() {
    java.lang.Object ref = contractNumber_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      contractNumber_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * DEPRECATED. Use CRM_ID.
   * </pre>
   *
   * <code>string contract_number = 17 [json_name = "contractNumber"];</code>
   * @return The bytes for contractNumber.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getContractNumberBytes() {
    java.lang.Object ref = contractNumber_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      contractNumber_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CRM_ID_FIELD_NUMBER = 18;
  @SuppressWarnings("serial")
  private volatile java.lang.Object cRMID_ = "";
  /**
   * <code>string CRM_ID = 18 [json_name = "CRMID"];</code>
   * @return The cRMID.
   */
  @java.lang.Override
  public java.lang.String getCRMID() {
    java.lang.Object ref = cRMID_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cRMID_ = s;
      return s;
    }
  }
  /**
   * <code>string CRM_ID = 18 [json_name = "CRMID"];</code>
   * @return The bytes for cRMID.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCRMIDBytes() {
    java.lang.Object ref = cRMID_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      cRMID_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TIME_ZONE_ENUM_FIELD_NUMBER = 19;
  private int timeZoneEnum_ = 0;
  /**
   * <code>.api.commons.TimeZone time_zone_enum = 19 [json_name = "timeZoneEnum"];</code>
   * @return The enum numeric value on the wire for timeZoneEnum.
   */
  @java.lang.Override public int getTimeZoneEnumValue() {
    return timeZoneEnum_;
  }
  /**
   * <code>.api.commons.TimeZone time_zone_enum = 19 [json_name = "timeZoneEnum"];</code>
   * @return The timeZoneEnum.
   */
  @java.lang.Override public com.tcn.cloud.api.api.commons.TimeZone getTimeZoneEnum() {
    com.tcn.cloud.api.api.commons.TimeZone result = com.tcn.cloud.api.api.commons.TimeZone.forNumber(timeZoneEnum_);
    return result == null ? com.tcn.cloud.api.api.commons.TimeZone.UNRECOGNIZED : result;
  }

  public static final int NAME_FIELD_NUMBER = 20;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <pre>
   * Required
   * </pre>
   *
   * <code>string name = 20 [json_name = "name"];</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required
   * </pre>
   *
   * <code>string name = 20 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
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
    if (isManualOnlyAccount_ != false) {
      output.writeBool(3, isManualOnlyAccount_);
    }
    if (backofficeTheme_ != com.tcn.cloud.api.api.commons.ClientSkin.CLIENT_SKIN_DEFAULT.getNumber()) {
      output.writeEnum(16, backofficeTheme_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(contractNumber_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 17, contractNumber_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cRMID_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 18, cRMID_);
    }
    if (timeZoneEnum_ != com.tcn.cloud.api.api.commons.TimeZone.TIME_ZONE_AMERICA_PUERTO_RICO.getNumber()) {
      output.writeEnum(19, timeZoneEnum_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 20, name_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (isManualOnlyAccount_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, isManualOnlyAccount_);
    }
    if (backofficeTheme_ != com.tcn.cloud.api.api.commons.ClientSkin.CLIENT_SKIN_DEFAULT.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(16, backofficeTheme_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(contractNumber_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(17, contractNumber_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cRMID_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(18, cRMID_);
    }
    if (timeZoneEnum_ != com.tcn.cloud.api.api.commons.TimeZone.TIME_ZONE_AMERICA_PUERTO_RICO.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(19, timeZoneEnum_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(20, name_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.Organization)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.Organization other = (com.tcn.cloud.api.api.v0alpha.Organization) obj;

    if (getIsManualOnlyAccount()
        != other.getIsManualOnlyAccount()) return false;
    if (backofficeTheme_ != other.backofficeTheme_) return false;
    if (!getContractNumber()
        .equals(other.getContractNumber())) return false;
    if (!getCRMID()
        .equals(other.getCRMID())) return false;
    if (timeZoneEnum_ != other.timeZoneEnum_) return false;
    if (!getName()
        .equals(other.getName())) return false;
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
    hash = (37 * hash) + IS_MANUAL_ONLY_ACCOUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsManualOnlyAccount());
    hash = (37 * hash) + BACKOFFICE_THEME_FIELD_NUMBER;
    hash = (53 * hash) + backofficeTheme_;
    hash = (37 * hash) + CONTRACT_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getContractNumber().hashCode();
    hash = (37 * hash) + CRM_ID_FIELD_NUMBER;
    hash = (53 * hash) + getCRMID().hashCode();
    hash = (37 * hash) + TIME_ZONE_ENUM_FIELD_NUMBER;
    hash = (53 * hash) + timeZoneEnum_;
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.Organization parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.Organization parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.Organization parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.Organization parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.Organization parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.Organization parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.Organization parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.Organization parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.Organization parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.Organization parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.Organization parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.Organization parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.Organization prototype) {
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
   * The message that serves as a datastore entity for the
   * Organization table.
   * </pre>
   *
   * Protobuf type {@code api.v0alpha.Organization}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.Organization)
      com.tcn.cloud.api.api.v0alpha.OrganizationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_Organization_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_Organization_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.Organization.class, com.tcn.cloud.api.api.v0alpha.Organization.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.Organization.newBuilder()
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
      isManualOnlyAccount_ = false;
      backofficeTheme_ = 0;
      contractNumber_ = "";
      cRMID_ = "";
      timeZoneEnum_ = 0;
      name_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_Organization_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.Organization getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.Organization.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.Organization build() {
      com.tcn.cloud.api.api.v0alpha.Organization result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.Organization buildPartial() {
      com.tcn.cloud.api.api.v0alpha.Organization result = new com.tcn.cloud.api.api.v0alpha.Organization(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.Organization result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.isManualOnlyAccount_ = isManualOnlyAccount_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.backofficeTheme_ = backofficeTheme_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.contractNumber_ = contractNumber_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.cRMID_ = cRMID_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.timeZoneEnum_ = timeZoneEnum_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.name_ = name_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v0alpha.Organization) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.Organization)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.Organization other) {
      if (other == com.tcn.cloud.api.api.v0alpha.Organization.getDefaultInstance()) return this;
      if (other.getIsManualOnlyAccount() != false) {
        setIsManualOnlyAccount(other.getIsManualOnlyAccount());
      }
      if (other.backofficeTheme_ != 0) {
        setBackofficeThemeValue(other.getBackofficeThemeValue());
      }
      if (!other.getContractNumber().isEmpty()) {
        contractNumber_ = other.contractNumber_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getCRMID().isEmpty()) {
        cRMID_ = other.cRMID_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      if (other.timeZoneEnum_ != 0) {
        setTimeZoneEnumValue(other.getTimeZoneEnumValue());
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
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
            case 24: {
              isManualOnlyAccount_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 24
            case 128: {
              backofficeTheme_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 128
            case 138: {
              contractNumber_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 138
            case 146: {
              cRMID_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 146
            case 152: {
              timeZoneEnum_ = input.readEnum();
              bitField0_ |= 0x00000010;
              break;
            } // case 152
            case 162: {
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000020;
              break;
            } // case 162
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

    private boolean isManualOnlyAccount_ ;
    /**
     * <code>bool is_manual_only_account = 3 [json_name = "isManualOnlyAccount"];</code>
     * @return The isManualOnlyAccount.
     */
    @java.lang.Override
    public boolean getIsManualOnlyAccount() {
      return isManualOnlyAccount_;
    }
    /**
     * <code>bool is_manual_only_account = 3 [json_name = "isManualOnlyAccount"];</code>
     * @param value The isManualOnlyAccount to set.
     * @return This builder for chaining.
     */
    public Builder setIsManualOnlyAccount(boolean value) {

      isManualOnlyAccount_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>bool is_manual_only_account = 3 [json_name = "isManualOnlyAccount"];</code>
     * @return This builder for chaining.
     */
    public Builder clearIsManualOnlyAccount() {
      bitField0_ = (bitField0_ & ~0x00000001);
      isManualOnlyAccount_ = false;
      onChanged();
      return this;
    }

    private int backofficeTheme_ = 0;
    /**
     * <pre>
     * Requried. Must match one of the timezones returned by
     * api.v0alpha.GetTimezones.
     * </pre>
     *
     * <code>.api.commons.ClientSkin backoffice_theme = 16 [json_name = "backofficeTheme"];</code>
     * @return The enum numeric value on the wire for backofficeTheme.
     */
    @java.lang.Override public int getBackofficeThemeValue() {
      return backofficeTheme_;
    }
    /**
     * <pre>
     * Requried. Must match one of the timezones returned by
     * api.v0alpha.GetTimezones.
     * </pre>
     *
     * <code>.api.commons.ClientSkin backoffice_theme = 16 [json_name = "backofficeTheme"];</code>
     * @param value The enum numeric value on the wire for backofficeTheme to set.
     * @return This builder for chaining.
     */
    public Builder setBackofficeThemeValue(int value) {
      backofficeTheme_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Requried. Must match one of the timezones returned by
     * api.v0alpha.GetTimezones.
     * </pre>
     *
     * <code>.api.commons.ClientSkin backoffice_theme = 16 [json_name = "backofficeTheme"];</code>
     * @return The backofficeTheme.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.ClientSkin getBackofficeTheme() {
      com.tcn.cloud.api.api.commons.ClientSkin result = com.tcn.cloud.api.api.commons.ClientSkin.forNumber(backofficeTheme_);
      return result == null ? com.tcn.cloud.api.api.commons.ClientSkin.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Requried. Must match one of the timezones returned by
     * api.v0alpha.GetTimezones.
     * </pre>
     *
     * <code>.api.commons.ClientSkin backoffice_theme = 16 [json_name = "backofficeTheme"];</code>
     * @param value The backofficeTheme to set.
     * @return This builder for chaining.
     */
    public Builder setBackofficeTheme(com.tcn.cloud.api.api.commons.ClientSkin value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      backofficeTheme_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Requried. Must match one of the timezones returned by
     * api.v0alpha.GetTimezones.
     * </pre>
     *
     * <code>.api.commons.ClientSkin backoffice_theme = 16 [json_name = "backofficeTheme"];</code>
     * @return This builder for chaining.
     */
    public Builder clearBackofficeTheme() {
      bitField0_ = (bitField0_ & ~0x00000002);
      backofficeTheme_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object contractNumber_ = "";
    /**
     * <pre>
     * DEPRECATED. Use CRM_ID.
     * </pre>
     *
     * <code>string contract_number = 17 [json_name = "contractNumber"];</code>
     * @return The contractNumber.
     */
    public java.lang.String getContractNumber() {
      java.lang.Object ref = contractNumber_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        contractNumber_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * DEPRECATED. Use CRM_ID.
     * </pre>
     *
     * <code>string contract_number = 17 [json_name = "contractNumber"];</code>
     * @return The bytes for contractNumber.
     */
    public com.google.protobuf.ByteString
        getContractNumberBytes() {
      java.lang.Object ref = contractNumber_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        contractNumber_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * DEPRECATED. Use CRM_ID.
     * </pre>
     *
     * <code>string contract_number = 17 [json_name = "contractNumber"];</code>
     * @param value The contractNumber to set.
     * @return This builder for chaining.
     */
    public Builder setContractNumber(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      contractNumber_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * DEPRECATED. Use CRM_ID.
     * </pre>
     *
     * <code>string contract_number = 17 [json_name = "contractNumber"];</code>
     * @return This builder for chaining.
     */
    public Builder clearContractNumber() {
      contractNumber_ = getDefaultInstance().getContractNumber();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * DEPRECATED. Use CRM_ID.
     * </pre>
     *
     * <code>string contract_number = 17 [json_name = "contractNumber"];</code>
     * @param value The bytes for contractNumber to set.
     * @return This builder for chaining.
     */
    public Builder setContractNumberBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      contractNumber_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object cRMID_ = "";
    /**
     * <code>string CRM_ID = 18 [json_name = "CRMID"];</code>
     * @return The cRMID.
     */
    public java.lang.String getCRMID() {
      java.lang.Object ref = cRMID_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cRMID_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string CRM_ID = 18 [json_name = "CRMID"];</code>
     * @return The bytes for cRMID.
     */
    public com.google.protobuf.ByteString
        getCRMIDBytes() {
      java.lang.Object ref = cRMID_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        cRMID_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string CRM_ID = 18 [json_name = "CRMID"];</code>
     * @param value The cRMID to set.
     * @return This builder for chaining.
     */
    public Builder setCRMID(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      cRMID_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>string CRM_ID = 18 [json_name = "CRMID"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCRMID() {
      cRMID_ = getDefaultInstance().getCRMID();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>string CRM_ID = 18 [json_name = "CRMID"];</code>
     * @param value The bytes for cRMID to set.
     * @return This builder for chaining.
     */
    public Builder setCRMIDBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      cRMID_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private int timeZoneEnum_ = 0;
    /**
     * <code>.api.commons.TimeZone time_zone_enum = 19 [json_name = "timeZoneEnum"];</code>
     * @return The enum numeric value on the wire for timeZoneEnum.
     */
    @java.lang.Override public int getTimeZoneEnumValue() {
      return timeZoneEnum_;
    }
    /**
     * <code>.api.commons.TimeZone time_zone_enum = 19 [json_name = "timeZoneEnum"];</code>
     * @param value The enum numeric value on the wire for timeZoneEnum to set.
     * @return This builder for chaining.
     */
    public Builder setTimeZoneEnumValue(int value) {
      timeZoneEnum_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.TimeZone time_zone_enum = 19 [json_name = "timeZoneEnum"];</code>
     * @return The timeZoneEnum.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.TimeZone getTimeZoneEnum() {
      com.tcn.cloud.api.api.commons.TimeZone result = com.tcn.cloud.api.api.commons.TimeZone.forNumber(timeZoneEnum_);
      return result == null ? com.tcn.cloud.api.api.commons.TimeZone.UNRECOGNIZED : result;
    }
    /**
     * <code>.api.commons.TimeZone time_zone_enum = 19 [json_name = "timeZoneEnum"];</code>
     * @param value The timeZoneEnum to set.
     * @return This builder for chaining.
     */
    public Builder setTimeZoneEnum(com.tcn.cloud.api.api.commons.TimeZone value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000010;
      timeZoneEnum_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.TimeZone time_zone_enum = 19 [json_name = "timeZoneEnum"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTimeZoneEnum() {
      bitField0_ = (bitField0_ & ~0x00000010);
      timeZoneEnum_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * Required
     * </pre>
     *
     * <code>string name = 20 [json_name = "name"];</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required
     * </pre>
     *
     * <code>string name = 20 [json_name = "name"];</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required
     * </pre>
     *
     * <code>string name = 20 [json_name = "name"];</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required
     * </pre>
     *
     * <code>string name = 20 [json_name = "name"];</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000020);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required
     * </pre>
     *
     * <code>string name = 20 [json_name = "name"];</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.Organization)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.Organization)
  private static final com.tcn.cloud.api.api.v0alpha.Organization DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.Organization();
  }

  public static com.tcn.cloud.api.api.v0alpha.Organization getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Organization>
      PARSER = new com.google.protobuf.AbstractParser<Organization>() {
    @java.lang.Override
    public Organization parsePartialFrom(
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

  public static com.google.protobuf.Parser<Organization> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Organization> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.Organization getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

