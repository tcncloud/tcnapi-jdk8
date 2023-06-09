// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/smsapi.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.SmsConversationAssignedAgent}
 */
public final class SmsConversationAssignedAgent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.SmsConversationAssignedAgent)
    SmsConversationAssignedAgentOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SmsConversationAssignedAgent.newBuilder() to construct.
  private SmsConversationAssignedAgent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SmsConversationAssignedAgent() {
    smsConversationId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SmsConversationAssignedAgent();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.SmsapiProto.internal_static_api_v0alpha_SmsConversationAssignedAgent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.SmsapiProto.internal_static_api_v0alpha_SmsConversationAssignedAgent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.SmsConversationAssignedAgent.class, com.tcn.cloud.api.api.v0alpha.SmsConversationAssignedAgent.Builder.class);
  }

  public static final int SMS_CONVERSATION_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object smsConversationId_ = "";
  /**
   * <code>string sms_conversation_id = 1 [json_name = "smsConversationId"];</code>
   * @return The smsConversationId.
   */
  @java.lang.Override
  public java.lang.String getSmsConversationId() {
    java.lang.Object ref = smsConversationId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      smsConversationId_ = s;
      return s;
    }
  }
  /**
   * <code>string sms_conversation_id = 1 [json_name = "smsConversationId"];</code>
   * @return The bytes for smsConversationId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSmsConversationIdBytes() {
    java.lang.Object ref = smsConversationId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      smsConversationId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ASSIGNED_AGENT_ID_FIELD_NUMBER = 2;
  private long assignedAgentId_ = 0L;
  /**
   * <code>int64 assigned_agent_id = 2 [json_name = "assignedAgentId"];</code>
   * @return The assignedAgentId.
   */
  @java.lang.Override
  public long getAssignedAgentId() {
    return assignedAgentId_;
  }

  public static final int PRIMARY_AGENT_FIELD_NUMBER = 3;
  private boolean primaryAgent_ = false;
  /**
   * <code>bool primary_agent = 3 [json_name = "primaryAgent"];</code>
   * @return The primaryAgent.
   */
  @java.lang.Override
  public boolean getPrimaryAgent() {
    return primaryAgent_;
  }

  public static final int NOTIFY_FIELD_NUMBER = 4;
  private boolean notify_ = false;
  /**
   * <code>bool notify = 4 [json_name = "notify"];</code>
   * @return The notify.
   */
  @java.lang.Override
  public boolean getNotify() {
    return notify_;
  }

  public static final int CREATED_ON_FIELD_NUMBER = 5;
  private com.google.protobuf.Timestamp createdOn_;
  /**
   * <code>.google.protobuf.Timestamp created_on = 5 [json_name = "createdOn"];</code>
   * @return Whether the createdOn field is set.
   */
  @java.lang.Override
  public boolean hasCreatedOn() {
    return createdOn_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp created_on = 5 [json_name = "createdOn"];</code>
   * @return The createdOn.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getCreatedOn() {
    return createdOn_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : createdOn_;
  }
  /**
   * <code>.google.protobuf.Timestamp created_on = 5 [json_name = "createdOn"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getCreatedOnOrBuilder() {
    return createdOn_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : createdOn_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(smsConversationId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, smsConversationId_);
    }
    if (assignedAgentId_ != 0L) {
      output.writeInt64(2, assignedAgentId_);
    }
    if (primaryAgent_ != false) {
      output.writeBool(3, primaryAgent_);
    }
    if (notify_ != false) {
      output.writeBool(4, notify_);
    }
    if (createdOn_ != null) {
      output.writeMessage(5, getCreatedOn());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(smsConversationId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, smsConversationId_);
    }
    if (assignedAgentId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, assignedAgentId_);
    }
    if (primaryAgent_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, primaryAgent_);
    }
    if (notify_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, notify_);
    }
    if (createdOn_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getCreatedOn());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.SmsConversationAssignedAgent)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.SmsConversationAssignedAgent other = (com.tcn.cloud.api.api.v0alpha.SmsConversationAssignedAgent) obj;

    if (!getSmsConversationId()
        .equals(other.getSmsConversationId())) return false;
    if (getAssignedAgentId()
        != other.getAssignedAgentId()) return false;
    if (getPrimaryAgent()
        != other.getPrimaryAgent()) return false;
    if (getNotify()
        != other.getNotify()) return false;
    if (hasCreatedOn() != other.hasCreatedOn()) return false;
    if (hasCreatedOn()) {
      if (!getCreatedOn()
          .equals(other.getCreatedOn())) return false;
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
    hash = (37 * hash) + SMS_CONVERSATION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getSmsConversationId().hashCode();
    hash = (37 * hash) + ASSIGNED_AGENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAssignedAgentId());
    hash = (37 * hash) + PRIMARY_AGENT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getPrimaryAgent());
    hash = (37 * hash) + NOTIFY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getNotify());
    if (hasCreatedOn()) {
      hash = (37 * hash) + CREATED_ON_FIELD_NUMBER;
      hash = (53 * hash) + getCreatedOn().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.SmsConversationAssignedAgent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.SmsConversationAssignedAgent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.SmsConversationAssignedAgent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.SmsConversationAssignedAgent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.SmsConversationAssignedAgent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.SmsConversationAssignedAgent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.SmsConversationAssignedAgent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.SmsConversationAssignedAgent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.SmsConversationAssignedAgent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.SmsConversationAssignedAgent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.SmsConversationAssignedAgent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.SmsConversationAssignedAgent parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.SmsConversationAssignedAgent prototype) {
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
   * Protobuf type {@code api.v0alpha.SmsConversationAssignedAgent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.SmsConversationAssignedAgent)
      com.tcn.cloud.api.api.v0alpha.SmsConversationAssignedAgentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.SmsapiProto.internal_static_api_v0alpha_SmsConversationAssignedAgent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.SmsapiProto.internal_static_api_v0alpha_SmsConversationAssignedAgent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.SmsConversationAssignedAgent.class, com.tcn.cloud.api.api.v0alpha.SmsConversationAssignedAgent.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.SmsConversationAssignedAgent.newBuilder()
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
      smsConversationId_ = "";
      assignedAgentId_ = 0L;
      primaryAgent_ = false;
      notify_ = false;
      createdOn_ = null;
      if (createdOnBuilder_ != null) {
        createdOnBuilder_.dispose();
        createdOnBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.SmsapiProto.internal_static_api_v0alpha_SmsConversationAssignedAgent_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.SmsConversationAssignedAgent getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.SmsConversationAssignedAgent.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.SmsConversationAssignedAgent build() {
      com.tcn.cloud.api.api.v0alpha.SmsConversationAssignedAgent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.SmsConversationAssignedAgent buildPartial() {
      com.tcn.cloud.api.api.v0alpha.SmsConversationAssignedAgent result = new com.tcn.cloud.api.api.v0alpha.SmsConversationAssignedAgent(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.SmsConversationAssignedAgent result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.smsConversationId_ = smsConversationId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.assignedAgentId_ = assignedAgentId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.primaryAgent_ = primaryAgent_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.notify_ = notify_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.createdOn_ = createdOnBuilder_ == null
            ? createdOn_
            : createdOnBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.SmsConversationAssignedAgent) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.SmsConversationAssignedAgent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.SmsConversationAssignedAgent other) {
      if (other == com.tcn.cloud.api.api.v0alpha.SmsConversationAssignedAgent.getDefaultInstance()) return this;
      if (!other.getSmsConversationId().isEmpty()) {
        smsConversationId_ = other.smsConversationId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getAssignedAgentId() != 0L) {
        setAssignedAgentId(other.getAssignedAgentId());
      }
      if (other.getPrimaryAgent() != false) {
        setPrimaryAgent(other.getPrimaryAgent());
      }
      if (other.getNotify() != false) {
        setNotify(other.getNotify());
      }
      if (other.hasCreatedOn()) {
        mergeCreatedOn(other.getCreatedOn());
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
              smsConversationId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              assignedAgentId_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              primaryAgent_ = input.readBool();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              notify_ = input.readBool();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 42: {
              input.readMessage(
                  getCreatedOnFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private java.lang.Object smsConversationId_ = "";
    /**
     * <code>string sms_conversation_id = 1 [json_name = "smsConversationId"];</code>
     * @return The smsConversationId.
     */
    public java.lang.String getSmsConversationId() {
      java.lang.Object ref = smsConversationId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        smsConversationId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string sms_conversation_id = 1 [json_name = "smsConversationId"];</code>
     * @return The bytes for smsConversationId.
     */
    public com.google.protobuf.ByteString
        getSmsConversationIdBytes() {
      java.lang.Object ref = smsConversationId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        smsConversationId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string sms_conversation_id = 1 [json_name = "smsConversationId"];</code>
     * @param value The smsConversationId to set.
     * @return This builder for chaining.
     */
    public Builder setSmsConversationId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      smsConversationId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string sms_conversation_id = 1 [json_name = "smsConversationId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSmsConversationId() {
      smsConversationId_ = getDefaultInstance().getSmsConversationId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string sms_conversation_id = 1 [json_name = "smsConversationId"];</code>
     * @param value The bytes for smsConversationId to set.
     * @return This builder for chaining.
     */
    public Builder setSmsConversationIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      smsConversationId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private long assignedAgentId_ ;
    /**
     * <code>int64 assigned_agent_id = 2 [json_name = "assignedAgentId"];</code>
     * @return The assignedAgentId.
     */
    @java.lang.Override
    public long getAssignedAgentId() {
      return assignedAgentId_;
    }
    /**
     * <code>int64 assigned_agent_id = 2 [json_name = "assignedAgentId"];</code>
     * @param value The assignedAgentId to set.
     * @return This builder for chaining.
     */
    public Builder setAssignedAgentId(long value) {

      assignedAgentId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>int64 assigned_agent_id = 2 [json_name = "assignedAgentId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAssignedAgentId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      assignedAgentId_ = 0L;
      onChanged();
      return this;
    }

    private boolean primaryAgent_ ;
    /**
     * <code>bool primary_agent = 3 [json_name = "primaryAgent"];</code>
     * @return The primaryAgent.
     */
    @java.lang.Override
    public boolean getPrimaryAgent() {
      return primaryAgent_;
    }
    /**
     * <code>bool primary_agent = 3 [json_name = "primaryAgent"];</code>
     * @param value The primaryAgent to set.
     * @return This builder for chaining.
     */
    public Builder setPrimaryAgent(boolean value) {

      primaryAgent_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>bool primary_agent = 3 [json_name = "primaryAgent"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPrimaryAgent() {
      bitField0_ = (bitField0_ & ~0x00000004);
      primaryAgent_ = false;
      onChanged();
      return this;
    }

    private boolean notify_ ;
    /**
     * <code>bool notify = 4 [json_name = "notify"];</code>
     * @return The notify.
     */
    @java.lang.Override
    public boolean getNotify() {
      return notify_;
    }
    /**
     * <code>bool notify = 4 [json_name = "notify"];</code>
     * @param value The notify to set.
     * @return This builder for chaining.
     */
    public Builder setNotify(boolean value) {

      notify_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>bool notify = 4 [json_name = "notify"];</code>
     * @return This builder for chaining.
     */
    public Builder clearNotify() {
      bitField0_ = (bitField0_ & ~0x00000008);
      notify_ = false;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp createdOn_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> createdOnBuilder_;
    /**
     * <code>.google.protobuf.Timestamp created_on = 5 [json_name = "createdOn"];</code>
     * @return Whether the createdOn field is set.
     */
    public boolean hasCreatedOn() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <code>.google.protobuf.Timestamp created_on = 5 [json_name = "createdOn"];</code>
     * @return The createdOn.
     */
    public com.google.protobuf.Timestamp getCreatedOn() {
      if (createdOnBuilder_ == null) {
        return createdOn_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : createdOn_;
      } else {
        return createdOnBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp created_on = 5 [json_name = "createdOn"];</code>
     */
    public Builder setCreatedOn(com.google.protobuf.Timestamp value) {
      if (createdOnBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        createdOn_ = value;
      } else {
        createdOnBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp created_on = 5 [json_name = "createdOn"];</code>
     */
    public Builder setCreatedOn(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (createdOnBuilder_ == null) {
        createdOn_ = builderForValue.build();
      } else {
        createdOnBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp created_on = 5 [json_name = "createdOn"];</code>
     */
    public Builder mergeCreatedOn(com.google.protobuf.Timestamp value) {
      if (createdOnBuilder_ == null) {
        if (((bitField0_ & 0x00000010) != 0) &&
          createdOn_ != null &&
          createdOn_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getCreatedOnBuilder().mergeFrom(value);
        } else {
          createdOn_ = value;
        }
      } else {
        createdOnBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp created_on = 5 [json_name = "createdOn"];</code>
     */
    public Builder clearCreatedOn() {
      bitField0_ = (bitField0_ & ~0x00000010);
      createdOn_ = null;
      if (createdOnBuilder_ != null) {
        createdOnBuilder_.dispose();
        createdOnBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp created_on = 5 [json_name = "createdOn"];</code>
     */
    public com.google.protobuf.Timestamp.Builder getCreatedOnBuilder() {
      bitField0_ |= 0x00000010;
      onChanged();
      return getCreatedOnFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp created_on = 5 [json_name = "createdOn"];</code>
     */
    public com.google.protobuf.TimestampOrBuilder getCreatedOnOrBuilder() {
      if (createdOnBuilder_ != null) {
        return createdOnBuilder_.getMessageOrBuilder();
      } else {
        return createdOn_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : createdOn_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp created_on = 5 [json_name = "createdOn"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getCreatedOnFieldBuilder() {
      if (createdOnBuilder_ == null) {
        createdOnBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getCreatedOn(),
                getParentForChildren(),
                isClean());
        createdOn_ = null;
      }
      return createdOnBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.SmsConversationAssignedAgent)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.SmsConversationAssignedAgent)
  private static final com.tcn.cloud.api.api.v0alpha.SmsConversationAssignedAgent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.SmsConversationAssignedAgent();
  }

  public static com.tcn.cloud.api.api.v0alpha.SmsConversationAssignedAgent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SmsConversationAssignedAgent>
      PARSER = new com.google.protobuf.AbstractParser<SmsConversationAssignedAgent>() {
    @java.lang.Override
    public SmsConversationAssignedAgent parsePartialFrom(
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

  public static com.google.protobuf.Parser<SmsConversationAssignedAgent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SmsConversationAssignedAgent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.SmsConversationAssignedAgent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

