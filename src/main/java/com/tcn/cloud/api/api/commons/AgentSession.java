// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/acd.proto

package com.tcn.cloud.api.api.commons;

/**
 * <pre>
 * a complex type that completely identifies an agent
 * </pre>
 *
 * Protobuf type {@code api.commons.AgentSession}
 */
public final class AgentSession extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.commons.AgentSession)
    AgentSessionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AgentSession.newBuilder() to construct.
  private AgentSession(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AgentSession() {
    orgId_ = "";
    regionId_ = "";
    userId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AgentSession();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.commons.AcdProto.internal_static_api_commons_AgentSession_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.commons.AcdProto.internal_static_api_commons_AgentSession_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.commons.AgentSession.class, com.tcn.cloud.api.api.commons.AgentSession.Builder.class);
  }

  public static final int AGENT_SID_FIELD_NUMBER = 1;
  private long agentSid_ = 0L;
  /**
   * <pre>
   * the agent's sid
   * </pre>
   *
   * <code>int64 agent_sid = 1 [json_name = "agentSid"];</code>
   * @return The agentSid.
   */
  @java.lang.Override
  public long getAgentSid() {
    return agentSid_;
  }

  public static final int TENANT_SID_FIELD_NUMBER = 2;
  private long tenantSid_ = 0L;
  /**
   * <pre>
   * the client's sid
   * </pre>
   *
   * <code>int64 tenant_sid = 2 [json_name = "tenantSid"];</code>
   * @return The tenantSid.
   */
  @java.lang.Override
  public long getTenantSid() {
    return tenantSid_;
  }

  public static final int SESSION_SID_FIELD_NUMBER = 3;
  private long sessionSid_ = 0L;
  /**
   * <pre>
   * the voice session sid
   * </pre>
   *
   * <code>int64 session_sid = 3 [json_name = "sessionSid"];</code>
   * @return The sessionSid.
   */
  @java.lang.Override
  public long getSessionSid() {
    return sessionSid_;
  }

  public static final int ASM_SESSION_SID_FIELD_NUMBER = 4;
  private long asmSessionSid_ = 0L;
  /**
   * <pre>
   * the asm session sid
   * </pre>
   *
   * <code>int64 asm_session_sid = 4 [json_name = "asmSessionSid"];</code>
   * @return The asmSessionSid.
   */
  @java.lang.Override
  public long getAsmSessionSid() {
    return asmSessionSid_;
  }

  public static final int ORG_ID_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object orgId_ = "";
  /**
   * <pre>
   * the org id of the user/agent
   * </pre>
   *
   * <code>string org_id = 5 [json_name = "orgId"];</code>
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
   * the org id of the user/agent
   * </pre>
   *
   * <code>string org_id = 5 [json_name = "orgId"];</code>
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

  public static final int REGION_ID_FIELD_NUMBER = 6;
  @SuppressWarnings("serial")
  private volatile java.lang.Object regionId_ = "";
  /**
   * <pre>
   * the region id of the user/agent
   * </pre>
   *
   * <code>string region_id = 6 [json_name = "regionId"];</code>
   * @return The regionId.
   */
  @java.lang.Override
  public java.lang.String getRegionId() {
    java.lang.Object ref = regionId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      regionId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * the region id of the user/agent
   * </pre>
   *
   * <code>string region_id = 6 [json_name = "regionId"];</code>
   * @return The bytes for regionId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRegionIdBytes() {
    java.lang.Object ref = regionId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      regionId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USER_ID_FIELD_NUMBER = 8;
  @SuppressWarnings("serial")
  private volatile java.lang.Object userId_ = "";
  /**
   * <pre>
   * the user's id
   * </pre>
   *
   * <code>string user_id = 8 [json_name = "userId"];</code>
   * @return The userId.
   */
  @java.lang.Override
  public java.lang.String getUserId() {
    java.lang.Object ref = userId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * the user's id
   * </pre>
   *
   * <code>string user_id = 8 [json_name = "userId"];</code>
   * @return The bytes for userId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUserIdBytes() {
    java.lang.Object ref = userId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userId_ = b;
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
    if (agentSid_ != 0L) {
      output.writeInt64(1, agentSid_);
    }
    if (tenantSid_ != 0L) {
      output.writeInt64(2, tenantSid_);
    }
    if (sessionSid_ != 0L) {
      output.writeInt64(3, sessionSid_);
    }
    if (asmSessionSid_ != 0L) {
      output.writeInt64(4, asmSessionSid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(orgId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, orgId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(regionId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, regionId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(userId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 8, userId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (agentSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, agentSid_);
    }
    if (tenantSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, tenantSid_);
    }
    if (sessionSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, sessionSid_);
    }
    if (asmSessionSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, asmSessionSid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(orgId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, orgId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(regionId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, regionId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(userId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(8, userId_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.commons.AgentSession)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.commons.AgentSession other = (com.tcn.cloud.api.api.commons.AgentSession) obj;

    if (getAgentSid()
        != other.getAgentSid()) return false;
    if (getTenantSid()
        != other.getTenantSid()) return false;
    if (getSessionSid()
        != other.getSessionSid()) return false;
    if (getAsmSessionSid()
        != other.getAsmSessionSid()) return false;
    if (!getOrgId()
        .equals(other.getOrgId())) return false;
    if (!getRegionId()
        .equals(other.getRegionId())) return false;
    if (!getUserId()
        .equals(other.getUserId())) return false;
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
    hash = (37 * hash) + AGENT_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAgentSid());
    hash = (37 * hash) + TENANT_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTenantSid());
    hash = (37 * hash) + SESSION_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSessionSid());
    hash = (37 * hash) + ASM_SESSION_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAsmSessionSid());
    hash = (37 * hash) + ORG_ID_FIELD_NUMBER;
    hash = (53 * hash) + getOrgId().hashCode();
    hash = (37 * hash) + REGION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getRegionId().hashCode();
    hash = (37 * hash) + USER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getUserId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.commons.AgentSession parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.AgentSession parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.AgentSession parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.AgentSession parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.AgentSession parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.AgentSession parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.AgentSession parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.AgentSession parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.commons.AgentSession parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.commons.AgentSession parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.AgentSession parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.AgentSession parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.commons.AgentSession prototype) {
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
   * a complex type that completely identifies an agent
   * </pre>
   *
   * Protobuf type {@code api.commons.AgentSession}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.commons.AgentSession)
      com.tcn.cloud.api.api.commons.AgentSessionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.AcdProto.internal_static_api_commons_AgentSession_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.commons.AcdProto.internal_static_api_commons_AgentSession_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.commons.AgentSession.class, com.tcn.cloud.api.api.commons.AgentSession.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.commons.AgentSession.newBuilder()
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
      agentSid_ = 0L;
      tenantSid_ = 0L;
      sessionSid_ = 0L;
      asmSessionSid_ = 0L;
      orgId_ = "";
      regionId_ = "";
      userId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.commons.AcdProto.internal_static_api_commons_AgentSession_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.AgentSession getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.commons.AgentSession.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.AgentSession build() {
      com.tcn.cloud.api.api.commons.AgentSession result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.AgentSession buildPartial() {
      com.tcn.cloud.api.api.commons.AgentSession result = new com.tcn.cloud.api.api.commons.AgentSession(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.commons.AgentSession result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.agentSid_ = agentSid_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.tenantSid_ = tenantSid_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.sessionSid_ = sessionSid_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.asmSessionSid_ = asmSessionSid_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.orgId_ = orgId_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.regionId_ = regionId_;
      }
      if (((from_bitField0_ & 0x00000040) != 0)) {
        result.userId_ = userId_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.commons.AgentSession) {
        return mergeFrom((com.tcn.cloud.api.api.commons.AgentSession)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.commons.AgentSession other) {
      if (other == com.tcn.cloud.api.api.commons.AgentSession.getDefaultInstance()) return this;
      if (other.getAgentSid() != 0L) {
        setAgentSid(other.getAgentSid());
      }
      if (other.getTenantSid() != 0L) {
        setTenantSid(other.getTenantSid());
      }
      if (other.getSessionSid() != 0L) {
        setSessionSid(other.getSessionSid());
      }
      if (other.getAsmSessionSid() != 0L) {
        setAsmSessionSid(other.getAsmSessionSid());
      }
      if (!other.getOrgId().isEmpty()) {
        orgId_ = other.orgId_;
        bitField0_ |= 0x00000010;
        onChanged();
      }
      if (!other.getRegionId().isEmpty()) {
        regionId_ = other.regionId_;
        bitField0_ |= 0x00000020;
        onChanged();
      }
      if (!other.getUserId().isEmpty()) {
        userId_ = other.userId_;
        bitField0_ |= 0x00000040;
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
              agentSid_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              tenantSid_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              sessionSid_ = input.readInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              asmSessionSid_ = input.readInt64();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 42: {
              orgId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000010;
              break;
            } // case 42
            case 50: {
              regionId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000020;
              break;
            } // case 50
            case 66: {
              userId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000040;
              break;
            } // case 66
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

    private long agentSid_ ;
    /**
     * <pre>
     * the agent's sid
     * </pre>
     *
     * <code>int64 agent_sid = 1 [json_name = "agentSid"];</code>
     * @return The agentSid.
     */
    @java.lang.Override
    public long getAgentSid() {
      return agentSid_;
    }
    /**
     * <pre>
     * the agent's sid
     * </pre>
     *
     * <code>int64 agent_sid = 1 [json_name = "agentSid"];</code>
     * @param value The agentSid to set.
     * @return This builder for chaining.
     */
    public Builder setAgentSid(long value) {

      agentSid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the agent's sid
     * </pre>
     *
     * <code>int64 agent_sid = 1 [json_name = "agentSid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAgentSid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      agentSid_ = 0L;
      onChanged();
      return this;
    }

    private long tenantSid_ ;
    /**
     * <pre>
     * the client's sid
     * </pre>
     *
     * <code>int64 tenant_sid = 2 [json_name = "tenantSid"];</code>
     * @return The tenantSid.
     */
    @java.lang.Override
    public long getTenantSid() {
      return tenantSid_;
    }
    /**
     * <pre>
     * the client's sid
     * </pre>
     *
     * <code>int64 tenant_sid = 2 [json_name = "tenantSid"];</code>
     * @param value The tenantSid to set.
     * @return This builder for chaining.
     */
    public Builder setTenantSid(long value) {

      tenantSid_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the client's sid
     * </pre>
     *
     * <code>int64 tenant_sid = 2 [json_name = "tenantSid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTenantSid() {
      bitField0_ = (bitField0_ & ~0x00000002);
      tenantSid_ = 0L;
      onChanged();
      return this;
    }

    private long sessionSid_ ;
    /**
     * <pre>
     * the voice session sid
     * </pre>
     *
     * <code>int64 session_sid = 3 [json_name = "sessionSid"];</code>
     * @return The sessionSid.
     */
    @java.lang.Override
    public long getSessionSid() {
      return sessionSid_;
    }
    /**
     * <pre>
     * the voice session sid
     * </pre>
     *
     * <code>int64 session_sid = 3 [json_name = "sessionSid"];</code>
     * @param value The sessionSid to set.
     * @return This builder for chaining.
     */
    public Builder setSessionSid(long value) {

      sessionSid_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the voice session sid
     * </pre>
     *
     * <code>int64 session_sid = 3 [json_name = "sessionSid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSessionSid() {
      bitField0_ = (bitField0_ & ~0x00000004);
      sessionSid_ = 0L;
      onChanged();
      return this;
    }

    private long asmSessionSid_ ;
    /**
     * <pre>
     * the asm session sid
     * </pre>
     *
     * <code>int64 asm_session_sid = 4 [json_name = "asmSessionSid"];</code>
     * @return The asmSessionSid.
     */
    @java.lang.Override
    public long getAsmSessionSid() {
      return asmSessionSid_;
    }
    /**
     * <pre>
     * the asm session sid
     * </pre>
     *
     * <code>int64 asm_session_sid = 4 [json_name = "asmSessionSid"];</code>
     * @param value The asmSessionSid to set.
     * @return This builder for chaining.
     */
    public Builder setAsmSessionSid(long value) {

      asmSessionSid_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the asm session sid
     * </pre>
     *
     * <code>int64 asm_session_sid = 4 [json_name = "asmSessionSid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAsmSessionSid() {
      bitField0_ = (bitField0_ & ~0x00000008);
      asmSessionSid_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object orgId_ = "";
    /**
     * <pre>
     * the org id of the user/agent
     * </pre>
     *
     * <code>string org_id = 5 [json_name = "orgId"];</code>
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
     * the org id of the user/agent
     * </pre>
     *
     * <code>string org_id = 5 [json_name = "orgId"];</code>
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
     * the org id of the user/agent
     * </pre>
     *
     * <code>string org_id = 5 [json_name = "orgId"];</code>
     * @param value The orgId to set.
     * @return This builder for chaining.
     */
    public Builder setOrgId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      orgId_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the org id of the user/agent
     * </pre>
     *
     * <code>string org_id = 5 [json_name = "orgId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearOrgId() {
      orgId_ = getDefaultInstance().getOrgId();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the org id of the user/agent
     * </pre>
     *
     * <code>string org_id = 5 [json_name = "orgId"];</code>
     * @param value The bytes for orgId to set.
     * @return This builder for chaining.
     */
    public Builder setOrgIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      orgId_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }

    private java.lang.Object regionId_ = "";
    /**
     * <pre>
     * the region id of the user/agent
     * </pre>
     *
     * <code>string region_id = 6 [json_name = "regionId"];</code>
     * @return The regionId.
     */
    public java.lang.String getRegionId() {
      java.lang.Object ref = regionId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        regionId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * the region id of the user/agent
     * </pre>
     *
     * <code>string region_id = 6 [json_name = "regionId"];</code>
     * @return The bytes for regionId.
     */
    public com.google.protobuf.ByteString
        getRegionIdBytes() {
      java.lang.Object ref = regionId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        regionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * the region id of the user/agent
     * </pre>
     *
     * <code>string region_id = 6 [json_name = "regionId"];</code>
     * @param value The regionId to set.
     * @return This builder for chaining.
     */
    public Builder setRegionId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      regionId_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the region id of the user/agent
     * </pre>
     *
     * <code>string region_id = 6 [json_name = "regionId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRegionId() {
      regionId_ = getDefaultInstance().getRegionId();
      bitField0_ = (bitField0_ & ~0x00000020);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the region id of the user/agent
     * </pre>
     *
     * <code>string region_id = 6 [json_name = "regionId"];</code>
     * @param value The bytes for regionId to set.
     * @return This builder for chaining.
     */
    public Builder setRegionIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      regionId_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }

    private java.lang.Object userId_ = "";
    /**
     * <pre>
     * the user's id
     * </pre>
     *
     * <code>string user_id = 8 [json_name = "userId"];</code>
     * @return The userId.
     */
    public java.lang.String getUserId() {
      java.lang.Object ref = userId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * the user's id
     * </pre>
     *
     * <code>string user_id = 8 [json_name = "userId"];</code>
     * @return The bytes for userId.
     */
    public com.google.protobuf.ByteString
        getUserIdBytes() {
      java.lang.Object ref = userId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * the user's id
     * </pre>
     *
     * <code>string user_id = 8 [json_name = "userId"];</code>
     * @param value The userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      userId_ = value;
      bitField0_ |= 0x00000040;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the user's id
     * </pre>
     *
     * <code>string user_id = 8 [json_name = "userId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearUserId() {
      userId_ = getDefaultInstance().getUserId();
      bitField0_ = (bitField0_ & ~0x00000040);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the user's id
     * </pre>
     *
     * <code>string user_id = 8 [json_name = "userId"];</code>
     * @param value The bytes for userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      userId_ = value;
      bitField0_ |= 0x00000040;
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


    // @@protoc_insertion_point(builder_scope:api.commons.AgentSession)
  }

  // @@protoc_insertion_point(class_scope:api.commons.AgentSession)
  private static final com.tcn.cloud.api.api.commons.AgentSession DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.commons.AgentSession();
  }

  public static com.tcn.cloud.api.api.commons.AgentSession getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AgentSession>
      PARSER = new com.google.protobuf.AbstractParser<AgentSession>() {
    @java.lang.Override
    public AgentSession parsePartialFrom(
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

  public static com.google.protobuf.Parser<AgentSession> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AgentSession> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.commons.AgentSession getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

