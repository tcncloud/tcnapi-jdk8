// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/audit/omnichannel_events.proto

package com.tcn.cloud.api.api.commons.audit;

/**
 * <pre>
 * OmnichannelFailModuleEvent - whenever a module is fail status
 * </pre>
 *
 * Protobuf type {@code api.commons.audit.OmnichannelFailModuleEvent}
 */
public final class OmnichannelFailModuleEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.commons.audit.OmnichannelFailModuleEvent)
    OmnichannelFailModuleEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OmnichannelFailModuleEvent.newBuilder() to construct.
  private OmnichannelFailModuleEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OmnichannelFailModuleEvent() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OmnichannelFailModuleEvent();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.commons.audit.OmnichannelEventsProto.internal_static_api_commons_audit_OmnichannelFailModuleEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.commons.audit.OmnichannelEventsProto.internal_static_api_commons_audit_OmnichannelFailModuleEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.commons.audit.OmnichannelFailModuleEvent.class, com.tcn.cloud.api.api.commons.audit.OmnichannelFailModuleEvent.Builder.class);
  }

  private int bitField0_;
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

  public static final int OMNI_CAMPAIGN_FIELD_NUMBER = 2;
  private com.tcn.cloud.api.api.commons.OmniCampaign omniCampaign_;
  /**
   * <pre>
   * omni campaign
   * </pre>
   *
   * <code>.api.commons.OmniCampaign omni_campaign = 2 [json_name = "omniCampaign"];</code>
   * @return Whether the omniCampaign field is set.
   */
  @java.lang.Override
  public boolean hasOmniCampaign() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * omni campaign
   * </pre>
   *
   * <code>.api.commons.OmniCampaign omni_campaign = 2 [json_name = "omniCampaign"];</code>
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
   * <code>.api.commons.OmniCampaign omni_campaign = 2 [json_name = "omniCampaign"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.OmniCampaignOrBuilder getOmniCampaignOrBuilder() {
    return omniCampaign_ == null ? com.tcn.cloud.api.api.commons.OmniCampaign.getDefaultInstance() : omniCampaign_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getOmniCampaign());
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
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getOmniCampaign());
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
    if (!(obj instanceof com.tcn.cloud.api.api.commons.audit.OmnichannelFailModuleEvent)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.commons.audit.OmnichannelFailModuleEvent other = (com.tcn.cloud.api.api.commons.audit.OmnichannelFailModuleEvent) obj;

    if (getModuleSid()
        != other.getModuleSid()) return false;
    if (hasOmniCampaign() != other.hasOmniCampaign()) return false;
    if (hasOmniCampaign()) {
      if (!getOmniCampaign()
          .equals(other.getOmniCampaign())) return false;
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
    if (hasOmniCampaign()) {
      hash = (37 * hash) + OMNI_CAMPAIGN_FIELD_NUMBER;
      hash = (53 * hash) + getOmniCampaign().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.commons.audit.OmnichannelFailModuleEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.audit.OmnichannelFailModuleEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.audit.OmnichannelFailModuleEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.audit.OmnichannelFailModuleEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.audit.OmnichannelFailModuleEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.audit.OmnichannelFailModuleEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.audit.OmnichannelFailModuleEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.audit.OmnichannelFailModuleEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.commons.audit.OmnichannelFailModuleEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.commons.audit.OmnichannelFailModuleEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.audit.OmnichannelFailModuleEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.audit.OmnichannelFailModuleEvent parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.commons.audit.OmnichannelFailModuleEvent prototype) {
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
   * OmnichannelFailModuleEvent - whenever a module is fail status
   * </pre>
   *
   * Protobuf type {@code api.commons.audit.OmnichannelFailModuleEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.commons.audit.OmnichannelFailModuleEvent)
      com.tcn.cloud.api.api.commons.audit.OmnichannelFailModuleEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.audit.OmnichannelEventsProto.internal_static_api_commons_audit_OmnichannelFailModuleEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.commons.audit.OmnichannelEventsProto.internal_static_api_commons_audit_OmnichannelFailModuleEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.commons.audit.OmnichannelFailModuleEvent.class, com.tcn.cloud.api.api.commons.audit.OmnichannelFailModuleEvent.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.commons.audit.OmnichannelFailModuleEvent.newBuilder()
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
        getOmniCampaignFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      moduleSid_ = 0L;
      omniCampaign_ = null;
      if (omniCampaignBuilder_ != null) {
        omniCampaignBuilder_.dispose();
        omniCampaignBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.commons.audit.OmnichannelEventsProto.internal_static_api_commons_audit_OmnichannelFailModuleEvent_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.audit.OmnichannelFailModuleEvent getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.commons.audit.OmnichannelFailModuleEvent.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.audit.OmnichannelFailModuleEvent build() {
      com.tcn.cloud.api.api.commons.audit.OmnichannelFailModuleEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.audit.OmnichannelFailModuleEvent buildPartial() {
      com.tcn.cloud.api.api.commons.audit.OmnichannelFailModuleEvent result = new com.tcn.cloud.api.api.commons.audit.OmnichannelFailModuleEvent(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.commons.audit.OmnichannelFailModuleEvent result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.moduleSid_ = moduleSid_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.omniCampaign_ = omniCampaignBuilder_ == null
            ? omniCampaign_
            : omniCampaignBuilder_.build();
        to_bitField0_ |= 0x00000001;
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
      if (other instanceof com.tcn.cloud.api.api.commons.audit.OmnichannelFailModuleEvent) {
        return mergeFrom((com.tcn.cloud.api.api.commons.audit.OmnichannelFailModuleEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.commons.audit.OmnichannelFailModuleEvent other) {
      if (other == com.tcn.cloud.api.api.commons.audit.OmnichannelFailModuleEvent.getDefaultInstance()) return this;
      if (other.getModuleSid() != 0L) {
        setModuleSid(other.getModuleSid());
      }
      if (other.hasOmniCampaign()) {
        mergeOmniCampaign(other.getOmniCampaign());
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
            case 18: {
              input.readMessage(
                  getOmniCampaignFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private com.tcn.cloud.api.api.commons.OmniCampaign omniCampaign_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.OmniCampaign, com.tcn.cloud.api.api.commons.OmniCampaign.Builder, com.tcn.cloud.api.api.commons.OmniCampaignOrBuilder> omniCampaignBuilder_;
    /**
     * <pre>
     * omni campaign
     * </pre>
     *
     * <code>.api.commons.OmniCampaign omni_campaign = 2 [json_name = "omniCampaign"];</code>
     * @return Whether the omniCampaign field is set.
     */
    public boolean hasOmniCampaign() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * omni campaign
     * </pre>
     *
     * <code>.api.commons.OmniCampaign omni_campaign = 2 [json_name = "omniCampaign"];</code>
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
     * <code>.api.commons.OmniCampaign omni_campaign = 2 [json_name = "omniCampaign"];</code>
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
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * omni campaign
     * </pre>
     *
     * <code>.api.commons.OmniCampaign omni_campaign = 2 [json_name = "omniCampaign"];</code>
     */
    public Builder setOmniCampaign(
        com.tcn.cloud.api.api.commons.OmniCampaign.Builder builderForValue) {
      if (omniCampaignBuilder_ == null) {
        omniCampaign_ = builderForValue.build();
      } else {
        omniCampaignBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * omni campaign
     * </pre>
     *
     * <code>.api.commons.OmniCampaign omni_campaign = 2 [json_name = "omniCampaign"];</code>
     */
    public Builder mergeOmniCampaign(com.tcn.cloud.api.api.commons.OmniCampaign value) {
      if (omniCampaignBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          omniCampaign_ != null &&
          omniCampaign_ != com.tcn.cloud.api.api.commons.OmniCampaign.getDefaultInstance()) {
          getOmniCampaignBuilder().mergeFrom(value);
        } else {
          omniCampaign_ = value;
        }
      } else {
        omniCampaignBuilder_.mergeFrom(value);
      }
      if (omniCampaign_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * omni campaign
     * </pre>
     *
     * <code>.api.commons.OmniCampaign omni_campaign = 2 [json_name = "omniCampaign"];</code>
     */
    public Builder clearOmniCampaign() {
      bitField0_ = (bitField0_ & ~0x00000002);
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
     * <code>.api.commons.OmniCampaign omni_campaign = 2 [json_name = "omniCampaign"];</code>
     */
    public com.tcn.cloud.api.api.commons.OmniCampaign.Builder getOmniCampaignBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getOmniCampaignFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * omni campaign
     * </pre>
     *
     * <code>.api.commons.OmniCampaign omni_campaign = 2 [json_name = "omniCampaign"];</code>
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
     * <code>.api.commons.OmniCampaign omni_campaign = 2 [json_name = "omniCampaign"];</code>
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


    // @@protoc_insertion_point(builder_scope:api.commons.audit.OmnichannelFailModuleEvent)
  }

  // @@protoc_insertion_point(class_scope:api.commons.audit.OmnichannelFailModuleEvent)
  private static final com.tcn.cloud.api.api.commons.audit.OmnichannelFailModuleEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.commons.audit.OmnichannelFailModuleEvent();
  }

  public static com.tcn.cloud.api.api.commons.audit.OmnichannelFailModuleEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OmnichannelFailModuleEvent>
      PARSER = new com.google.protobuf.AbstractParser<OmnichannelFailModuleEvent>() {
    @java.lang.Override
    public OmnichannelFailModuleEvent parsePartialFrom(
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

  public static com.google.protobuf.Parser<OmnichannelFailModuleEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OmnichannelFailModuleEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.commons.audit.OmnichannelFailModuleEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

