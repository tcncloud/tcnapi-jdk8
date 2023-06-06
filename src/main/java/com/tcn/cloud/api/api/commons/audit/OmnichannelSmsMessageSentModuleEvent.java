// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/audit/omnichannel_events.proto

package com.tcn.cloud.api.api.commons.audit;

/**
 * <pre>
 * OmnichannelAddSmsMessageSentAuditEvent - handle omnimessage and messageunits
 * </pre>
 *
 * Protobuf type {@code api.commons.audit.OmnichannelSmsMessageSentModuleEvent}
 */
public final class OmnichannelSmsMessageSentModuleEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.commons.audit.OmnichannelSmsMessageSentModuleEvent)
    OmnichannelSmsMessageSentModuleEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OmnichannelSmsMessageSentModuleEvent.newBuilder() to construct.
  private OmnichannelSmsMessageSentModuleEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OmnichannelSmsMessageSentModuleEvent() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OmnichannelSmsMessageSentModuleEvent();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.commons.audit.OmnichannelEventsProto.internal_static_api_commons_audit_OmnichannelSmsMessageSentModuleEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.commons.audit.OmnichannelEventsProto.internal_static_api_commons_audit_OmnichannelSmsMessageSentModuleEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.commons.audit.OmnichannelSmsMessageSentModuleEvent.class, com.tcn.cloud.api.api.commons.audit.OmnichannelSmsMessageSentModuleEvent.Builder.class);
  }

  public static final int MODULE_SID_FIELD_NUMBER = 1;
  private long moduleSid_ = 0L;
  /**
   * <pre>
   * module id
   * </pre>
   *
   * <code>int64 module_sid = 1 [json_name = "moduleSid", jstype = JS_STRING];</code>
   * @return The moduleSid.
   */
  @java.lang.Override
  public long getModuleSid() {
    return moduleSid_;
  }

  public static final int MESSAGE_UNITS_FIELD_NUMBER = 2;
  private long messageUnits_ = 0L;
  /**
   * <pre>
   * messageunits
   * </pre>
   *
   * <code>int64 message_units = 2 [json_name = "messageUnits"];</code>
   * @return The messageUnits.
   */
  @java.lang.Override
  public long getMessageUnits() {
    return messageUnits_;
  }

  public static final int OMNI_CAMPAIGN_FIELD_NUMBER = 3;
  private com.tcn.cloud.api.api.commons.OmniCampaign omniCampaign_;
  /**
   * <pre>
   * omni campaign
   * </pre>
   *
   * <code>.api.commons.OmniCampaign omni_campaign = 3 [json_name = "omniCampaign"];</code>
   * @return Whether the omniCampaign field is set.
   */
  @java.lang.Override
  public boolean hasOmniCampaign() {
    return omniCampaign_ != null;
  }
  /**
   * <pre>
   * omni campaign
   * </pre>
   *
   * <code>.api.commons.OmniCampaign omni_campaign = 3 [json_name = "omniCampaign"];</code>
   * @return The omniCampaign.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.OmniCampaign getOmniCampaign() {
    return omniCampaign_ == null ? com.tcn.cloud.api.api.commons.OmniCampaign.getDefaultInstance() : omniCampaign_;
  }
  /**
   * <pre>
   * omni campaign
   * </pre>
   *
   * <code>.api.commons.OmniCampaign omni_campaign = 3 [json_name = "omniCampaign"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.OmniCampaignOrBuilder getOmniCampaignOrBuilder() {
    return omniCampaign_ == null ? com.tcn.cloud.api.api.commons.OmniCampaign.getDefaultInstance() : omniCampaign_;
  }

  public static final int MESSAGE_FIELD_NUMBER = 4;
  private com.tcn.cloud.api.api.commons.OmniMessage message_;
  /**
   * <pre>
   * the message sent by the agent
   * </pre>
   *
   * <code>.api.commons.OmniMessage message = 4 [json_name = "message"];</code>
   * @return Whether the message field is set.
   */
  @java.lang.Override
  public boolean hasMessage() {
    return message_ != null;
  }
  /**
   * <pre>
   * the message sent by the agent
   * </pre>
   *
   * <code>.api.commons.OmniMessage message = 4 [json_name = "message"];</code>
   * @return The message.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.OmniMessage getMessage() {
    return message_ == null ? com.tcn.cloud.api.api.commons.OmniMessage.getDefaultInstance() : message_;
  }
  /**
   * <pre>
   * the message sent by the agent
   * </pre>
   *
   * <code>.api.commons.OmniMessage message = 4 [json_name = "message"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.OmniMessageOrBuilder getMessageOrBuilder() {
    return message_ == null ? com.tcn.cloud.api.api.commons.OmniMessage.getDefaultInstance() : message_;
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
    if (moduleSid_ != 0L) {
      output.writeInt64(1, moduleSid_);
    }
    if (messageUnits_ != 0L) {
      output.writeInt64(2, messageUnits_);
    }
    if (omniCampaign_ != null) {
      output.writeMessage(3, getOmniCampaign());
    }
    if (message_ != null) {
      output.writeMessage(4, getMessage());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (moduleSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, moduleSid_);
    }
    if (messageUnits_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, messageUnits_);
    }
    if (omniCampaign_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getOmniCampaign());
    }
    if (message_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getMessage());
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
    if (!(obj instanceof com.tcn.cloud.api.api.commons.audit.OmnichannelSmsMessageSentModuleEvent)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.commons.audit.OmnichannelSmsMessageSentModuleEvent other = (com.tcn.cloud.api.api.commons.audit.OmnichannelSmsMessageSentModuleEvent) obj;

    if (getModuleSid()
        != other.getModuleSid()) return false;
    if (getMessageUnits()
        != other.getMessageUnits()) return false;
    if (hasOmniCampaign() != other.hasOmniCampaign()) return false;
    if (hasOmniCampaign()) {
      if (!getOmniCampaign()
          .equals(other.getOmniCampaign())) return false;
    }
    if (hasMessage() != other.hasMessage()) return false;
    if (hasMessage()) {
      if (!getMessage()
          .equals(other.getMessage())) return false;
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
    hash = (37 * hash) + MODULE_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getModuleSid());
    hash = (37 * hash) + MESSAGE_UNITS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMessageUnits());
    if (hasOmniCampaign()) {
      hash = (37 * hash) + OMNI_CAMPAIGN_FIELD_NUMBER;
      hash = (53 * hash) + getOmniCampaign().hashCode();
    }
    if (hasMessage()) {
      hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
      hash = (53 * hash) + getMessage().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.commons.audit.OmnichannelSmsMessageSentModuleEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.audit.OmnichannelSmsMessageSentModuleEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.audit.OmnichannelSmsMessageSentModuleEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.audit.OmnichannelSmsMessageSentModuleEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.audit.OmnichannelSmsMessageSentModuleEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.audit.OmnichannelSmsMessageSentModuleEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.audit.OmnichannelSmsMessageSentModuleEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.audit.OmnichannelSmsMessageSentModuleEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.commons.audit.OmnichannelSmsMessageSentModuleEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.commons.audit.OmnichannelSmsMessageSentModuleEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.audit.OmnichannelSmsMessageSentModuleEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.audit.OmnichannelSmsMessageSentModuleEvent parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.commons.audit.OmnichannelSmsMessageSentModuleEvent prototype) {
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
   * OmnichannelAddSmsMessageSentAuditEvent - handle omnimessage and messageunits
   * </pre>
   *
   * Protobuf type {@code api.commons.audit.OmnichannelSmsMessageSentModuleEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.commons.audit.OmnichannelSmsMessageSentModuleEvent)
      com.tcn.cloud.api.api.commons.audit.OmnichannelSmsMessageSentModuleEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.audit.OmnichannelEventsProto.internal_static_api_commons_audit_OmnichannelSmsMessageSentModuleEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.commons.audit.OmnichannelEventsProto.internal_static_api_commons_audit_OmnichannelSmsMessageSentModuleEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.commons.audit.OmnichannelSmsMessageSentModuleEvent.class, com.tcn.cloud.api.api.commons.audit.OmnichannelSmsMessageSentModuleEvent.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.commons.audit.OmnichannelSmsMessageSentModuleEvent.newBuilder()
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
      moduleSid_ = 0L;
      messageUnits_ = 0L;
      omniCampaign_ = null;
      if (omniCampaignBuilder_ != null) {
        omniCampaignBuilder_.dispose();
        omniCampaignBuilder_ = null;
      }
      message_ = null;
      if (messageBuilder_ != null) {
        messageBuilder_.dispose();
        messageBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.commons.audit.OmnichannelEventsProto.internal_static_api_commons_audit_OmnichannelSmsMessageSentModuleEvent_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.audit.OmnichannelSmsMessageSentModuleEvent getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.commons.audit.OmnichannelSmsMessageSentModuleEvent.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.audit.OmnichannelSmsMessageSentModuleEvent build() {
      com.tcn.cloud.api.api.commons.audit.OmnichannelSmsMessageSentModuleEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.audit.OmnichannelSmsMessageSentModuleEvent buildPartial() {
      com.tcn.cloud.api.api.commons.audit.OmnichannelSmsMessageSentModuleEvent result = new com.tcn.cloud.api.api.commons.audit.OmnichannelSmsMessageSentModuleEvent(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.commons.audit.OmnichannelSmsMessageSentModuleEvent result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.moduleSid_ = moduleSid_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.messageUnits_ = messageUnits_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.omniCampaign_ = omniCampaignBuilder_ == null
            ? omniCampaign_
            : omniCampaignBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.message_ = messageBuilder_ == null
            ? message_
            : messageBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.commons.audit.OmnichannelSmsMessageSentModuleEvent) {
        return mergeFrom((com.tcn.cloud.api.api.commons.audit.OmnichannelSmsMessageSentModuleEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.commons.audit.OmnichannelSmsMessageSentModuleEvent other) {
      if (other == com.tcn.cloud.api.api.commons.audit.OmnichannelSmsMessageSentModuleEvent.getDefaultInstance()) return this;
      if (other.getModuleSid() != 0L) {
        setModuleSid(other.getModuleSid());
      }
      if (other.getMessageUnits() != 0L) {
        setMessageUnits(other.getMessageUnits());
      }
      if (other.hasOmniCampaign()) {
        mergeOmniCampaign(other.getOmniCampaign());
      }
      if (other.hasMessage()) {
        mergeMessage(other.getMessage());
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
              moduleSid_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              messageUnits_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              input.readMessage(
                  getOmniCampaignFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              input.readMessage(
                  getMessageFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000008;
              break;
            } // case 34
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

    private long moduleSid_ ;
    /**
     * <pre>
     * module id
     * </pre>
     *
     * <code>int64 module_sid = 1 [json_name = "moduleSid", jstype = JS_STRING];</code>
     * @return The moduleSid.
     */
    @java.lang.Override
    public long getModuleSid() {
      return moduleSid_;
    }
    /**
     * <pre>
     * module id
     * </pre>
     *
     * <code>int64 module_sid = 1 [json_name = "moduleSid", jstype = JS_STRING];</code>
     * @param value The moduleSid to set.
     * @return This builder for chaining.
     */
    public Builder setModuleSid(long value) {

      moduleSid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * module id
     * </pre>
     *
     * <code>int64 module_sid = 1 [json_name = "moduleSid", jstype = JS_STRING];</code>
     * @return This builder for chaining.
     */
    public Builder clearModuleSid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      moduleSid_ = 0L;
      onChanged();
      return this;
    }

    private long messageUnits_ ;
    /**
     * <pre>
     * messageunits
     * </pre>
     *
     * <code>int64 message_units = 2 [json_name = "messageUnits"];</code>
     * @return The messageUnits.
     */
    @java.lang.Override
    public long getMessageUnits() {
      return messageUnits_;
    }
    /**
     * <pre>
     * messageunits
     * </pre>
     *
     * <code>int64 message_units = 2 [json_name = "messageUnits"];</code>
     * @param value The messageUnits to set.
     * @return This builder for chaining.
     */
    public Builder setMessageUnits(long value) {

      messageUnits_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * messageunits
     * </pre>
     *
     * <code>int64 message_units = 2 [json_name = "messageUnits"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMessageUnits() {
      bitField0_ = (bitField0_ & ~0x00000002);
      messageUnits_ = 0L;
      onChanged();
      return this;
    }

    private com.tcn.cloud.api.api.commons.OmniCampaign omniCampaign_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.OmniCampaign, com.tcn.cloud.api.api.commons.OmniCampaign.Builder, com.tcn.cloud.api.api.commons.OmniCampaignOrBuilder> omniCampaignBuilder_;
    /**
     * <pre>
     * omni campaign
     * </pre>
     *
     * <code>.api.commons.OmniCampaign omni_campaign = 3 [json_name = "omniCampaign"];</code>
     * @return Whether the omniCampaign field is set.
     */
    public boolean hasOmniCampaign() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * omni campaign
     * </pre>
     *
     * <code>.api.commons.OmniCampaign omni_campaign = 3 [json_name = "omniCampaign"];</code>
     * @return The omniCampaign.
     */
    public com.tcn.cloud.api.api.commons.OmniCampaign getOmniCampaign() {
      if (omniCampaignBuilder_ == null) {
        return omniCampaign_ == null ? com.tcn.cloud.api.api.commons.OmniCampaign.getDefaultInstance() : omniCampaign_;
      } else {
        return omniCampaignBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * omni campaign
     * </pre>
     *
     * <code>.api.commons.OmniCampaign omni_campaign = 3 [json_name = "omniCampaign"];</code>
     */
    public Builder setOmniCampaign(com.tcn.cloud.api.api.commons.OmniCampaign value) {
      if (omniCampaignBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        omniCampaign_ = value;
      } else {
        omniCampaignBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * omni campaign
     * </pre>
     *
     * <code>.api.commons.OmniCampaign omni_campaign = 3 [json_name = "omniCampaign"];</code>
     */
    public Builder setOmniCampaign(
        com.tcn.cloud.api.api.commons.OmniCampaign.Builder builderForValue) {
      if (omniCampaignBuilder_ == null) {
        omniCampaign_ = builderForValue.build();
      } else {
        omniCampaignBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * omni campaign
     * </pre>
     *
     * <code>.api.commons.OmniCampaign omni_campaign = 3 [json_name = "omniCampaign"];</code>
     */
    public Builder mergeOmniCampaign(com.tcn.cloud.api.api.commons.OmniCampaign value) {
      if (omniCampaignBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          omniCampaign_ != null &&
          omniCampaign_ != com.tcn.cloud.api.api.commons.OmniCampaign.getDefaultInstance()) {
          getOmniCampaignBuilder().mergeFrom(value);
        } else {
          omniCampaign_ = value;
        }
      } else {
        omniCampaignBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * omni campaign
     * </pre>
     *
     * <code>.api.commons.OmniCampaign omni_campaign = 3 [json_name = "omniCampaign"];</code>
     */
    public Builder clearOmniCampaign() {
      bitField0_ = (bitField0_ & ~0x00000004);
      omniCampaign_ = null;
      if (omniCampaignBuilder_ != null) {
        omniCampaignBuilder_.dispose();
        omniCampaignBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * omni campaign
     * </pre>
     *
     * <code>.api.commons.OmniCampaign omni_campaign = 3 [json_name = "omniCampaign"];</code>
     */
    public com.tcn.cloud.api.api.commons.OmniCampaign.Builder getOmniCampaignBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getOmniCampaignFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * omni campaign
     * </pre>
     *
     * <code>.api.commons.OmniCampaign omni_campaign = 3 [json_name = "omniCampaign"];</code>
     */
    public com.tcn.cloud.api.api.commons.OmniCampaignOrBuilder getOmniCampaignOrBuilder() {
      if (omniCampaignBuilder_ != null) {
        return omniCampaignBuilder_.getMessageOrBuilder();
      } else {
        return omniCampaign_ == null ?
            com.tcn.cloud.api.api.commons.OmniCampaign.getDefaultInstance() : omniCampaign_;
      }
    }
    /**
     * <pre>
     * omni campaign
     * </pre>
     *
     * <code>.api.commons.OmniCampaign omni_campaign = 3 [json_name = "omniCampaign"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.OmniCampaign, com.tcn.cloud.api.api.commons.OmniCampaign.Builder, com.tcn.cloud.api.api.commons.OmniCampaignOrBuilder> 
        getOmniCampaignFieldBuilder() {
      if (omniCampaignBuilder_ == null) {
        omniCampaignBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.commons.OmniCampaign, com.tcn.cloud.api.api.commons.OmniCampaign.Builder, com.tcn.cloud.api.api.commons.OmniCampaignOrBuilder>(
                getOmniCampaign(),
                getParentForChildren(),
                isClean());
        omniCampaign_ = null;
      }
      return omniCampaignBuilder_;
    }

    private com.tcn.cloud.api.api.commons.OmniMessage message_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.OmniMessage, com.tcn.cloud.api.api.commons.OmniMessage.Builder, com.tcn.cloud.api.api.commons.OmniMessageOrBuilder> messageBuilder_;
    /**
     * <pre>
     * the message sent by the agent
     * </pre>
     *
     * <code>.api.commons.OmniMessage message = 4 [json_name = "message"];</code>
     * @return Whether the message field is set.
     */
    public boolean hasMessage() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * the message sent by the agent
     * </pre>
     *
     * <code>.api.commons.OmniMessage message = 4 [json_name = "message"];</code>
     * @return The message.
     */
    public com.tcn.cloud.api.api.commons.OmniMessage getMessage() {
      if (messageBuilder_ == null) {
        return message_ == null ? com.tcn.cloud.api.api.commons.OmniMessage.getDefaultInstance() : message_;
      } else {
        return messageBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * the message sent by the agent
     * </pre>
     *
     * <code>.api.commons.OmniMessage message = 4 [json_name = "message"];</code>
     */
    public Builder setMessage(com.tcn.cloud.api.api.commons.OmniMessage value) {
      if (messageBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        message_ = value;
      } else {
        messageBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the message sent by the agent
     * </pre>
     *
     * <code>.api.commons.OmniMessage message = 4 [json_name = "message"];</code>
     */
    public Builder setMessage(
        com.tcn.cloud.api.api.commons.OmniMessage.Builder builderForValue) {
      if (messageBuilder_ == null) {
        message_ = builderForValue.build();
      } else {
        messageBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the message sent by the agent
     * </pre>
     *
     * <code>.api.commons.OmniMessage message = 4 [json_name = "message"];</code>
     */
    public Builder mergeMessage(com.tcn.cloud.api.api.commons.OmniMessage value) {
      if (messageBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          message_ != null &&
          message_ != com.tcn.cloud.api.api.commons.OmniMessage.getDefaultInstance()) {
          getMessageBuilder().mergeFrom(value);
        } else {
          message_ = value;
        }
      } else {
        messageBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the message sent by the agent
     * </pre>
     *
     * <code>.api.commons.OmniMessage message = 4 [json_name = "message"];</code>
     */
    public Builder clearMessage() {
      bitField0_ = (bitField0_ & ~0x00000008);
      message_ = null;
      if (messageBuilder_ != null) {
        messageBuilder_.dispose();
        messageBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the message sent by the agent
     * </pre>
     *
     * <code>.api.commons.OmniMessage message = 4 [json_name = "message"];</code>
     */
    public com.tcn.cloud.api.api.commons.OmniMessage.Builder getMessageBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getMessageFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * the message sent by the agent
     * </pre>
     *
     * <code>.api.commons.OmniMessage message = 4 [json_name = "message"];</code>
     */
    public com.tcn.cloud.api.api.commons.OmniMessageOrBuilder getMessageOrBuilder() {
      if (messageBuilder_ != null) {
        return messageBuilder_.getMessageOrBuilder();
      } else {
        return message_ == null ?
            com.tcn.cloud.api.api.commons.OmniMessage.getDefaultInstance() : message_;
      }
    }
    /**
     * <pre>
     * the message sent by the agent
     * </pre>
     *
     * <code>.api.commons.OmniMessage message = 4 [json_name = "message"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.OmniMessage, com.tcn.cloud.api.api.commons.OmniMessage.Builder, com.tcn.cloud.api.api.commons.OmniMessageOrBuilder> 
        getMessageFieldBuilder() {
      if (messageBuilder_ == null) {
        messageBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.commons.OmniMessage, com.tcn.cloud.api.api.commons.OmniMessage.Builder, com.tcn.cloud.api.api.commons.OmniMessageOrBuilder>(
                getMessage(),
                getParentForChildren(),
                isClean());
        message_ = null;
      }
      return messageBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.commons.audit.OmnichannelSmsMessageSentModuleEvent)
  }

  // @@protoc_insertion_point(class_scope:api.commons.audit.OmnichannelSmsMessageSentModuleEvent)
  private static final com.tcn.cloud.api.api.commons.audit.OmnichannelSmsMessageSentModuleEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.commons.audit.OmnichannelSmsMessageSentModuleEvent();
  }

  public static com.tcn.cloud.api.api.commons.audit.OmnichannelSmsMessageSentModuleEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OmnichannelSmsMessageSentModuleEvent>
      PARSER = new com.google.protobuf.AbstractParser<OmnichannelSmsMessageSentModuleEvent>() {
    @java.lang.Override
    public OmnichannelSmsMessageSentModuleEvent parsePartialFrom(
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

  public static com.google.protobuf.Parser<OmnichannelSmsMessageSentModuleEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OmnichannelSmsMessageSentModuleEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.commons.audit.OmnichannelSmsMessageSentModuleEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

