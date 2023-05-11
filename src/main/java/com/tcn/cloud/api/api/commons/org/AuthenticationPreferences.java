// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/org/preferences.proto

package com.tcn.cloud.api.api.commons.org;

/**
 * <pre>
 * Preferences for controlling the organization's authentication properties.
 * </pre>
 *
 * Protobuf type {@code api.commons.org.AuthenticationPreferences}
 */
public final class AuthenticationPreferences extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.commons.org.AuthenticationPreferences)
    AuthenticationPreferencesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AuthenticationPreferences.newBuilder() to construct.
  private AuthenticationPreferences(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AuthenticationPreferences() {
    orgId_ = "";
    allowedIps_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    agentApiKey_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AuthenticationPreferences();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.commons.org.PreferencesProto.internal_static_api_commons_org_AuthenticationPreferences_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.commons.org.PreferencesProto.internal_static_api_commons_org_AuthenticationPreferences_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.commons.org.AuthenticationPreferences.class, com.tcn.cloud.api.api.commons.org.AuthenticationPreferences.Builder.class);
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

  public static final int AUTHORIZATION_VIA_IP_FIELD_NUMBER = 10;
  private boolean authorizationViaIp_ = false;
  /**
   * <pre>
   * Use IP based authorization.
   * </pre>
   *
   * <code>bool authorization_via_ip = 10 [json_name = "authorizationViaIp"];</code>
   * @return The authorizationViaIp.
   */
  @java.lang.Override
  public boolean getAuthorizationViaIp() {
    return authorizationViaIp_;
  }

  public static final int ALLOWED_IPS_FIELD_NUMBER = 11;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList allowedIps_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * List of whitelisted IPs.
   * </pre>
   *
   * <code>repeated string allowed_ips = 11 [json_name = "allowedIps"];</code>
   * @return A list containing the allowedIps.
   */
  public com.google.protobuf.ProtocolStringList
      getAllowedIpsList() {
    return allowedIps_;
  }
  /**
   * <pre>
   * List of whitelisted IPs.
   * </pre>
   *
   * <code>repeated string allowed_ips = 11 [json_name = "allowedIps"];</code>
   * @return The count of allowedIps.
   */
  public int getAllowedIpsCount() {
    return allowedIps_.size();
  }
  /**
   * <pre>
   * List of whitelisted IPs.
   * </pre>
   *
   * <code>repeated string allowed_ips = 11 [json_name = "allowedIps"];</code>
   * @param index The index of the element to return.
   * @return The allowedIps at the given index.
   */
  public java.lang.String getAllowedIps(int index) {
    return allowedIps_.get(index);
  }
  /**
   * <pre>
   * List of whitelisted IPs.
   * </pre>
   *
   * <code>repeated string allowed_ips = 11 [json_name = "allowedIps"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the allowedIps at the given index.
   */
  public com.google.protobuf.ByteString
      getAllowedIpsBytes(int index) {
    return allowedIps_.getByteString(index);
  }

  public static final int AGENT_API_KEY_FIELD_NUMBER = 12;
  @SuppressWarnings("serial")
  private volatile java.lang.Object agentApiKey_ = "";
  /**
   * <pre>
   * Agent API key.
   * </pre>
   *
   * <code>string agent_api_key = 12 [json_name = "agentApiKey"];</code>
   * @return The agentApiKey.
   */
  @java.lang.Override
  public java.lang.String getAgentApiKey() {
    java.lang.Object ref = agentApiKey_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      agentApiKey_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Agent API key.
   * </pre>
   *
   * <code>string agent_api_key = 12 [json_name = "agentApiKey"];</code>
   * @return The bytes for agentApiKey.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAgentApiKeyBytes() {
    java.lang.Object ref = agentApiKey_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      agentApiKey_ = b;
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
    if (authorizationViaIp_ != false) {
      output.writeBool(10, authorizationViaIp_);
    }
    for (int i = 0; i < allowedIps_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 11, allowedIps_.getRaw(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(agentApiKey_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 12, agentApiKey_);
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
    if (authorizationViaIp_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(10, authorizationViaIp_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < allowedIps_.size(); i++) {
        dataSize += computeStringSizeNoTag(allowedIps_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getAllowedIpsList().size();
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(agentApiKey_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(12, agentApiKey_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.commons.org.AuthenticationPreferences)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.commons.org.AuthenticationPreferences other = (com.tcn.cloud.api.api.commons.org.AuthenticationPreferences) obj;

    if (!getOrgId()
        .equals(other.getOrgId())) return false;
    if (getAuthorizationViaIp()
        != other.getAuthorizationViaIp()) return false;
    if (!getAllowedIpsList()
        .equals(other.getAllowedIpsList())) return false;
    if (!getAgentApiKey()
        .equals(other.getAgentApiKey())) return false;
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
    hash = (37 * hash) + AUTHORIZATION_VIA_IP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getAuthorizationViaIp());
    if (getAllowedIpsCount() > 0) {
      hash = (37 * hash) + ALLOWED_IPS_FIELD_NUMBER;
      hash = (53 * hash) + getAllowedIpsList().hashCode();
    }
    hash = (37 * hash) + AGENT_API_KEY_FIELD_NUMBER;
    hash = (53 * hash) + getAgentApiKey().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.commons.org.AuthenticationPreferences parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.org.AuthenticationPreferences parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.org.AuthenticationPreferences parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.org.AuthenticationPreferences parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.org.AuthenticationPreferences parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.org.AuthenticationPreferences parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.org.AuthenticationPreferences parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.org.AuthenticationPreferences parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.commons.org.AuthenticationPreferences parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.commons.org.AuthenticationPreferences parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.org.AuthenticationPreferences parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.org.AuthenticationPreferences parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.commons.org.AuthenticationPreferences prototype) {
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
   * Preferences for controlling the organization's authentication properties.
   * </pre>
   *
   * Protobuf type {@code api.commons.org.AuthenticationPreferences}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.commons.org.AuthenticationPreferences)
      com.tcn.cloud.api.api.commons.org.AuthenticationPreferencesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.org.PreferencesProto.internal_static_api_commons_org_AuthenticationPreferences_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.commons.org.PreferencesProto.internal_static_api_commons_org_AuthenticationPreferences_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.commons.org.AuthenticationPreferences.class, com.tcn.cloud.api.api.commons.org.AuthenticationPreferences.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.commons.org.AuthenticationPreferences.newBuilder()
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
      authorizationViaIp_ = false;
      allowedIps_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      agentApiKey_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.commons.org.PreferencesProto.internal_static_api_commons_org_AuthenticationPreferences_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.org.AuthenticationPreferences getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.commons.org.AuthenticationPreferences.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.org.AuthenticationPreferences build() {
      com.tcn.cloud.api.api.commons.org.AuthenticationPreferences result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.org.AuthenticationPreferences buildPartial() {
      com.tcn.cloud.api.api.commons.org.AuthenticationPreferences result = new com.tcn.cloud.api.api.commons.org.AuthenticationPreferences(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.commons.org.AuthenticationPreferences result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.orgId_ = orgId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.authorizationViaIp_ = authorizationViaIp_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        allowedIps_.makeImmutable();
        result.allowedIps_ = allowedIps_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.agentApiKey_ = agentApiKey_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.commons.org.AuthenticationPreferences) {
        return mergeFrom((com.tcn.cloud.api.api.commons.org.AuthenticationPreferences)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.commons.org.AuthenticationPreferences other) {
      if (other == com.tcn.cloud.api.api.commons.org.AuthenticationPreferences.getDefaultInstance()) return this;
      if (!other.getOrgId().isEmpty()) {
        orgId_ = other.orgId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getAuthorizationViaIp() != false) {
        setAuthorizationViaIp(other.getAuthorizationViaIp());
      }
      if (!other.allowedIps_.isEmpty()) {
        if (allowedIps_.isEmpty()) {
          allowedIps_ = other.allowedIps_;
          bitField0_ |= 0x00000004;
        } else {
          ensureAllowedIpsIsMutable();
          allowedIps_.addAll(other.allowedIps_);
        }
        onChanged();
      }
      if (!other.getAgentApiKey().isEmpty()) {
        agentApiKey_ = other.agentApiKey_;
        bitField0_ |= 0x00000008;
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
              authorizationViaIp_ = input.readBool();
              bitField0_ |= 0x00000002;
              break;
            } // case 80
            case 90: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureAllowedIpsIsMutable();
              allowedIps_.add(s);
              break;
            } // case 90
            case 98: {
              agentApiKey_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 98
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

    private boolean authorizationViaIp_ ;
    /**
     * <pre>
     * Use IP based authorization.
     * </pre>
     *
     * <code>bool authorization_via_ip = 10 [json_name = "authorizationViaIp"];</code>
     * @return The authorizationViaIp.
     */
    @java.lang.Override
    public boolean getAuthorizationViaIp() {
      return authorizationViaIp_;
    }
    /**
     * <pre>
     * Use IP based authorization.
     * </pre>
     *
     * <code>bool authorization_via_ip = 10 [json_name = "authorizationViaIp"];</code>
     * @param value The authorizationViaIp to set.
     * @return This builder for chaining.
     */
    public Builder setAuthorizationViaIp(boolean value) {

      authorizationViaIp_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Use IP based authorization.
     * </pre>
     *
     * <code>bool authorization_via_ip = 10 [json_name = "authorizationViaIp"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAuthorizationViaIp() {
      bitField0_ = (bitField0_ & ~0x00000002);
      authorizationViaIp_ = false;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList allowedIps_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureAllowedIpsIsMutable() {
      if (!allowedIps_.isModifiable()) {
        allowedIps_ = new com.google.protobuf.LazyStringArrayList(allowedIps_);
      }
      bitField0_ |= 0x00000004;
    }
    /**
     * <pre>
     * List of whitelisted IPs.
     * </pre>
     *
     * <code>repeated string allowed_ips = 11 [json_name = "allowedIps"];</code>
     * @return A list containing the allowedIps.
     */
    public com.google.protobuf.ProtocolStringList
        getAllowedIpsList() {
      allowedIps_.makeImmutable();
      return allowedIps_;
    }
    /**
     * <pre>
     * List of whitelisted IPs.
     * </pre>
     *
     * <code>repeated string allowed_ips = 11 [json_name = "allowedIps"];</code>
     * @return The count of allowedIps.
     */
    public int getAllowedIpsCount() {
      return allowedIps_.size();
    }
    /**
     * <pre>
     * List of whitelisted IPs.
     * </pre>
     *
     * <code>repeated string allowed_ips = 11 [json_name = "allowedIps"];</code>
     * @param index The index of the element to return.
     * @return The allowedIps at the given index.
     */
    public java.lang.String getAllowedIps(int index) {
      return allowedIps_.get(index);
    }
    /**
     * <pre>
     * List of whitelisted IPs.
     * </pre>
     *
     * <code>repeated string allowed_ips = 11 [json_name = "allowedIps"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the allowedIps at the given index.
     */
    public com.google.protobuf.ByteString
        getAllowedIpsBytes(int index) {
      return allowedIps_.getByteString(index);
    }
    /**
     * <pre>
     * List of whitelisted IPs.
     * </pre>
     *
     * <code>repeated string allowed_ips = 11 [json_name = "allowedIps"];</code>
     * @param index The index to set the value at.
     * @param value The allowedIps to set.
     * @return This builder for chaining.
     */
    public Builder setAllowedIps(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureAllowedIpsIsMutable();
      allowedIps_.set(index, value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of whitelisted IPs.
     * </pre>
     *
     * <code>repeated string allowed_ips = 11 [json_name = "allowedIps"];</code>
     * @param value The allowedIps to add.
     * @return This builder for chaining.
     */
    public Builder addAllowedIps(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureAllowedIpsIsMutable();
      allowedIps_.add(value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of whitelisted IPs.
     * </pre>
     *
     * <code>repeated string allowed_ips = 11 [json_name = "allowedIps"];</code>
     * @param values The allowedIps to add.
     * @return This builder for chaining.
     */
    public Builder addAllAllowedIps(
        java.lang.Iterable<java.lang.String> values) {
      ensureAllowedIpsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, allowedIps_);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of whitelisted IPs.
     * </pre>
     *
     * <code>repeated string allowed_ips = 11 [json_name = "allowedIps"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAllowedIps() {
      allowedIps_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000004);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of whitelisted IPs.
     * </pre>
     *
     * <code>repeated string allowed_ips = 11 [json_name = "allowedIps"];</code>
     * @param value The bytes of the allowedIps to add.
     * @return This builder for chaining.
     */
    public Builder addAllowedIpsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureAllowedIpsIsMutable();
      allowedIps_.add(value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object agentApiKey_ = "";
    /**
     * <pre>
     * Agent API key.
     * </pre>
     *
     * <code>string agent_api_key = 12 [json_name = "agentApiKey"];</code>
     * @return The agentApiKey.
     */
    public java.lang.String getAgentApiKey() {
      java.lang.Object ref = agentApiKey_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        agentApiKey_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Agent API key.
     * </pre>
     *
     * <code>string agent_api_key = 12 [json_name = "agentApiKey"];</code>
     * @return The bytes for agentApiKey.
     */
    public com.google.protobuf.ByteString
        getAgentApiKeyBytes() {
      java.lang.Object ref = agentApiKey_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        agentApiKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Agent API key.
     * </pre>
     *
     * <code>string agent_api_key = 12 [json_name = "agentApiKey"];</code>
     * @param value The agentApiKey to set.
     * @return This builder for chaining.
     */
    public Builder setAgentApiKey(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      agentApiKey_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Agent API key.
     * </pre>
     *
     * <code>string agent_api_key = 12 [json_name = "agentApiKey"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAgentApiKey() {
      agentApiKey_ = getDefaultInstance().getAgentApiKey();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Agent API key.
     * </pre>
     *
     * <code>string agent_api_key = 12 [json_name = "agentApiKey"];</code>
     * @param value The bytes for agentApiKey to set.
     * @return This builder for chaining.
     */
    public Builder setAgentApiKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      agentApiKey_ = value;
      bitField0_ |= 0x00000008;
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


    // @@protoc_insertion_point(builder_scope:api.commons.org.AuthenticationPreferences)
  }

  // @@protoc_insertion_point(class_scope:api.commons.org.AuthenticationPreferences)
  private static final com.tcn.cloud.api.api.commons.org.AuthenticationPreferences DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.commons.org.AuthenticationPreferences();
  }

  public static com.tcn.cloud.api.api.commons.org.AuthenticationPreferences getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AuthenticationPreferences>
      PARSER = new com.google.protobuf.AbstractParser<AuthenticationPreferences>() {
    @java.lang.Override
    public AuthenticationPreferences parsePartialFrom(
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

  public static com.google.protobuf.Parser<AuthenticationPreferences> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AuthenticationPreferences> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.AuthenticationPreferences getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

