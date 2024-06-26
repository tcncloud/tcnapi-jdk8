// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/integrations/service.proto

package com.tcn.cloud.api.api.v1alpha1.integrations;

/**
 * Protobuf type {@code api.v1alpha1.integrations.PopulateIntegrationLinkReq}
 */
public final class PopulateIntegrationLinkReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.integrations.PopulateIntegrationLinkReq)
    PopulateIntegrationLinkReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PopulateIntegrationLinkReq.newBuilder() to construct.
  private PopulateIntegrationLinkReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PopulateIntegrationLinkReq() {
    callType_ = 0;
    scheduledCallbackId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PopulateIntegrationLinkReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.integrations.ServiceProto.internal_static_api_v1alpha1_integrations_PopulateIntegrationLinkReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.integrations.ServiceProto.internal_static_api_v1alpha1_integrations_PopulateIntegrationLinkReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkReq.class, com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkReq.Builder.class);
  }

  public static final int CLIENT_SID_FIELD_NUMBER = 1;
  private long clientSid_ = 0L;
  /**
   * <code>int64 client_sid = 1 [json_name = "clientSid"];</code>
   * @return The clientSid.
   */
  @java.lang.Override
  public long getClientSid() {
    return clientSid_;
  }

  public static final int AGENT_SID_FIELD_NUMBER = 2;
  private long agentSid_ = 0L;
  /**
   * <code>int64 agent_sid = 2 [json_name = "agentSid"];</code>
   * @return The agentSid.
   */
  @java.lang.Override
  public long getAgentSid() {
    return agentSid_;
  }

  public static final int CALL_SID_FIELD_NUMBER = 3;
  private long callSid_ = 0L;
  /**
   * <code>int64 call_sid = 3 [json_name = "callSid"];</code>
   * @return The callSid.
   */
  @java.lang.Override
  public long getCallSid() {
    return callSid_;
  }

  public static final int CALL_TYPE_FIELD_NUMBER = 4;
  private int callType_ = 0;
  /**
   * <code>.api.commons.CallType.Enum call_type = 4 [json_name = "callType"];</code>
   * @return The enum numeric value on the wire for callType.
   */
  @java.lang.Override public int getCallTypeValue() {
    return callType_;
  }
  /**
   * <code>.api.commons.CallType.Enum call_type = 4 [json_name = "callType"];</code>
   * @return The callType.
   */
  @java.lang.Override public com.tcn.cloud.api.api.commons.CallType.Enum getCallType() {
    com.tcn.cloud.api.api.commons.CallType.Enum result = com.tcn.cloud.api.api.commons.CallType.Enum.forNumber(callType_);
    return result == null ? com.tcn.cloud.api.api.commons.CallType.Enum.UNRECOGNIZED : result;
  }

  public static final int SCHEDULED_CALLBACK_ID_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object scheduledCallbackId_ = "";
  /**
   * <code>string scheduled_callback_id = 5 [json_name = "scheduledCallbackId"];</code>
   * @return The scheduledCallbackId.
   */
  @java.lang.Override
  public java.lang.String getScheduledCallbackId() {
    java.lang.Object ref = scheduledCallbackId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      scheduledCallbackId_ = s;
      return s;
    }
  }
  /**
   * <code>string scheduled_callback_id = 5 [json_name = "scheduledCallbackId"];</code>
   * @return The bytes for scheduledCallbackId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getScheduledCallbackIdBytes() {
    java.lang.Object ref = scheduledCallbackId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      scheduledCallbackId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INTEGRATION_LINK_FIELD_NUMBER = 6;
  private com.tcn.cloud.api.api.commons.org.IntegrationLink integrationLink_;
  /**
   * <pre>
   * all params above are going to use MailMerge to populate the fields on integration link
   * </pre>
   *
   * <code>.api.commons.org.IntegrationLink integration_link = 6 [json_name = "integrationLink"];</code>
   * @return Whether the integrationLink field is set.
   */
  @java.lang.Override
  public boolean hasIntegrationLink() {
    return integrationLink_ != null;
  }
  /**
   * <pre>
   * all params above are going to use MailMerge to populate the fields on integration link
   * </pre>
   *
   * <code>.api.commons.org.IntegrationLink integration_link = 6 [json_name = "integrationLink"];</code>
   * @return The integrationLink.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.IntegrationLink getIntegrationLink() {
    return integrationLink_ == null ? com.tcn.cloud.api.api.commons.org.IntegrationLink.getDefaultInstance() : integrationLink_;
  }
  /**
   * <pre>
   * all params above are going to use MailMerge to populate the fields on integration link
   * </pre>
   *
   * <code>.api.commons.org.IntegrationLink integration_link = 6 [json_name = "integrationLink"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.IntegrationLinkOrBuilder getIntegrationLinkOrBuilder() {
    return integrationLink_ == null ? com.tcn.cloud.api.api.commons.org.IntegrationLink.getDefaultInstance() : integrationLink_;
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
    if (clientSid_ != 0L) {
      output.writeInt64(1, clientSid_);
    }
    if (agentSid_ != 0L) {
      output.writeInt64(2, agentSid_);
    }
    if (callSid_ != 0L) {
      output.writeInt64(3, callSid_);
    }
    if (callType_ != com.tcn.cloud.api.api.commons.CallType.Enum.INBOUND.getNumber()) {
      output.writeEnum(4, callType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(scheduledCallbackId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, scheduledCallbackId_);
    }
    if (integrationLink_ != null) {
      output.writeMessage(6, getIntegrationLink());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (clientSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, clientSid_);
    }
    if (agentSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, agentSid_);
    }
    if (callSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, callSid_);
    }
    if (callType_ != com.tcn.cloud.api.api.commons.CallType.Enum.INBOUND.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, callType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(scheduledCallbackId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, scheduledCallbackId_);
    }
    if (integrationLink_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(6, getIntegrationLink());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkReq other = (com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkReq) obj;

    if (getClientSid()
        != other.getClientSid()) return false;
    if (getAgentSid()
        != other.getAgentSid()) return false;
    if (getCallSid()
        != other.getCallSid()) return false;
    if (callType_ != other.callType_) return false;
    if (!getScheduledCallbackId()
        .equals(other.getScheduledCallbackId())) return false;
    if (hasIntegrationLink() != other.hasIntegrationLink()) return false;
    if (hasIntegrationLink()) {
      if (!getIntegrationLink()
          .equals(other.getIntegrationLink())) return false;
    }
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
    hash = (37 * hash) + CLIENT_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getClientSid());
    hash = (37 * hash) + AGENT_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAgentSid());
    hash = (37 * hash) + CALL_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCallSid());
    hash = (37 * hash) + CALL_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + callType_;
    hash = (37 * hash) + SCHEDULED_CALLBACK_ID_FIELD_NUMBER;
    hash = (53 * hash) + getScheduledCallbackId().hashCode();
    if (hasIntegrationLink()) {
      hash = (37 * hash) + INTEGRATION_LINK_FIELD_NUMBER;
      hash = (53 * hash) + getIntegrationLink().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkReq prototype) {
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
   * Protobuf type {@code api.v1alpha1.integrations.PopulateIntegrationLinkReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.integrations.PopulateIntegrationLinkReq)
      com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.integrations.ServiceProto.internal_static_api_v1alpha1_integrations_PopulateIntegrationLinkReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.integrations.ServiceProto.internal_static_api_v1alpha1_integrations_PopulateIntegrationLinkReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkReq.class, com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkReq.newBuilder()
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
      clientSid_ = 0L;
      agentSid_ = 0L;
      callSid_ = 0L;
      callType_ = 0;
      scheduledCallbackId_ = "";
      integrationLink_ = null;
      if (integrationLinkBuilder_ != null) {
        integrationLinkBuilder_.dispose();
        integrationLinkBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.integrations.ServiceProto.internal_static_api_v1alpha1_integrations_PopulateIntegrationLinkReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkReq build() {
      com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkReq buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkReq result = new com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.clientSid_ = clientSid_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.agentSid_ = agentSid_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.callSid_ = callSid_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.callType_ = callType_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.scheduledCallbackId_ = scheduledCallbackId_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.integrationLink_ = integrationLinkBuilder_ == null
            ? integrationLink_
            : integrationLinkBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkReq) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkReq other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkReq.getDefaultInstance()) return this;
      if (other.getClientSid() != 0L) {
        setClientSid(other.getClientSid());
      }
      if (other.getAgentSid() != 0L) {
        setAgentSid(other.getAgentSid());
      }
      if (other.getCallSid() != 0L) {
        setCallSid(other.getCallSid());
      }
      if (other.callType_ != 0) {
        setCallTypeValue(other.getCallTypeValue());
      }
      if (!other.getScheduledCallbackId().isEmpty()) {
        scheduledCallbackId_ = other.scheduledCallbackId_;
        bitField0_ |= 0x00000010;
        onChanged();
      }
      if (other.hasIntegrationLink()) {
        mergeIntegrationLink(other.getIntegrationLink());
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
              clientSid_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              agentSid_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              callSid_ = input.readInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              callType_ = input.readEnum();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 42: {
              scheduledCallbackId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000010;
              break;
            } // case 42
            case 50: {
              input.readMessage(
                  getIntegrationLinkFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000020;
              break;
            } // case 50
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

    private long clientSid_ ;
    /**
     * <code>int64 client_sid = 1 [json_name = "clientSid"];</code>
     * @return The clientSid.
     */
    @java.lang.Override
    public long getClientSid() {
      return clientSid_;
    }
    /**
     * <code>int64 client_sid = 1 [json_name = "clientSid"];</code>
     * @param value The clientSid to set.
     * @return This builder for chaining.
     */
    public Builder setClientSid(long value) {

      clientSid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int64 client_sid = 1 [json_name = "clientSid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearClientSid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      clientSid_ = 0L;
      onChanged();
      return this;
    }

    private long agentSid_ ;
    /**
     * <code>int64 agent_sid = 2 [json_name = "agentSid"];</code>
     * @return The agentSid.
     */
    @java.lang.Override
    public long getAgentSid() {
      return agentSid_;
    }
    /**
     * <code>int64 agent_sid = 2 [json_name = "agentSid"];</code>
     * @param value The agentSid to set.
     * @return This builder for chaining.
     */
    public Builder setAgentSid(long value) {

      agentSid_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>int64 agent_sid = 2 [json_name = "agentSid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAgentSid() {
      bitField0_ = (bitField0_ & ~0x00000002);
      agentSid_ = 0L;
      onChanged();
      return this;
    }

    private long callSid_ ;
    /**
     * <code>int64 call_sid = 3 [json_name = "callSid"];</code>
     * @return The callSid.
     */
    @java.lang.Override
    public long getCallSid() {
      return callSid_;
    }
    /**
     * <code>int64 call_sid = 3 [json_name = "callSid"];</code>
     * @param value The callSid to set.
     * @return This builder for chaining.
     */
    public Builder setCallSid(long value) {

      callSid_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>int64 call_sid = 3 [json_name = "callSid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCallSid() {
      bitField0_ = (bitField0_ & ~0x00000004);
      callSid_ = 0L;
      onChanged();
      return this;
    }

    private int callType_ = 0;
    /**
     * <code>.api.commons.CallType.Enum call_type = 4 [json_name = "callType"];</code>
     * @return The enum numeric value on the wire for callType.
     */
    @java.lang.Override public int getCallTypeValue() {
      return callType_;
    }
    /**
     * <code>.api.commons.CallType.Enum call_type = 4 [json_name = "callType"];</code>
     * @param value The enum numeric value on the wire for callType to set.
     * @return This builder for chaining.
     */
    public Builder setCallTypeValue(int value) {
      callType_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.CallType.Enum call_type = 4 [json_name = "callType"];</code>
     * @return The callType.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.CallType.Enum getCallType() {
      com.tcn.cloud.api.api.commons.CallType.Enum result = com.tcn.cloud.api.api.commons.CallType.Enum.forNumber(callType_);
      return result == null ? com.tcn.cloud.api.api.commons.CallType.Enum.UNRECOGNIZED : result;
    }
    /**
     * <code>.api.commons.CallType.Enum call_type = 4 [json_name = "callType"];</code>
     * @param value The callType to set.
     * @return This builder for chaining.
     */
    public Builder setCallType(com.tcn.cloud.api.api.commons.CallType.Enum value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000008;
      callType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.CallType.Enum call_type = 4 [json_name = "callType"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCallType() {
      bitField0_ = (bitField0_ & ~0x00000008);
      callType_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object scheduledCallbackId_ = "";
    /**
     * <code>string scheduled_callback_id = 5 [json_name = "scheduledCallbackId"];</code>
     * @return The scheduledCallbackId.
     */
    public java.lang.String getScheduledCallbackId() {
      java.lang.Object ref = scheduledCallbackId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        scheduledCallbackId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string scheduled_callback_id = 5 [json_name = "scheduledCallbackId"];</code>
     * @return The bytes for scheduledCallbackId.
     */
    public com.google.protobuf.ByteString
        getScheduledCallbackIdBytes() {
      java.lang.Object ref = scheduledCallbackId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        scheduledCallbackId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string scheduled_callback_id = 5 [json_name = "scheduledCallbackId"];</code>
     * @param value The scheduledCallbackId to set.
     * @return This builder for chaining.
     */
    public Builder setScheduledCallbackId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      scheduledCallbackId_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>string scheduled_callback_id = 5 [json_name = "scheduledCallbackId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearScheduledCallbackId() {
      scheduledCallbackId_ = getDefaultInstance().getScheduledCallbackId();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <code>string scheduled_callback_id = 5 [json_name = "scheduledCallbackId"];</code>
     * @param value The bytes for scheduledCallbackId to set.
     * @return This builder for chaining.
     */
    public Builder setScheduledCallbackIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      scheduledCallbackId_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }

    private com.tcn.cloud.api.api.commons.org.IntegrationLink integrationLink_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.org.IntegrationLink, com.tcn.cloud.api.api.commons.org.IntegrationLink.Builder, com.tcn.cloud.api.api.commons.org.IntegrationLinkOrBuilder> integrationLinkBuilder_;
    /**
     * <pre>
     * all params above are going to use MailMerge to populate the fields on integration link
     * </pre>
     *
     * <code>.api.commons.org.IntegrationLink integration_link = 6 [json_name = "integrationLink"];</code>
     * @return Whether the integrationLink field is set.
     */
    public boolean hasIntegrationLink() {
      return ((bitField0_ & 0x00000020) != 0);
    }
    /**
     * <pre>
     * all params above are going to use MailMerge to populate the fields on integration link
     * </pre>
     *
     * <code>.api.commons.org.IntegrationLink integration_link = 6 [json_name = "integrationLink"];</code>
     * @return The integrationLink.
     */
    public com.tcn.cloud.api.api.commons.org.IntegrationLink getIntegrationLink() {
      if (integrationLinkBuilder_ == null) {
        return integrationLink_ == null ? com.tcn.cloud.api.api.commons.org.IntegrationLink.getDefaultInstance() : integrationLink_;
      } else {
        return integrationLinkBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * all params above are going to use MailMerge to populate the fields on integration link
     * </pre>
     *
     * <code>.api.commons.org.IntegrationLink integration_link = 6 [json_name = "integrationLink"];</code>
     */
    public Builder setIntegrationLink(com.tcn.cloud.api.api.commons.org.IntegrationLink value) {
      if (integrationLinkBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        integrationLink_ = value;
      } else {
        integrationLinkBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * all params above are going to use MailMerge to populate the fields on integration link
     * </pre>
     *
     * <code>.api.commons.org.IntegrationLink integration_link = 6 [json_name = "integrationLink"];</code>
     */
    public Builder setIntegrationLink(
        com.tcn.cloud.api.api.commons.org.IntegrationLink.Builder builderForValue) {
      if (integrationLinkBuilder_ == null) {
        integrationLink_ = builderForValue.build();
      } else {
        integrationLinkBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * all params above are going to use MailMerge to populate the fields on integration link
     * </pre>
     *
     * <code>.api.commons.org.IntegrationLink integration_link = 6 [json_name = "integrationLink"];</code>
     */
    public Builder mergeIntegrationLink(com.tcn.cloud.api.api.commons.org.IntegrationLink value) {
      if (integrationLinkBuilder_ == null) {
        if (((bitField0_ & 0x00000020) != 0) &&
          integrationLink_ != null &&
          integrationLink_ != com.tcn.cloud.api.api.commons.org.IntegrationLink.getDefaultInstance()) {
          getIntegrationLinkBuilder().mergeFrom(value);
        } else {
          integrationLink_ = value;
        }
      } else {
        integrationLinkBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * all params above are going to use MailMerge to populate the fields on integration link
     * </pre>
     *
     * <code>.api.commons.org.IntegrationLink integration_link = 6 [json_name = "integrationLink"];</code>
     */
    public Builder clearIntegrationLink() {
      bitField0_ = (bitField0_ & ~0x00000020);
      integrationLink_ = null;
      if (integrationLinkBuilder_ != null) {
        integrationLinkBuilder_.dispose();
        integrationLinkBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * all params above are going to use MailMerge to populate the fields on integration link
     * </pre>
     *
     * <code>.api.commons.org.IntegrationLink integration_link = 6 [json_name = "integrationLink"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.IntegrationLink.Builder getIntegrationLinkBuilder() {
      bitField0_ |= 0x00000020;
      onChanged();
      return getIntegrationLinkFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * all params above are going to use MailMerge to populate the fields on integration link
     * </pre>
     *
     * <code>.api.commons.org.IntegrationLink integration_link = 6 [json_name = "integrationLink"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.IntegrationLinkOrBuilder getIntegrationLinkOrBuilder() {
      if (integrationLinkBuilder_ != null) {
        return integrationLinkBuilder_.getMessageOrBuilder();
      } else {
        return integrationLink_ == null ?
            com.tcn.cloud.api.api.commons.org.IntegrationLink.getDefaultInstance() : integrationLink_;
      }
    }
    /**
     * <pre>
     * all params above are going to use MailMerge to populate the fields on integration link
     * </pre>
     *
     * <code>.api.commons.org.IntegrationLink integration_link = 6 [json_name = "integrationLink"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.org.IntegrationLink, com.tcn.cloud.api.api.commons.org.IntegrationLink.Builder, com.tcn.cloud.api.api.commons.org.IntegrationLinkOrBuilder> 
        getIntegrationLinkFieldBuilder() {
      if (integrationLinkBuilder_ == null) {
        integrationLinkBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.commons.org.IntegrationLink, com.tcn.cloud.api.api.commons.org.IntegrationLink.Builder, com.tcn.cloud.api.api.commons.org.IntegrationLinkOrBuilder>(
                getIntegrationLink(),
                getParentForChildren(),
                isClean());
        integrationLink_ = null;
      }
      return integrationLinkBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.integrations.PopulateIntegrationLinkReq)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.integrations.PopulateIntegrationLinkReq)
  private static final com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkReq();
  }

  public static com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PopulateIntegrationLinkReq>
      PARSER = new com.google.protobuf.AbstractParser<PopulateIntegrationLinkReq>() {
    @java.lang.Override
    public PopulateIntegrationLinkReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<PopulateIntegrationLinkReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PopulateIntegrationLinkReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

